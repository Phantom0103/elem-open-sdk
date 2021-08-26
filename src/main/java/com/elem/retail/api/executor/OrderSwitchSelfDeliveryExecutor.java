package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderSwitchSelfDeliveryRequest;

import java.io.Serializable;

/**
 * 此接口主要用于使用蜂鸟配送过程中，平台推送物流状态为配送异常/配送取消/配送拒单时，可通过调用此接口将配送方式转为自配送，商家自行配送。
 * 商家自配送接入流程图请查看：接入指南-API调用场景-订单整体方案中的订单（商家自配送）接入流程。
 *
 * @Author zhouw
 * @Description 配送异常切自配送
 * @Date 2021-08-26
 */
public class OrderSwitchSelfDeliveryExecutor extends ElemApiExecutor {

    private OrderSwitchSelfDeliveryRequest request;

    public OrderSwitchSelfDeliveryExecutor(String appid, String secret, OrderSwitchSelfDeliveryRequest request) {
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
