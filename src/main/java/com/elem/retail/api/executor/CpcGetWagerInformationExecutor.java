package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetWagerInformationRequest;
import elem.retail.dto.cpc.CpcGetWagerInformationResult;

import java.io.Serializable;

/**
 * 根据店铺ID，推广状态、推广出价、每日预算、投放时间、投放速率。
 *
 * @author zhouw
 * @description 查询推广信息
 * @date 2021-09-30
 */
public class CpcGetWagerInformationExecutor extends ElemApiExecutor {

    private CpcGetWagerInformationRequest request;

    public CpcGetWagerInformationExecutor(String appid, String secret, CpcGetWagerInformationRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CpcGetWagerInformationResult.class;
    }
}
