package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.drug.PrescriptionSaveRequest;
import elem.retail.dto.drug.PrescriptionSaveResult;

import java.io.Serializable;

/**
 * 互联网回传处方。
 *
 * @Author zhouw
 * @Description 三方医疗-回传处方
 * @Date 2021-09-03
 */
public class PrescriptionSaveExecutor extends ElemApiExecutor {

    private PrescriptionSaveRequest request;

    public PrescriptionSaveExecutor(String appid, String secret, PrescriptionSaveRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return PrescriptionSaveResult.class;
    }
}
