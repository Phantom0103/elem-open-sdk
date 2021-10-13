package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNs1SkuDeleteRequest;

import java.io.Serializable;

/**
 * N选1删除活动商品。
 *
 * @author zhouw
 * @description N选1删除活动商品
 * @date 2021-10-13
 */
public class ActivityNs1SkuDeleteExecutor extends ElemApiExecutor {

    private ActivityNs1SkuDeleteRequest request;

    public ActivityNs1SkuDeleteExecutor(String appid, String secret, ActivityNs1SkuDeleteRequest request) {
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
