
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>infoPnrTrip complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="infoPnrTrip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airplanetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tocity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoPnrTrip", propOrder = {
    "airplanetype",
    "cabin",
    "flightNo",
    "flightdate",
    "fromcity",
    "fromtime",
    "planetype",
    "tocity",
    "totime"
})
public class InfoPnrTrip {

    protected String airplanetype;
    protected String cabin;
    protected String flightNo;
    protected String flightdate;
    protected String fromcity;
    protected String fromtime;
    protected String planetype;
    protected String tocity;
    protected String totime;

    /**
     * 获取airplanetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirplanetype() {
        return airplanetype;
    }

    /**
     * 设置airplanetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirplanetype(String value) {
        this.airplanetype = value;
    }

    /**
     * 获取cabin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * 设置cabin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
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
     * 获取flightdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightdate() {
        return flightdate;
    }

    /**
     * 设置flightdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightdate(String value) {
        this.flightdate = value;
    }

    /**
     * 获取fromcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromcity() {
        return fromcity;
    }

    /**
     * 设置fromcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromcity(String value) {
        this.fromcity = value;
    }

    /**
     * 获取fromtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromtime() {
        return fromtime;
    }

    /**
     * 设置fromtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromtime(String value) {
        this.fromtime = value;
    }

    /**
     * 获取planetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanetype() {
        return planetype;
    }

    /**
     * 设置planetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanetype(String value) {
        this.planetype = value;
    }

    /**
     * 获取tocity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTocity() {
        return tocity;
    }

    /**
     * 设置tocity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTocity(String value) {
        this.tocity = value;
    }

    /**
     * 获取totime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotime() {
        return totime;
    }

    /**
     * 设置totime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotime(String value) {
        this.totime = value;
    }

}
