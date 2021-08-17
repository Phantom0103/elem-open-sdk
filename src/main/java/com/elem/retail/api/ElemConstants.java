package com.elem.retail.api;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-17
 */
public class ElemConstants {

    public static final String API_URL = "https://api-be.ele.me";

    public static final String OK_CODE = "0";
    public static final String ERROR_CODE = "-1";

    public static final String NULL_BODY_ERROR = "body is null";

    public static final int DEFAULT_RETRY_COUNT = 3;
    public static final long DEFAULT_WAIT_TIME = 200L;

    public static final String DEFAULT_CHARSET_NAME = "UTF-8";
    public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public static final String ACCEPT = "text/xml,text/javascript";
    public static final String USER_AGENT = "elem-sdk-java";
    public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded;charset=UTF-8";
    public static final String CONTENT_ENCODING = "gzip";

    public static final int READ_BUFFER_SIZE = 1024;

}
