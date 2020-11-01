
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getBestPolicyByPnrContextResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getBestPolicyByPnrContextResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://cxfcenter.web.com/}getBestPolicyForPNRResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBestPolicyByPnrContextResponse", propOrder = {
    "_return"
})
public class GetBestPolicyByPnrContextResponse {

    @XmlElement(name = "return")
    protected GetBestPolicyForPNRResponse _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetBestPolicyForPNRResponse }
     *     
     */
    public GetBestPolicyForPNRResponse getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetBestPolicyForPNRResponse }
     *     
     */
    public void setReturn(GetBestPolicyForPNRResponse value) {
        this._return = value;
    }

}
