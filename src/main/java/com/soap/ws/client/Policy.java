
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>policy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="policy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airporttax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="airways" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brokerage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canceltime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endworktime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factdefrayal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="finalprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fueltax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ispace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="margin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overticktype" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seatcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startworktime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsidymargin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticketspeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalfinalprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policy", propOrder = {
    "airporttax",
    "airways",
    "brokerage",
    "canceltime",
    "endcity",
    "endworktime",
    "factdefrayal",
    "finalprice",
    "fueltax",
    "ispace",
    "margin",
    "officeno",
    "overticktype",
    "pid",
    "remark",
    "seatcode",
    "startcity",
    "startworktime",
    "subsidymargin",
    "ticketspeed",
    "totalfinalprice",
    "totalprice"
})
public class Policy {

    protected String airporttax;
    protected String airways;
    protected String brokerage;
    protected String canceltime;
    protected String endcity;
    protected String endworktime;
    protected String factdefrayal;
    protected String finalprice;
    protected String fueltax;
    protected String ispace;
    protected String margin;
    protected String officeno;
    protected Long overticktype;
    protected String pid;
    protected String remark;
    protected String seatcode;
    protected String startcity;
    protected String startworktime;
    protected String subsidymargin;
    protected String ticketspeed;
    protected String totalfinalprice;
    protected String totalprice;

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
     * 获取airways属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirways() {
        return airways;
    }

    /**
     * 设置airways属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirways(String value) {
        this.airways = value;
    }

    /**
     * 获取brokerage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerage() {
        return brokerage;
    }

    /**
     * 设置brokerage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerage(String value) {
        this.brokerage = value;
    }

    /**
     * 获取canceltime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanceltime() {
        return canceltime;
    }

    /**
     * 设置canceltime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanceltime(String value) {
        this.canceltime = value;
    }

    /**
     * 获取endcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndcity() {
        return endcity;
    }

    /**
     * 设置endcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndcity(String value) {
        this.endcity = value;
    }

    /**
     * 获取endworktime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndworktime() {
        return endworktime;
    }

    /**
     * 设置endworktime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndworktime(String value) {
        this.endworktime = value;
    }

    /**
     * 获取factdefrayal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactdefrayal() {
        return factdefrayal;
    }

    /**
     * 设置factdefrayal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactdefrayal(String value) {
        this.factdefrayal = value;
    }

    /**
     * 获取finalprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalprice() {
        return finalprice;
    }

    /**
     * 设置finalprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalprice(String value) {
        this.finalprice = value;
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
     * 获取ispace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIspace() {
        return ispace;
    }

    /**
     * 设置ispace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIspace(String value) {
        this.ispace = value;
    }

    /**
     * 获取margin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMargin() {
        return margin;
    }

    /**
     * 设置margin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMargin(String value) {
        this.margin = value;
    }

    /**
     * 获取officeno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeno() {
        return officeno;
    }

    /**
     * 设置officeno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeno(String value) {
        this.officeno = value;
    }

    /**
     * 获取overticktype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverticktype() {
        return overticktype;
    }

    /**
     * 设置overticktype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverticktype(Long value) {
        this.overticktype = value;
    }

    /**
     * 获取pid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置pid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取seatcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatcode() {
        return seatcode;
    }

    /**
     * 设置seatcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatcode(String value) {
        this.seatcode = value;
    }

    /**
     * 获取startcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartcity() {
        return startcity;
    }

    /**
     * 设置startcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartcity(String value) {
        this.startcity = value;
    }

    /**
     * 获取startworktime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartworktime() {
        return startworktime;
    }

    /**
     * 设置startworktime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartworktime(String value) {
        this.startworktime = value;
    }

    /**
     * 获取subsidymargin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidymargin() {
        return subsidymargin;
    }

    /**
     * 设置subsidymargin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidymargin(String value) {
        this.subsidymargin = value;
    }

    /**
     * 获取ticketspeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketspeed() {
        return ticketspeed;
    }

    /**
     * 设置ticketspeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketspeed(String value) {
        this.ticketspeed = value;
    }

    /**
     * 获取totalfinalprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalfinalprice() {
        return totalfinalprice;
    }

    /**
     * 设置totalfinalprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalfinalprice(String value) {
        this.totalfinalprice = value;
    }

    /**
     * 获取totalprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalprice() {
        return totalprice;
    }

    /**
     * 设置totalprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalprice(String value) {
        this.totalprice = value;
    }

}
