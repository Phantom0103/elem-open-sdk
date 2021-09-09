package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopBusStatusGetRequest;
import elem.retail.dto.shop.ShopBusStatusGetResult;

import java.io.Serializable;

/**
 * 查看商户的营业状态。
 *
 * @Author zhouw
 * @Description 查看商户的营业状态
 * @Date 2021-09-09
 */
public class ShopBusStatusGetExecutor extends ElemApiExecutor {

    private ShopBusStatusGetRequest request;

    public ShopBusStatusGetExecutor(String appid, String secret, ShopBusStatusGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopBusStatusGetResult.class;
    }
}
