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
     * @param keyword
     * @param request
     */
    void doBeforeRequest(String keyword, ElemRequest request);

    /**
     * 请求API后可执行的勾子方法
     *
     * @param keyword
     * @param responseData
     */
    void doAfterResponse(String keyword, HttpResponseData responseData);
}
