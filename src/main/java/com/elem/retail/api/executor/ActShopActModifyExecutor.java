package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActModifyRequest;

import java.io.Serializable;

/**
 * 店铺类活动信息修改。
 *
 * @author zhouw
 * @description 店铺类活动信息修改
 * @date 2021-10-13
 */
public class ActShopActModifyExecutor extends ElemApiExecutor {

    private ActShopActModifyRequest request;

    public ActShopActModifyExecutor(String appid, String secret, ActShopActModifyRequest request) {
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
