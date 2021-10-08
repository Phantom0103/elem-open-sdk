package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActDetailAddSingleRequest;
import elem.retail.dto.activity.ActShopActDetailAddSingleResult;

import java.io.Serializable;

/**
 * 店铺类活动添加单个店铺。
 *
 * @author zhouw
 * @description 店铺类活动添加单个店铺
 * @date 2021-10-08
 */
public class ActShopActDetailAddSingleExecutor extends ElemApiExecutor {

    private ActShopActDetailAddSingleRequest request;

    public ActShopActDetailAddSingleExecutor(String appid, String secret, ActShopActDetailAddSingleRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActShopActDetailAddSingleResult.class;
    }
}
