package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActDetailAddRequest;
import elem.retail.dto.activity.ActShopActDetailAddResult;

import java.io.Serializable;

/**
 * 店铺类活动添加店铺。
 *
 * @author zhouw
 * @description 店铺类活动添加店铺
 * @date 2021-10-13
 */
public class ActShopActDetailAddExecutor extends ElemApiExecutor {

    private ActShopActDetailAddRequest request;

    public ActShopActDetailAddExecutor(String appid, String secret, ActShopActDetailAddRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActShopActDetailAddResult.class;
    }
}
