package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopUpdateRequest;

import java.io.Serializable;

/**
 * 修改商户。
 *
 * @Author zhouw
 * @Description 修改商户
 * @Date 2021-09-09
 */
public class ShopUpdateExecutor extends ElemApiExecutor {

    private ShopUpdateRequest request;

    public ShopUpdateExecutor(String appid, String secret, ShopUpdateRequest request) {
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
