package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class OrderGetResult {

    private String errno;

    /**
     * @return 返回错误码
     */
    public String getErrno() {
        return errno;
    }

    /**
     * 设置返回错误码     *
          
     * 此参数必填
     */
    public void setErrno(String errno) {
        this.errno = errno;
    }

    private String error;

    /**
     * @return 返回错误信息
     */
    public String getError() {
        return error;
    }

    /**
     * 设置返回错误信息     *
          
     * 此参数必填
     */
    public void setError(String error) {
        this.error = error;
    }

    private MeEleNopDoaApiDtoOrderGetOrderGetDataResultDataDto data;

    /**
     * @return 响应结果
     */
    public MeEleNopDoaApiDtoOrderGetOrderGetDataResultDataDto getData() {
        return data;
    }

    /**
     * 设置响应结果     *
          
     * 此参数必填
     */
    public void setData(MeEleNopDoaApiDtoOrderGetOrderGetDataResultDataDto data) {
        this.data = data;
    }

}
