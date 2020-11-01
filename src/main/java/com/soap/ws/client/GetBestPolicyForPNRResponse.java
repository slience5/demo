
package com.soap.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getBestPolicyForPNRResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getBestPolicyForPNRResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlinePNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="airporttax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightInfos" type="{http://cxfcenter.web.com/}infoPnrTrip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fueltax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerInfos" type="{http://cxfcenter.web.com/}infopnrPassenger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pnrno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyresult" type="{http://cxfcenter.web.com/}policy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="psaanergertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBestPolicyForPNRResponse", propOrder = {
    "airlinePNR",
    "airporttax",
    "errorcode",
    "errorinfo",
    "flightInfos",
    "fueltax",
    "passengerInfos",
    "pnrno",
    "policyresult",
    "price",
    "psaanergertype"
})
public class GetBestPolicyForPNRResponse {

    protected String airlinePNR;
    protected String airporttax;
    protected String errorcode;
    protected String errorinfo;
    @XmlElement(nillable = true)
    protected List<InfoPnrTrip> flightInfos;
    protected String fueltax;
    @XmlElement(nillable = true)
    protected List<InfopnrPassenger> passengerInfos;
    protected String pnrno;
    @XmlElement(nillable = true)
    protected List<Policy> policyresult;
    protected String price;
    protected String psaanergertype;

    /**
     * 获取airlinePNR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlinePNR() {
        return airlinePNR;
    }

    /**
     * 设置airlinePNR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlinePNR(String value) {
        this.airlinePNR = value;
    }

    /**
     * 获取airporttax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirporttax() {
        return airporttax;
    }

    /**
     * 设置airporttax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirporttax(String value) {
        this.airporttax = value;
    }

    /**
     * 获取errorcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
     * 设置errorcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorcode(String value) {
        this.errorcode = value;
    }

    /**
     * 获取errorinfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorinfo() {
        return errorinfo;
    }

    /**
     * 设置errorinfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorinfo(String value) {
        this.errorinfo = value;
    }

    /**
     * Gets the value of the flightInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoPnrTrip }
     * 
     * 
     */
    public List<InfoPnrTrip> getFlightInfos() {
        if (flightInfos == null) {
            flightInfos = new ArrayList<InfoPnrTrip>();
        }
        return this.flightInfos;
    }

    /**
     * 获取fueltax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFueltax() {
        return fueltax;
    }

    /**
     * 设置fueltax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFueltax(String value) {
        this.fueltax = value;
    }

    /**
     * Gets the value of the passengerInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfopnrPassenger }
     * 
     * 
     */
    public List<InfopnrPassenger> getPassengerInfos() {
        if (passengerInfos == null) {
            passengerInfos = new ArrayList<InfopnrPassenger>();
        }
        return this.passengerInfos;
    }

    /**
     * 获取pnrno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrno() {
        return pnrno;
    }

    /**
     * 设置pnrno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrno(String value) {
        this.pnrno = value;
    }

    /**
     * Gets the value of the policyresult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyresult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyresult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policy }
     * 
     * 
     */
    public List<Policy> getPolicyresult() {
        if (policyresult == null) {
            policyresult = new ArrayList<Policy>();
        }
        return this.policyresult;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * 获取psaanergertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsaanergertype() {
        return psaanergertype;
    }

    /**
     * 设置psaanergertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsaanergertype(String value) {
        this.psaanergertype = value;
    }

}
