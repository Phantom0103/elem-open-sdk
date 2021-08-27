package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderQrcodeCheckoutRequest;

import java.io.Serializable;

/**
 * 此接口主要用于用户到店自提订单，通过核销二维码来识别身份。此接口与order.checkout的区别：1. 可核销商户下订单 2. 仅支持二维码取货码核销。
 *
 * @Author zhouw
 * @Description 二维码核销
 * @Date 2021-08-27
 */
public class OrderQrcodeCheckoutExecutor extends ElemApiExecutor {

    private OrderQrcodeCheckoutRequest request;

    public OrderQrcodeCheckoutExecutor(String appid, String secret, OrderQrcodeCheckoutRequest request) {
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
