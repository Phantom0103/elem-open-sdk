package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.ugc.UgcOrderCommentGetRequest;
import elem.retail.dto.ugc.UgcOrderCommentGetResult;

import java.io.Serializable;

/**
 * 查看指定门店的商户订单评论信息，建议用此版。
 *
 * @Author zhouw
 * @Description 获取商户订单评论
 * @Date 2021-08-23
 */
public class UgcOrderCommentGetExecutor extends ElemApiExecutor {

    private UgcOrderCommentGetRequest request;

    public UgcOrderCommentGetExecutor(String appid, String secret, UgcOrderCommentGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return UgcOrderCommentGetResult.class;
    }
}
