package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivitySkuDeleteBatchRequest;

import java.io.Serializable;

/**
 * 批量删除活动商品（除N选1外，所有活动类型）。
 *
 * @author zhouw
 * @description 批量删除活动商品（除N选1外，所有活动类型）
 * @date 2021-10-09
 */
public class ActivitySkuDeleteBatchExecutor extends ElemApiExecutor {

    private ActivitySkuDeleteBatchRequest request;

    public ActivitySkuDeleteBatchExecutor(String appid, String secret, ActivitySkuDeleteBatchRequest request) {
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
