package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponseData;
import elem.retail.dto.order.OrderGetRequest;
import elem.retail.dto.order.OrderGetResponse;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-04
 */
public class OrderGetExecutor extends ElemApiExecutor {

    private OrderGetRequest request;

    public OrderGetExecutor(String appid, String secret, String accessToken, OrderGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemResponseData getResponseData() {
        return new OrderGetResponse();
    }

    @Override
    public ElemRequest getRequest() {
        return request;
    }
}
