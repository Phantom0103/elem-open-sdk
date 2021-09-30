package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetUvSummaryRequest;
import elem.retail.dto.cpc.CpcGetUvSummaryResult;

import java.io.Serializable;

/**
 * 根据店铺ID，获取今日、近7天、近30天推广效果数据（当日数据不包含曝光数、点击率，不建议手动求点击率）。
 *
 * @author zhouw
 * @description 查询推广效果数据
 * @date 2021-09-30
 */
public class CpcGetUvSummaryExecutor extends ElemApiExecutor {

    private CpcGetUvSummaryRequest request;

    public CpcGetUvSummaryExecutor(String appid, String secret, CpcGetUvSummaryRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CpcGetUvSummaryResult.class;
    }
}
