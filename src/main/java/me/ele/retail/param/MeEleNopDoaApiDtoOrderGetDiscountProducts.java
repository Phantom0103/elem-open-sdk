package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetDiscountProducts {

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

    private Integer activity_product_num;

    /**
     * @return 参与活动商品数量
     */
    public Integer getActivity_product_num() {
        return activity_product_num;
    }

    /**
     * 设置参与活动商品数量     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setActivity_product_num(Integer activity_product_num) {
        this.activity_product_num = activity_product_num;
    }

    private String baidu_product_id;

    /**
     * @return 商品ID
     */
    public String getBaidu_product_id() {
        return baidu_product_id;
    }

    /**
     * 设置商品ID     *
     * 参数示例：<pre>1231231</pre>     
     * 此参数必填
     */
    public void setBaidu_product_id(String baidu_product_id) {
        this.baidu_product_id = baidu_product_id;
    }

    private Integer now_price;

    /**
     * @return 优惠后金额
     */
    public Integer getNow_price() {
        return now_price;
    }

    /**
     * 设置优惠后金额     *
     * 参数示例：<pre>20000</pre>     
     * 此参数必填
     */
    public void setNow_price(Integer now_price) {
        this.now_price = now_price;
    }

    private Integer orig_price;

    /**
     * @return 原始价
     */
    public Integer getOrig_price() {
        return orig_price;
    }

    /**
     * 设置原始价     *
     * 参数示例：<pre>10000</pre>     
     * 此参数必填
     */
    public void setOrig_price(Integer orig_price) {
        this.orig_price = orig_price;
    }

    private Integer save_price;

    /**
     * @return 优惠金额
     */
    public Integer getSave_price() {
        return save_price;
    }

    /**
     * 设置优惠金额     *
     * 参数示例：<pre>200</pre>     
     * 此参数必填
     */
    public void setSave_price(Integer save_price) {
        this.save_price = save_price;
    }

}
