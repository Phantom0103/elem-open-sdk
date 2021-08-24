package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopCreateRequest;
import elem.retail.dto.shop.ShopCreateResult;

import java.io.Serializable;

/**
 * 创建商户。
 *
 * @Author zhouw
 * @Description 创建商户
 * @Date 2021-08-24
 */
public class ShopCreateExecutor extends ElemApiExecutor {

    private ShopCreateRequest request;

    public ShopCreateExecutor(String appid, String secret, ShopCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopCreateResult.class;
    }
}
