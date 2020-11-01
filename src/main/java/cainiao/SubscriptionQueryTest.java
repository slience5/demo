package cainiao;

import com.alibaba.fastjson.JSON;
import com.taobao.pac.sdk.cp.PacClient;
import com.taobao.pac.sdk.cp.SendSysParams;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_CANCEL.TmsWaybillCancelRequest;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_SUBSCRIPTION_QUERY.TmsWaybillSubscriptionQueryRequest;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_UPDATE.Recipient;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_UPDATE.TmsWaybillUpdateRequest;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_SUBSCRIPTION_QUERY.TmsWaybillSubscriptionQueryResponse;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_UPDATE.TmsWaybillUpdateResponse;

/**
 * 简单场景
 */
public class SubscriptionQueryTest {

    /**
     * 查询电子面单订购关系以及账户情况
     *
     * @param args
     */
    public static void main(String[] args) {
        PacClient client = CainiaoConstant.CLIENT_ONLINE;
        SendSysParams params = new SendSysParams();
        params.setFromCode("Y015cVFmUVR1T1FjcW1Hek8rQlEyb3c0a0xXU0Y3bGtJL1E5TGRRRmorK3lOWVc4blFoeTFJWTZVZnpGRXpLUQ==");

        TmsWaybillSubscriptionQueryRequest request = new TmsWaybillSubscriptionQueryRequest();
        request.setCpCode("YTO");
        TmsWaybillSubscriptionQueryResponse tmsWaybillSubscriptionQueryResponse = client.send(request, params);
        if (!tmsWaybillSubscriptionQueryResponse.isSuccess()) {
            System.out.println("errorCode:" + tmsWaybillSubscriptionQueryResponse.getErrorCode() + "errorMessage:" + tmsWaybillSubscriptionQueryResponse.getErrorMsg());
            return;
        }
        System.out.println(JSON.toJSONString(tmsWaybillSubscriptionQueryResponse));
        System.out.println(tmsWaybillSubscriptionQueryResponse.getWaybillApplySubscriptionCols());
    }
}