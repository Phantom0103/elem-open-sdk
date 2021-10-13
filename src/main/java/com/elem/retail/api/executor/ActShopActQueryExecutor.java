package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActQueryRequest;
import elem.retail.dto.activity.ActShopActQueryResult;

import java.io.Serializable;

/**
 * 店铺类活动查询活动信息。
 *
 * @author zhouw
 * @description 店铺类活动查询活动信息
 * @date 2021-10-13
 */
public class ActShopActQueryExecutor extends ElemApiExecutor {

    private ActShopActQueryRequest request;

    public ActShopActQueryExecutor(String appid, String secret, ActShopActQueryRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActShopActQueryResult.class;
    }
}
