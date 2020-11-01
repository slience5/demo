package cainiao;

import com.taobao.pac.sdk.cp.PacClient;
import com.taobao.pac.sdk.cp.SendSysParams;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.AddressDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.Item;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.OrderInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.PackageInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.TmsWaybillGetRequest;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.TradeOrderInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.UserInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_UPDATE.Recipient;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_UPDATE.TmsWaybillUpdateRequest;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_GET.TmsWaybillGetResponse;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_GET.WaybillCloudPrintResponse;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_UPDATE.TmsWaybillUpdateResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单场景
 */
public class UpdateTest {

    /**
     * 更新电子面单信息
     *
     * @param args
     */
    public static void main(String[] args) {
        PacClient client = new PacClient(CainiaoConstant.dailyAppKey, CainiaoConstant.dailySecretKey, CainiaoConstant.dailyUrl);
        SendSysParams params = new SendSysParams();
        params.setFromCode(CainiaoConstant.dailyToken);

        //更新一下面单上的收件人手机号
        TmsWaybillUpdateRequest request = new TmsWaybillUpdateRequest();

        //配送公司编码
        request.setCpCode("EMS");
        //面单号
        request.setWaybillCode("1101469709602");

        Recipient recipient = new Recipient();
        recipient.setMobile("13100000000");
        request.setRecipient(recipient);
        TmsWaybillUpdateResponse tmsWaybillUpdateResponse = client.send(request, params);
        if (!tmsWaybillUpdateResponse.isSuccess()) {
            System.out.println("errorCode:" + tmsWaybillUpdateResponse.getErrorCode() + "errorMessage:" + tmsWaybillUpdateResponse.getErrorMsg());
            return;
        }
        String newPrintData = tmsWaybillUpdateResponse.getPrintData();
        System.out.println(newPrintData);
    }
}