package utils;

import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * HttpClient工具类
 *
 * @author captcha_dev
 * @version 2019年11月4日
 */
public class HttpClientUtil {

    protected static Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

    private static final Integer TIME_OUT = 20000;

    /**
     * 发送post请求
     *
     * @param url
     *            请求地址
     * @param params
     *            请求参数
     * @return
     */
    public static String post(String url, Map<String, String> params) {
        return post(url, JSON.toJSONString(params), null, null);
    }

    /**
     * 发送post请求
     *
     * @param url
     *            请求地址
     * @param params
     *            请求参数
     * @return
     */
    public static String post(String url, Map<String, String> params, Map<String, String> headers) {
        return post(url, JSON.toJSONString(params), headers, null);
    }

    /**
     * 发送post请求
     *
     * @param url
     *            请求地址
     * @param headers
     *            请求参数
     * @return
     */
    public static String postNoParams(String url, Map<String, String> headers) {
        return post(url, null, headers, null);
    }

    /**
     * 发送post请求
     *
     * @param url
     *            请求地址
     * @param json
     *            请求参数
     * @return
     */
    public static String post(String url, String json) {
        return post(url, json, null, null);
    }

    /**
     * 自定义Header post请求
     */
    public static String post(String url, String json, Map<String, String> headers) {
        return post(url, json, headers, null);
    }

    /**
     * 发送post请求
     *
     * @param url
     *            请求地址
     * @param params
     *            请求参数
     * @param headers
     *            请求头
     * @param contentType
     * @return
     */
    public static String post(String url, String params, Map<String, String> headers, String contentType) {
        try {
            HttpRequest request = HttpRequest.post(url).timeout(TIME_OUT);

            if (StringUtils.isNotEmpty(params)) {
                request.body(params);
            }

            if (StringUtils.isNotEmpty(contentType)) {
                request.contentType(contentType);
            }
            if (headers != null && !headers.isEmpty()) {
                request.addHeaders(headers);
            }

            return request.execute().body();
        } catch (HttpException e) {
            log.error("[HttpClientUtil] 请求出错 url:{},params:{}", url, params, e);
        }
        return "";
    }

    /**
     * 执行GET请求
     *
     * @param url
     * @return
     * @throws IOException
     * @throws ClientProtocolException
     */
    public static String get(String url) {
        return get(url, null, null);
    }

    /**
     * 带有参数的GET请求
     *
     * @param url
     * @param params
     * @return
     * @throws URISyntaxException
     * @throws IOException
     * @throws ClientProtocolException
     */
    public static String get(String url, Map<String, String> params) {
        return get(url, params, null);
    }

    /**
     * 发送get请求
     *
     * @param url
     *            请求地址
     * @param params
     *            请求参数
     * @param headers
     *            请求头
     * @return
     */
    public static String get(String url, Map<String, String> params, Map<String, String> headers) {
        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            if(params != null) {
                for (String key : params.keySet()) {
                    uriBuilder.addParameter(key, params.get(key));
                }
            }

            HttpRequest request = HttpRequest.get(uriBuilder.toString()).timeout(TIME_OUT);

            if (headers != null && !headers.isEmpty()) {
                request.addHeaders(headers);
            }

            return request.execute().body();
        } catch (HttpException | URISyntaxException e) {
            log.error("[HttpClientUtil] 请求出错 url:{},params:{}", url, params, e);
        }
        return "";
    }
}