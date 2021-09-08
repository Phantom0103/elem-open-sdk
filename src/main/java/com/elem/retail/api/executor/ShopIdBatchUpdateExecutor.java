package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopIdBatchUpdateRequest;

import java.io.Serializable;

/**
 * 商户三方门店ID映射。
 *
 * @Author zhouw
 * @Description 商户三方门店ID映射
 * @Date 2021-09-08
 */
public class ShopIdBatchUpdateExecutor extends ElemApiExecutor {

    private ShopIdBatchUpdateRequest request;

    public ShopIdBatchUpdateExecutor(String appid, String secret, ShopIdBatchUpdateRequest request) {
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
