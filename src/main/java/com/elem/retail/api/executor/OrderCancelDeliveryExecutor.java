package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCancelDeliveryRequest;

import java.io.Serializable;

/**
 * 此接口主要用于订单在使用众包配送时取消呼叫配送的场景。注意：骑手接单后不允许再取消呼叫配送。
 *
 * @Author zhouw
 * @Description 取消呼叫配送
 * @Date 2021-08-27
 */
public class OrderCancelDeliveryExecutor extends ElemApiExecutor {

    private OrderCancelDeliveryRequest request;

    public OrderCancelDeliveryExecutor(String appid, String secret, OrderCancelDeliveryRequest request) {
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
