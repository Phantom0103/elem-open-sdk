package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderListRequest;
import elem.retail.dto.order.OrderListResult;

import java.io.Serializable;

/**
 * 此接口主要用于获取门店下筛选时间段内的订单数据列表场景，也可以用于防止漏单和补单场景。
 * 注意：1. 仅可获取到绑定api后发生的订单数据；2. 仅可查询近3个月内的订单。
 *
 * @Author zhouw
 * @Description 查看订单列表
 * @Date 2021-08-27
 */
public class OrderListExecutor extends ElemApiExecutor {

    private OrderListRequest request;

    public OrderListExecutor(String appid, String secret, OrderListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderListResult.class;
    }
}
