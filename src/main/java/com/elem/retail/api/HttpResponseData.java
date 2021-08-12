package com.elem.retail.api;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-12
 */
public class HttpResponseData implements Serializable {

    private static final long serialVersionUID = 7112279865058565318L;

    private int responseCode;
    private String responseMessage;
    private String body;
    private Map<String, List<String>> headers;

    public boolean isSuccess() {
        return responseCode == 200;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
