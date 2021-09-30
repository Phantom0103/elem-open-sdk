package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetResidueDegreeRequest;

import java.io.Serializable;

/**
 * 查询推广修改剩余次数。
 *
 * @author zhouw
 * @description 查询推广修改剩余次数
 * @date 2021-09-30
 */
public class CpcGetResidueDegreeExecutor extends ElemApiExecutor {

    private CpcGetResidueDegreeRequest request;

    public CpcGetResidueDegreeExecutor(String appid, String secret, CpcGetResidueDegreeRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Integer.class;
    }
}
