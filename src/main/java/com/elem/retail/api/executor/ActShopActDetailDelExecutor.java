package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActDetailDelRequest;
import elem.retail.dto.activity.ActShopActDetailDelResult;

import java.io.Serializable;

/**
 * 店铺类活动删除店铺。
 *
 * @author zhouw
 * @description 店铺类活动删除店铺
 * @date 2021-10-13
 */
public class ActShopActDetailDelExecutor extends ElemApiExecutor {

    private ActShopActDetailDelRequest request;

    public ActShopActDetailDelExecutor(String appid, String secret, ActShopActDetailDelRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActShopActDetailDelResult.class;
    }
}
