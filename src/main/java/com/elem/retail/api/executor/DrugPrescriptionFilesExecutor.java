package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.drug.DrugPrescriptionFilesRequest;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 提供获取订单关联处方单url（有效时间为1小时）。
 *
 * @Author zhouw
 * @Description 获取订单相关处方单
 * @Date 2021-08-24
 */
public class DrugPrescriptionFilesExecutor extends ElemApiExecutor {

    private DrugPrescriptionFilesRequest request;

    public DrugPrescriptionFilesExecutor(String appid, String secret, DrugPrescriptionFilesRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ArrayList.class;
    }
}
