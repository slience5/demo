package cainiao;

import com.alibaba.fastjson.JSON;
import com.taobao.pac.sdk.cp.PacClient;
import com.taobao.pac.sdk.cp.SendSysParams;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.AddressDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.Item;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.OrderInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.PackageInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.TmsWaybillGetRequest;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.TradeOrderInfoDto;
import com.taobao.pac.sdk.cp.dataobject.request.TMS_WAYBILL_GET.UserInfoDto;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_GET.TmsWaybillGetResponse;
import com.taobao.pac.sdk.cp.dataobject.response.TMS_WAYBILL_GET.WaybillCloudPrintResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 面单获取接口
 */
public class GetTest {

    /**
     * 通过物流云获取电子面单
     *
     * @param args
     */
    public static void main(String[] args) {
        PacClient client = new PacClient(CainiaoConstant.dailyAppKey, CainiaoConstant.dailySecretKey, CainiaoConstant.dailyUrl);
        SendSysParams params = new SendSysParams();
        params.setFromCode(CainiaoConstant.dailyToken);

        TmsWaybillGetRequest request = new TmsWaybillGetRequest();
        //配送公司编码
        request.setCpCode("EMS");

        //发件人信息
        UserInfoDto sender = new UserInfoDto();
        request.setSender(sender);

        //发件人姓名
        sender.setName("寄件人姓名");
        //发件人固定电话
        sender.setPhone("02512345678");
        //发件人手机号
        sender.setMobile("13000000000");

        //寄件地址，这里的地址需要是卖家订购电子面单服务时使用的订购地址，具体可以通过TMS_WAYBILL_SUBSCRIPTION_QUERY接口获取
        AddressDto sendAddress = new AddressDto();
        sender.setAddress(sendAddress);
        sendAddress.setProvince("江苏省");
        sendAddress.setCity("南京市");
        sendAddress.setDistrict("江宁区");
        sendAddress.setDetail("将军大道1号");

        String objectId = "A";
        //收件信息
        ArrayList<TradeOrderInfoDto> tradeOrderInfoDtos = new ArrayList<TradeOrderInfoDto>();
        request.setTradeOrderInfoDtos(tradeOrderInfoDtos);

        TradeOrderInfoDto tradeOrderInfoDto = new TradeOrderInfoDto();
        tradeOrderInfoDto.setObjectId(objectId);
        String emsTemplateUrl = "http://cloudprint.daily.taobao.net/template/standard/137411/1";
        //打印模板的url,参见白皮书
        tradeOrderInfoDto.setTemplateUrl(emsTemplateUrl);
        tradeOrderInfoDtos.add(tradeOrderInfoDto);

        OrderInfoDto orderInfoDto = new OrderInfoDto();
        tradeOrderInfoDto.setOrderInfo(orderInfoDto);

        orderInfoDto.setOrderChannelsType("OTHERS");
        ArrayList<String> orderList = new ArrayList<String>();
        orderInfoDto.setTradeOrderList(orderList);

        //订单列表，这里的场景是一个订单获取一个面单号
        orderList.add("1234567890");

        PackageInfoDto packageInfoDto = new PackageInfoDto();
        tradeOrderInfoDto.setPackageInfo(packageInfoDto);
        ArrayList<Item> items = new ArrayList<Item>();
        packageInfoDto.setItems(items);
        Item item = new Item();
        items.add(item);
        item.setName("衣服");
        item.setCount(1);

        UserInfoDto receiver = new UserInfoDto();
        tradeOrderInfoDto.setRecipient(receiver);
        receiver.setName("收件人姓名");
        receiver.setMobile("13100000000");
        AddressDto receiveAddress = new AddressDto();
        receiver.setAddress(receiveAddress);

        receiveAddress.setProvince("浙江省");
        receiveAddress.setCity("杭州市");
        receiveAddress.setDistrict("余杭区");
        receiveAddress.setDetail("文一西路969号");

        TmsWaybillGetResponse response = client.send(request, params);
        if (!response.isSuccess()) {
            System.out.println("errorCode:" + response.getErrorCode() + ",errorMessage:" + response.getErrorMsg());
            return;
        }

        System.out.println(JSON.toJSONString(response));
        List<WaybillCloudPrintResponse> waybillCloudPrintResponseList = response.getWaybillCloudPrintResponseList();
        for (WaybillCloudPrintResponse waybillCloudPrintResponse : waybillCloudPrintResponseList) {
            if (objectId.equals(waybillCloudPrintResponse.getObjectId())) {
                System.out.println("get waybillCode:" + waybillCloudPrintResponse.getWaybillCode() + ",printData:" + waybillCloudPrintResponse.getPrintData());
        //使用printData和templateUrl调用本地云打印组件打印面单
            }
        }

    }
}