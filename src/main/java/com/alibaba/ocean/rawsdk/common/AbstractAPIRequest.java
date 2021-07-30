package com.alibaba.ocean.rawsdk.common;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.client.pollicy.RequestPolicy;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class AbstractAPIRequest<T> {

    protected RequestPolicy oceanRequestPolicy = new RequestPolicy();
    protected APIId oceanApiId;

    private String ticket;
    private String cmd;
    private String encrypt;
    private String traceid;
    private String source;
    private String version = "3";
    private Long timestamp;
    private String sign;

    public RequestPolicy getOceanRequestPolicy() {
        return oceanRequestPolicy;
    }

    public void setOceanRequestPolicy(RequestPolicy oceanRequestPolicy) {
        this.oceanRequestPolicy = oceanRequestPolicy;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
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

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public APIId getOceanApiId() {
        return oceanApiId;
    }

    public void setOceanApiId(APIId oceanApiId) {
        this.oceanApiId = oceanApiId;
    }

    public Class<T> getResponseClass() {
        Type type = this.getClass().getGenericSuperclass();

        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        return (Class) parameterizedType.getActualTypeArguments()[0];
    }

    public Object getBody() {
        return null;
    }
}
