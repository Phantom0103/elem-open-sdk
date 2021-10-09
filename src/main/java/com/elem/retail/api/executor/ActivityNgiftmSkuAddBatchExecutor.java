package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmSkuAddBatchRequest;

import java.io.Serializable;

/**
 * 批量添加买N赠M活动商品。
 *
 * @author zhouw
 * @description 批量添加买N赠M活动商品
 * @date 2021-10-09
 */
public class ActivityNgiftmSkuAddBatchExecutor extends ElemApiExecutor {

    private ActivityNgiftmSkuAddBatchRequest request;

    public ActivityNgiftmSkuAddBatchExecutor(String appid, String secret, ActivityNgiftmSkuAddBatchRequest request) {
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
