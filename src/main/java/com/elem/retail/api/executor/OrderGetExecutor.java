package com.elem.retail.api.executor;

import com.alibaba.fastjson.JSONObject;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import elem.retail.dto.order.OrderGetRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-04
 */
public class OrderGetExecutor extends ElemApiExecutor {

    private OrderGetRequest request;

    public OrderGetExecutor(String appid, String secret, String accessToken, OrderGetRequest request) {
        super(appid, secret, accessToken);
        this.request = request;
    }

    @Override
    ElemResponse getResponse(JSONObject response) {
        return null;
    }

    @Override
    public ElemRequest getRequest() {
        return request;
    }
}
