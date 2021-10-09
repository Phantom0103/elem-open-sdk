package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNs1SkuAddBatchRequest;

import java.io.Serializable;

/**
 * N选1批量添加活动商品。
 *
 * @author zhouw
 * @description N选1批量添加活动商品
 * @date 2021-10-09
 */
public class ActivityNs1SkuAddBatchExecutor extends ElemApiExecutor {

    private ActivityNs1SkuAddBatchRequest request;

    public ActivityNs1SkuAddBatchExecutor(String appid, String secret, ActivityNs1SkuAddBatchRequest request) {
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
