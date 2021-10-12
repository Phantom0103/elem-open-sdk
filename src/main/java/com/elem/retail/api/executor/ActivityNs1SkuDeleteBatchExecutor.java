package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNs1SkuDeleteBatchRequest;

import java.io.Serializable;

/**
 * N选1批量删除活动商品。
 *
 * @author zhouw
 * @description N选1批量删除活动商品
 * @date 2021-10-12
 */
public class ActivityNs1SkuDeleteBatchExecutor extends ElemApiExecutor {

    private ActivityNs1SkuDeleteBatchRequest request;

    public ActivityNs1SkuDeleteBatchExecutor(String appid, String secret, ActivityNs1SkuDeleteBatchRequest request) {
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
