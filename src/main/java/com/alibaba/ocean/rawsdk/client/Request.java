package com.alibaba.ocean.rawsdk.client;

import com.alibaba.ocean.rawsdk.client.pollicy.RequestPolicy;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

public class Request<T> {


    private AbstractAPIRequest requestEntity;
    private RequestPolicy policy = new RequestPolicy();
    private T body;

    public Request() {
    }


    public AbstractAPIRequest getRequestEntity() {
        return requestEntity;
    }

    public void setRequestEntity(AbstractAPIRequest requestEntity) {
        this.requestEntity = requestEntity;
    }

    public RequestPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(RequestPolicy policy) {
        this.policy = policy;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
