package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityCreateRequest;
import elem.retail.dto.activity.ActivityCreateResult;

import java.io.Serializable;

/**
 * 创建商品直降、品类满减、N选1活动，商品直降活动支持同一商品不同门店不同优惠价格，品类满减活动支持多商品组合营销能力。
 *
 * @author zhouw
 * @description 创建商品营销活动（直降、品类满减、N选1）
 * @date 2021-10-12
 */
public class ActivityCreateExecutor extends ElemApiExecutor {

    private ActivityCreateRequest request;

    public ActivityCreateExecutor(String appid, String secret, ActivityCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivityCreateResult.class;
    }
}
