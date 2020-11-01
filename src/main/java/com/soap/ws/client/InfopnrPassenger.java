
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>infopnrPassenger complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="infopnrPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="exparam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isInsure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ischild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passenger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengercardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticketno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticketstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infopnrPassenger", propOrder = {
    "account",
    "birthdate",
    "cardtype",
    "createdate",
    "exparam1",
    "exparam2",
    "exparam3",
    "isInsure",
    "ischild",
    "passenger",
    "passengercardno",
    "passengername",
    "ticketno",
    "ticketstate",
    "updatedate"
})
public class InfopnrPassenger {

    protected String account;
    protected String birthdate;
    protected String cardtype;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdate;
    protected String exparam1;
    protected String exparam2;
    protected String exparam3;
    protected String isInsure;
    protected String ischild;
    protected String passenger;
    protected String passengercardno;
    protected String passengername;
    protected String ticketno;
    protected String ticketstate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedate;

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * 获取birthdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * 设置birthdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * 获取cardtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 设置cardtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardtype(String value) {
        this.cardtype = value;
    }

    /**
     * 获取createdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedate() {
        return createdate;
    }

    /**
     * 设置createdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedate(XMLGregorianCalendar value) {
        this.createdate = value;
    }

    /**
     * 获取exparam1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExparam1() {
        return exparam1;
    }

    /**
     * 设置exparam1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExparam1(String value) {
        this.exparam1 = value;
    }

    /**
     * 获取exparam2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExparam2() {
        return exparam2;
    }

    /**
     * 设置exparam2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExparam2(String value) {
        this.exparam2 = value;
    }

    /**
     * 获取exparam3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExparam3() {
        return exparam3;
    }

    /**
     * 设置exparam3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExparam3(String value) {
        this.exparam3 = value;
    }

    /**
     * 获取isInsure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInsure() {
        return isInsure;
    }

    /**
     * 设置isInsure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInsure(String value) {
        this.isInsure = value;
    }

    /**
     * 获取ischild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIschild() {
        return ischild;
    }

    /**
     * 设置ischild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIschild(String value) {
        this.ischild = value;
    }

    /**
     * 获取passenger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassenger() {
        return passenger;
    }

    /**
     * 设置passenger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassenger(String value) {
        this.passenger = value;
    }

    /**
     * 获取passengercardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengercardno() {
        return passengercardno;
    }

    /**
     * 设置passengercardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengercardno(String value) {
        this.passengercardno = value;
    }

    /**
     * 获取passengername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengername() {
        return passengername;
    }

    /**
     * 设置passengername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengername(String value) {
        this.passengername = value;
    }

    /**
     * 获取ticketno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketno() {
        return ticketno;
    }

    /**
     * 设置ticketno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketno(String value) {
        this.ticketno = value;
    }

    /**
     * 获取ticketstate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketstate() {
        return ticketstate;
    }

    /**
     * 设置ticketstate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketstate(String value) {
        this.ticketstate = value;
    }

    /**
     * 获取updatedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedate() {
        return updatedate;
    }

    /**
     * 设置updatedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedate(XMLGregorianCalendar value) {
        this.updatedate = value;
    }

}
