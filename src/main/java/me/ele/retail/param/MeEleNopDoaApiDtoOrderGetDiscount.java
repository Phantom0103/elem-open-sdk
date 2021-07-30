package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetDiscount {

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

    private Integer agent_rate;

    /**
     * @return 代理商承担金额
     */
    public Integer getAgent_rate() {
        return agent_rate;
    }

    /**
     * 设置代理商承担金额     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setAgent_rate(Integer agent_rate) {
        this.agent_rate = agent_rate;
    }

    private Integer baidu_rate;

    /**
     * @return 平台承担金额
     */
    public Integer getBaidu_rate() {
        return baidu_rate;
    }

    /**
     * 设置平台承担金额     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setBaidu_rate(Integer baidu_rate) {
        this.baidu_rate = baidu_rate;
    }

    private String desc;

    /**
     * @return 优惠描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置优惠描述     *
     * 参数示例：<pre>这是优惠</pre>     
     * 此参数必填
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    private Integer fee;

    /**
     * @return 优惠金额 单位：分
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * 设置优惠金额 单位：分     *
     * 参数示例：<pre>200</pre>     
     * 此参数必填
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    private Integer logistics_rate;

    /**
     * @return 物流承担金额
     */
    public Integer getLogistics_rate() {
        return logistics_rate;
    }

    /**
     * 设置物流承担金额     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setLogistics_rate(Integer logistics_rate) {
        this.logistics_rate = logistics_rate;
    }

    private MeEleNopDoaApiDtoOrderGetDiscountProducts[] products;

    /**
     * @return 特价菜(单品)
     */
    public MeEleNopDoaApiDtoOrderGetDiscountProducts[] getProducts() {
        return products;
    }

    /**
     * 设置特价菜(单品)     *
     * 参数示例：<pre>[]</pre>     
     * 此参数必填
     */
    public void setProducts(MeEleNopDoaApiDtoOrderGetDiscountProducts[] products) {
        this.products = products;
    }

    private String rule_id;

    /**
     * @return rule_id
     */
    public String getRule_id() {
        return rule_id;
    }

    /**
     * 设置rule_id     *
     * 参数示例：<pre>123</pre>     
     * 此参数必填
     */
    public void setRule_id(String rule_id) {
        this.rule_id = rule_id;
    }

    private Integer shop_rate;

    /**
     * @return 商户承担金额
     */
    public Integer getShop_rate() {
        return shop_rate;
    }

    /**
     * 设置商户承担金额     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setShop_rate(Integer shop_rate) {
        this.shop_rate = shop_rate;
    }

    private String type;

    /**
     * @return 优惠类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置优惠类型     *
     * 参数示例：<pre>gt</pre>     
     * 此参数必填
     */
    public void setType(String type) {
        this.type = type;
    }

    private Integer user_rate;

    /**
     * @return 用户承担
     */
    public Integer getUser_rate() {
        return user_rate;
    }

    /**
     * 设置用户承担     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setUser_rate(Integer user_rate) {
        this.user_rate = user_rate;
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
     * 参数示例：<pre>1234</pre>     
     * 此参数必填
     */
    public void setCustom_activity_id(String custom_activity_id) {
        this.custom_activity_id = custom_activity_id;
    }

}
