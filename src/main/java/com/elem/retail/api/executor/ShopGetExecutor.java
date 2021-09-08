package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopGetRequest;
import elem.retail.dto.shop.ShopGetResult;

import java.io.Serializable;

/**
 * 查看商户。
 *
 * @Author zhouw
 * @Description 查看商户
 * @Date 2021-09-08
 */
public class ShopGetExecutor extends ElemApiExecutor {

    private ShopGetRequest request;

    public ShopGetExecutor(String appid, String secret, ShopGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopGetResult.class;
    }
}
