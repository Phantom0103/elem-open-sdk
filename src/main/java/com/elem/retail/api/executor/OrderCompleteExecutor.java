package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCancelRequest;

import java.io.Serializable;

/**
 * 此接口主要用于饿了么自配送订单回传订单送达状态场景。调用成功后订单状态将变为已完成。自配送接入流程图可参考接入指南-API调用场景-订单整体解决方案。
 *
 * @Author zhouw
 * @Description 订单送达
 * @Date 2021-08-24
 */
public class OrderCompleteExecutor extends ElemApiExecutor {

    private OrderCancelRequest request;

    public OrderCompleteExecutor(String appid, String secret, OrderCancelRequest request) {
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
