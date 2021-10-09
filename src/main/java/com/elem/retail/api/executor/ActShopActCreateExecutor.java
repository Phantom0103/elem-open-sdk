package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActCreateRequest;
import elem.retail.dto.activity.ActShopActCreateResult;

import java.io.Serializable;

/**
 * 创建店铺类活动。
 *
 * @author zhouw
 * @description 创建店铺类活动
 * @date 2021-10-09
 */
public class ActShopActCreateExecutor extends ElemApiExecutor {

    private ActShopActCreateRequest request;

    public ActShopActCreateExecutor(String appid, String secret, ActShopActCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActShopActCreateResult.class;
    }
}
