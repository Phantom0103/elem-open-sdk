package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderQueryAcceptanceCodeRequest;
import elem.retail.dto.order.OrderQueryAcceptanceCodeResult;

import java.io.Serializable;

/**
 * 获取取货码。
 *
 * @Author zhouw
 * @Description 获取取货码
 * @Date 2021-08-27
 */
public class OrderQueryAcceptanceCodeExecutor extends ElemApiExecutor {

    private OrderQueryAcceptanceCodeRequest request;

    public OrderQueryAcceptanceCodeExecutor(String appid, String secret, OrderQueryAcceptanceCodeRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    protected ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderQueryAcceptanceCodeResult.class;
    }
}
