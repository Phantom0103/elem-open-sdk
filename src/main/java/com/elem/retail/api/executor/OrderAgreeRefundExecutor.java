package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderAgreeRefundRequest;

import java.io.Serializable;

/**
 * 此接口主要用于售中用户发起全单取消，商家同意的场景。注：如用户在商家接单后一分钟内发起的取消，系统会自动同意退款无需商家审核同意。
 *
 * @Author zhouw
 * @Description 同意用户取消单/退单
 * @Date 2021-08-26
 */
public class OrderAgreeRefundExecutor extends ElemApiExecutor {

    private OrderAgreeRefundRequest request;

    public OrderAgreeRefundExecutor(String appid, String secret, OrderAgreeRefundRequest request) {
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
