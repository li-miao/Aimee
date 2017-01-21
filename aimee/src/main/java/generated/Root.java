//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.01.21 时间 02:38:59 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;


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
 *         &lt;element name="Msg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IsShowCannelButton" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IsShowErrPayButton" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PnrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PnrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OrderSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PaySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ServerTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PayLimitTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalTicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalAirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalFuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalPiccPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalExpressPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalMpsDeduction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalCashCoupon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalWebPayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PayOrders" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayPlatformCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayWay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayWayCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Flights" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LegId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TakeoffTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ArriveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ClassLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Routes" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RouteDetails" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PassengerAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SumTicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SumAirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SumFuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DiscountPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="Passengers" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CertificateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CertificateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Birth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TicketNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Insurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Contact">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Express" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Changes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Refunds" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FlightTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Passengers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PassengerList" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AirportPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FuelPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Refund_Poundage_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Refund_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotalTicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TotalPayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TotalAirportPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TotalFuelPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RefundPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CheckContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RefundInsurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ErrorRefund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IsHaveInsurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IsCanRefundInsurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "msg",
    "code",
    "isSuccess",
    "data"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(name = "Msg", required = true)
    @JsonProperty(value = "Msg")
    protected String msg;
    @XmlElement(name = "Code", required = true)
    @JsonProperty(value = "Code")
    protected String code;
    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty(value = "IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "Data", required = true)
    @JsonProperty(value = "Data")
    protected Root.Data data;

    /**
     * 获取msg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置msg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取isSuccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    /**
     * 设置isSuccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSuccess(String value) {
        this.isSuccess = value;
    }

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Root.Data }
     *     
     */
    public Root.Data getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Root.Data }
     *     
     */
    public void setData(Root.Data value) {
        this.data = value;
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
     *         &lt;element name="IsShowCannelButton" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IsShowErrPayButton" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PnrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PnrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OrderSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PaySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ServerTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PayLimitTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalTicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalAirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalFuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalPiccPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalExpressPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalMpsDeduction" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalCashCoupon" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalWebPayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PayOrders" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayPlatformCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayWay" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayWayCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Flights" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LegId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TakeoffTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ArriveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ClassLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Routes" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RouteDetails" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PassengerAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SumTicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SumAirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SumFuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DiscountPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *         &lt;element name="Passengers" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CertificateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CertificateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Birth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TicketNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Insurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Contact">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Express" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Changes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Refunds" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FlightTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Passengers" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PassengerList" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AirportPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FuelPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Refund_Poundage_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Refund_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TotalTicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TotalPayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TotalAirportPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TotalFuelPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RefundPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CheckContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RefundInsurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ErrorRefund" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IsHaveInsurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IsCanRefundInsurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "isShowCannelButton",
        "id",
        "isShowErrPayButton",
        "pnrId",
        "pnrCode",
        "orderSerialNumber",
        "paySerialNumber",
        "status",
        "payId",
        "serverTime",
        "payLimitTime",
        "statusCode",
        "totalPrice",
        "totalTicketPrice",
        "totalAirportTax",
        "totalFuelTax",
        "totalPiccPrice",
        "totalExpressPrice",
        "totalMpsDeduction",
        "totalCashCoupon",
        "totalWebPayPrice",
        "payOrders",
        "flights",
        "routes",
        "passengers",
        "contact",
        "express",
        "changes",
        "refunds",
        "refundInsurances",
        "errorRefund",
        "isHaveInsurances",
        "isCanRefundInsurances"
    })
    public static class Data {

        @XmlElement(name = "IsShowCannelButton", required = true)
        @JsonProperty(value = "IsShowCannelButton")
        protected String isShowCannelButton;
        @XmlElement(name = "Id", required = true)
        @JsonProperty(value = "Id")
        protected String id;
        @XmlElement(name = "IsShowErrPayButton", required = true)
        @JsonProperty(value = "IsShowErrPayButton")
        protected String isShowErrPayButton;
        @XmlElement(name = "PnrId", required = true)
        @JsonProperty(value = "PnrId")
        protected String pnrId;
        @XmlElement(name = "PnrCode", required = true)
        @JsonProperty(value = "PnrCode")
        protected String pnrCode;
        @XmlElement(name = "OrderSerialNumber", required = true)
        @JsonProperty(value = "OrderSerialNumber")
        protected String orderSerialNumber;
        @XmlElement(name = "PaySerialNumber", required = true)
        @JsonProperty(value = "PaySerialNumber")
        protected String paySerialNumber;
        @XmlElement(name = "Status", required = true)
        @JsonProperty(value = "Status")
        protected String status;
        @XmlElement(name = "PayId", required = true)
        @JsonProperty(value = "PayId")
        protected String payId;
        @XmlElement(name = "ServerTime", required = true)
        @JsonProperty(value = "ServerTime")
        protected String serverTime;
        @XmlElement(name = "PayLimitTime", required = true)
        @JsonProperty(value = "PayLimitTime")
        protected String payLimitTime;
        @XmlElement(name = "StatusCode", required = true)
        @JsonProperty(value = "StatusCode")
        protected String statusCode;
        @XmlElement(name = "TotalPrice", required = true)
        @JsonProperty(value = "TotalPrice")
        protected String totalPrice;
        @XmlElement(name = "TotalTicketPrice", required = true)
        @JsonProperty(value = "TotalTicketPrice")
        protected String totalTicketPrice;
        @XmlElement(name = "TotalAirportTax", required = true)
        @JsonProperty(value = "TotalAirportTax")
        protected String totalAirportTax;
        @XmlElement(name = "TotalFuelTax", required = true)
        @JsonProperty(value = "TotalFuelTax")
        protected String totalFuelTax;
        @XmlElement(name = "TotalPiccPrice", required = true)
        @JsonProperty(value = "TotalPiccPrice")
        protected String totalPiccPrice;
        @XmlElement(name = "TotalExpressPrice", required = true)
        @JsonProperty(value = "TotalExpressPrice")
        protected String totalExpressPrice;
        @XmlElement(name = "TotalMpsDeduction", required = true)
        @JsonProperty(value = "TotalMpsDeduction")
        protected String totalMpsDeduction;
        @XmlElement(name = "TotalCashCoupon", required = true)
        @JsonProperty(value = "TotalCashCoupon")
        protected String totalCashCoupon;
        @XmlElement(name = "TotalWebPayPrice", required = true)
        @JsonProperty(value = "TotalWebPayPrice")
        protected String totalWebPayPrice;
        @XmlElement(name = "PayOrders")
        @JsonProperty(value = "PayOrders")
        protected List<Root.Data.PayOrders> payOrders;
        @XmlElement(name = "Flights")
        @JsonProperty(value = "Flights")
        protected List<Root.Data.Flights> flights;
        @XmlElement(name = "Routes")
        @JsonProperty(value = "Routes")
        protected List<Root.Data.Routes> routes;
        @XmlElement(name = "Passengers")
        @JsonProperty(value = "Passengers")
        protected List<Root.Data.Passengers> passengers;
        @XmlElement(name = "Contact", required = true)
        @JsonProperty(value = "Contact")
        protected Root.Data.Contact contact;
        @XmlElement(name = "Express", required = true)
        @JsonProperty(value = "Express")
        protected String express;
        @XmlElement(name = "Changes", required = true)
        @JsonProperty(value = "Changes")
        protected String changes;
        @XmlElement(name = "Refunds")
        @JsonProperty(value = "Refunds")
        protected List<Root.Data.Refunds> refunds;
        @XmlElement(name = "RefundInsurances", required = true)
        @JsonProperty(value = "RefundInsurances")
        protected String refundInsurances;
        @XmlElement(name = "ErrorRefund", required = true)
        @JsonProperty(value = "ErrorRefund")
        protected String errorRefund;
        @XmlElement(name = "IsHaveInsurances", required = true)
        @JsonProperty(value = "IsHaveInsurances")
        protected String isHaveInsurances;
        @XmlElement(name = "IsCanRefundInsurances", required = true)
        @JsonProperty(value = "IsCanRefundInsurances")
        protected String isCanRefundInsurances;

        /**
         * 获取isShowCannelButton属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsShowCannelButton() {
            return isShowCannelButton;
        }

        /**
         * 设置isShowCannelButton属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsShowCannelButton(String value) {
            this.isShowCannelButton = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * 获取isShowErrPayButton属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsShowErrPayButton() {
            return isShowErrPayButton;
        }

        /**
         * 设置isShowErrPayButton属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsShowErrPayButton(String value) {
            this.isShowErrPayButton = value;
        }

        /**
         * 获取pnrId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPnrId() {
            return pnrId;
        }

        /**
         * 设置pnrId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPnrId(String value) {
            this.pnrId = value;
        }

        /**
         * 获取pnrCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPnrCode() {
            return pnrCode;
        }

        /**
         * 设置pnrCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPnrCode(String value) {
            this.pnrCode = value;
        }

        /**
         * 获取orderSerialNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderSerialNumber() {
            return orderSerialNumber;
        }

        /**
         * 设置orderSerialNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderSerialNumber(String value) {
            this.orderSerialNumber = value;
        }

        /**
         * 获取paySerialNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaySerialNumber() {
            return paySerialNumber;
        }

        /**
         * 设置paySerialNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaySerialNumber(String value) {
            this.paySerialNumber = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * 获取payId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayId() {
            return payId;
        }

        /**
         * 设置payId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayId(String value) {
            this.payId = value;
        }

        /**
         * 获取serverTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServerTime() {
            return serverTime;
        }

        /**
         * 设置serverTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServerTime(String value) {
            this.serverTime = value;
        }

        /**
         * 获取payLimitTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayLimitTime() {
            return payLimitTime;
        }

        /**
         * 设置payLimitTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayLimitTime(String value) {
            this.payLimitTime = value;
        }

        /**
         * 获取statusCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * 设置statusCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * 获取totalPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalPrice() {
            return totalPrice;
        }

        /**
         * 设置totalPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalPrice(String value) {
            this.totalPrice = value;
        }

        /**
         * 获取totalTicketPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalTicketPrice() {
            return totalTicketPrice;
        }

        /**
         * 设置totalTicketPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalTicketPrice(String value) {
            this.totalTicketPrice = value;
        }

        /**
         * 获取totalAirportTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalAirportTax() {
            return totalAirportTax;
        }

        /**
         * 设置totalAirportTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalAirportTax(String value) {
            this.totalAirportTax = value;
        }

        /**
         * 获取totalFuelTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalFuelTax() {
            return totalFuelTax;
        }

        /**
         * 设置totalFuelTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalFuelTax(String value) {
            this.totalFuelTax = value;
        }

        /**
         * 获取totalPiccPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalPiccPrice() {
            return totalPiccPrice;
        }

        /**
         * 设置totalPiccPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalPiccPrice(String value) {
            this.totalPiccPrice = value;
        }

        /**
         * 获取totalExpressPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalExpressPrice() {
            return totalExpressPrice;
        }

        /**
         * 设置totalExpressPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalExpressPrice(String value) {
            this.totalExpressPrice = value;
        }

        /**
         * 获取totalMpsDeduction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalMpsDeduction() {
            return totalMpsDeduction;
        }

        /**
         * 设置totalMpsDeduction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalMpsDeduction(String value) {
            this.totalMpsDeduction = value;
        }

        /**
         * 获取totalCashCoupon属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalCashCoupon() {
            return totalCashCoupon;
        }

        /**
         * 设置totalCashCoupon属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalCashCoupon(String value) {
            this.totalCashCoupon = value;
        }

        /**
         * 获取totalWebPayPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalWebPayPrice() {
            return totalWebPayPrice;
        }

        /**
         * 设置totalWebPayPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalWebPayPrice(String value) {
            this.totalWebPayPrice = value;
        }

        /**
         * Gets the value of the payOrders property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payOrders property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayOrders().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Root.Data.PayOrders }
         * 
         * 
         */
        public List<Root.Data.PayOrders> getPayOrders() {
            if (payOrders == null) {
                payOrders = new ArrayList<Root.Data.PayOrders>();
            }
            return this.payOrders;
        }

        /**
         * Gets the value of the flights property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flights property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlights().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Root.Data.Flights }
         * 
         * 
         */
        public List<Root.Data.Flights> getFlights() {
            if (flights == null) {
                flights = new ArrayList<Root.Data.Flights>();
            }
            return this.flights;
        }

        /**
         * Gets the value of the routes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoutes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Root.Data.Routes }
         * 
         * 
         */
        public List<Root.Data.Routes> getRoutes() {
            if (routes == null) {
                routes = new ArrayList<Root.Data.Routes>();
            }
            return this.routes;
        }

        /**
         * Gets the value of the passengers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Root.Data.Passengers }
         * 
         * 
         */
        public List<Root.Data.Passengers> getPassengers() {
            if (passengers == null) {
                passengers = new ArrayList<Root.Data.Passengers>();
            }
            return this.passengers;
        }

        /**
         * 获取contact属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Root.Data.Contact }
         *     
         */
        public Root.Data.Contact getContact() {
            return contact;
        }

        /**
         * 设置contact属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Root.Data.Contact }
         *     
         */
        public void setContact(Root.Data.Contact value) {
            this.contact = value;
        }

        /**
         * 获取express属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpress() {
            return express;
        }

        /**
         * 设置express属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpress(String value) {
            this.express = value;
        }

        /**
         * 获取changes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChanges() {
            return changes;
        }

        /**
         * 设置changes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChanges(String value) {
            this.changes = value;
        }

        /**
         * Gets the value of the refunds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refunds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefunds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Root.Data.Refunds }
         * 
         * 
         */
        public List<Root.Data.Refunds> getRefunds() {
            if (refunds == null) {
                refunds = new ArrayList<Root.Data.Refunds>();
            }
            return this.refunds;
        }

        /**
         * 获取refundInsurances属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefundInsurances() {
            return refundInsurances;
        }

        /**
         * 设置refundInsurances属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefundInsurances(String value) {
            this.refundInsurances = value;
        }

        /**
         * 获取errorRefund属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorRefund() {
            return errorRefund;
        }

        /**
         * 设置errorRefund属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorRefund(String value) {
            this.errorRefund = value;
        }

        /**
         * 获取isHaveInsurances属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsHaveInsurances() {
            return isHaveInsurances;
        }

        /**
         * 设置isHaveInsurances属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsHaveInsurances(String value) {
            this.isHaveInsurances = value;
        }

        /**
         * 获取isCanRefundInsurances属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsCanRefundInsurances() {
            return isCanRefundInsurances;
        }

        /**
         * 设置isCanRefundInsurances属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsCanRefundInsurances(String value) {
            this.isCanRefundInsurances = value;
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
         *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "contactName",
            "mobilePhone",
            "email"
        })
        public static class Contact {

            @XmlElement(name = "ContactName", required = true)
            @JsonProperty(value = "ContactName")
            protected String contactName;
            @XmlElement(name = "MobilePhone", required = true)
            @JsonProperty(value = "MobilePhone")
            protected String mobilePhone;
            @XmlElement(name = "Email", required = true)
            @JsonProperty(value = "Email")
            protected String email;

            /**
             * 获取contactName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactName() {
                return contactName;
            }

            /**
             * 设置contactName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactName(String value) {
                this.contactName = value;
            }

            /**
             * 获取mobilePhone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMobilePhone() {
                return mobilePhone;
            }

            /**
             * 设置mobilePhone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMobilePhone(String value) {
                this.mobilePhone = value;
            }

            /**
             * 获取email属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * 设置email属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
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
         *         &lt;element name="LegId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TakeoffTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ArriveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ClassLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "legId",
            "departure",
            "arrival",
            "flightDate",
            "takeoffTime",
            "arriveTime",
            "airline",
            "flightNo",
            "departureCity",
            "arrivalCity",
            "classLevel",
            "productCode",
            "productName"
        })
        public static class Flights {

            @XmlElement(name = "LegId", required = true)
            @JsonProperty(value = "LegId")
            protected String legId;
            @XmlElement(name = "Departure", required = true)
            @JsonProperty(value = "Departure")
            protected String departure;
            @XmlElement(name = "Arrival", required = true)
            @JsonProperty(value = "Arrival")
            protected String arrival;
            @XmlElement(name = "FlightDate", required = true)
            @JsonProperty(value = "FlightDate")
            protected String flightDate;
            @XmlElement(name = "TakeoffTime", required = true)
            @JsonProperty(value = "TakeoffTime")
            protected String takeoffTime;
            @XmlElement(name = "ArriveTime", required = true)
            @JsonProperty(value = "ArriveTime")
            protected String arriveTime;
            @XmlElement(name = "Airline", required = true)
            @JsonProperty(value = "Airline")
            protected String airline;
            @XmlElement(name = "FlightNo", required = true)
            @JsonProperty(value = "FlightNo")
            protected String flightNo;
            @XmlElement(name = "DepartureCity", required = true)
            @JsonProperty(value = "DepartureCity")
            protected String departureCity;
            @XmlElement(name = "ArrivalCity", required = true)
            @JsonProperty(value = "ArrivalCity")
            protected String arrivalCity;
            @XmlElement(name = "ClassLevel", required = true)
            @JsonProperty(value = "ClassLevel")
            protected String classLevel;
            @XmlElement(name = "ProductCode", required = true)
            @JsonProperty(value = "ProductCode")
            protected String productCode;
            @XmlElement(name = "ProductName", required = true)
            @JsonProperty(value = "ProductName")
            protected String productName;

            /**
             * 获取legId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegId() {
                return legId;
            }

            /**
             * 设置legId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegId(String value) {
                this.legId = value;
            }

            /**
             * 获取departure属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeparture() {
                return departure;
            }

            /**
             * 设置departure属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeparture(String value) {
                this.departure = value;
            }

            /**
             * 获取arrival属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrival() {
                return arrival;
            }

            /**
             * 设置arrival属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrival(String value) {
                this.arrival = value;
            }

            /**
             * 获取flightDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightDate() {
                return flightDate;
            }

            /**
             * 设置flightDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightDate(String value) {
                this.flightDate = value;
            }

            /**
             * 获取takeoffTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTakeoffTime() {
                return takeoffTime;
            }

            /**
             * 设置takeoffTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTakeoffTime(String value) {
                this.takeoffTime = value;
            }

            /**
             * 获取arriveTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArriveTime() {
                return arriveTime;
            }

            /**
             * 设置arriveTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArriveTime(String value) {
                this.arriveTime = value;
            }

            /**
             * 获取airline属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirline() {
                return airline;
            }

            /**
             * 设置airline属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirline(String value) {
                this.airline = value;
            }

            /**
             * 获取flightNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNo() {
                return flightNo;
            }

            /**
             * 设置flightNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNo(String value) {
                this.flightNo = value;
            }

            /**
             * 获取departureCity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureCity() {
                return departureCity;
            }

            /**
             * 设置departureCity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureCity(String value) {
                this.departureCity = value;
            }

            /**
             * 获取arrivalCity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalCity() {
                return arrivalCity;
            }

            /**
             * 设置arrivalCity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalCity(String value) {
                this.arrivalCity = value;
            }

            /**
             * 获取classLevel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassLevel() {
                return classLevel;
            }

            /**
             * 设置classLevel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassLevel(String value) {
                this.classLevel = value;
            }

            /**
             * 获取productCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductCode() {
                return productCode;
            }

            /**
             * 设置productCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductCode(String value) {
                this.productCode = value;
            }

            /**
             * 获取productName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductName() {
                return productName;
            }

            /**
             * 设置productName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductName(String value) {
                this.productName = value;
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
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CertificateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CertificateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Birth" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TicketNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Insurances" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "id",
            "passengerName",
            "passengerType",
            "certificateType",
            "certificateTypeCode",
            "birth",
            "certificate",
            "ticketNo",
            "contactPhone",
            "insurances"
        })
        public static class Passengers {

            @XmlElement(name = "Id", required = true)
            @JsonProperty(value = "Id")
            protected String id;
            @XmlElement(name = "PassengerName", required = true)
            @JsonProperty(value = "PassengerName")
            protected String passengerName;
            @XmlElement(name = "PassengerType", required = true)
            @JsonProperty(value = "PassengerType")
            protected String passengerType;
            @XmlElement(name = "CertificateType", required = true)
            @JsonProperty(value = "CertificateType")
            protected String certificateType;
            @XmlElement(name = "CertificateTypeCode", required = true)
            @JsonProperty(value = "CertificateTypeCode")
            protected String certificateTypeCode;
            @XmlElement(name = "Birth", required = true)
            @JsonProperty(value = "Birth")
            protected String birth;
            @XmlElement(name = "Certificate", required = true)
            @JsonProperty(value = "Certificate")
            protected String certificate;
            @XmlElement(name = "TicketNo", required = true)
            @JsonProperty(value = "TicketNo")
            protected String ticketNo;
            @XmlElement(name = "ContactPhone", required = true)
            @JsonProperty(value = "ContactPhone")
            protected String contactPhone;
            @XmlElement(name = "Insurances", required = true)
            @JsonProperty(value = "Insurances")
            protected String insurances;

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * 获取passengerName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassengerName() {
                return passengerName;
            }

            /**
             * 设置passengerName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassengerName(String value) {
                this.passengerName = value;
            }

            /**
             * 获取passengerType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassengerType() {
                return passengerType;
            }

            /**
             * 设置passengerType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassengerType(String value) {
                this.passengerType = value;
            }

            /**
             * 获取certificateType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCertificateType() {
                return certificateType;
            }

            /**
             * 设置certificateType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCertificateType(String value) {
                this.certificateType = value;
            }

            /**
             * 获取certificateTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCertificateTypeCode() {
                return certificateTypeCode;
            }

            /**
             * 设置certificateTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCertificateTypeCode(String value) {
                this.certificateTypeCode = value;
            }

            /**
             * 获取birth属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBirth() {
                return birth;
            }

            /**
             * 设置birth属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBirth(String value) {
                this.birth = value;
            }

            /**
             * 获取certificate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCertificate() {
                return certificate;
            }

            /**
             * 设置certificate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCertificate(String value) {
                this.certificate = value;
            }

            /**
             * 获取ticketNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketNo() {
                return ticketNo;
            }

            /**
             * 设置ticketNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketNo(String value) {
                this.ticketNo = value;
            }

            /**
             * 获取contactPhone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactPhone() {
                return contactPhone;
            }

            /**
             * 设置contactPhone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactPhone(String value) {
                this.contactPhone = value;
            }

            /**
             * 获取insurances属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsurances() {
                return insurances;
            }

            /**
             * 设置insurances属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsurances(String value) {
                this.insurances = value;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayPlatformCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayWay" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayWayCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "id",
            "serialNumber",
            "payPrice",
            "payPlatform",
            "payPlatformCode",
            "payWay",
            "payWayCode",
            "payTime",
            "payType",
            "payStatus",
            "payStatusCode"
        })
        public static class PayOrders {

            @XmlElement(name = "ID", required = true)
            @JsonProperty(value = "ID")
            protected String id;
            @XmlElement(name = "SerialNumber", required = true)
            @JsonProperty(value = "SerialNumber")
            protected String serialNumber;
            @XmlElement(name = "PayPrice", required = true)
            @JsonProperty(value = "PayPrice")
            protected String payPrice;
            @XmlElement(name = "PayPlatform", required = true)
            @JsonProperty(value = "PayPlatform")
            protected String payPlatform;
            @XmlElement(name = "PayPlatformCode", required = true)
            @JsonProperty(value = "PayPlatformCode")
            protected String payPlatformCode;
            @XmlElement(name = "PayWay", required = true)
            @JsonProperty(value = "PayWay")
            protected String payWay;
            @XmlElement(name = "PayWayCode", required = true)
            @JsonProperty(value = "PayWayCode")
            protected String payWayCode;
            @XmlElement(name = "PayTime", required = true)
            @JsonProperty(value = "PayTime")
            protected String payTime;
            @XmlElement(name = "PayType", required = true)
            @JsonProperty(value = "PayType")
            protected String payType;
            @XmlElement(name = "PayStatus", required = true)
            @JsonProperty(value = "PayStatus")
            protected String payStatus;
            @XmlElement(name = "PayStatusCode", required = true)
            @JsonProperty(value = "PayStatusCode")
            protected String payStatusCode;

            /**
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * 获取serialNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerialNumber() {
                return serialNumber;
            }

            /**
             * 设置serialNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerialNumber(String value) {
                this.serialNumber = value;
            }

            /**
             * 获取payPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayPrice() {
                return payPrice;
            }

            /**
             * 设置payPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayPrice(String value) {
                this.payPrice = value;
            }

            /**
             * 获取payPlatform属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayPlatform() {
                return payPlatform;
            }

            /**
             * 设置payPlatform属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayPlatform(String value) {
                this.payPlatform = value;
            }

            /**
             * 获取payPlatformCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayPlatformCode() {
                return payPlatformCode;
            }

            /**
             * 设置payPlatformCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayPlatformCode(String value) {
                this.payPlatformCode = value;
            }

            /**
             * 获取payWay属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayWay() {
                return payWay;
            }

            /**
             * 设置payWay属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayWay(String value) {
                this.payWay = value;
            }

            /**
             * 获取payWayCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayWayCode() {
                return payWayCode;
            }

            /**
             * 设置payWayCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayWayCode(String value) {
                this.payWayCode = value;
            }

            /**
             * 获取payTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayTime() {
                return payTime;
            }

            /**
             * 设置payTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayTime(String value) {
                this.payTime = value;
            }

            /**
             * 获取payType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayType() {
                return payType;
            }

            /**
             * 设置payType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayType(String value) {
                this.payType = value;
            }

            /**
             * 获取payStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayStatus() {
                return payStatus;
            }

            /**
             * 设置payStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayStatus(String value) {
                this.payStatus = value;
            }

            /**
             * 获取payStatusCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayStatusCode() {
                return payStatusCode;
            }

            /**
             * 设置payStatusCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayStatusCode(String value) {
                this.payStatusCode = value;
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
         *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FlightTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Passengers" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PassengerList" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AirportPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FuelPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Refund_Poundage_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Refund_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TotalTicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TotalPayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TotalAirportPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TotalFuelPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RefundPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CheckContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "route",
            "flightNo",
            "flightTime",
            "clazz",
            "passengers",
            "passengerList",
            "totalTicketPrice",
            "totalPayPrice",
            "totalAirportPrice",
            "totalFuelPrice",
            "refundPrice",
            "createTime",
            "status",
            "statusCode",
            "checkContent"
        })
        public static class Refunds {

            @XmlElement(name = "Route", required = true)
            @JsonProperty(value = "Route")
            protected String route;
            @XmlElement(name = "FlightNo", required = true)
            @JsonProperty(value = "FlightNo")
            protected String flightNo;
            @XmlElement(name = "FlightTime", required = true)
            @JsonProperty(value = "FlightTime")
            protected String flightTime;
            @XmlElement(name = "Class", required = true)
            @JsonProperty(value = "Class")
            protected String clazz;
            @XmlElement(name = "Passengers", required = true)
            @JsonProperty(value = "Passengers")
            protected String passengers;
            @XmlElement(name = "PassengerList")
            @JsonProperty(value = "PassengerList")
            protected List<Root.Data.Refunds.PassengerList> passengerList;
            @XmlElement(name = "TotalTicketPrice", required = true)
            @JsonProperty(value = "TotalTicketPrice")
            protected String totalTicketPrice;
            @XmlElement(name = "TotalPayPrice", required = true)
            @JsonProperty(value = "TotalPayPrice")
            protected String totalPayPrice;
            @XmlElement(name = "TotalAirportPrice", required = true)
            @JsonProperty(value = "TotalAirportPrice")
            protected String totalAirportPrice;
            @XmlElement(name = "TotalFuelPrice", required = true)
            @JsonProperty(value = "TotalFuelPrice")
            protected String totalFuelPrice;
            @XmlElement(name = "RefundPrice", required = true)
            @JsonProperty(value = "RefundPrice")
            protected String refundPrice;
            @XmlElement(name = "CreateTime", required = true)
            @JsonProperty(value = "CreateTime")
            protected String createTime;
            @XmlElement(name = "Status", required = true)
            @JsonProperty(value = "Status")
            protected String status;
            @XmlElement(name = "StatusCode", required = true)
            @JsonProperty(value = "StatusCode")
            protected String statusCode;
            @XmlElement(name = "CheckContent", required = true)
            @JsonProperty(value = "CheckContent")
            protected String checkContent;

            /**
             * 获取route属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoute() {
                return route;
            }

            /**
             * 设置route属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoute(String value) {
                this.route = value;
            }

            /**
             * 获取flightNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNo() {
                return flightNo;
            }

            /**
             * 设置flightNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNo(String value) {
                this.flightNo = value;
            }

            /**
             * 获取flightTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightTime() {
                return flightTime;
            }

            /**
             * 设置flightTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightTime(String value) {
                this.flightTime = value;
            }

            /**
             * 获取clazz属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * 设置clazz属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
            }

            /**
             * 获取passengers属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassengers() {
                return passengers;
            }

            /**
             * 设置passengers属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassengers(String value) {
                this.passengers = value;
            }

            /**
             * Gets the value of the passengerList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Root.Data.Refunds.PassengerList }
             * 
             * 
             */
            public List<Root.Data.Refunds.PassengerList> getPassengerList() {
                if (passengerList == null) {
                    passengerList = new ArrayList<Root.Data.Refunds.PassengerList>();
                }
                return this.passengerList;
            }

            /**
             * 获取totalTicketPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalTicketPrice() {
                return totalTicketPrice;
            }

            /**
             * 设置totalTicketPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalTicketPrice(String value) {
                this.totalTicketPrice = value;
            }

            /**
             * 获取totalPayPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalPayPrice() {
                return totalPayPrice;
            }

            /**
             * 设置totalPayPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalPayPrice(String value) {
                this.totalPayPrice = value;
            }

            /**
             * 获取totalAirportPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalAirportPrice() {
                return totalAirportPrice;
            }

            /**
             * 设置totalAirportPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalAirportPrice(String value) {
                this.totalAirportPrice = value;
            }

            /**
             * 获取totalFuelPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalFuelPrice() {
                return totalFuelPrice;
            }

            /**
             * 设置totalFuelPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalFuelPrice(String value) {
                this.totalFuelPrice = value;
            }

            /**
             * 获取refundPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefundPrice() {
                return refundPrice;
            }

            /**
             * 设置refundPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefundPrice(String value) {
                this.refundPrice = value;
            }

            /**
             * 获取createTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateTime() {
                return createTime;
            }

            /**
             * 设置createTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateTime(String value) {
                this.createTime = value;
            }

            /**
             * 获取status属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * 设置status属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * 获取statusCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusCode() {
                return statusCode;
            }

            /**
             * 设置statusCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusCode(String value) {
                this.statusCode = value;
            }

            /**
             * 获取checkContent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckContent() {
                return checkContent;
            }

            /**
             * 设置checkContent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckContent(String value) {
                this.checkContent = value;
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
             *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PayPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TicketPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AirportPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FuelPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Refund_Poundage_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Refund_Price" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "passengerName",
                "payPrice",
                "ticketPrice",
                "airportPrice",
                "fuelPrice",
                "refundPoundagePrice",
                "refundPrice"
            })
            public static class PassengerList {

                @XmlElement(name = "PassengerName", required = true)
                @JsonProperty(value = "PassengerName")
                protected String passengerName;
                @XmlElement(name = "PayPrice", required = true)
                @JsonProperty(value = "PayPrice")
                protected String payPrice;
                @XmlElement(name = "TicketPrice", required = true)
                @JsonProperty(value = "TicketPrice")
                protected String ticketPrice;
                @XmlElement(name = "AirportPrice", required = true)
                @JsonProperty(value = "AirportPrice")
                protected String airportPrice;
                @XmlElement(name = "FuelPrice", required = true)
                @JsonProperty(value = "FuelPrice")
                protected String fuelPrice;
                @XmlElement(name = "Refund_Poundage_Price", required = true)
                @JsonProperty(value = "Refund_Poundage_Price")
                protected String refundPoundagePrice;
                @XmlElement(name = "Refund_Price", required = true)
                @JsonProperty(value = "Refund_Price")
                protected String refundPrice;

                /**
                 * 获取passengerName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassengerName() {
                    return passengerName;
                }

                /**
                 * 设置passengerName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassengerName(String value) {
                    this.passengerName = value;
                }

                /**
                 * 获取payPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPayPrice() {
                    return payPrice;
                }

                /**
                 * 设置payPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPayPrice(String value) {
                    this.payPrice = value;
                }

                /**
                 * 获取ticketPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTicketPrice() {
                    return ticketPrice;
                }

                /**
                 * 设置ticketPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTicketPrice(String value) {
                    this.ticketPrice = value;
                }

                /**
                 * 获取airportPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirportPrice() {
                    return airportPrice;
                }

                /**
                 * 设置airportPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirportPrice(String value) {
                    this.airportPrice = value;
                }

                /**
                 * 获取fuelPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFuelPrice() {
                    return fuelPrice;
                }

                /**
                 * 设置fuelPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFuelPrice(String value) {
                    this.fuelPrice = value;
                }

                /**
                 * 获取refundPoundagePrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefundPoundagePrice() {
                    return refundPoundagePrice;
                }

                /**
                 * 设置refundPoundagePrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefundPoundagePrice(String value) {
                    this.refundPoundagePrice = value;
                }

                /**
                 * 获取refundPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefundPrice() {
                    return refundPrice;
                }

                /**
                 * 设置refundPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefundPrice(String value) {
                    this.refundPrice = value;
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
         *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RouteDetails" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PassengerAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SumTicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SumAirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SumFuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DiscountPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "route",
            "routeDetails"
        })
        public static class Routes {

            @XmlElement(name = "Route", required = true)
            @JsonProperty(value = "Route")
            protected String route;
            @XmlElement(name = "RouteDetails")
            @JsonProperty(value = "RouteDetails")
            protected List<Root.Data.Routes.RouteDetails> routeDetails;

            /**
             * 获取route属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoute() {
                return route;
            }

            /**
             * 设置route属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoute(String value) {
                this.route = value;
            }

            /**
             * Gets the value of the routeDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the routeDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRouteDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Root.Data.Routes.RouteDetails }
             * 
             * 
             */
            public List<Root.Data.Routes.RouteDetails> getRouteDetails() {
                if (routeDetails == null) {
                    routeDetails = new ArrayList<Root.Data.Routes.RouteDetails>();
                }
                return this.routeDetails;
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
             *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PassengerAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="AirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SumTicketTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SumAirportTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SumFuelTax" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DiscountPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "passengerType",
                "passengerAmount",
                "ticketTotalPrice",
                "airportTax",
                "fuelTax",
                "sumTicketTotalPrice",
                "sumAirportTax",
                "sumFuelTax",
                "discountPrice"
            })
            public static class RouteDetails {

                @XmlElement(name = "PassengerType", required = true)
                @JsonProperty(value = "PassengerType")
                protected String passengerType;
                @XmlElement(name = "PassengerAmount", required = true)
                @JsonProperty(value = "PassengerAmount")
                protected String passengerAmount;
                @XmlElement(name = "TicketTotalPrice", required = true)
                @JsonProperty(value = "TicketTotalPrice")
                protected String ticketTotalPrice;
                @XmlElement(name = "AirportTax", required = true)
                @JsonProperty(value = "AirportTax")
                protected String airportTax;
                @XmlElement(name = "FuelTax", required = true)
                @JsonProperty(value = "FuelTax")
                protected String fuelTax;
                @XmlElement(name = "SumTicketTotalPrice", required = true)
                @JsonProperty(value = "SumTicketTotalPrice")
                protected String sumTicketTotalPrice;
                @XmlElement(name = "SumAirportTax", required = true)
                @JsonProperty(value = "SumAirportTax")
                protected String sumAirportTax;
                @XmlElement(name = "SumFuelTax", required = true)
                @JsonProperty(value = "SumFuelTax")
                protected String sumFuelTax;
                @XmlElement(name = "DiscountPrice", required = true)
                @JsonProperty(value = "DiscountPrice")
                protected String discountPrice;

                /**
                 * 获取passengerType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassengerType() {
                    return passengerType;
                }

                /**
                 * 设置passengerType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassengerType(String value) {
                    this.passengerType = value;
                }

                /**
                 * 获取passengerAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassengerAmount() {
                    return passengerAmount;
                }

                /**
                 * 设置passengerAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassengerAmount(String value) {
                    this.passengerAmount = value;
                }

                /**
                 * 获取ticketTotalPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTicketTotalPrice() {
                    return ticketTotalPrice;
                }

                /**
                 * 设置ticketTotalPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTicketTotalPrice(String value) {
                    this.ticketTotalPrice = value;
                }

                /**
                 * 获取airportTax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirportTax() {
                    return airportTax;
                }

                /**
                 * 设置airportTax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirportTax(String value) {
                    this.airportTax = value;
                }

                /**
                 * 获取fuelTax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFuelTax() {
                    return fuelTax;
                }

                /**
                 * 设置fuelTax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFuelTax(String value) {
                    this.fuelTax = value;
                }

                /**
                 * 获取sumTicketTotalPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSumTicketTotalPrice() {
                    return sumTicketTotalPrice;
                }

                /**
                 * 设置sumTicketTotalPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSumTicketTotalPrice(String value) {
                    this.sumTicketTotalPrice = value;
                }

                /**
                 * 获取sumAirportTax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSumAirportTax() {
                    return sumAirportTax;
                }

                /**
                 * 设置sumAirportTax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSumAirportTax(String value) {
                    this.sumAirportTax = value;
                }

                /**
                 * 获取sumFuelTax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSumFuelTax() {
                    return sumFuelTax;
                }

                /**
                 * 设置sumFuelTax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSumFuelTax(String value) {
                    this.sumFuelTax = value;
                }

                /**
                 * 获取discountPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiscountPrice() {
                    return discountPrice;
                }

                /**
                 * 设置discountPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiscountPrice(String value) {
                    this.discountPrice = value;
                }

            }

        }

    }

}
