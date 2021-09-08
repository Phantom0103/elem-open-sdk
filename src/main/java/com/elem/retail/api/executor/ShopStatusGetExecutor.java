package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopStatusGetRequest;
import elem.retail.dto.shop.ShopStatusGetResult;

import java.io.Serializable;

/**
 * 查看商户状态。
 *
 * @Author zhouw
 * @Description 查看商户状态
 * @Date 2021-09-08
 */
public class ShopStatusGetExecutor extends ElemApiExecutor {

    private ShopStatusGetRequest request;

    public ShopStatusGetExecutor(String appid, String secret, ShopStatusGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopStatusGetResult.class;
    }
}
