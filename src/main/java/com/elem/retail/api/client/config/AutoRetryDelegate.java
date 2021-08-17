package com.elem.retail.api.client.config;

import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.ElemResponseData;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-16
 */
@Slf4j(topic = "com.elem.retail.api")
public abstract class AutoRetryDelegate {

    private int retryCount = 3;
    private long waitTime = 200L;

    private final Set<String> retryErrorCodes = new HashSet<>(Arrays.asList("gw.ISPInvokeError", "gw.ISPConnectError", "gw.ISPInvokeTimeout"));

    public <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
        ElemResponse<T> response = null;
        ElemApiException exception = null;
        /**
         * 循环retryCount次，最多执行retryCount+1次。重试的条件是发生异常或者配置了重试的错误码
         */
        for (int i = 0; i <= retryCount; i++) {
            if (i > 0) {
                if (exception == null && !retryErrorCodes.contains(response.getMessage())) {
                    break;
                }

                this.sleep(waitTime);
                log.warn("cmd: {} 第{}次重试", request.getCmd(), i);
            }

            try {
                response = clientExecute(request, token, clazz);
                if ("0".equals(response.getCode())) {
                    return response;
                }

                exception = null;

                if (i == retryCount) {
                    return response;
                }
            } catch (ElemApiException e) {
                if (exception == null) {
                    exception = e;
                }
            }
        }

        if (exception != null) {
            throw exception;
        } else {
            return response;
        }
    }

    private void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public void setWaitTime(long waitTime) {
        this.waitTime = waitTime;
    }

    public void addRetryErrorCodes(List<String> retryErrorCodes) {
        this.retryErrorCodes.addAll(retryErrorCodes);
    }

    public abstract <T extends ElemResponseData> ElemResponse<T> clientExecute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException;
}
