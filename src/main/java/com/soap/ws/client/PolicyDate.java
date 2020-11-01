
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>policyDate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="policyDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="afterreturncheckoff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aircompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allowance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canceltime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientprice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="createdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealfeetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destenddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endworktime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="istallespecially" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="istrip" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="noflightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgstartdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overticktype" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="passdestenddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passorgstartdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paytype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profitmargin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startworktime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticketspeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticktype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="week" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyDate", propOrder = {
    "afterreturncheckoff",
    "aircompany",
    "allowance",
    "cabin",
    "canceltime",
    "clientprice",
    "createdate",
    "dealfeetype",
    "destcity",
    "destenddate",
    "endworktime",
    "flightNo",
    "id",
    "istallespecially",
    "istrip",
    "noflightNo",
    "officeno",
    "orgcity",
    "orgstartdate",
    "overticktype",
    "passdestenddate",
    "passengertype",
    "passorgstartdate",
    "paytype",
    "policyid",
    "profitmargin",
    "remark",
    "startworktime",
    "state",
    "ticketspeed",
    "ticktype",
    "updatedate",
    "week"
})
public class PolicyDate {

    protected String afterreturncheckoff;
    protected String aircompany;
    protected String allowance;
    protected String cabin;
    protected String canceltime;
    protected Double clientprice;
    protected String createdate;
    protected String dealfeetype;
    protected String destcity;
    protected String destenddate;
    protected String endworktime;
    protected String flightNo;
    protected Long id;
    protected Long istallespecially;
    protected Long istrip;
    protected String noflightNo;
    protected String officeno;
    protected String orgcity;
    protected String orgstartdate;
    protected Long overticktype;
    protected String passdestenddate;
    protected String passengertype;
    protected String passorgstartdate;
    protected String paytype;
    protected String policyid;
    protected Double profitmargin;
    protected String remark;
    protected String startworktime;
    protected String state;
    protected String ticketspeed;
    protected String ticktype;
    protected String updatedate;
    protected String week;

    /**
     * 获取afterreturncheckoff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterreturncheckoff() {
        return afterreturncheckoff;
    }

    /**
     * 设置afterreturncheckoff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterreturncheckoff(String value) {
        this.afterreturncheckoff = value;
    }

    /**
     * 获取aircompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircompany() {
        return aircompany;
    }

    /**
     * 设置aircompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircompany(String value) {
        this.aircompany = value;
    }

    /**
     * 获取allowance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowance() {
        return allowance;
    }

    /**
     * 设置allowance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowance(String value) {
        this.allowance = value;
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
     * 获取clientprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClientprice() {
        return clientprice;
    }

    /**
     * 设置clientprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClientprice(Double value) {
        this.clientprice = value;
    }

    /**
     * 获取createdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 设置createdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedate(String value) {
        this.createdate = value;
    }

    /**
     * 获取dealfeetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealfeetype() {
        return dealfeetype;
    }

    /**
     * 设置dealfeetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealfeetype(String value) {
        this.dealfeetype = value;
    }

    /**
     * 获取destcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestcity() {
        return destcity;
    }

    /**
     * 设置destcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestcity(String value) {
        this.destcity = value;
    }

    /**
     * 获取destenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestenddate() {
        return destenddate;
    }

    /**
     * 设置destenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestenddate(String value) {
        this.destenddate = value;
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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * 获取istallespecially属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIstallespecially() {
        return istallespecially;
    }

    /**
     * 设置istallespecially属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIstallespecially(Long value) {
        this.istallespecially = value;
    }

    /**
     * 获取istrip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIstrip() {
        return istrip;
    }

    /**
     * 设置istrip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIstrip(Long value) {
        this.istrip = value;
    }

    /**
     * 获取noflightNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoflightNo() {
        return noflightNo;
    }

    /**
     * 设置noflightNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoflightNo(String value) {
        this.noflightNo = value;
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
     * 获取orgcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgcity() {
        return orgcity;
    }

    /**
     * 设置orgcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgcity(String value) {
        this.orgcity = value;
    }

    /**
     * 获取orgstartdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgstartdate() {
        return orgstartdate;
    }

    /**
     * 设置orgstartdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgstartdate(String value) {
        this.orgstartdate = value;
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
     * 获取passdestenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassdestenddate() {
        return passdestenddate;
    }

    /**
     * 设置passdestenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassdestenddate(String value) {
        this.passdestenddate = value;
    }

    /**
     * 获取passengertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengertype() {
        return passengertype;
    }

    /**
     * 设置passengertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengertype(String value) {
        this.passengertype = value;
    }

    /**
     * 获取passorgstartdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassorgstartdate() {
        return passorgstartdate;
    }

    /**
     * 设置passorgstartdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassorgstartdate(String value) {
        this.passorgstartdate = value;
    }

    /**
     * 获取paytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 设置paytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytype(String value) {
        this.paytype = value;
    }

    /**
     * 获取policyid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyid() {
        return policyid;
    }

    /**
     * 设置policyid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyid(String value) {
        this.policyid = value;
    }

    /**
     * 获取profitmargin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProfitmargin() {
        return profitmargin;
    }

    /**
     * 设置profitmargin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProfitmargin(Double value) {
        this.profitmargin = value;
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
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
     * 获取ticktype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicktype() {
        return ticktype;
    }

    /**
     * 设置ticktype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicktype(String value) {
        this.ticktype = value;
    }

    /**
     * 获取updatedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedate() {
        return updatedate;
    }

    /**
     * 设置updatedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedate(String value) {
        this.updatedate = value;
    }

    /**
     * 获取week属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeek() {
        return week;
    }

    /**
     * 设置week属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeek(String value) {
        this.week = value;
    }

}
