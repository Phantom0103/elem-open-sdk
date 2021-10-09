package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivitySkuAddBatchRequest;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 批量添加活动商品，仅用于单品直降。
 *
 * @author zhouw
 * @description 批量添加活动商品（单品直降）
 * @date 2021-10-09
 */
@Getter
@Setter
public class ActivitySkuAddBatchExecutor extends ElemApiExecutor {

    private ActivitySkuAddBatchRequest request;

    public ActivitySkuAddBatchExecutor(String appid, String secret, ActivitySkuAddBatchRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return String.class;
    }
}
