package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActShopActDetailQueryRequest;
import elem.retail.dto.activity.ActShopActDetailQueryResult;

import java.io.Serializable;

/**
 * 店铺类活动查询活动明细信息。
 *
 * @author zhouw
 * @description 店铺类活动查询活动明细信息
 * @date 2021-10-13
 */
public class ActShopActDetailQueryExecutor extends ElemApiExecutor {

    private ActShopActDetailQueryRequest request;

    public ActShopActDetailQueryExecutor(String appid, String secret, ActShopActDetailQueryRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActShopActDetailQueryResult.class;
    }
}
