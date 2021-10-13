package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActXdiscountySkuAddRequest;

import java.io.Serializable;

/**
 * 商品X件Y元/折添加商品明细。
 *
 * @author zhouw
 * @description 商品X件Y元/折添加商品明细
 * @date 2021-10-13
 */
public class ActXdiscountySkuAddExecutor extends ElemApiExecutor {

    private ActXdiscountySkuAddRequest request;

    public ActXdiscountySkuAddExecutor(String appid, String secret, ActXdiscountySkuAddRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return null;
    }
}
