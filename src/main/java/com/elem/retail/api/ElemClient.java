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
     * @return
     * @throws ElemApiException
     */
    <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, Class<T> clazz) throws ElemApiException;

    /**
     * 执行需要授权的API请求
     *
     * @param request
     * @param token
     * @return
     * @throws ElemApiException
     */
    <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException;
}
