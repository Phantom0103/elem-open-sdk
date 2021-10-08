package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActXdiscountySkuAddBatchRequest;

import java.io.Serializable;

/**
 * 商品X件Y元/折批量添加商品明细。
 *
 * @author zhouw
 * @description 商品X件Y元/折批量添加商品明细
 * @date 2021-10-08
 */
public class ActXdiscountySkuAddBatchExecutor extends ElemApiExecutor {

    private ActXdiscountySkuAddBatchRequest request;

    public ActXdiscountySkuAddBatchExecutor(String appid, String secret, ActXdiscountySkuAddBatchRequest request) {
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
