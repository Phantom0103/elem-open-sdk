package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetShop {

    private String baidu_shop_id;

    /**
     * @return 平台门店ID
     */
    public String getBaidu_shop_id() {
        return baidu_shop_id;
    }

    /**
     * 设置平台门店ID     *
     * 参数示例：<pre>42267022812</pre>     
     * 此参数必填
     */
    public void setBaidu_shop_id(String baidu_shop_id) {
        this.baidu_shop_id = baidu_shop_id;
    }

    private String id;

    /**
     * @return 合作方门店ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置合作方门店ID     *
     * 参数示例：<pre>1483446181</pre>     
     * 此参数必填
     */
    public void setId(String id) {
        this.id = id;
    }

    private String name;

    /**
     * @return 门店名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置门店名称     *
     * 参数示例：<pre>熊猫水果</pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

}
