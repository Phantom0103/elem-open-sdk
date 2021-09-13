package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuStdupcBarcodeRequest;
import elem.retail.dto.sku.SkuStdupcBarcodeResult;

import java.io.Serializable;

/**
 * 根据条码查询平台商品（含spu）。
 *
 * @author zhouw
 * @description 查询平台商品条码
 * @date 2021-09-13
 */
public class SkuStdupcBarcodeExecutor extends ElemApiExecutor {

    private SkuStdupcBarcodeRequest request;

    public SkuStdupcBarcodeExecutor(String appid, String secret, SkuStdupcBarcodeRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuStdupcBarcodeResult.class;
    }
}
