import datetime
import httplib
import json
import psycopg2
import re
import sys
import time
from dateutil import tz

# CONFIGURATION START
esHost = "ls01.panatrip.cn:9200"
pgHost = "192.168.1.12"
pgPort = "5432"
pgDatabase = "biqu"
pgUser = "dev"
pgPassword = "panatripdev"
# CONFIGURATION END


def printlog(msg):
    print datetime.datetime.now().isoformat(), msg

printlog("process started..................................")
if len(sys.argv) > 1:
    checkdate = sys.argv[1]
    if not (re.search('\d{4}-\d{2}-\d{2}', checkdate)):
        printlog("invalid date arg:" + checkdate)
        printlog("process ended..................................")
        exit()
else:
    yesterday = datetime.date.today() - datetime.timedelta(days=1)
    checkdate = yesterday.strftime('%Y-%m-%d')

hitvisits = []
allvisits = []

conn = httplib.HTTPConnection(esHost)

printlog("operation date:" + checkdate)

startime = datetime.datetime.strptime(checkdate + " 00:00:00.000", "%Y-%m-%d %H:%M:%S.%f")
startime = long(time.mktime(startime.timetuple()) * 1000.0 + startime.microsecond / 1000.0)
endtime = datetime.datetime.strptime(checkdate + " 23:59:59.999", "%Y-%m-%d %H:%M:%S.%f")
endtime = long(time.mktime(endtime.timetuple()) * 1000.0 + endtime.microsecond / 1000.0)

# hits
bodyData = json.dumps({"size":5000, "sort":[{"@timestamp":{"order":"desc", "unmapped_type":"boolean"}}], "query":{"filtered":{"query":{"query_string":{"analyze_wildcard":"true", "query":"\"av search result using cache:\""}}, "filter":{"bool":{"must":[{"range":{"@timestamp":{"gte":startime, "lte":endtime, "format":"epoch_millis"}}}], "must_not":[]}}}}, "aggs":{"2":{"date_histogram":{"field":"@timestamp", "interval":"30m", "time_zone":"Asia/Shanghai", "min_doc_count":0, "extended_bounds":{"min":startime, "max":endtime}}}}, "fields":["*", "_source"], "script_fields":{}, "fielddata_fields":["@timestamp"]})
conn.request(method="POST", url="/logstash-*/_search?scroll=5m", body=bodyData)
r1 = conn.getresponse()
printlog("hitvisits init:" + str(r1.status) + " " + r1.reason) 
result = json.loads(r1.read())

curhits = result["hits"]["hits"]
scroll_id = result["_scroll_id"]
hits = []
hits.extend(curhits)

while len(curhits) == 5000:
    bodyData = json.dumps({"scroll":"5m", "scroll_id":scroll_id })
    conn.request(method="POST", url="/_search/scroll", body=bodyData)
    r1 = conn.getresponse()
    printlog("hitvisits scroll:" + str(r1.status) + " " + r1.reason)
    result = json.loads(r1.read())
    curhits = result["hits"]["hits"]
    hits.extend(curhits)

for hit in hits:
    localtime = datetime.datetime.strptime(hit["_source"]["@timestamp"], '%Y-%m-%dT%H:%M:%S.%fZ').replace(tzinfo=tz.tzutc()).astimezone(tz.tzlocal())
    line = str(localtime) + hit["_source"]["message"]
    match = re.search('\[(.{1,})\]', line)
    fields = []
    fields.append(line[0:16])
    fields.append(match.group(1).split(":")[0] + ':' + match.group(1).split(":")[1])
    fields.append(match.group(1).split(":")[2])
    hitvisits.append(fields)


# all
bodyData = json.dumps({"size":10000, "sort":[{"@timestamp":{"order":"desc", "unmapped_type":"boolean"}}], "query":{"filtered":{"query":{"query_string":{"analyze_wildcard":"true", "query":"\"av route cahce search params, departure\""}}, "filter":{"bool":{"must":[{"range":{"@timestamp":{"gte":startime, "lte":endtime, "format":"epoch_millis"}}}], "must_not":[]}}}}, "aggs":{"2":{"date_histogram":{"field":"@timestamp", "interval":"30m", "time_zone":"Asia/Shanghai", "min_doc_count":0, "extended_bounds":{"min":startime, "max":endtime}}}}, "fields":["*", "_source"], "script_fields":{}, "fielddata_fields":["@timestamp"]})
conn.request(method="POST", url="/logstash-*/_search?scroll=5m", body=bodyData)
r1 = conn.getresponse()
printlog("allvisits init:" + str(r1.status) + " " + r1.reason)
result = json.loads(r1.read())

curhits = result["hits"]["hits"]
scroll_id = result["_scroll_id"]
hits = []
hits.extend(curhits)

while len(curhits) == 10000:
    bodyData = json.dumps({"scroll":"5m", "scroll_id":scroll_id })
    conn.request(method="POST", url="/_search/scroll", body=bodyData)
    r1 = conn.getresponse()
    printlog("allvisits scroll:" + str(r1.status) + " " + r1.reason)
    result = json.loads(r1.read())
    curhits = result["hits"]["hits"]
    hits.extend(curhits)

for hit in hits:
    localtime = datetime.datetime.strptime(hit["_source"]["@timestamp"], '%Y-%m-%dT%H:%M:%S.%fZ').replace(tzinfo=tz.tzutc()).astimezone(tz.tzlocal())
    line = str(localtime) + hit["_source"]["message"]
    match = re.search('departure : (.{3}).{1,}arrive : (.{3}).{1,}departuredate : (.{10})', line)
    fields = []
    fields.append(line[0:16])
    fields.append(match.group(1) + ":" + match.group(2))
    fields.append(match.group(3))
    allvisits.append(fields)

conn.close()

printlog("start to connect postgresql")
conn = psycopg2.connect(host=pgHost, port=pgPort, database=pgDatabase, user=pgUser, password=pgPassword)

cur = conn.cursor()
cur.execute(
    "CREATE TABLE if not exists TEST_WLH_DOM_CACHE_CACHEHIT (time varchar(16), od varchar(7), departuredate varchar(10));")
cur.execute(
    "CREATE TABLE if not exists TEST_WLH_DOM_CACHE_ALLVISIT (time varchar(16), od varchar(7), departuredate varchar(10));")

for fields in hitvisits:
    cur.execute("INSERT INTO TEST_WLH_DOM_CACHE_CACHEHIT (time, od, departuredate) VALUES (%s, %s, %s)",
                (fields[0], fields[1], fields[2]))
for fields in allvisits:
    cur.execute("INSERT INTO TEST_WLH_DOM_CACHE_ALLVISIT (time, od, departuredate) VALUES (%s, %s, %s)",
                (fields[0], fields[1], fields[2]))

conn.commit()
printlog("TEST_WLH_DOM_CACHE_CACHEHIT:" + str(len(hitvisits)))
printlog("TEST_WLH_DOM_CACHE_ALLVISIT:" + str(len(allvisits)))
cur.close()
conn.close()
printlog("process ended..................................")
