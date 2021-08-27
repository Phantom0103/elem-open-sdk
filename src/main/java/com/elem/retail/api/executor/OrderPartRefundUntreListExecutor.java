package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderPartRefundUntreListRequest;
import elem.retail.dto.order.OrderPartRefundUntreListResult;

import java.io.Serializable;

/**
 * 此接口主要用于商家主动获取未处理用户申请的部分退款列表场景，以防止遗漏未处理退款单引起客诉或资损。
 * 注意：1. 饿了么APP订单商户发起部分退款后用户自动同意；2. 饿了么星选APP订单商户发起部分退款后需要用户操作同意，如10分钟用户未响应，订单将自动取消。
 *
 * @Author zhouw
 * @Description 获取未处理部分退单
 * @Date 2021-08-27
 */
public class OrderPartRefundUntreListExecutor extends ElemApiExecutor {

    private OrderPartRefundUntreListRequest request;

    public OrderPartRefundUntreListExecutor(String appid, String secret, OrderPartRefundUntreListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderPartRefundUntreListResult.class;
    }
}
