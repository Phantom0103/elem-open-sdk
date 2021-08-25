package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderDeliveryGetRequest;
import elem.retail.dto.order.OrderDeliveryGetResult;

import java.io.Serializable;

/**
 * 此接口主要用于为商家提供订单配送信息查询服务场景，可以获取订单当前状态的运单配送信息。注意：接口暂不支持自配送获取运单状态。
 *
 * @Author zhouw
 * @Description 获取订单配送信息
 * @Date 2021-08-25
 */
public class OrderDeliveryGetExecutor extends ElemApiExecutor {

    private OrderDeliveryGetRequest request;

    public OrderDeliveryGetExecutor(String appid, String secret, OrderDeliveryGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderDeliveryGetResult.class;
    }
}
