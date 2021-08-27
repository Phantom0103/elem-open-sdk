package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderGetDeliveryFeeForCrowdRequest;

import java.io.Serializable;

/**
 * 此接口主要用于蜂鸟众包订单获取当前时段的众包配送费，接口仅限蜂鸟众包商户调用。众包配送接入流程请参考：接入指南-APi调用场景-订单整体方案。
 *
 * @Author zhouw
 * @Description 获取众包订单配送费
 * @Date 2021-08-27
 */
public class OrderGetDeliveryFeeForCrowdExecutor extends ElemApiExecutor {

    private OrderGetDeliveryFeeForCrowdRequest request;

    public OrderGetDeliveryFeeForCrowdExecutor(String appid, String secret, OrderGetDeliveryFeeForCrowdRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Integer.class;
    }
}
