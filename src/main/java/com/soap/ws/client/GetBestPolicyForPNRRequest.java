
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getBestPolicyForPNRRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getBestPolicyForPNRRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exparam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="istime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnrcontext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "getBestPolicyForPNRRequest", propOrder = {
    "exparam1",
    "exparam2",
    "exparam3",
    "exparam4",
    "exparam5",
    "exparam6",
    "istime",
    "key",
    "pnr",
    "pnrcontext",
    "size",
    "username"
})
public class GetBestPolicyForPNRRequest {

    protected String exparam1;
    protected String exparam2;
    protected String exparam3;
    protected String exparam4;
    protected String exparam5;
    protected String exparam6;
    protected String istime;
    protected String key;
    protected String pnr;
    protected String pnrcontext;
    protected int size;
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
     * 获取istime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstime() {
        return istime;
    }

    /**
     * 设置istime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstime(String value) {
        this.istime = value;
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
     * 获取pnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * 设置pnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnr(String value) {
        this.pnr = value;
    }

    /**
     * 获取pnrcontext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrcontext() {
        return pnrcontext;
    }

    /**
     * 设置pnrcontext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrcontext(String value) {
        this.pnrcontext = value;
    }

    /**
     * 获取size属性的值。
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     */
    public void setSize(int value) {
        this.size = value;
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
