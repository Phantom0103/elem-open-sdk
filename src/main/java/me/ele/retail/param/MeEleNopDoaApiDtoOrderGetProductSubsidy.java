package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetProductSubsidy {

    private Integer agent_rate;

    /**
     * @return 代理商承担费用;单位分;
     */
    public Integer getAgent_rate() {
        return agent_rate;
    }

    /**
     * 设置代理商承担费用;单位分;     *
     * 参数示例：<pre>200</pre>     
     * 此参数必填
     */
    public void setAgent_rate(Integer agent_rate) {
        this.agent_rate = agent_rate;
    }

    private Integer baidu_rate;

    /**
     * @return 平台承担费用;单位分;
     */
    public Integer getBaidu_rate() {
        return baidu_rate;
    }

    /**
     * 设置平台承担费用;单位分;     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setBaidu_rate(Integer baidu_rate) {
        this.baidu_rate = baidu_rate;
    }

    private Integer discount;

    /**
     * @return 总优惠金额;单位分;
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * 设置总优惠金额;单位分;     *
     * 参数示例：<pre>300</pre>     
     * 此参数必填
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    private MeEleNopDoaApiDtoOrderGetDiscountDetail[] discount_detail;

    /**
     * @return 订单优惠信息明细;
     */
    public MeEleNopDoaApiDtoOrderGetDiscountDetail[] getDiscount_detail() {
        return discount_detail;
    }

    /**
     * 设置订单优惠信息明细;     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setDiscount_detail(MeEleNopDoaApiDtoOrderGetDiscountDetail[] discount_detail) {
        this.discount_detail = discount_detail;
    }

    private Integer logistics_rate;

    /**
     * @return 物流承担费用;单位分
     */
    public Integer getLogistics_rate() {
        return logistics_rate;
    }

    /**
     * 设置物流承担费用;单位分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setLogistics_rate(Integer logistics_rate) {
        this.logistics_rate = logistics_rate;
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

    private Integer user_rate;

    /**
     * @return 用户承担费用;单位分
     */
    public Integer getUser_rate() {
        return user_rate;
    }

    /**
     * 设置用户承担费用;单位分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setUser_rate(Integer user_rate) {
        this.user_rate = user_rate;
    }

}
