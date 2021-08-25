package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderLimitedTakingRequest;

import java.io.Serializable;

/**
 * 接口主要用于设置门店指定时间段内限制用户下单量场景。每次配置仅对全天时间片生效，仅择时达和新标品服务包可配置。
 *
 * @Author zhouw
 * @Description 设置门店限单值
 * @Date 2021-08-25
 */
public class OrderLimitedTakingResult extends ElemApiExecutor {

    private OrderLimitedTakingRequest request;

    public OrderLimitedTakingResult(String appid, String secret, OrderLimitedTakingRequest request) {
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
