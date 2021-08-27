package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderStatusGetRequest;
import elem.retail.dto.order.OrderStatusGetResult;

import java.io.Serializable;

/**
 * 此接口主要用于商家获取订单状态场景。如商家仅需查询订单状态，可使用此接口。
 *
 * @Author zhouw
 * @Description 查看订单状态
 * @Date 2021-08-27
 */
public class OrderStatusGetExecutor extends ElemApiExecutor {

    private OrderStatusGetRequest request;

    public OrderStatusGetExecutor(String appid, String secret, OrderStatusGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderStatusGetResult.class;
    }
}
