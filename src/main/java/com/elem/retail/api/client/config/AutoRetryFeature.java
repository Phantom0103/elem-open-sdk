package com.elem.retail.api.client.config;

import com.elem.retail.api.ElemConstants;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-17
 */
public class AutoRetryFeature {

    private int retryCount = ElemConstants.DEFAULT_RETRY_COUNT;
    private long waitTime = ElemConstants.DEFAULT_WAIT_TIME;
    private List<String> retryErrorCodes;

    public AutoRetryFeature() {

    }

    public AutoRetryFeature(int retryCount) {
        this.retryCount = retryCount;
    }

    public AutoRetryFeature(long waitTime) {
        this.waitTime = waitTime;
    }

    public AutoRetryFeature(List<String> retryErrorCodes) {
        this.retryErrorCodes = retryErrorCodes;
    }

    public AutoRetryFeature(int retryCount, long waitTime) {
        this.retryCount = retryCount;
        this.waitTime = waitTime;
    }

    public AutoRetryFeature(int retryCount, List<String> retryErrorCodes) {
        this.retryCount = retryCount;
        this.retryErrorCodes = retryErrorCodes;
    }

    public AutoRetryFeature(int retryCount, long waitTime, List<String> retryErrorCodes) {
        this.retryCount = retryCount;
        this.waitTime = waitTime;
        this.retryErrorCodes = retryErrorCodes;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(long waitTime) {
        this.waitTime = waitTime;
    }

    public List<String> getRetryErrorCodes() {
        return retryErrorCodes;
    }

    public void setRetryErrorCodes(List<String> retryErrorCodes) {
        this.retryErrorCodes = retryErrorCodes;
    }
}
