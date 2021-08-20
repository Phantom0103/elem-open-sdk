package com.elem.retail.api;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-19
 */
public interface ElemApiHook {

    /**
     * 请求API之前可执行的勾子方法
     *
     * @param ticket
     * @param request
     */
    void doBeforeRequest(String ticket, ElemRequest request);

    /**
     * 请求API后可执行的勾子方法
     *
     * @param ticket
     * @param request
     * @param responseData
     */
    void doAfterResponse(String ticket, ElemRequest request, HttpResponseData responseData);
}
