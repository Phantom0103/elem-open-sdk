package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopOpenRequest;

import java.io.Serializable;

/**
 * 商户开业。
 *
 * @Author zhouw
 * @Description 商户开业
 * @Date 2021-09-09
 */
public class ShopOpenExecutor extends ElemApiExecutor {

    private ShopOpenRequest request;

    public ShopOpenExecutor(String appid, String secret, ShopOpenRequest request) {
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
