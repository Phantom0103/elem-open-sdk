package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.drug.DrugPrescriptionOrderAuditResultRequest;
import elem.retail.dto.drug.DrugPrescriptionOrderAuditResultResult;

import java.io.Serializable;

/**
 * 药师审方结果回传。
 *
 * @Author zhouw
 * @Description 药师审方结果回传
 * @Date 2021-09-02
 */
public class DrugPrescriptionOrderAuditResultExecutor extends ElemApiExecutor {

    DrugPrescriptionOrderAuditResultRequest request;

    public DrugPrescriptionOrderAuditResultExecutor(String appid, String secret, DrugPrescriptionOrderAuditResultRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return DrugPrescriptionOrderAuditResultResult.class;
    }
}
