package com.alibaba.ocean.rawsdk.common;

import java.util.Map;

public class BizResultWrapper<T> {

    private String cmd;
    private String encrypt;
    private String traceid;
    private String source;
    private String ticket;
    private String version;
    private Long timestamp;
    private String sign;

    private T body;

    private static String RTN_CODE = "errno";
    private static String SUCCESS_FLAG = "0";

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public String getTraceid() {
        return traceid;
    }

    public void setTraceid(String traceid) {
        this.traceid = traceid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public boolean isSuccess(){
        Object errno = ((Map)body).get(RTN_CODE);
        if(errno != null){
            return SUCCESS_FLAG.equals(String.valueOf(errno));
        }
        return false;
    }
}
