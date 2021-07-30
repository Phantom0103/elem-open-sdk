package com.alibaba.ocean.rawsdk.common;

import java.util.TimeZone;

public class EleConstants {
    /**
     * 协议
     */
    public static final String ELE_PROTOCAL_SEPERATE = "_";

    public static final String ELE_PROTOCAL_URL = "/router/rest";

    public static final String ELE_PROTOCAL_DATE = "yyyy-MM-dd HH:mm:ss";

    public static final String ELE_PROTOCAL_ZONE = "GMT+8";

    public static final TimeZone ELE_TIMEZONE = TimeZone.getTimeZone(ELE_PROTOCAL_ZONE);
    /**
     * 公共参数
     */
    public static String API_NAME = "cmd";

    public static String APPKEY = "source";

    public static String TICKET = "ticket";

    public static String ENCRYPT = "encrypt";

    public static String VERSION = "version";

    public static String RESULT_DATA = "data";
    public static String BODY = "body";
    /**
     * yyyy-MM-dd
     */
    public static String TIMESTAMP = "timestamp";

    public static String SIGNATURE = "sign";

    public static String SECRET = "secret";
    /**
     * 返回的错误格式
     */
    public static final String ELE_ERROR_RESPONSE = "body";

    public static final String ELE_ERROR_CODE = "errno";

    public static final String ELE_ERROR_MESSAGE = "error";

    /**
     * 正确返回格式
     */
    public static final String ELE_RESPONSE_SUFFIX = ELE_PROTOCAL_SEPERATE + "response";

    private static final String regularPattern = "\\.";

    public static Integer DEFAULT_HTTP_PORT = 80;
    public static Integer DEFAULT_HTTPS_PORT = 443;

    public static String DEFAULT_HOST = "api-be.ele.me";

    public static final String CONTENT_ENCODING_GZIP = "gzip";

}
