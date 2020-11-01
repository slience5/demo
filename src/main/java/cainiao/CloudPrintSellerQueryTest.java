package cainiao;

import com.alibaba.fastjson.JSON;
import com.taobao.pac.sdk.cp.PacClient;
import com.taobao.pac.sdk.cp.SendSysParams;
import com.taobao.pac.sdk.cp.dataobject.request.CLOUDPRINT_SELLER_ISV_TEMPLATES.CloudprintSellerIsvTemplatesRequest;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_SUBSCRIPTION_QUERY.TmsWaybillSubscriptionQueryRequest;
import com.taobao.pac.sdk.cp.dataobject.response.CLOUDPRINT_SELLER_ISV_TEMPLATES.CloudprintSellerIsvTemplatesResponse;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_SUBSCRIPTION_QUERY.TmsWaybillSubscriptionQueryResponse;

/**
 * 简单场景
 */
public class CloudPrintSellerQueryTest {

    /**
     * 查询电子面单订购关系以及账户情况
     *
     * @param args
     */
    public static void main(String[] args) {
        PacClient client = new PacClient(CainiaoConstant.dailyAppKey, CainiaoConstant.dailySecretKey, CainiaoConstant.dailyUrl1);
        SendSysParams params = new SendSysParams();
        params.setFromCode(CainiaoConstant.dailyToken);

        CloudprintSellerIsvTemplatesRequest request = new CloudprintSellerIsvTemplatesRequest();
//        request.set
        CloudprintSellerIsvTemplatesResponse response = client.send(request, params);
        System.out.println(JSON.toJSONString(response));
    }
}