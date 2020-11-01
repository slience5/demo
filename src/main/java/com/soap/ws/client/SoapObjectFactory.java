
package com.soap.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class SoapObjectFactory {

    private final static QName _GetBestPolicyByPnr_QNAME = new QName("http://cxfcenter.web.com/", "getBestPolicyByPnr");
    private final static QName _GetBestPolicyByPnrContext_QNAME = new QName("http://cxfcenter.web.com/", "getBestPolicyByPnrContext");
    private final static QName _GetBestPolicyByPnrContextResponse_QNAME = new QName("http://cxfcenter.web.com/", "getBestPolicyByPnrContextResponse");
    private final static QName _GetBestPolicyByPnrResponse_QNAME = new QName("http://cxfcenter.web.com/", "getBestPolicyByPnrResponse");
    private final static QName _GetPolicyDateAll_QNAME = new QName("http://cxfcenter.web.com/", "getPolicyDateAll");
    private final static QName _GetPolicyDateAllResponse_QNAME = new QName("http://cxfcenter.web.com/", "getPolicyDateAllResponse");
    private final static QName _RefundApplyRequestBack_QNAME = new QName("http://cxfcenter.web.com/", "refundApplyRequestBack");
    private final static QName _RefundApplyRequestBackResponse_QNAME = new QName("http://cxfcenter.web.com/", "refundApplyRequestBackResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.ws.client.generated
     * 
     */
    public SoapObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBestPolicyByPnr }
     * 
     */
    public GetBestPolicyByPnr createGetBestPolicyByPnr() {
        return new GetBestPolicyByPnr();
    }

    /**
     * Create an instance of {@link GetBestPolicyByPnrContext }
     * 
     */
    public GetBestPolicyByPnrContext createGetBestPolicyByPnrContext() {
        return new GetBestPolicyByPnrContext();
    }

    /**
     * Create an instance of {@link GetBestPolicyByPnrContextResponse }
     * 
     */
    public GetBestPolicyByPnrContextResponse createGetBestPolicyByPnrContextResponse() {
        return new GetBestPolicyByPnrContextResponse();
    }

    /**
     * Create an instance of {@link GetBestPolicyByPnrResponse }
     * 
     */
    public GetBestPolicyByPnrResponse createGetBestPolicyByPnrResponse() {
        return new GetBestPolicyByPnrResponse();
    }

    /**
     * Create an instance of {@link GetPolicyDateAll }
     * 
     */
    public GetPolicyDateAll createGetPolicyDateAll() {
        return new GetPolicyDateAll();
    }

    /**
     * Create an instance of {@link GetPolicyDateAllResponse }
     * 
     */
    public GetPolicyDateAllResponse createGetPolicyDateAllResponse() {
        return new GetPolicyDateAllResponse();
    }

    /**
     * Create an instance of {@link RefundApplyRequestBack }
     * 
     */
    public RefundApplyRequestBack createRefundApplyRequestBack() {
        return new RefundApplyRequestBack();
    }

    /**
     * Create an instance of {@link RefundApplyRequestBackResponse }
     * 
     */
    public RefundApplyRequestBackResponse createRefundApplyRequestBackResponse() {
        return new RefundApplyRequestBackResponse();
    }

    /**
     * Create an instance of {@link GetBestPolicyForPNRRequest }
     * 
     */
    public GetBestPolicyForPNRRequest createGetBestPolicyForPNRRequest() {
        return new GetBestPolicyForPNRRequest();
    }

    /**
     * Create an instance of {@link GetBestPolicyForPNRResponse }
     * 
     */
    public GetBestPolicyForPNRResponse createGetBestPolicyForPNRResponse() {
        return new GetBestPolicyForPNRResponse();
    }

    /**
     * Create an instance of {@link InfoPnrTrip }
     * 
     */
    public InfoPnrTrip createInfoPnrTrip() {
        return new InfoPnrTrip();
    }

    /**
     * Create an instance of {@link InfopnrPassenger }
     * 
     */
    public InfopnrPassenger createInfopnrPassenger() {
        return new InfopnrPassenger();
    }

    /**
     * Create an instance of {@link Policy }
     * 
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link PolicyFormRequest }
     * 
     */
    public PolicyFormRequest createPolicyFormRequest() {
        return new PolicyFormRequest();
    }

    /**
     * Create an instance of {@link PolicyResponse }
     * 
     */
    public PolicyResponse createPolicyResponse() {
        return new PolicyResponse();
    }

    /**
     * Create an instance of {@link PolicyDate }
     * 
     */
    public PolicyDate createPolicyDate() {
        return new PolicyDate();
    }

    /**
     * Create an instance of {@link RefundApplyRequest }
     * 
     */
    public RefundApplyRequest createRefundApplyRequest() {
        return new RefundApplyRequest();
    }

    /**
     * Create an instance of {@link RefundApplyResponse }
     * 
     */
    public RefundApplyResponse createRefundApplyResponse() {
        return new RefundApplyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnr }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "getBestPolicyByPnr")
    public JAXBElement<GetBestPolicyByPnr> createGetBestPolicyByPnr(GetBestPolicyByPnr value) {
        return new JAXBElement<GetBestPolicyByPnr>(_GetBestPolicyByPnr_QNAME, GetBestPolicyByPnr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnrContext }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnrContext }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "getBestPolicyByPnrContext")
    public JAXBElement<GetBestPolicyByPnrContext> createGetBestPolicyByPnrContext(GetBestPolicyByPnrContext value) {
        return new JAXBElement<GetBestPolicyByPnrContext>(_GetBestPolicyByPnrContext_QNAME, GetBestPolicyByPnrContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnrContextResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnrContextResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "getBestPolicyByPnrContextResponse")
    public JAXBElement<GetBestPolicyByPnrContextResponse> createGetBestPolicyByPnrContextResponse(GetBestPolicyByPnrContextResponse value) {
        return new JAXBElement<GetBestPolicyByPnrContextResponse>(_GetBestPolicyByPnrContextResponse_QNAME, GetBestPolicyByPnrContextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnrResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBestPolicyByPnrResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "getBestPolicyByPnrResponse")
    public JAXBElement<GetBestPolicyByPnrResponse> createGetBestPolicyByPnrResponse(GetBestPolicyByPnrResponse value) {
        return new JAXBElement<GetBestPolicyByPnrResponse>(_GetBestPolicyByPnrResponse_QNAME, GetBestPolicyByPnrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyDateAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPolicyDateAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "getPolicyDateAll")
    public JAXBElement<GetPolicyDateAll> createGetPolicyDateAll(GetPolicyDateAll value) {
        return new JAXBElement<GetPolicyDateAll>(_GetPolicyDateAll_QNAME, GetPolicyDateAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyDateAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPolicyDateAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "getPolicyDateAllResponse")
    public JAXBElement<GetPolicyDateAllResponse> createGetPolicyDateAllResponse(GetPolicyDateAllResponse value) {
        return new JAXBElement<GetPolicyDateAllResponse>(_GetPolicyDateAllResponse_QNAME, GetPolicyDateAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundApplyRequestBack }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RefundApplyRequestBack }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "refundApplyRequestBack")
    public JAXBElement<RefundApplyRequestBack> createRefundApplyRequestBack(RefundApplyRequestBack value) {
        return new JAXBElement<RefundApplyRequestBack>(_RefundApplyRequestBack_QNAME, RefundApplyRequestBack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundApplyRequestBackResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RefundApplyRequestBackResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cxfcenter.web.com/", name = "refundApplyRequestBackResponse")
    public JAXBElement<RefundApplyRequestBackResponse> createRefundApplyRequestBackResponse(RefundApplyRequestBackResponse value) {
        return new JAXBElement<RefundApplyRequestBackResponse>(_RefundApplyRequestBackResponse_QNAME, RefundApplyRequestBackResponse.class, null, value);
    }

}
