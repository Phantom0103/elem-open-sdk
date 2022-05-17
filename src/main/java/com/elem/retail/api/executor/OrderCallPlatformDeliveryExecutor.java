package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCallPlatformDeliveryRequest;

import java.io.Serializable;

/**
 * 订单呼叫平台配送
 * <p>
 * 配送异常，调用此接口进行二次呼叫平台配送。
 *
 * @author zhouw
 * @date 2022-05-17
 */
public class OrderCallPlatformDeliveryExecutor extends ElemApiExecutor {

    private OrderCallPlatformDeliveryRequest request;

    public OrderCallPlatformDeliveryExecutor(String appid, String secret, OrderCallPlatformDeliveryRequest request) {
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
