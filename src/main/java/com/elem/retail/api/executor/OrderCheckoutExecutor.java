package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCheckoutRequest;

import java.io.Serializable;

/**
 * 此接口主要用于订单自提场景，当用户到店自提时，需出示取货码或二维码进行订单核销。注意：商家在订单被接单后可通过order.get 接口获取订单的自提取货码。
 *
 * @Author zhouw
 * @Description 订单核销
 * @Date 2021-08-27
 */
public class OrderCheckoutExecutor extends ElemApiExecutor {

    private OrderCheckoutRequest request;

    public OrderCheckoutExecutor(String appid, String secret, OrderCheckoutRequest request) {
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
