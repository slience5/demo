package sf;

import com.sf.csim.express.service.CallExpressServiceTools;
import com.sf.csim.express.service.EspServiceCode;
import com.sf.csim.express.service.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
@Slf4j
public class SfCallTest {

    //丰桥新沙箱测试顾客编码  Yg4Zf06w_sxZs3A5D
    //校验码                          3Xdk1jqeG1Xod9nUXus8Op7DNOkchTnw
    private static final String CLIENT_CODE = "YqiFNyiS";  //此处替换为您在丰桥平台获取的顾客编码
    private static final String CHECK_WORD = "8FQpb431sNmcLL3lc7nr4N199KzIc3t1";//此处替换为您在丰桥平台获取的校验码

    //沙箱环境的地址
    private static final String CALL_URL_BOX = "https://sfapi-sbox.sf-express.com/std/service";
    //生产环境的地址
    private static final String CALL_URL_PROD = "https://sfapi.sf-express.com/std/service";

    public static void main(String[] args) throws UnsupportedEncodingException {
//        EspServiceCode testService = EspServiceCode.EXP_RECE_CREATE_ORDER; //下订单
//        	EspServiceCode testService = EspServiceCode.EXP_RECE_SEARCH_ORDER_RESP; //查订单
            EspServiceCode testService = EspServiceCode.EXP_RECE_UPDATE_ORDER;//订单取消
        //	EspServiceCode testService = EspServiceCode.EXP_RECE_FILTER_ORDER_BSP;//订单筛选
        //   EspServiceCode testService = EspServiceCode.EXP_RECE_SEARCH_ROUTES;//查路由
        //	EspServiceCode testService = EspServiceCode.EXP_RECE_GET_SUB_MAILNO;//子单号
        //	EspServiceCode testService = EspServiceCode.EXP_RECE_QUERY_SFWAYBILL;//查运费

        CallExpressServiceTools client=CallExpressServiceTools.getInstance();

        // set common header
        Map<String, String> params = new HashMap<String, String>();

        String timeStamp = String.valueOf(System.currentTimeMillis());
        String msgData = packageMsgData(testService);

        params.put("partnerID", CLIENT_CODE);  // 顾客编码 ，对应丰桥上获取的clientCode
        params.put("requestID", UUID.randomUUID().toString().replace("-", ""));
        params.put("serviceCode",testService.getCode());// 接口服务码
        params.put("timestamp", timeStamp);
        params.put("msgData", msgData);
        params.put("msgDigest", client.getMsgDigest(msgData,timeStamp,CHECK_WORD));

        // System.out.println(params.get("requestID"));
        long startTime = System.currentTimeMillis();

        System.out.println("====调用请求：" + params.get("msgData"));
        String result = HttpClientUtil.post(CALL_URL_PROD, params);

        System.out.println("====调用丰桥的接口服务代码：" + String.valueOf(testService.getCode()) + " 接口耗时："+ String.valueOf(System.currentTimeMillis()-startTime)+"====");
        System.out.println("===调用地址 ==="+CALL_URL_BOX);
        System.out.println("===顾客编码 ==="+CALL_URL_PROD);
        System.out.println("===返回结果：" +result);

    }

    public static String packageMsgData(EspServiceCode espServiceCode) {
        String jsonString = "";

        String prefix = "/callExpressRequest/%s";

        try {
            InputStream is = SfCallTest.class.getResourceAsStream(String.format(prefix,espServiceCode.getPath()));
            byte[] bs = new byte[is.available()];
            is.read(bs);
            jsonString = new String(bs);
        } catch (Exception var4) {
            log.error("【packageMsgData】error ",var4);
        }

        return
                jsonString;
    }
}
