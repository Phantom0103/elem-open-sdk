package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponseData;
import elem.retail.dto.order.OrderGetRequest;
import elem.retail.dto.order.OrderGetResult;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-04
 */
public class OrderGetExecutor extends ElemApiExecutor {

    private OrderGetRequest request;

    public OrderGetExecutor(String appid, String secret, OrderGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    Class<? extends ElemResponseData> getResponseDataClass() {
        return OrderGetResult.class;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }
}
