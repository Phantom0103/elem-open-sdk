package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCancelRequest;

import java.io.Serializable;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-04
 */
public class OrderCancelExecutor extends ElemApiExecutor {

    private OrderCancelRequest request;

    public OrderCancelExecutor(String appid, String secret, OrderCancelRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Boolean.class;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }
}
