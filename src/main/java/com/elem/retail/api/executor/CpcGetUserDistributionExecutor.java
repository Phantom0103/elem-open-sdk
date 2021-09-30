package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetUserDistributionRequest;
import elem.retail.dto.cpc.CpcGetUserDistributionResult;

import java.io.Serializable;

/**
 * 根据店铺ID，获取某一天推广活跃顾客的点击结构。一次只能查询一天，date的有效范围是近7天。
 *
 * @author zhouw
 * @description 获取推广活跃顾客的点击结构
 * @date 2021-09-30
 */
public class CpcGetUserDistributionExecutor extends ElemApiExecutor {

    private CpcGetUserDistributionRequest request;

    public CpcGetUserDistributionExecutor(String appid, String secret, CpcGetUserDistributionRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CpcGetUserDistributionResult.class;
    }
}
