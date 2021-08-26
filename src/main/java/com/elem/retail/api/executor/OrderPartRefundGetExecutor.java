package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderPartRefundGetRequest;
import elem.retail.dto.order.OrderPartRefundGetResult;

import java.io.Serializable;

/**
 * 此接口主要用于获取部分退款详情信息，包括退款订单信息、商品营销信息、退款商品信息、退款后商品信息、历史退款商品信息等。
 * 注意：1. 饿了么APP订单商户发起部分退款后用户自动同意；2. 饿了么星选APP订单商户发起部分退款后需要用户操作同意，如10分钟用户未响应，订单将自动取消。
 *
 * @Author zhouw
 * @Description 查看部分退款订单详情
 * @Date 2021-08-26
 */
public class OrderPartRefundGetExecutor extends ElemApiExecutor {

    private OrderPartRefundGetRequest request;

    public OrderPartRefundGetExecutor(String appid, String secret, OrderPartRefundGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderPartRefundGetResult.class;
    }
}
