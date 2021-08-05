package com.elem.retail.api;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public interface ElemClient {

    /**
     * 执行公开的API请求
     *
     * @param request
     * @param responseData
     * @return
     * @throws ElemApiException
     */
    ElemResponse execute(ElemRequest request, ElemResponseData responseData) throws ElemApiException;

    /**
     * 执行需要授权的API请求
     *
     * @param request
     * @param responseData
     * @param token
     * @return
     * @throws ElemApiException
     */
    ElemResponse execute(ElemRequest request, ElemResponseData responseData, String token) throws ElemApiException;
}
