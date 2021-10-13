package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNitemSpecialSkuUpdateBatchRequest;

import java.io.Serializable;

/**
 * 批量更新第N件特价批量更新活动商品库存、日库存。
 *
 * @author zhouw
 * @description 批量更新第N件特价批量更新活动商品库存、日库存
 * @date 2021-10-13
 */
public class ActivityNitemSpecialSkuUpdateBatchExecutor extends ElemApiExecutor {

    private ActivityNitemSpecialSkuUpdateBatchRequest request;

    public ActivityNitemSpecialSkuUpdateBatchExecutor(String appid, String secret, ActivityNitemSpecialSkuUpdateBatchRequest request) {
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
