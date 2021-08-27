package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderPartRefundRequest;

import java.io.Serializable;

/**
 * 此接口主要用于售中商户主动发起部分退款申请场景。注意：此接口仅支持一笔订单发起一次退款，如需发起多次退款请使用order.manyTimesPartrefund接口。
 *
 * @Author zhouw
 * @Description 商户发起部分退款申请
 * @Date 2021-08-27
 */
public class OrderPartRefundExecutor extends ElemApiExecutor {

    private OrderPartRefundRequest request;

    public OrderPartRefundExecutor(String appid, String secret, OrderPartRefundRequest request) {
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
