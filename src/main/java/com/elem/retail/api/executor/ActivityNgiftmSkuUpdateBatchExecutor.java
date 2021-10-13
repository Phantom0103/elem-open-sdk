package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmSkuUpdateBatchRequest;

import java.io.Serializable;

/**
 * 批量更新买N赠M活动商品库存、日库存信息。
 *
 * @author zhouw
 * @description 批量更新买N赠M活动商品库存、日库存信息
 * @date 2021-10-13
 */
public class ActivityNgiftmSkuUpdateBatchExecutor extends ElemApiExecutor {

    private ActivityNgiftmSkuUpdateBatchRequest request;

    public ActivityNgiftmSkuUpdateBatchExecutor(String appid, String secret, ActivityNgiftmSkuUpdateBatchRequest request) {
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
