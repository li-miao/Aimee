//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.10.22 时间 08:34:45 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="items1">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item1" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dstCity">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="arriveTime">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="planeType">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value3" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="mileage">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value4" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="cabinList">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="items2">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="item2" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="productList">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="items3">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="code">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;simpleContent>
 *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                           &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                         &lt;/extension>
 *                                                                                                       &lt;/simpleContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="childFare">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;complexContent>
 *                                                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                           &lt;sequence>
 *                                                                                                             &lt;element name="marketFare">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="fuelsurcharge">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="netPrice">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="airporttax">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                           &lt;/sequence>
 *                                                                                                         &lt;/restriction>
 *                                                                                                       &lt;/complexContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="infantFare">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;complexContent>
 *                                                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                           &lt;sequence>
 *                                                                                                             &lt;element name="marketFare">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="fuelsurcharge">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="netPrice">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="airporttax">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                           &lt;/sequence>
 *                                                                                                         &lt;/restriction>
 *                                                                                                       &lt;/complexContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="name">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;simpleContent>
 *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                           &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                         &lt;/extension>
 *                                                                                                       &lt;/simpleContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="ticketRemark">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;simpleContent>
 *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                           &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                         &lt;/extension>
 *                                                                                                       &lt;/simpleContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="adultFare">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;complexContent>
 *                                                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                           &lt;sequence>
 *                                                                                                             &lt;element name="marketFare">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="fuelsurcharge">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="netPrice">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                             &lt;element name="airporttax">
 *                                                                                                               &lt;complexType>
 *                                                                                                                 &lt;simpleContent>
 *                                                                                                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                                     &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                                                                                   &lt;/extension>
 *                                                                                                                 &lt;/simpleContent>
 *                                                                                                               &lt;/complexType>
 *                                                                                                             &lt;/element>
 *                                                                                                           &lt;/sequence>
 *                                                                                                         &lt;/restriction>
 *                                                                                                       &lt;/complexContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="inventory">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="cabinCode">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="flightNo">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value22" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="carrier">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value23" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="departureTime">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value24" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="baseFare">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value25" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="orgCity">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="value26" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightList"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(required = true)
    protected Root.FlightList flightList;

    /**
     * 获取flightList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Root.FlightList }
     *     
     */
    public Root.FlightList getFlightList() {
        return flightList;
    }

    /**
     * 设置flightList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Root.FlightList }
     *     
     */
    public void setFlightList(Root.FlightList value) {
        this.flightList = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="items1">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item1" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dstCity">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="arriveTime">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="planeType">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value3" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="mileage">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value4" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="cabinList">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="items2">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="item2" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="productList">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="items3">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="code">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;simpleContent>
     *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                 &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                               &lt;/extension>
     *                                                                                             &lt;/simpleContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="childFare">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="marketFare">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="fuelsurcharge">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="netPrice">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="airporttax">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                 &lt;/sequence>
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="infantFare">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="marketFare">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="fuelsurcharge">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="netPrice">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="airporttax">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                 &lt;/sequence>
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="name">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;simpleContent>
     *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                 &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                               &lt;/extension>
     *                                                                                             &lt;/simpleContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="ticketRemark">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;simpleContent>
     *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                 &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                               &lt;/extension>
     *                                                                                             &lt;/simpleContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="adultFare">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="marketFare">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="fuelsurcharge">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="netPrice">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                   &lt;element name="airporttax">
     *                                                                                                     &lt;complexType>
     *                                                                                                       &lt;simpleContent>
     *                                                                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                                           &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                                                                                         &lt;/extension>
     *                                                                                                       &lt;/simpleContent>
     *                                                                                                     &lt;/complexType>
     *                                                                                                   &lt;/element>
     *                                                                                                 &lt;/sequence>
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="inventory">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="cabinCode">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="flightNo">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value22" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="carrier">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value23" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="departureTime">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value24" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="baseFare">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value25" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="orgCity">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="value26" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "items1"
    })
    public static class FlightList {

        @XmlElement(required = true)
        protected Root.FlightList.Items1 items1;

        /**
         * 获取items1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Root.FlightList.Items1 }
         *     
         */
        public Root.FlightList.Items1 getItems1() {
            return items1;
        }

        /**
         * 设置items1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Root.FlightList.Items1 }
         *     
         */
        public void setItems1(Root.FlightList.Items1 value) {
            this.items1 = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item1" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dstCity">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value1" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="arriveTime">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="planeType">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value3" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="mileage">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value4" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="cabinList">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="items2">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="item2" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="productList">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="items3">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="code">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;simpleContent>
         *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                       &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                                     &lt;/extension>
         *                                                                                   &lt;/simpleContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="childFare">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;complexContent>
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                                       &lt;sequence>
         *                                                                                         &lt;element name="marketFare">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="fuelsurcharge">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="netPrice">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="airporttax">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                       &lt;/sequence>
         *                                                                                     &lt;/restriction>
         *                                                                                   &lt;/complexContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="infantFare">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;complexContent>
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                                       &lt;sequence>
         *                                                                                         &lt;element name="marketFare">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="fuelsurcharge">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="netPrice">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="airporttax">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                       &lt;/sequence>
         *                                                                                     &lt;/restriction>
         *                                                                                   &lt;/complexContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="name">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;simpleContent>
         *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                       &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                                     &lt;/extension>
         *                                                                                   &lt;/simpleContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="ticketRemark">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;simpleContent>
         *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                       &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                                     &lt;/extension>
         *                                                                                   &lt;/simpleContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="adultFare">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;complexContent>
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                                       &lt;sequence>
         *                                                                                         &lt;element name="marketFare">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="fuelsurcharge">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="netPrice">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                         &lt;element name="airporttax">
         *                                                                                           &lt;complexType>
         *                                                                                             &lt;simpleContent>
         *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                                                 &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                                                                               &lt;/extension>
         *                                                                                             &lt;/simpleContent>
         *                                                                                           &lt;/complexType>
         *                                                                                         &lt;/element>
         *                                                                                       &lt;/sequence>
         *                                                                                     &lt;/restriction>
         *                                                                                   &lt;/complexContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="inventory">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="cabinCode">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="flightNo">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value22" type="{http://www.w3.org/2001/XMLSchema}short" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="carrier">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value23" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="departureTime">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value24" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="baseFare">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value25" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="orgCity">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="value26" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item1"
        })
        public static class Items1 {

            protected List<Root.FlightList.Items1 .Item1> item1;

            /**
             * Gets the value of the item1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Root.FlightList.Items1 .Item1 }
             * 
             * 
             */
            public List<Root.FlightList.Items1 .Item1> getItem1() {
                if (item1 == null) {
                    item1 = new ArrayList<Root.FlightList.Items1 .Item1>();
                }
                return this.item1;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="dstCity">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value1" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="arriveTime">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="planeType">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value3" type="{http://www.w3.org/2001/XMLSchema}short" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="mileage">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value4" type="{http://www.w3.org/2001/XMLSchema}float" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="cabinList">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="items2">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="item2" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="productList">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="items3">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="code">
             *                                                                       &lt;complexType>
             *                                                                         &lt;simpleContent>
             *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                             &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                           &lt;/extension>
             *                                                                         &lt;/simpleContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="childFare">
             *                                                                       &lt;complexType>
             *                                                                         &lt;complexContent>
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                             &lt;sequence>
             *                                                                               &lt;element name="marketFare">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="fuelsurcharge">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="netPrice">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="airporttax">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                             &lt;/sequence>
             *                                                                           &lt;/restriction>
             *                                                                         &lt;/complexContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="infantFare">
             *                                                                       &lt;complexType>
             *                                                                         &lt;complexContent>
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                             &lt;sequence>
             *                                                                               &lt;element name="marketFare">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="fuelsurcharge">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="netPrice">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="airporttax">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                             &lt;/sequence>
             *                                                                           &lt;/restriction>
             *                                                                         &lt;/complexContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="name">
             *                                                                       &lt;complexType>
             *                                                                         &lt;simpleContent>
             *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                             &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                           &lt;/extension>
             *                                                                         &lt;/simpleContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="ticketRemark">
             *                                                                       &lt;complexType>
             *                                                                         &lt;simpleContent>
             *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                             &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                           &lt;/extension>
             *                                                                         &lt;/simpleContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="adultFare">
             *                                                                       &lt;complexType>
             *                                                                         &lt;complexContent>
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                             &lt;sequence>
             *                                                                               &lt;element name="marketFare">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="fuelsurcharge">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="netPrice">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                               &lt;element name="airporttax">
             *                                                                                 &lt;complexType>
             *                                                                                   &lt;simpleContent>
             *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                                                       &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                                                                                     &lt;/extension>
             *                                                                                   &lt;/simpleContent>
             *                                                                                 &lt;/complexType>
             *                                                                               &lt;/element>
             *                                                                             &lt;/sequence>
             *                                                                           &lt;/restriction>
             *                                                                         &lt;/complexContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="inventory">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="cabinCode">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="flightNo">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value22" type="{http://www.w3.org/2001/XMLSchema}short" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="carrier">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value23" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="departureTime">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value24" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="baseFare">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value25" type="{http://www.w3.org/2001/XMLSchema}float" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="orgCity">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="value26" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dstCity",
                "arriveTime",
                "planeType",
                "mileage",
                "cabinList",
                "flightNo",
                "carrier",
                "departureTime",
                "baseFare",
                "orgCity"
            })
            public static class Item1 {

                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .DstCity dstCity;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .ArriveTime arriveTime;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .PlaneType planeType;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .Mileage mileage;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .CabinList cabinList;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .FlightNo flightNo;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .Carrier carrier;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .DepartureTime departureTime;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .BaseFare baseFare;
                @XmlElement(required = true)
                protected Root.FlightList.Items1 .Item1 .OrgCity orgCity;

                /**
                 * 获取dstCity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .DstCity }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .DstCity getDstCity() {
                    return dstCity;
                }

                /**
                 * 设置dstCity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .DstCity }
                 *     
                 */
                public void setDstCity(Root.FlightList.Items1 .Item1 .DstCity value) {
                    this.dstCity = value;
                }

                /**
                 * 获取arriveTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .ArriveTime }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .ArriveTime getArriveTime() {
                    return arriveTime;
                }

                /**
                 * 设置arriveTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .ArriveTime }
                 *     
                 */
                public void setArriveTime(Root.FlightList.Items1 .Item1 .ArriveTime value) {
                    this.arriveTime = value;
                }

                /**
                 * 获取planeType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .PlaneType }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .PlaneType getPlaneType() {
                    return planeType;
                }

                /**
                 * 设置planeType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .PlaneType }
                 *     
                 */
                public void setPlaneType(Root.FlightList.Items1 .Item1 .PlaneType value) {
                    this.planeType = value;
                }

                /**
                 * 获取mileage属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .Mileage }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .Mileage getMileage() {
                    return mileage;
                }

                /**
                 * 设置mileage属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .Mileage }
                 *     
                 */
                public void setMileage(Root.FlightList.Items1 .Item1 .Mileage value) {
                    this.mileage = value;
                }

                /**
                 * 获取cabinList属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .CabinList }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .CabinList getCabinList() {
                    return cabinList;
                }

                /**
                 * 设置cabinList属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .CabinList }
                 *     
                 */
                public void setCabinList(Root.FlightList.Items1 .Item1 .CabinList value) {
                    this.cabinList = value;
                }

                /**
                 * 获取flightNo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .FlightNo }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .FlightNo getFlightNo() {
                    return flightNo;
                }

                /**
                 * 设置flightNo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .FlightNo }
                 *     
                 */
                public void setFlightNo(Root.FlightList.Items1 .Item1 .FlightNo value) {
                    this.flightNo = value;
                }

                /**
                 * 获取carrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .Carrier }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .Carrier getCarrier() {
                    return carrier;
                }

                /**
                 * 设置carrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .Carrier }
                 *     
                 */
                public void setCarrier(Root.FlightList.Items1 .Item1 .Carrier value) {
                    this.carrier = value;
                }

                /**
                 * 获取departureTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .DepartureTime }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .DepartureTime getDepartureTime() {
                    return departureTime;
                }

                /**
                 * 设置departureTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .DepartureTime }
                 *     
                 */
                public void setDepartureTime(Root.FlightList.Items1 .Item1 .DepartureTime value) {
                    this.departureTime = value;
                }

                /**
                 * 获取baseFare属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .BaseFare }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .BaseFare getBaseFare() {
                    return baseFare;
                }

                /**
                 * 设置baseFare属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .BaseFare }
                 *     
                 */
                public void setBaseFare(Root.FlightList.Items1 .Item1 .BaseFare value) {
                    this.baseFare = value;
                }

                /**
                 * 获取orgCity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.FlightList.Items1 .Item1 .OrgCity }
                 *     
                 */
                public Root.FlightList.Items1 .Item1 .OrgCity getOrgCity() {
                    return orgCity;
                }

                /**
                 * 设置orgCity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.FlightList.Items1 .Item1 .OrgCity }
                 *     
                 */
                public void setOrgCity(Root.FlightList.Items1 .Item1 .OrgCity value) {
                    this.orgCity = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value2" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class ArriveTime {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value2")
                    protected String value2;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value2属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue2() {
                        return value2;
                    }

                    /**
                     * 设置value2属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue2(String value) {
                        this.value2 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value25" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class BaseFare {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value25")
                    protected Float value25;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value25属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    public Float getValue25() {
                        return value25;
                    }

                    /**
                     * 设置value25属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    public void setValue25(Float value) {
                        this.value25 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="items2">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="item2" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="productList">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="items3">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="code">
                 *                                                             &lt;complexType>
                 *                                                               &lt;simpleContent>
                 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                   &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                                 &lt;/extension>
                 *                                                               &lt;/simpleContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="childFare">
                 *                                                             &lt;complexType>
                 *                                                               &lt;complexContent>
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                                   &lt;sequence>
                 *                                                                     &lt;element name="marketFare">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="fuelsurcharge">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="netPrice">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="airporttax">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                   &lt;/sequence>
                 *                                                                 &lt;/restriction>
                 *                                                               &lt;/complexContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="infantFare">
                 *                                                             &lt;complexType>
                 *                                                               &lt;complexContent>
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                                   &lt;sequence>
                 *                                                                     &lt;element name="marketFare">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="fuelsurcharge">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="netPrice">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="airporttax">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                   &lt;/sequence>
                 *                                                                 &lt;/restriction>
                 *                                                               &lt;/complexContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="name">
                 *                                                             &lt;complexType>
                 *                                                               &lt;simpleContent>
                 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                   &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                                 &lt;/extension>
                 *                                                               &lt;/simpleContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="ticketRemark">
                 *                                                             &lt;complexType>
                 *                                                               &lt;simpleContent>
                 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                   &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                                 &lt;/extension>
                 *                                                               &lt;/simpleContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="adultFare">
                 *                                                             &lt;complexType>
                 *                                                               &lt;complexContent>
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                                   &lt;sequence>
                 *                                                                     &lt;element name="marketFare">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="fuelsurcharge">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="netPrice">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                     &lt;element name="airporttax">
                 *                                                                       &lt;complexType>
                 *                                                                         &lt;simpleContent>
                 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                                                             &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                                                                           &lt;/extension>
                 *                                                                         &lt;/simpleContent>
                 *                                                                       &lt;/complexType>
                 *                                                                     &lt;/element>
                 *                                                                   &lt;/sequence>
                 *                                                                 &lt;/restriction>
                 *                                                               &lt;/complexContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="inventory">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="cabinCode">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "items2"
                })
                public static class CabinList {

                    @XmlElement(required = true)
                    protected Root.FlightList.Items1 .Item1 .CabinList.Items2 items2;

                    /**
                     * 获取items2属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 }
                     *     
                     */
                    public Root.FlightList.Items1 .Item1 .CabinList.Items2 getItems2() {
                        return items2;
                    }

                    /**
                     * 设置items2属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 }
                     *     
                     */
                    public void setItems2(Root.FlightList.Items1 .Item1 .CabinList.Items2 value) {
                        this.items2 = value;
                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="item2" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="productList">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="items3">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="code">
                     *                                                   &lt;complexType>
                     *                                                     &lt;simpleContent>
                     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                         &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                                       &lt;/extension>
                     *                                                     &lt;/simpleContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="childFare">
                     *                                                   &lt;complexType>
                     *                                                     &lt;complexContent>
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                                         &lt;sequence>
                     *                                                           &lt;element name="marketFare">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="fuelsurcharge">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="netPrice">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="airporttax">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                         &lt;/sequence>
                     *                                                       &lt;/restriction>
                     *                                                     &lt;/complexContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="infantFare">
                     *                                                   &lt;complexType>
                     *                                                     &lt;complexContent>
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                                         &lt;sequence>
                     *                                                           &lt;element name="marketFare">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="fuelsurcharge">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="netPrice">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="airporttax">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                         &lt;/sequence>
                     *                                                       &lt;/restriction>
                     *                                                     &lt;/complexContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="name">
                     *                                                   &lt;complexType>
                     *                                                     &lt;simpleContent>
                     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                         &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                                       &lt;/extension>
                     *                                                     &lt;/simpleContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="ticketRemark">
                     *                                                   &lt;complexType>
                     *                                                     &lt;simpleContent>
                     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                         &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                                       &lt;/extension>
                     *                                                     &lt;/simpleContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="adultFare">
                     *                                                   &lt;complexType>
                     *                                                     &lt;complexContent>
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                                         &lt;sequence>
                     *                                                           &lt;element name="marketFare">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="fuelsurcharge">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="netPrice">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                           &lt;element name="airporttax">
                     *                                                             &lt;complexType>
                     *                                                               &lt;simpleContent>
                     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                                                   &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *                                                                 &lt;/extension>
                     *                                                               &lt;/simpleContent>
                     *                                                             &lt;/complexType>
                     *                                                           &lt;/element>
                     *                                                         &lt;/sequence>
                     *                                                       &lt;/restriction>
                     *                                                     &lt;/complexContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="inventory">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="cabinCode">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "item2"
                    })
                    public static class Items2 {

                        protected List<Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2> item2;

                        /**
                         * Gets the value of the item2 property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the item2 property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getItem2().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 }
                         * 
                         * 
                         */
                        public List<Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2> getItem2() {
                            if (item2 == null) {
                                item2 = new ArrayList<Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2>();
                            }
                            return this.item2;
                        }


                        /**
                         * <p>anonymous complex type的 Java 类。
                         * 
                         * <p>以下模式片段指定包含在此类中的预期内容。
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="productList">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="items3">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="code">
                         *                                         &lt;complexType>
                         *                                           &lt;simpleContent>
                         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                               &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                             &lt;/extension>
                         *                                           &lt;/simpleContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="childFare">
                         *                                         &lt;complexType>
                         *                                           &lt;complexContent>
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                               &lt;sequence>
                         *                                                 &lt;element name="marketFare">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="fuelsurcharge">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="netPrice">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="airporttax">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                               &lt;/sequence>
                         *                                             &lt;/restriction>
                         *                                           &lt;/complexContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="infantFare">
                         *                                         &lt;complexType>
                         *                                           &lt;complexContent>
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                               &lt;sequence>
                         *                                                 &lt;element name="marketFare">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="fuelsurcharge">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="netPrice">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="airporttax">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                               &lt;/sequence>
                         *                                             &lt;/restriction>
                         *                                           &lt;/complexContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="name">
                         *                                         &lt;complexType>
                         *                                           &lt;simpleContent>
                         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                               &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                             &lt;/extension>
                         *                                           &lt;/simpleContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="ticketRemark">
                         *                                         &lt;complexType>
                         *                                           &lt;simpleContent>
                         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                               &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                             &lt;/extension>
                         *                                           &lt;/simpleContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="adultFare">
                         *                                         &lt;complexType>
                         *                                           &lt;complexContent>
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                               &lt;sequence>
                         *                                                 &lt;element name="marketFare">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="fuelsurcharge">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="netPrice">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                                 &lt;element name="airporttax">
                         *                                                   &lt;complexType>
                         *                                                     &lt;simpleContent>
                         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                                                         &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                         *                                                       &lt;/extension>
                         *                                                     &lt;/simpleContent>
                         *                                                   &lt;/complexType>
                         *                                                 &lt;/element>
                         *                                               &lt;/sequence>
                         *                                             &lt;/restriction>
                         *                                           &lt;/complexContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                     &lt;/sequence>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="inventory">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="cabinCode">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "productList",
                            "inventory",
                            "cabinCode"
                        })
                        public static class Item2 {

                            @XmlElement(required = true)
                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList productList;
                            @XmlElement(required = true)
                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .Inventory inventory;
                            @XmlElement(required = true)
                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .CabinCode cabinCode;

                            /**
                             * 获取productList属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList }
                             *     
                             */
                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList getProductList() {
                                return productList;
                            }

                            /**
                             * 设置productList属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList }
                             *     
                             */
                            public void setProductList(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList value) {
                                this.productList = value;
                            }

                            /**
                             * 获取inventory属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .Inventory }
                             *     
                             */
                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .Inventory getInventory() {
                                return inventory;
                            }

                            /**
                             * 设置inventory属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .Inventory }
                             *     
                             */
                            public void setInventory(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .Inventory value) {
                                this.inventory = value;
                            }

                            /**
                             * 获取cabinCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .CabinCode }
                             *     
                             */
                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .CabinCode getCabinCode() {
                                return cabinCode;
                            }

                            /**
                             * 设置cabinCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .CabinCode }
                             *     
                             */
                            public void setCabinCode(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .CabinCode value) {
                                this.cabinCode = value;
                            }


                            /**
                             * <p>anonymous complex type的 Java 类。
                             * 
                             * <p>以下模式片段指定包含在此类中的预期内容。
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="value21" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class CabinCode {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "value21")
                                protected String value21;

                                /**
                                 * 获取value属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * 设置value属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * 获取value21属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue21() {
                                    return value21;
                                }

                                /**
                                 * 设置value21属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue21(String value) {
                                    this.value21 = value;
                                }

                            }


                            /**
                             * <p>anonymous complex type的 Java 类。
                             * 
                             * <p>以下模式片段指定包含在此类中的预期内容。
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="value20" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class Inventory {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "value20")
                                protected String value20;

                                /**
                                 * 获取value属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * 设置value属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * 获取value20属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue20() {
                                    return value20;
                                }

                                /**
                                 * 设置value20属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue20(String value) {
                                    this.value20 = value;
                                }

                            }


                            /**
                             * <p>anonymous complex type的 Java 类。
                             * 
                             * <p>以下模式片段指定包含在此类中的预期内容。
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="items3">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="code">
                             *                               &lt;complexType>
                             *                                 &lt;simpleContent>
                             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                     &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                                   &lt;/extension>
                             *                                 &lt;/simpleContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="childFare">
                             *                               &lt;complexType>
                             *                                 &lt;complexContent>
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                                     &lt;sequence>
                             *                                       &lt;element name="marketFare">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="fuelsurcharge">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="netPrice">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="airporttax">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                     &lt;/sequence>
                             *                                   &lt;/restriction>
                             *                                 &lt;/complexContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="infantFare">
                             *                               &lt;complexType>
                             *                                 &lt;complexContent>
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                                     &lt;sequence>
                             *                                       &lt;element name="marketFare">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="fuelsurcharge">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="netPrice">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="airporttax">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                     &lt;/sequence>
                             *                                   &lt;/restriction>
                             *                                 &lt;/complexContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="name">
                             *                               &lt;complexType>
                             *                                 &lt;simpleContent>
                             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                     &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                                   &lt;/extension>
                             *                                 &lt;/simpleContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="ticketRemark">
                             *                               &lt;complexType>
                             *                                 &lt;simpleContent>
                             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                     &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                                   &lt;/extension>
                             *                                 &lt;/simpleContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="adultFare">
                             *                               &lt;complexType>
                             *                                 &lt;complexContent>
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                                     &lt;sequence>
                             *                                       &lt;element name="marketFare">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="fuelsurcharge">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="netPrice">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                       &lt;element name="airporttax">
                             *                                         &lt;complexType>
                             *                                           &lt;simpleContent>
                             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                                               &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                             *                                             &lt;/extension>
                             *                                           &lt;/simpleContent>
                             *                                         &lt;/complexType>
                             *                                       &lt;/element>
                             *                                     &lt;/sequence>
                             *                                   &lt;/restriction>
                             *                                 &lt;/complexContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                           &lt;/sequence>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "items3"
                            })
                            public static class ProductList {

                                @XmlElement(required = true)
                                protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 items3;

                                /**
                                 * 获取items3属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 }
                                 *     
                                 */
                                public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 getItems3() {
                                    return items3;
                                }

                                /**
                                 * 设置items3属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 }
                                 *     
                                 */
                                public void setItems3(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 value) {
                                    this.items3 = value;
                                }


                                /**
                                 * <p>anonymous complex type的 Java 类。
                                 * 
                                 * <p>以下模式片段指定包含在此类中的预期内容。
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="item3" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="code">
                                 *                     &lt;complexType>
                                 *                       &lt;simpleContent>
                                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                           &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                         &lt;/extension>
                                 *                       &lt;/simpleContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="childFare">
                                 *                     &lt;complexType>
                                 *                       &lt;complexContent>
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                           &lt;sequence>
                                 *                             &lt;element name="marketFare">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="fuelsurcharge">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="netPrice">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="airporttax">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                           &lt;/sequence>
                                 *                         &lt;/restriction>
                                 *                       &lt;/complexContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="infantFare">
                                 *                     &lt;complexType>
                                 *                       &lt;complexContent>
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                           &lt;sequence>
                                 *                             &lt;element name="marketFare">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="fuelsurcharge">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="netPrice">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="airporttax">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                           &lt;/sequence>
                                 *                         &lt;/restriction>
                                 *                       &lt;/complexContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="name">
                                 *                     &lt;complexType>
                                 *                       &lt;simpleContent>
                                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                           &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                         &lt;/extension>
                                 *                       &lt;/simpleContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="ticketRemark">
                                 *                     &lt;complexType>
                                 *                       &lt;simpleContent>
                                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                           &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                         &lt;/extension>
                                 *                       &lt;/simpleContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="adultFare">
                                 *                     &lt;complexType>
                                 *                       &lt;complexContent>
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                           &lt;sequence>
                                 *                             &lt;element name="marketFare">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="fuelsurcharge">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="netPrice">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                             &lt;element name="airporttax">
                                 *                               &lt;complexType>
                                 *                                 &lt;simpleContent>
                                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *                                     &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                                 *                                   &lt;/extension>
                                 *                                 &lt;/simpleContent>
                                 *                               &lt;/complexType>
                                 *                             &lt;/element>
                                 *                           &lt;/sequence>
                                 *                         &lt;/restriction>
                                 *                       &lt;/complexContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                 &lt;/sequence>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "item3"
                                })
                                public static class Items3 {

                                    protected List<Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3> item3;

                                    /**
                                     * Gets the value of the item3 property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the item3 property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getItem3().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 }
                                     * 
                                     * 
                                     */
                                    public List<Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3> getItem3() {
                                        if (item3 == null) {
                                            item3 = new ArrayList<Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3>();
                                        }
                                        return this.item3;
                                    }


                                    /**
                                     * <p>anonymous complex type的 Java 类。
                                     * 
                                     * <p>以下模式片段指定包含在此类中的预期内容。
                                     * 
                                     * <pre>
                                     * &lt;complexType>
                                     *   &lt;complexContent>
                                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *       &lt;sequence>
                                     *         &lt;element name="code">
                                     *           &lt;complexType>
                                     *             &lt;simpleContent>
                                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                 &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *               &lt;/extension>
                                     *             &lt;/simpleContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="childFare">
                                     *           &lt;complexType>
                                     *             &lt;complexContent>
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *                 &lt;sequence>
                                     *                   &lt;element name="marketFare">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="fuelsurcharge">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="netPrice">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="airporttax">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                 &lt;/sequence>
                                     *               &lt;/restriction>
                                     *             &lt;/complexContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="infantFare">
                                     *           &lt;complexType>
                                     *             &lt;complexContent>
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *                 &lt;sequence>
                                     *                   &lt;element name="marketFare">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="fuelsurcharge">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="netPrice">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="airporttax">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                 &lt;/sequence>
                                     *               &lt;/restriction>
                                     *             &lt;/complexContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="name">
                                     *           &lt;complexType>
                                     *             &lt;simpleContent>
                                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                 &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *               &lt;/extension>
                                     *             &lt;/simpleContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="ticketRemark">
                                     *           &lt;complexType>
                                     *             &lt;simpleContent>
                                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                 &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *               &lt;/extension>
                                     *             &lt;/simpleContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="adultFare">
                                     *           &lt;complexType>
                                     *             &lt;complexContent>
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *                 &lt;sequence>
                                     *                   &lt;element name="marketFare">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="fuelsurcharge">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="netPrice">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                   &lt;element name="airporttax">
                                     *                     &lt;complexType>
                                     *                       &lt;simpleContent>
                                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                     *                           &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                                     *                         &lt;/extension>
                                     *                       &lt;/simpleContent>
                                     *                     &lt;/complexType>
                                     *                   &lt;/element>
                                     *                 &lt;/sequence>
                                     *               &lt;/restriction>
                                     *             &lt;/complexContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *       &lt;/sequence>
                                     *     &lt;/restriction>
                                     *   &lt;/complexContent>
                                     * &lt;/complexType>
                                     * </pre>
                                     * 
                                     * 
                                     */
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "code",
                                        "childFare",
                                        "infantFare",
                                        "name",
                                        "ticketRemark",
                                        "adultFare"
                                    })
                                    public static class Item3 {

                                        @XmlElement(required = true)
                                        protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Code code;
                                        @XmlElement(required = true)
                                        protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare childFare;
                                        @XmlElement(required = true)
                                        protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare infantFare;
                                        @XmlElement(required = true)
                                        protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Name name;
                                        @XmlElement(required = true)
                                        protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .TicketRemark ticketRemark;
                                        @XmlElement(required = true)
                                        protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare adultFare;

                                        /**
                                         * 获取code属性的值。
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Code }
                                         *     
                                         */
                                        public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Code getCode() {
                                            return code;
                                        }

                                        /**
                                         * 设置code属性的值。
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Code }
                                         *     
                                         */
                                        public void setCode(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Code value) {
                                            this.code = value;
                                        }

                                        /**
                                         * 获取childFare属性的值。
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare }
                                         *     
                                         */
                                        public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare getChildFare() {
                                            return childFare;
                                        }

                                        /**
                                         * 设置childFare属性的值。
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare }
                                         *     
                                         */
                                        public void setChildFare(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare value) {
                                            this.childFare = value;
                                        }

                                        /**
                                         * 获取infantFare属性的值。
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare }
                                         *     
                                         */
                                        public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare getInfantFare() {
                                            return infantFare;
                                        }

                                        /**
                                         * 设置infantFare属性的值。
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare }
                                         *     
                                         */
                                        public void setInfantFare(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare value) {
                                            this.infantFare = value;
                                        }

                                        /**
                                         * 获取name属性的值。
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Name }
                                         *     
                                         */
                                        public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Name getName() {
                                            return name;
                                        }

                                        /**
                                         * 设置name属性的值。
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Name }
                                         *     
                                         */
                                        public void setName(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .Name value) {
                                            this.name = value;
                                        }

                                        /**
                                         * 获取ticketRemark属性的值。
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .TicketRemark }
                                         *     
                                         */
                                        public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .TicketRemark getTicketRemark() {
                                            return ticketRemark;
                                        }

                                        /**
                                         * 设置ticketRemark属性的值。
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .TicketRemark }
                                         *     
                                         */
                                        public void setTicketRemark(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .TicketRemark value) {
                                            this.ticketRemark = value;
                                        }

                                        /**
                                         * 获取adultFare属性的值。
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare }
                                         *     
                                         */
                                        public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare getAdultFare() {
                                            return adultFare;
                                        }

                                        /**
                                         * 设置adultFare属性的值。
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare }
                                         *     
                                         */
                                        public void setAdultFare(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare value) {
                                            this.adultFare = value;
                                        }


                                        /**
                                         * <p>anonymous complex type的 Java 类。
                                         * 
                                         * <p>以下模式片段指定包含在此类中的预期内容。
                                         * 
                                         * <pre>
                                         * &lt;complexType>
                                         *   &lt;complexContent>
                                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                         *       &lt;sequence>
                                         *         &lt;element name="marketFare">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="fuelsurcharge">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="netPrice">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="airporttax">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *       &lt;/sequence>
                                         *     &lt;/restriction>
                                         *   &lt;/complexContent>
                                         * &lt;/complexType>
                                         * </pre>
                                         * 
                                         * 
                                         */
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "marketFare",
                                            "fuelsurcharge",
                                            "netPrice",
                                            "airporttax"
                                        })
                                        public static class AdultFare {

                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.MarketFare marketFare;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Fuelsurcharge fuelsurcharge;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.NetPrice netPrice;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Airporttax airporttax;

                                            /**
                                             * 获取marketFare属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.MarketFare }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.MarketFare getMarketFare() {
                                                return marketFare;
                                            }

                                            /**
                                             * 设置marketFare属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.MarketFare }
                                             *     
                                             */
                                            public void setMarketFare(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.MarketFare value) {
                                                this.marketFare = value;
                                            }

                                            /**
                                             * 获取fuelsurcharge属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Fuelsurcharge }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Fuelsurcharge getFuelsurcharge() {
                                                return fuelsurcharge;
                                            }

                                            /**
                                             * 设置fuelsurcharge属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Fuelsurcharge }
                                             *     
                                             */
                                            public void setFuelsurcharge(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Fuelsurcharge value) {
                                                this.fuelsurcharge = value;
                                            }

                                            /**
                                             * 获取netPrice属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.NetPrice }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.NetPrice getNetPrice() {
                                                return netPrice;
                                            }

                                            /**
                                             * 设置netPrice属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.NetPrice }
                                             *     
                                             */
                                            public void setNetPrice(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.NetPrice value) {
                                                this.netPrice = value;
                                            }

                                            /**
                                             * 获取airporttax属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Airporttax }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Airporttax getAirporttax() {
                                                return airporttax;
                                            }

                                            /**
                                             * 设置airporttax属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Airporttax }
                                             *     
                                             */
                                            public void setAirporttax(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .AdultFare.Airporttax value) {
                                                this.airporttax = value;
                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value19" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class Airporttax {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value19")
                                                protected Float value19;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value19属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue19() {
                                                    return value19;
                                                }

                                                /**
                                                 * 设置value19属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue19(Float value) {
                                                    this.value19 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value17" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class Fuelsurcharge {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value17")
                                                protected Float value17;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value17属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue17() {
                                                    return value17;
                                                }

                                                /**
                                                 * 设置value17属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue17(Float value) {
                                                    this.value17 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value16" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class MarketFare {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value16")
                                                protected Float value16;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value16属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue16() {
                                                    return value16;
                                                }

                                                /**
                                                 * 设置value16属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue16(Float value) {
                                                    this.value16 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value18" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class NetPrice {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value18")
                                                protected Float value18;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value18属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue18() {
                                                    return value18;
                                                }

                                                /**
                                                 * 设置value18属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue18(Float value) {
                                                    this.value18 = value;
                                                }

                                            }

                                        }


                                        /**
                                         * <p>anonymous complex type的 Java 类。
                                         * 
                                         * <p>以下模式片段指定包含在此类中的预期内容。
                                         * 
                                         * <pre>
                                         * &lt;complexType>
                                         *   &lt;complexContent>
                                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                         *       &lt;sequence>
                                         *         &lt;element name="marketFare">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="fuelsurcharge">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="netPrice">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="airporttax">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *       &lt;/sequence>
                                         *     &lt;/restriction>
                                         *   &lt;/complexContent>
                                         * &lt;/complexType>
                                         * </pre>
                                         * 
                                         * 
                                         */
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "marketFare",
                                            "fuelsurcharge",
                                            "netPrice",
                                            "airporttax"
                                        })
                                        public static class ChildFare {

                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.MarketFare marketFare;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Fuelsurcharge fuelsurcharge;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.NetPrice netPrice;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Airporttax airporttax;

                                            /**
                                             * 获取marketFare属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.MarketFare }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.MarketFare getMarketFare() {
                                                return marketFare;
                                            }

                                            /**
                                             * 设置marketFare属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.MarketFare }
                                             *     
                                             */
                                            public void setMarketFare(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.MarketFare value) {
                                                this.marketFare = value;
                                            }

                                            /**
                                             * 获取fuelsurcharge属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Fuelsurcharge }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Fuelsurcharge getFuelsurcharge() {
                                                return fuelsurcharge;
                                            }

                                            /**
                                             * 设置fuelsurcharge属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Fuelsurcharge }
                                             *     
                                             */
                                            public void setFuelsurcharge(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Fuelsurcharge value) {
                                                this.fuelsurcharge = value;
                                            }

                                            /**
                                             * 获取netPrice属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.NetPrice }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.NetPrice getNetPrice() {
                                                return netPrice;
                                            }

                                            /**
                                             * 设置netPrice属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.NetPrice }
                                             *     
                                             */
                                            public void setNetPrice(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.NetPrice value) {
                                                this.netPrice = value;
                                            }

                                            /**
                                             * 获取airporttax属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Airporttax }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Airporttax getAirporttax() {
                                                return airporttax;
                                            }

                                            /**
                                             * 设置airporttax属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Airporttax }
                                             *     
                                             */
                                            public void setAirporttax(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .ChildFare.Airporttax value) {
                                                this.airporttax = value;
                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value9" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class Airporttax {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value9")
                                                protected Float value9;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value9属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue9() {
                                                    return value9;
                                                }

                                                /**
                                                 * 设置value9属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue9(Float value) {
                                                    this.value9 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value7" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class Fuelsurcharge {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value7")
                                                protected Float value7;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value7属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue7() {
                                                    return value7;
                                                }

                                                /**
                                                 * 设置value7属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue7(Float value) {
                                                    this.value7 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value6" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class MarketFare {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value6")
                                                protected Float value6;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value6属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue6() {
                                                    return value6;
                                                }

                                                /**
                                                 * 设置value6属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue6(Float value) {
                                                    this.value6 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value8" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class NetPrice {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value8")
                                                protected Float value8;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value8属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue8() {
                                                    return value8;
                                                }

                                                /**
                                                 * 设置value8属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue8(Float value) {
                                                    this.value8 = value;
                                                }

                                            }

                                        }


                                        /**
                                         * <p>anonymous complex type的 Java 类。
                                         * 
                                         * <p>以下模式片段指定包含在此类中的预期内容。
                                         * 
                                         * <pre>
                                         * &lt;complexType>
                                         *   &lt;simpleContent>
                                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *       &lt;attribute name="value5" type="{http://www.w3.org/2001/XMLSchema}string" />
                                         *     &lt;/extension>
                                         *   &lt;/simpleContent>
                                         * &lt;/complexType>
                                         * </pre>
                                         * 
                                         * 
                                         */
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "value"
                                        })
                                        public static class Code {

                                            @XmlValue
                                            protected String value;
                                            @XmlAttribute(name = "value5")
                                            protected String value5;

                                            /**
                                             * 获取value属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getValue() {
                                                return value;
                                            }

                                            /**
                                             * 设置value属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setValue(String value) {
                                                this.value = value;
                                            }

                                            /**
                                             * 获取value5属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getValue5() {
                                                return value5;
                                            }

                                            /**
                                             * 设置value5属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setValue5(String value) {
                                                this.value5 = value;
                                            }

                                        }


                                        /**
                                         * <p>anonymous complex type的 Java 类。
                                         * 
                                         * <p>以下模式片段指定包含在此类中的预期内容。
                                         * 
                                         * <pre>
                                         * &lt;complexType>
                                         *   &lt;complexContent>
                                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                         *       &lt;sequence>
                                         *         &lt;element name="marketFare">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="fuelsurcharge">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="netPrice">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *         &lt;element name="airporttax">
                                         *           &lt;complexType>
                                         *             &lt;simpleContent>
                                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *                 &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                                         *               &lt;/extension>
                                         *             &lt;/simpleContent>
                                         *           &lt;/complexType>
                                         *         &lt;/element>
                                         *       &lt;/sequence>
                                         *     &lt;/restriction>
                                         *   &lt;/complexContent>
                                         * &lt;/complexType>
                                         * </pre>
                                         * 
                                         * 
                                         */
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "marketFare",
                                            "fuelsurcharge",
                                            "netPrice",
                                            "airporttax"
                                        })
                                        public static class InfantFare {

                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.MarketFare marketFare;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Fuelsurcharge fuelsurcharge;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.NetPrice netPrice;
                                            @XmlElement(required = true)
                                            protected Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Airporttax airporttax;

                                            /**
                                             * 获取marketFare属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.MarketFare }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.MarketFare getMarketFare() {
                                                return marketFare;
                                            }

                                            /**
                                             * 设置marketFare属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.MarketFare }
                                             *     
                                             */
                                            public void setMarketFare(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.MarketFare value) {
                                                this.marketFare = value;
                                            }

                                            /**
                                             * 获取fuelsurcharge属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Fuelsurcharge }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Fuelsurcharge getFuelsurcharge() {
                                                return fuelsurcharge;
                                            }

                                            /**
                                             * 设置fuelsurcharge属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Fuelsurcharge }
                                             *     
                                             */
                                            public void setFuelsurcharge(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Fuelsurcharge value) {
                                                this.fuelsurcharge = value;
                                            }

                                            /**
                                             * 获取netPrice属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.NetPrice }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.NetPrice getNetPrice() {
                                                return netPrice;
                                            }

                                            /**
                                             * 设置netPrice属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.NetPrice }
                                             *     
                                             */
                                            public void setNetPrice(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.NetPrice value) {
                                                this.netPrice = value;
                                            }

                                            /**
                                             * 获取airporttax属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Airporttax }
                                             *     
                                             */
                                            public Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Airporttax getAirporttax() {
                                                return airporttax;
                                            }

                                            /**
                                             * 设置airporttax属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Airporttax }
                                             *     
                                             */
                                            public void setAirporttax(Root.FlightList.Items1 .Item1 .CabinList.Items2 .Item2 .ProductList.Items3 .Item3 .InfantFare.Airporttax value) {
                                                this.airporttax = value;
                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value13" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class Airporttax {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value13")
                                                protected Float value13;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value13属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue13() {
                                                    return value13;
                                                }

                                                /**
                                                 * 设置value13属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue13(Float value) {
                                                    this.value13 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value11" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class Fuelsurcharge {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value11")
                                                protected Float value11;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value11属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue11() {
                                                    return value11;
                                                }

                                                /**
                                                 * 设置value11属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue11(Float value) {
                                                    this.value11 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value10" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class MarketFare {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value10")
                                                protected Float value10;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value10属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue10() {
                                                    return value10;
                                                }

                                                /**
                                                 * 设置value10属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue10(Float value) {
                                                    this.value10 = value;
                                                }

                                            }


                                            /**
                                             * <p>anonymous complex type的 Java 类。
                                             * 
                                             * <p>以下模式片段指定包含在此类中的预期内容。
                                             * 
                                             * <pre>
                                             * &lt;complexType>
                                             *   &lt;simpleContent>
                                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                             *       &lt;attribute name="value12" type="{http://www.w3.org/2001/XMLSchema}float" />
                                             *     &lt;/extension>
                                             *   &lt;/simpleContent>
                                             * &lt;/complexType>
                                             * </pre>
                                             * 
                                             * 
                                             */
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "value"
                                            })
                                            public static class NetPrice {

                                                @XmlValue
                                                protected String value;
                                                @XmlAttribute(name = "value12")
                                                protected Float value12;

                                                /**
                                                 * 获取value属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public String getValue() {
                                                    return value;
                                                }

                                                /**
                                                 * 设置value属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link String }
                                                 *     
                                                 */
                                                public void setValue(String value) {
                                                    this.value = value;
                                                }

                                                /**
                                                 * 获取value12属性的值。
                                                 * 
                                                 * @return
                                                 *     possible object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public Float getValue12() {
                                                    return value12;
                                                }

                                                /**
                                                 * 设置value12属性的值。
                                                 * 
                                                 * @param value
                                                 *     allowed object is
                                                 *     {@link Float }
                                                 *     
                                                 */
                                                public void setValue12(Float value) {
                                                    this.value12 = value;
                                                }

                                            }

                                        }


                                        /**
                                         * <p>anonymous complex type的 Java 类。
                                         * 
                                         * <p>以下模式片段指定包含在此类中的预期内容。
                                         * 
                                         * <pre>
                                         * &lt;complexType>
                                         *   &lt;simpleContent>
                                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *       &lt;attribute name="value14" type="{http://www.w3.org/2001/XMLSchema}string" />
                                         *     &lt;/extension>
                                         *   &lt;/simpleContent>
                                         * &lt;/complexType>
                                         * </pre>
                                         * 
                                         * 
                                         */
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "value"
                                        })
                                        public static class Name {

                                            @XmlValue
                                            protected String value;
                                            @XmlAttribute(name = "value14")
                                            protected String value14;

                                            /**
                                             * 获取value属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getValue() {
                                                return value;
                                            }

                                            /**
                                             * 设置value属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setValue(String value) {
                                                this.value = value;
                                            }

                                            /**
                                             * 获取value14属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getValue14() {
                                                return value14;
                                            }

                                            /**
                                             * 设置value14属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setValue14(String value) {
                                                this.value14 = value;
                                            }

                                        }


                                        /**
                                         * <p>anonymous complex type的 Java 类。
                                         * 
                                         * <p>以下模式片段指定包含在此类中的预期内容。
                                         * 
                                         * <pre>
                                         * &lt;complexType>
                                         *   &lt;simpleContent>
                                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                         *       &lt;attribute name="value15" type="{http://www.w3.org/2001/XMLSchema}string" />
                                         *     &lt;/extension>
                                         *   &lt;/simpleContent>
                                         * &lt;/complexType>
                                         * </pre>
                                         * 
                                         * 
                                         */
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "value"
                                        })
                                        public static class TicketRemark {

                                            @XmlValue
                                            protected String value;
                                            @XmlAttribute(name = "value15")
                                            protected String value15;

                                            /**
                                             * 获取value属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getValue() {
                                                return value;
                                            }

                                            /**
                                             * 设置value属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setValue(String value) {
                                                this.value = value;
                                            }

                                            /**
                                             * 获取value15属性的值。
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link String }
                                             *     
                                             */
                                            public String getValue15() {
                                                return value15;
                                            }

                                            /**
                                             * 设置value15属性的值。
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link String }
                                             *     
                                             */
                                            public void setValue15(String value) {
                                                this.value15 = value;
                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value23" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Carrier {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value23")
                    protected String value23;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value23属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue23() {
                        return value23;
                    }

                    /**
                     * 设置value23属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue23(String value) {
                        this.value23 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value24" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class DepartureTime {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value24")
                    protected String value24;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value24属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue24() {
                        return value24;
                    }

                    /**
                     * 设置value24属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue24(String value) {
                        this.value24 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value1" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class DstCity {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value1")
                    protected String value1;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value1属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue1() {
                        return value1;
                    }

                    /**
                     * 设置value1属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue1(String value) {
                        this.value1 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value22" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class FlightNo {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value22")
                    protected Short value22;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value22属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getValue22() {
                        return value22;
                    }

                    /**
                     * 设置value22属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setValue22(Short value) {
                        this.value22 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value4" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Mileage {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value4")
                    protected Float value4;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value4属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    public Float getValue4() {
                        return value4;
                    }

                    /**
                     * 设置value4属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    public void setValue4(Float value) {
                        this.value4 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value26" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class OrgCity {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value26")
                    protected String value26;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value26属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue26() {
                        return value26;
                    }

                    /**
                     * 设置value26属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue26(String value) {
                        this.value26 = value;
                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="value3" type="{http://www.w3.org/2001/XMLSchema}short" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class PlaneType {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "value3")
                    protected Short value3;

                    /**
                     * 获取value属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * 获取value3属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getValue3() {
                        return value3;
                    }

                    /**
                     * 设置value3属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setValue3(Short value) {
                        this.value3 = value;
                    }

                }

            }

        }

    }

}
