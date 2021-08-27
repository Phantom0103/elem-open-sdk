package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderManyTimesPartRefundRequest;

import java.io.Serializable;

/**
 * 此接口主要用于售中商家主动发起多次部分退款（一次和多次都支持）场景。注意：商家只能在骑手已取餐状态前发起部分退款，
 * 骑手已取餐后（包含骑手已取餐）不再支持商家发起全单取消（或部分退款）。
 *
 * @Author zhouw
 * @Description 商家主动发起多次部分退
 * @Date 2021-08-27
 */
public class OrderManyTimesPartRefundExecutor extends ElemApiExecutor {

    private OrderManyTimesPartRefundRequest request;

    public OrderManyTimesPartRefundExecutor(String appid, String secret, OrderManyTimesPartRefundRequest request) {
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
