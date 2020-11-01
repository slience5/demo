package cainiao;

import com.taobao.pac.sdk.cp.PacClient;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class CainiaoConstant {

    /**
     * 测试环境请求url
     */
    public final static String dailyUrl = "https://linkdaily.tbsandbox.com/gateway/pac_message_receiver.do";
    public final static String dailyUrl1 = "https://linkdaily.tbsandbox.com/gateway/link.do";
    /**
     * 测试环境appKey
     */
    public final static String dailyAppKey = "766654";
    /**
     * 测试环境secretKey
     */
    public final static String dailySecretKey = "F53eqq903jQySV100Z8w06f9g914A13Z";
    /**
     * 测试环境token，token是商家在物流云平台授权ISV后生成的授权码，目前需要商家配置在ISV的软件中
     */
    public final static String dailyToken = "TmpFU1ZOUGoyRnoybDZmT3lyaW9hU3E4SDlobjdvMlJkemsxaGhHaVFMa2ZpMWtwOWsxSjFIUmMrUTlmNWdHVQ==";

    /**
     * 线上环境请求url
     */
    public final static String onlineUrl = "http://link.cainiao.com/gateway/link.do";
    /**
     * 线上环境appKey，物流云控制台查看
     */
    public final static String onlineAppKey = "394303";
    /**
     * 线上环境secretKey,物流云控制台查看
     */
    public final static String onlineSecretKey = "046j8XlGu50H20L94fm81p0910hlxJP9";
    /**
     * 线上环境token，token是商家在物流云平台授权ISV后生成的授权码，目前需要商家配置在ISV的软件中
     */
    public final static String onlineToken = "OU9tbXlubGZMaVFrODNSV2R2Y0R3Y2t3TDhzZkU4Ymhvcm9tS2YzNzg5aTcvbnNHM0NPTlk1b2g2U2tzRjBTWA==";

    public final static String onlineToken1 = "c0pyWnZMV0plOStpRVBYSENCdTdDMkNOWTBQZ2d5WnlOaXNBYytwWmVRS0dqVUdBVGQyYmVFZDhNSFFJZ1J1Lw==";

    public final static PacClient CLIENT_TEST = new PacClient(CainiaoConstant.dailyAppKey, CainiaoConstant.dailySecretKey, CainiaoConstant.dailyUrl1);

    public final static PacClient CLIENT_ONLINE = new PacClient(CainiaoConstant.onlineAppKey, CainiaoConstant.onlineSecretKey, CainiaoConstant.onlineUrl);
}
