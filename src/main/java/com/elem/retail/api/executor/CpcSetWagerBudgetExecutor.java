package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcSetWagerBudgetRequest;

import java.io.Serializable;

/**
 * 根据店铺ID，设置预算。
 *
 * @author zhouw
 * @description 设置预算
 * @date 2021-09-30
 */
public class CpcSetWagerBudgetExecutor extends ElemApiExecutor {

    private CpcSetWagerBudgetRequest request;

    public CpcSetWagerBudgetExecutor(String appid, String secret, CpcSetWagerBudgetRequest request) {
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
