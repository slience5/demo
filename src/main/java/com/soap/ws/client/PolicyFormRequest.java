
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>policyFormRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="policyFormRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currenttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currpage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="exparam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exparam6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastupdatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pagesize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="requesttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "policyFormRequest", propOrder = {
    "currenttime",
    "currpage",
    "exparam1",
    "exparam2",
    "exparam3",
    "exparam4",
    "exparam5",
    "exparam6",
    "key",
    "lastupdatetime",
    "pagesize",
    "requesttype",
    "username"
})
public class PolicyFormRequest {

    protected String currenttime;
    protected int currpage;
    protected String exparam1;
    protected String exparam2;
    protected String exparam3;
    protected String exparam4;
    protected String exparam5;
    protected String exparam6;
    protected String key;
    protected String lastupdatetime;
    protected int pagesize;
    protected String requesttype;
    protected String username;

    /**
     * 获取currenttime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrenttime() {
        return currenttime;
    }

    /**
     * 设置currenttime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrenttime(String value) {
        this.currenttime = value;
    }

    /**
     * 获取currpage属性的值。
     * 
     */
    public int getCurrpage() {
        return currpage;
    }

    /**
     * 设置currpage属性的值。
     * 
     */
    public void setCurrpage(int value) {
        this.currpage = value;
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
     * 获取lastupdatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastupdatetime() {
        return lastupdatetime;
    }

    /**
     * 设置lastupdatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastupdatetime(String value) {
        this.lastupdatetime = value;
    }

    /**
     * 获取pagesize属性的值。
     * 
     */
    public int getPagesize() {
        return pagesize;
    }

    /**
     * 设置pagesize属性的值。
     * 
     */
    public void setPagesize(int value) {
        this.pagesize = value;
    }

    /**
     * 获取requesttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesttype() {
        return requesttype;
    }

    /**
     * 设置requesttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesttype(String value) {
        this.requesttype = value;
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
