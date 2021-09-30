package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetWagerEstimateRequest;
import elem.retail.dto.cpc.CpcGetWagerEstimateResult;

import java.io.Serializable;

/**
 * 根据出价查询预估信息。
 *
 * @author zhouw
 * @description 根据出价查询预估信息
 * @date 2021-09-30
 */
public class CpcGetWagerEstimateExecutor extends ElemApiExecutor {

    private CpcGetWagerEstimateRequest request;

    public CpcGetWagerEstimateExecutor(String appid, String secret, CpcGetWagerEstimateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CpcGetWagerEstimateResult.class;
    }
}
