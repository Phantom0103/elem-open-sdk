package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcSetWagerGradeRequest;

import java.io.Serializable;

/**
 * 根据店铺ID，设置推广出价。
 *
 * @author zhouw
 * @description 设置推广出价
 * @date 2021-09-30
 */
public class CpcSetWagerGradeExecutor extends ElemApiExecutor {

    private CpcSetWagerGradeRequest request;

    public CpcSetWagerGradeExecutor(String appid, String secret, CpcSetWagerGradeRequest request) {
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
