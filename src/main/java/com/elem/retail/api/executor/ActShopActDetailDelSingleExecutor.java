package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActDetailDelSingleRequest;
import elem.retail.dto.activity.ActShopActDetailDelSingleResult;

import java.io.Serializable;

/**
 * 店铺类活动删除单个店铺。
 *
 * @author zhouw
 * @description 店铺类活动删除单个店铺
 * @date 2021-10-13
 */
public class ActShopActDetailDelSingleExecutor extends ElemApiExecutor {

    private ActShopActDetailDelSingleRequest request;

    public ActShopActDetailDelSingleExecutor(String appid, String secret, ActShopActDetailDelSingleRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActShopActDetailDelSingleResult.class;
    }
}
