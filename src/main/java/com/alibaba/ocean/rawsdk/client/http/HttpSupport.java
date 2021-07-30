package com.alibaba.ocean.rawsdk.client.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

import com.alibaba.fastjson.JSON;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.client.pollicy.RequestPolicy;
import com.alibaba.ocean.rawsdk.client.serialize.AbstractParamRequestSerializer;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;
import com.alibaba.ocean.rawsdk.common.EleConstants;
import com.alibaba.ocean.rawsdk.util.MD5Utils;
import com.alibaba.ocean.rawsdk.util.MapSortUtil;
import com.alibaba.ocean.rawsdk.client.Request;

public final class HttpSupport {
    public static final char PARAMETER_SEPARATOR = '&';
    public static final char NAME_VALUE_SEPARATOR = '=';

    public final static Map<String, String> buildHttpHeader(RequestPolicy clientPolicy) {
        Map<String, String> header = new LinkedHashMap<String, String>();
        // header.put("Accept", "text/xml,text/javascript,application/json");
        header.put("Content-type", "application/x-www-form-urlencoded");
        header.put("User-Agent", clientPolicy.getAgent());
        return header;
    }

    /**
     * 构建query参数
     *
     * @param request
     * @param appKey
     * @return
     */
    public static Map<String, Object> buildParams(AbstractAPIRequest request, String appKey) {
        Map<String, Object> serializerMap = AbstractParamRequestSerializer.serialize(request);
        APIId apiId = request.getOceanApiId();

        // 系统参数
        serializerMap.put(EleConstants.API_NAME, apiId.getName());
        serializerMap.put(EleConstants.TIMESTAMP, String.valueOf(System.currentTimeMillis() / 1000));
        serializerMap.put(EleConstants.VERSION, apiId.getVersion());
        serializerMap.put(EleConstants.APPKEY, appKey);
        serializerMap.put(EleConstants.TICKET, request.getTicket());
        serializerMap.put(EleConstants.ENCRYPT, "");

        return serializerMap;
    }

    /**
     * 生成签名
     *
     * @param parameters
     * @param appKey
     * @param secKey
     * @param policy
     */
    public static void signature(Map<String, Object> parameters, String appKey, String secKey, RequestPolicy policy) {
        if (!policy.isUseSignture())
            return;
        if ((null == appKey || appKey == "")
                || (null == secKey || secKey == "")) {
            return;
        }

        String signedContent = getOpenApiSign(parameters, secKey);
        parameters.put(EleConstants.SIGNATURE, signedContent);
    }

    /**
     * 根据入参进行签名计算
     *
     * @param params
     * @param signingKey
     * @return
     */
    private static String getOpenApiSign(Map<String, Object> params, String signingKey) {
        params.put(EleConstants.SECRET, signingKey);
        Map<String, Object> paramsMap = MapSortUtil.sortMapByKey(params);
        StringBuilder builder = new StringBuilder();
        Iterator<Map.Entry<String, Object>> entryIterator = paramsMap.entrySet().iterator();
        if (entryIterator.hasNext()) {
            Map.Entry<?, ?> entry = entryIterator.next();
            builder.append(entry.getKey());
            builder.append(NAME_VALUE_SEPARATOR);
            builder.append(entry.getValue());
        }
        while (entryIterator.hasNext()) {
            builder.append(PARAMETER_SEPARATOR);
            Map.Entry<?, ?> e = entryIterator.next();
            builder.append(e.getKey());
            builder.append(NAME_VALUE_SEPARATOR);
            builder.append(e.getValue());
        }
        String sign = MD5Utils.getMd5(builder.toString());
        params.remove(EleConstants.SECRET);

        return sign;
    }

    /**
     * @param params
     * @return
     * @throws IOException
     */
    public static String buildQuery(Map<String, Object> params) throws IOException {
        if (params == null || params.isEmpty()) {
            return "";
        }
        StringBuilder query = new StringBuilder();
        Set<Map.Entry<String, Object>> entries = params.entrySet();
        boolean hasParam = false;

        for (Map.Entry<String, Object> entry : entries) {
            String name = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (hasParam) {
                    query.append("&");
                } else {
                    hasParam = true;
                }
                query.append(name).append("=").append(URLEncoder.encode(String.valueOf(value), "utf-8"));
            }
        }

        return query.toString();
    }

    public static URL buildPostRequestUrl(RequestPolicy clientPolicy) throws IOException {
        String protocol = "http";
        String host = clientPolicy.getServerHost();
        int port = clientPolicy.getHttpPort();
        if (clientPolicy.isUseHttps()) {
            protocol = "https";
            port = clientPolicy.getHttpsPort();
        }
        return new URL(protocol, host, port, "");

    }

    public static String parseResponseCharset(RequestPolicy requestPolicy, String ctype) {
        String charset = requestPolicy.getContentCharset();

        if (null != ctype && ctype != "") {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if (pair.length == 2) {
                        if (null != pair[1] && pair[1] != "") {
                            charset = pair[1].trim();
                        }
                    }
                    break;
                }
            }
        }
        return charset;
    }

}
