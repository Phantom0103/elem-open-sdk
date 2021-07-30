package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleRetailOrderGetReqDto {

    private String order_id;

    /**
     * @return 订单ID
     */
    public String getOrder_id() {
        return order_id;
    }

    /**
     * 设置订单ID     *
     * 参数示例：<pre>1253</pre>     
     * 此参数必填
     */
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

}
