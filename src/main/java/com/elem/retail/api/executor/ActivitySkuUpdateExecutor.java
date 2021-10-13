package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivitySkuUpdateRequest;

import java.io.Serializable;

/**
 * 对已创建且未过活动期的商品直降活动、品类满减活动，更新活动商品。
 *
 * @author zhouw
 * @description 更新活动商品（仅直降）
 * @date 2021-10-13
 */
public class ActivitySkuUpdateExecutor extends ElemApiExecutor {

    private ActivitySkuUpdateRequest request;

    public ActivitySkuUpdateExecutor(String appid, String secret, ActivitySkuUpdateRequest request) {
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
