package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNitemSpecialSkuAddBatchRequest;

import java.io.Serializable;

/**
 * 批量添加第N件特价活动商品。
 *
 * @author zhouw
 * @description 批量添加第N件特价活动商品
 * @date 2021-10-11
 */
public class ActivityNitemSpecialSkuAddBatchExecutor extends ElemApiExecutor {

    private ActivityNitemSpecialSkuAddBatchRequest request;

    public ActivityNitemSpecialSkuAddBatchExecutor(String appid, String secret, ActivityNitemSpecialSkuAddBatchRequest request) {
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
