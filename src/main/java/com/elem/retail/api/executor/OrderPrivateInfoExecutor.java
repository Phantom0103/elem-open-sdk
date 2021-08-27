package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderPrivateInfoRequest;
import elem.retail.dto.order.OrderPrivateInfoResult;

import java.io.Serializable;

/**
 * 此接口主要用于获取匿名订单的隐私信息，可获取匿名订单的用户隐私小号以及小号失效时间。注意：1. 隐私小号仅支持呼叫不支持发送短信，隐私小号的
 * 使用说明请查看：支持中心-常见问题-隐私小号
 *
 * @Author zhouw
 * @Description 获取订单隐私信息
 * @Date 2021-08-27
 */
public class OrderPrivateInfoExecutor extends ElemApiExecutor {

    private OrderPrivateInfoRequest request;

    public OrderPrivateInfoExecutor(String appid, String secret, OrderPrivateInfoRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderPrivateInfoResult.class;
    }
}
