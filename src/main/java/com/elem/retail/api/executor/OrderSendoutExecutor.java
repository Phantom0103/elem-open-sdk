package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderSendoutRequest;

import java.io.Serializable;

/**
 * 此接口主要用于商家自配送场景，将订单置为配送中状态。 商家自配送接入流程图：请查看 接入指南-API调用场景-订单整体方案中的订单（商家自配送）接入流程。
 * 注意：此接口与order.selfDeliveryStateSync接口互斥，同一个订单不能同时调用这两个接口，否则会出现覆盖现象。
 *
 * @Author zhouw
 * @Description 订单送出
 * @Date 2021-08-26
 */
public class OrderSendoutExecutor extends ElemApiExecutor {

    private OrderSendoutRequest request;

    public OrderSendoutExecutor(String appid, String secret, OrderSendoutRequest request) {
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
