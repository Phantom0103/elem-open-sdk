package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderAgreePartRefundRequest;

import java.io.Serializable;

/**
 * 此接口用于订单售后用户申请多次部分退款，商家同意退款的场景。售后用户申请多次部分退 (注：只有上一个部分退完结，才可以发起下次部分退)。
 *
 * @Author zhouw
 * @Description 用户多次退商家同意
 * @Date 2021-08-27
 */
public class OrderAgreePartRefundExecutor extends ElemApiExecutor {

    private OrderAgreePartRefundRequest request;

    public OrderAgreePartRefundExecutor(String appid, String secret, OrderAgreePartRefundRequest request) {
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
