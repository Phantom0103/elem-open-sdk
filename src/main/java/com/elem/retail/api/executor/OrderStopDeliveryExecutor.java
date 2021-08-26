package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderStopDeliveryRequest;

import java.io.Serializable;

/**
 * 此接口主要用于使用蜂鸟配送过程中，平台推送物流状态为配送异常/配送取消/配送拒单时，可通过调用此接口取消配送。
 * 注意：调用不再配送后，订单状态也会置为取消。
 *
 * @Author zhouw
 * @Description 配送异常不再配送
 * @Date 2021-08-26
 */
public class OrderStopDeliveryExecutor extends ElemApiExecutor {

    private OrderStopDeliveryRequest request;

    public OrderStopDeliveryExecutor(String appid, String secret, OrderStopDeliveryRequest request) {
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
