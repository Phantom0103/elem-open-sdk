package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetDeliveryFee {

    private Integer platform_delivery_fee;

    /**
     * @return platform_delivery_fee平台承担费用(单位分)
     */
    public Integer getPlatform_delivery_fee() {
        return platform_delivery_fee;
    }

    /**
     * 设置platform_delivery_fee平台承担费用(单位分)     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setPlatform_delivery_fee(Integer platform_delivery_fee) {
        this.platform_delivery_fee = platform_delivery_fee;
    }

    private Integer shop_delivery_fee;

    /**
     * @return shop_delivery_fee 商户承担费用(单位分)
     */
    public Integer getShop_delivery_fee() {
        return shop_delivery_fee;
    }

    /**
     * 设置shop_delivery_fee 商户承担费用(单位分)     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setShop_delivery_fee(Integer shop_delivery_fee) {
        this.shop_delivery_fee = shop_delivery_fee;
    }

}
