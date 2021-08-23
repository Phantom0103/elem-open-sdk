package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.ugc.UgcReplyRequest;

import java.io.Serializable;

/**
 * 回复评论信息。
 *
 * @Author zhouw
 * @Description 回复评论
 * @Date 2021-08-04
 */
public class UgcReplyExecutor extends ElemApiExecutor {

    private UgcReplyRequest request;

    public UgcReplyExecutor(String appid, String secret, UgcReplyRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Boolean.class;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }
}
