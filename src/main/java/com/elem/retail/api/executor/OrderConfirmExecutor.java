package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderConfirmRequest;

import java.io.Serializable;

/**
 * 从接口主要用于订单接单，实现商家自动接单场景。注意：如订单下单后五分钟，商家未接单系统会自动取消订单。
 *
 * @Author zhouw
 * @Description 确认订单
 * @Date 2021-08-27
 */
public class OrderConfirmExecutor extends ElemApiExecutor {

    private OrderConfirmRequest request;

    public OrderConfirmExecutor(String appid, String secret, OrderConfirmRequest request) {
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
