package demo;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import utils.HttpClientUtil;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Map;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class SmsDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String url = "http://121.14.38.42:16673/cmpptohttp/service";
        Map<String,Object> params = Maps.newHashMap();

        String DestId = "13777818609";
        String ServiceCode = "";
        String MsgContent = "";
        String TransactionId = "";
        String SubPort = "";


        params.put("DestId",DestId);
        params.put("ServiceCode",ServiceCode);
        params.put("MsgContent",MsgContent);
        params.put("TransactionId",TransactionId);
        params.put("SubPort",SubPort);

        HttpClientUtil.post(url, Base64.getEncoder().encodeToString(JSON.toJSONString(params).getBytes("utf-8")));
    }

}
