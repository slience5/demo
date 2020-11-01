package cainiao;

import com.alibaba.fastjson.JSON;
import com.taobao.pac.sdk.cp.PacClient;
import com.taobao.pac.sdk.cp.SendSysParams;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_DISCARD.TmsWaybillDiscardRequest;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.AddressDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.Item;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.OrderInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.PackageInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.TmsWaybillGetRequest;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.TradeOrderInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.UserInfoDto;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_DISCARD.TmsWaybillDiscardResponse;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_GET.TmsWaybillGetResponse;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_GET.WaybillCloudPrintResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 面单取消接口
 */
public class DiscardTest {
//
//    /**
//     * 测试环境请求url
//     */
//    private final static String CainiaoConstant.dailyUrl = "https://linkdaily.tbsandbox.com/gateway/pac_message_receiver.do";
//    /**
//     * 测试环境appKey
//     */
//    private final static String CainiaoConstant.dailyAppKey = "766654";
//    /**
//     * 测试环境secretKey
//     */
//    private final static String CainiaoConstant.dailySecretKey = "F53eqq903jQySV100Z8w06f9g914A13Z";
//    /**
//     * 测试环境token，token是商家在物流云平台授权ISV后生成的授权码，目前需要商家配置在ISV的软件中
//     */
//    private final static String CainiaoConstant.dailyToken = "TmpFU1ZOUGoyRnoybDZmT3lyaW9hWGR4VFNad0xNYTBUek9QZk9kamt2Z1hJMytsVkVHK0FjVW55T25wcUR1Qw==";
//
//    /**
//     * 线上环境请求url
//     */
//    private final static String onlineUrl = ":http://link.cainiao.com/gateway/link.do";
//    /**
//     * 线上环境appKey，物流云控制台查看
//     */
//    private final static String onlineAppKey = "yourAppKey";
//    /**
//     * 线上环境secretKey,物流云控制台查看
//     */
//    private final static String onlineSecretKey = "yourSecretKey";
//    /**
//     * 线上环境token，token是商家在物流云平台授权ISV后生成的授权码，目前需要商家配置在ISV的软件中
//     */
//    private final static String onlineToken = "yourOnlineToken";

    /**
     * 获取的电子面单号不用寄了，就取消电子面单，标记为不再使用，并且这个面单号和他对应的订单也将解绑，对应订单再来取号时会获取到新的电子面单号.
     *
     * @param args
     */
    public static void main(String[] args) {
        PacClient client = new PacClient(CainiaoConstant.dailyAppKey, CainiaoConstant.dailySecretKey, CainiaoConstant.dailyUrl);
        SendSysParams params = new SendSysParams();
        params.setFromCode(CainiaoConstant.dailyToken);

        TmsWaybillDiscardRequest request = new TmsWaybillDiscardRequest();
        //配送公司编码
        request.setCpCode("EMS");
        request.setWaybillCode("1100097770632");

        TmsWaybillDiscardResponse tmsWaybillDiscardResponse = client.send(request, params);
        if (!tmsWaybillDiscardResponse.isSuccess()) {
            System.out.println("errorCode:" + tmsWaybillDiscardResponse.getErrorCode() + ",errorMessage:" + tmsWaybillDiscardResponse.getErrorMsg());
            return;
        }

        System.out.println(JSON.toJSONString(tmsWaybillDiscardResponse));

    }
}