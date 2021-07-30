package com.alibaba.ocean.rawsdk.client;

public class Response {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private int statusCode;
    private Object result;
    private Throwable exception;
    private String charset = DEFAULT_CHARSET;
    private String encoding;

    public Response setResult(Object result) {
        this.result = result;
        return this;
    }

    public Object getResult() {
        return result;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
