package com.elem.retail.api.util;

import okhttp3.*;

import java.io.IOException;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public class HttpUtils {

    public static String doPost(String url, String param) throws IOException {
        OkHttpClient httpClient = new OkHttpClient();
        RequestBody requestBody = RequestBody.create(param, MediaType.parse("application/x-www-form-urlencoded"));
        Request request = new Request.Builder().url(url).post(requestBody).build();
        try (Response response = httpClient.newCall(request).execute()) {
            ResponseBody responseBody = response.body();
            return responseBody == null ? null : responseBody.string();
        }
    }
}
