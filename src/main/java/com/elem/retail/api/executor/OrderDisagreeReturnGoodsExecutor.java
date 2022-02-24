package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderDisagreeReturnGoodsRequest;

import java.io.Serializable;

/**
 * 拒绝用户申请售后退货。
 *
 * @author zhouw
 * @date 2022-02-24
 */
public class OrderDisagreeReturnGoodsExecutor extends ElemApiExecutor {

    private OrderDisagreeReturnGoodsRequest request;

    public OrderDisagreeReturnGoodsExecutor(String appid, String secret, OrderDisagreeReturnGoodsRequest request) {
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
