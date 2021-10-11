package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivitySkuListRequest;
import elem.retail.dto.activity.ActivitySkuListResult;

import java.io.Serializable;

/**
 * 商品营销活动查看活动商品信息（直降、N选1、品类满减、第N件特价）。
 *
 * @author zhouw
 * @description 商品营销活动查看活动商品信息（直降、N选1、品类满减、第N件特价）
 * @date 2021-10-11
 */
public class ActivitySkuListExecutor extends ElemApiExecutor {

    private ActivitySkuListRequest request;

    public ActivitySkuListExecutor(String appid, String secret, ActivitySkuListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivitySkuListResult.class;
    }
}
