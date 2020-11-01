package cainiao;

import com.alibaba.fastjson.JSON;
import com.taobao.pac.sdk.cp.PacClient;
import com.taobao.pac.sdk.cp.SendSysParams;
import com.taobao.pac.sdk.cp.dataobject.request.CLOUDPRINT_ISV_TEMPLATES.CloudprintIsvTemplatesRequest;
import com.taobao.pac.sdk.cp.dataobject.request.CLOUDPRINT_SELLER_CUSTOM_AREAS.CloudprintSellerCustomAreasRequest;
import com.taobao.pac.sdk.cp.dataobject.request.CLOUDPRINT_SELLER_ISV_TEMPLATES.CloudprintSellerIsvTemplatesRequest;
import com.taobao.pac.sdk.cp.dataobject.request.CLOUDPRINT_STANDARD_TEMPLATES.CloudprintStandardTemplatesRequest;
import com.taobao.pac.sdk.cp.dataobject.response.CLOUDPRINT_ISV_TEMPLATES.CloudprintIsvTemplatesResponse;
import com.taobao.pac.sdk.cp.dataobject.response.CLOUDPRINT_SELLER_CUSTOM_AREAS.CloudprintSellerCustomAreasResponse;
import com.taobao.pac.sdk.cp.dataobject.response.CLOUDPRINT_SELLER_ISV_TEMPLATES.CloudprintSellerIsvTemplatesResponse;
import com.taobao.pac.sdk.cp.dataobject.response.CLOUDPRINT_STANDARD_TEMPLATES.CloudprintStandardTemplatesResponse;
import org.checkerframework.checker.units.qual.C;

/**
 * 简单场景
 */
public class CainiaoCommonTempleteQueryTest {

    /**
     * 查询电子面单订购关系以及账户情况
     *
     * @param args
     */
    public static void main(String[] args) {
        PacClient client = CainiaoConstant.CLIENT_ONLINE;
        SendSysParams params = new SendSysParams();
        params.setFromCode(CainiaoConstant.onlineToken);

        // isv自定义项
//        CloudprintIsvTemplatesRequest request = new CloudprintIsvTemplatesRequest();
//        request.setTemplateType(6L);
////        request.set
//        CloudprintIsvTemplatesResponse response = client.send(request, params);

        // 菜鸟通用模版
        CloudprintStandardTemplatesRequest request = new CloudprintStandardTemplatesRequest();
        request.setCpCode("YTO");
//        request.set
        CloudprintStandardTemplatesResponse response = client.send(request, params);


        // 商家自定义区
//        CloudprintSellerCustomAreasRequest request = new CloudprintSellerCustomAreasRequest();
////        request.setObject_id("YTO");
////        request.set
//        CloudprintSellerCustomAreasResponse response = client.send(request, params);

        // 菜鸟通用模版
//        CloudprintSellerIsvTemplatesRequest request = new CloudprintSellerIsvTemplatesRequest();
////        request.setObject_id("YTO");
////        request.set
//        CloudprintSellerIsvTemplatesResponse response = client.send(request, params);
        System.out.println(JSON.toJSONString(response));
    }
}