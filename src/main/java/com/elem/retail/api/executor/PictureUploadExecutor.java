package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.other.PictureUploadRequest;
import elem.retail.dto.other.PictureUploadResult;

import java.io.Serializable;

/**
 * 提供给合作方上传图片所用，每次支持上传一张图片。
 *
 * @Author zhouw
 * @Description 上传图片
 * @Date 2021-08-24
 */
public class PictureUploadExecutor extends ElemApiExecutor {

    private PictureUploadRequest request;

    public PictureUploadExecutor(String appid, String secret, PictureUploadRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return PictureUploadResult.class;
    }
}
