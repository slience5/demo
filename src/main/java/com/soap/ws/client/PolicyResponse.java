
package com.soap.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>policyResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="policyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currenttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currpage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastupdatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="policyresult" type="{http://cxfcenter.web.com/}policyDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalrows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyResponse", propOrder = {
    "currenttime",
    "currpage",
    "errorcode",
    "errorinfo",
    "lastupdatetime",
    "pageCount",
    "policyresult",
    "totalrows"
})
public class PolicyResponse {

    protected String currenttime;
    protected int currpage;
    protected String errorcode;
    protected String errorinfo;
    protected String lastupdatetime;
    protected int pageCount;
    @XmlElement(nillable = true)
    protected List<PolicyDate> policyresult;
    protected int totalrows;

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
     * 获取pageCount属性的值。
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * 设置pageCount属性的值。
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
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
     * {@link PolicyDate }
     * 
     * 
     */
    public List<PolicyDate> getPolicyresult() {
        if (policyresult == null) {
            policyresult = new ArrayList<PolicyDate>();
        }
        return this.policyresult;
    }

    /**
     * 获取totalrows属性的值。
     * 
     */
    public int getTotalrows() {
        return totalrows;
    }

    /**
     * 设置totalrows属性的值。
     * 
     */
    public void setTotalrows(int value) {
        this.totalrows = value;
    }

}
