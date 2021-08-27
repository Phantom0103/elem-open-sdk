package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCallDeliveryRequest;

import java.io.Serializable;

/**
 * 此接口主要用于众包配送时呼叫众包骑手场景。商家接单后首先获取众包配送费，确认当前时段的配送费可接受，然后在调用呼叫配送接口呼叫众包骑手。
 *
 * @Author zhouw
 * @Description 呼叫配送
 * @Date 2021-08-27
 */
public class OrderCallDeliveryExecutor extends ElemApiExecutor {

    private OrderCallDeliveryRequest request;

    public OrderCallDeliveryExecutor(String appid, String secret, OrderCallDeliveryRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Boolean.class;
    }
}
