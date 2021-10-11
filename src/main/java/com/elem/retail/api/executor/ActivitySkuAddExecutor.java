package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivitySkuAddRequest;

import java.io.Serializable;

/**
 * 添加活动商品（单品直降、品类满减）。
 *
 * @author zhouw
 * @description 添加活动商品
 * @date 2021-10-11
 */
public class ActivitySkuAddExecutor extends ElemApiExecutor {

    private ActivitySkuAddRequest request;

    public ActivitySkuAddExecutor(String appid, String secret, ActivitySkuAddRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return null;
    }
}
