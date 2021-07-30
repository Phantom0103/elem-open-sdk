package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetDiscountDetail {

    private String activity_id;

    /**
     * @return 活动id
     */
    public String getActivity_id() {
        return activity_id;
    }

    /**
     * 设置活动id     *
     * 参数示例：<pre>123</pre>     
     * 此参数必填
     */
    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    private Integer baidu_rate;

    /**
     * @return 平台承担费用;单位分
     */
    public Integer getBaidu_rate() {
        return baidu_rate;
    }

    /**
     * 设置平台承担费用;单位分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setBaidu_rate(Integer baidu_rate) {
        this.baidu_rate = baidu_rate;
    }

    private Integer shop_rate;

    /**
     * @return 商户承担费用;单位分
     */
    public Integer getShop_rate() {
        return shop_rate;
    }

    /**
     * 设置商户承担费用;单位分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setShop_rate(Integer shop_rate) {
        this.shop_rate = shop_rate;
    }

    private String type;

    /**
     * @return 活动类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置活动类型     *
     * 参数示例：<pre>gt</pre>     
     * 此参数必填
     */
    public void setType(String type) {
        this.type = type;
    }

    private String custom_activity_id;

    /**
     * @return 合作方活动ID
     */
    public String getCustom_activity_id() {
        return custom_activity_id;
    }

    /**
     * 设置合作方活动ID     *
     * 参数示例：<pre>123</pre>     
     * 此参数必填
     */
    public void setCustom_activity_id(String custom_activity_id) {
        this.custom_activity_id = custom_activity_id;
    }

}
