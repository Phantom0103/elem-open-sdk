package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.drug.PrescriptionDrugSearchRequest;
import elem.retail.dto.drug.PrescriptionDrugSearchResult;

import java.io.Serializable;

/**
 * 三方医疗-搜索药品。
 *
 * @Author zhouw
 * @Description 三方医疗-搜索药品
 * @Date 2021-09-02
 */
public class PrescriptionDrugSearchExecutor extends ElemApiExecutor {

    private PrescriptionDrugSearchRequest request;

    public PrescriptionDrugSearchExecutor(String appid, String secret, PrescriptionDrugSearchRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return PrescriptionDrugSearchResult.class;
    }
}
