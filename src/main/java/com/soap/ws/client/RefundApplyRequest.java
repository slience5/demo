
package com.soap.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>refundApplyRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="refundApplyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exparam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ordercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengers" type="{http://cxfcenter.web.com/}infopnrPassenger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pnrcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundApplyRequest", propOrder = {
    "exparam1",
    "exparam2",
    "exparam3",
    "exparam4",
    "exparam5",
    "exparam6",
    "key",
    "ordercode",
    "passengers",
    "pnrcode",
    "tag",
    "username"
})
public class RefundApplyRequest {

    protected String exparam1;
    protected String exparam2;
    protected String exparam3;
    protected String exparam4;
    protected String exparam5;
    protected String exparam6;
    protected String key;
    protected String ordercode;
    @XmlElement(nillable = true)
    protected List<InfopnrPassenger> passengers;
    protected String pnrcode;
    protected String tag;
    protected String username;

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
     * 获取exparam4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExparam4() {
        return exparam4;
    }

    /**
     * 设置exparam4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExparam4(String value) {
        this.exparam4 = value;
    }

    /**
     * 获取exparam5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExparam5() {
        return exparam5;
    }

    /**
     * 设置exparam5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExparam5(String value) {
        this.exparam5 = value;
    }

    /**
     * 获取exparam6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExparam6() {
        return exparam6;
    }

    /**
     * 设置exparam6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExparam6(String value) {
        this.exparam6 = value;
    }

    /**
     * 获取key属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置key属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * 获取ordercode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdercode() {
        return ordercode;
    }

    /**
     * 设置ordercode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdercode(String value) {
        this.ordercode = value;
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
     * {@link InfopnrPassenger }
     * 
     * 
     */
    public List<InfopnrPassenger> getPassengers() {
        if (passengers == null) {
            passengers = new ArrayList<InfopnrPassenger>();
        }
        return this.passengers;
    }

    /**
     * 获取pnrcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrcode() {
        return pnrcode;
    }

    /**
     * 设置pnrcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrcode(String value) {
        this.pnrcode = value;
    }

    /**
     * 获取tag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置tag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
