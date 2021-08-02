package com.elem.retail.api;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public interface ElemClient {

    ElemResponse execute(ElemRequest request) throws ElemApiException;
}
