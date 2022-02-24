package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderAgreeReturnGoodsRequest;

import java.io.Serializable;

/**
 * 同意退货。
 *
 * @Author zhouw
 * @Date 2022-02-24
 */
public class OrderAgreeReturnGoodsExecutor extends ElemApiExecutor {

    private OrderAgreeReturnGoodsRequest request;

    public OrderAgreeReturnGoodsExecutor(String appid, String secret, OrderAgreeReturnGoodsRequest request) {
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
