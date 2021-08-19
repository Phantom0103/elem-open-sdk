package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCancelRequest;

import java.io.Serializable;

/**
 * 此接口主要用于售中商家发起全单取消场景。注意：商家只能在骑手已取餐状态前发起全单取消，骑手已取餐后（包含骑手已取餐）
 * 不再支持商家发起全单取消（或部分退款）。
 *
 * @Author zhouw
 * @Description 取消订单
 * @Date 2021-08-04
 */
public class OrderCancelExecutor extends ElemApiExecutor {

    private OrderCancelRequest request;

    public OrderCancelExecutor(String appid, String secret, OrderCancelRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Boolean.class;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }
}
