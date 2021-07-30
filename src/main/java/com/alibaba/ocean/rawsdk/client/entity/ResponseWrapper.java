package com.alibaba.ocean.rawsdk.client.entity;

import com.alibaba.ocean.rawsdk.common.BizResultWrapper;

public class ResponseWrapper<T> {
    private String invokeStartTime;
    private long invokeCostTime;
    private ResponseStatus status;
    private BizResultWrapper<T> result;

    private String signature;

    public String getInvokeStartTime() {
        return invokeStartTime;
    }

    public void setInvokeStartTime(String invokeStartTime) {
        this.invokeStartTime = invokeStartTime;
    }

    public long getInvokeCostTime() {
        return invokeCostTime;
    }

    public void setInvokeCostTime(long invokeCostTime) {
        this.invokeCostTime = invokeCostTime;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public BizResultWrapper<T> getResult() {
        return result;
    }

    public void setResult(BizResultWrapper<T> result) {
        this.result = result;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}
