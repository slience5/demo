package cainiao;


import okhttp3.ConnectionSpec;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.codec.binary.Base64;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * HTTP方式调用
 */
public class CainiaoTest {
    /**
     * 线上环境请求url
     */
    private final static String onlineUrl = "https://link.cainiao.com/gateway/link.do";

//    private final static String SAND_BOX_URL = "https://linkdaily.tbsandbox.com/gateway/link.do";
    /**
     * 线上环境appKey，物流云控制台查看
     */
    private final static String onlineAppKey = "394303";
    /**
     * 线上环境secretKey,物流云控制台查看
     */
    private final static String onlineSecretKey = "046j8XlGu50H20L94fm81p0910hlxJP9";
    /**
     * 线上环境token，token是商家在物流云平台授权ISV后生成的授权码，目前需要商家配置在ISV的软件中
     */
    private final static String onlineToken = "OU9tbXlubGZMaVFrODNSV2R2Y0R3VlVLdnE0cFFWUDVsTkNYNDZPMHdIMHNJeFJzUkR1WWo2VDZJYXRQSzRGMQ==";

    /**
     * 物流云工作台配置的API使用字符编码
     */
    private final static String myCharset = "UTF-8";

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        String secretKey = CainiaoConstant.dailySecretKey;
        String token = CainiaoConstant.dailyToken;
        String url = CainiaoConstant.dailyUrl;

//        secretKey = onlineSecretKey;
//        token = onlineToken;
//        url = onlineUrl;

        String apiContent = "{}";
        String digest = getDigest(apiContent,secretKey);

        FormBody.Builder formBodyBuilder = new FormBody.Builder();
        formBodyBuilder.add("logistic_provider_id",token);
        formBodyBuilder.add("msg_type","TMS_WAYBILL_SUBSCRIPTION_QUERY");
        formBodyBuilder.add("logistics_interface",apiContent);
        formBodyBuilder.add("data_digest",digest);

        Request httpRequest = new Request.Builder().url(url).post(formBodyBuilder.build()).build();
        Response response = new OkHttpClient.Builder()
                .connectionSpecs(Arrays.asList(ConnectionSpec.COMPATIBLE_TLS))
                .build()
                .newCall(httpRequest).execute();
        System.out.println(response.body().string());

//        SSLContext context = SSLContext.getInstance("TLS");
//        context.init(null, null, null);
//
//        SSLSocketFactory factory = (SSLSocketFactory) context.getSocketFactory();
//        SSLSocket socket = (SSLSocket) factory.createSocket();
//
//        String[] protocols = socket.getSupportedProtocols();
//
//        System.out.println("Supported Protocols: " + protocols.length);
//        for (int i = 0; i < protocols.length; i++) {
//            System.out.println(" " + protocols[i]);
//        }
//
//        protocols = socket.getEnabledProtocols();
//
//        System.out.println("Enabled Protocols: " + protocols.length);
//        for (int i = 0; i < protocols.length; i++) {
//            System.out.println(" " + protocols[i]);
//        }


    }

    private static String getDigest(String apiContent, String secretKey) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String combine = apiContent + secretKey;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(combine.getBytes(myCharset));
        return new String(Base64.encodeBase64(md.digest()), myCharset);
    }
}