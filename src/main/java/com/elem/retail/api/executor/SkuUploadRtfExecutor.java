package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuUploadRtfRequest;
import elem.retail.dto.sku.SkuUploadRtfResult;

import java.io.Serializable;

/**
 * 商品图文详情上传。
 *
 * @author zhouw
 * @description 商品图文详情上传
 * @date 2021-09-14
 */
public class SkuUploadRtfExecutor extends ElemApiExecutor {

    private SkuUploadRtfRequest request;

    public SkuUploadRtfExecutor(String appid, String secret, SkuUploadRtfRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuUploadRtfResult.class;
    }
}
