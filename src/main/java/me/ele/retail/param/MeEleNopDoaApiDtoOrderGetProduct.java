package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetProduct {

    private String activity_id;

    /**
     * @return 活动id
     */
    public String getActivity_id() {
        return activity_id;
    }

    /**
     * 设置活动id     *
     * 参数示例：<pre>1232131</pre>     
     * 此参数必填
     */
    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
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
     * 参数示例：<pre>12312321</pre>     
     * 此参数必填
     */
    public void setBaidu_product_id(String baidu_product_id) {
        this.baidu_product_id = baidu_product_id;
    }

    private String custom_sku_id;

    /**
     * @return 合作商品ID;未设置为空;
     */
    public String getCustom_sku_id() {
        return custom_sku_id;
    }

    /**
     * 设置合作商品ID;未设置为空;     *
     * 参数示例：<pre>231231321</pre>     
     * 此参数必填
     */
    public void setCustom_sku_id(String custom_sku_id) {
        this.custom_sku_id = custom_sku_id;
    }

    private String[] gm_ids;

    /**
     * @return 赠品来自的主品Id  ["id1","id2"] 主品List	代表主品unique_id
     */
    public String[] getGm_ids() {
        return gm_ids;
    }

    /**
     * 设置赠品来自的主品Id  ["id1","id2"] 主品List	代表主品unique_id     *
     * 参数示例：<pre>[]</pre>     
     * 此参数必填
     */
    public void setGm_ids(String[] gm_ids) {
        this.gm_ids = gm_ids;
    }

    private Integer is_free_gift;

    /**
     * @return 是否是赠品，1代表是赠品，0或null代表不是赠品
     */
    public Integer getIs_free_gift() {
        return is_free_gift;
    }

    /**
     * 设置是否是赠品，1代表是赠品，0或null代表不是赠品     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setIs_free_gift(Integer is_free_gift) {
        this.is_free_gift = is_free_gift;
    }

    private Integer package_amount;

    /**
     * @return 包装数量
     */
    public Integer getPackage_amount() {
        return package_amount;
    }

    /**
     * 设置包装数量     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setPackage_amount(Integer package_amount) {
        this.package_amount = package_amount;
    }

    private Integer package_fee;

    /**
     * @return 包装费，单位：分
     */
    public Integer getPackage_fee() {
        return package_fee;
    }

    /**
     * 设置包装费，单位：分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setPackage_fee(Integer package_fee) {
        this.package_fee = package_fee;
    }

    private Integer package_price;

    /**
     * @return 包装费
     */
    public Integer getPackage_price() {
        return package_price;
    }

    /**
     * 设置包装费     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setPackage_price(Integer package_price) {
        this.package_price = package_price;
    }

    private String prescription_id;

    /**
     * @return 处方药编号;不存在为空;
     */
    public String getPrescription_id() {
        return prescription_id;
    }

    /**
     * 设置处方药编号;不存在为空;     *
     * 参数示例：<pre>1231231</pre>     
     * 此参数必填
     */
    public void setPrescription_id(String prescription_id) {
        this.prescription_id = prescription_id;
    }

    private Integer product_amount;

    /**
     * @return 商品份数
     */
    public Integer getProduct_amount() {
        return product_amount;
    }

    /**
     * 设置商品份数     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setProduct_amount(Integer product_amount) {
        this.product_amount = product_amount;
    }

    private MeEleNopDoaApiDtoOrderGetProductAttr[] product_attr;

    /**
     * @return 商品参数
     */
    public MeEleNopDoaApiDtoOrderGetProductAttr[] getProduct_attr() {
        return product_attr;
    }

    /**
     * 设置商品参数     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setProduct_attr(MeEleNopDoaApiDtoOrderGetProductAttr[] product_attr) {
        this.product_attr = product_attr;
    }

    private String product_custom_index;

    /**
     * @return 商品唯一串，已废弃
     */
    public String getProduct_custom_index() {
        return product_custom_index;
    }

    /**
     * 设置商品唯一串，已废弃     *
     * 参数示例：<pre>1529731460_0_0</pre>     
     * 此参数必填
     */
    public void setProduct_custom_index(String product_custom_index) {
        this.product_custom_index = product_custom_index;
    }

    private MeEleNopDoaApiDtoOrderGetProductFeatures[] product_features;

    /**
     * @return 商品属性
     */
    public MeEleNopDoaApiDtoOrderGetProductFeatures[] getProduct_features() {
        return product_features;
    }

    /**
     * 设置商品属性     *
     * 参数示例：<pre>[]</pre>     
     * 此参数必填
     */
    public void setProduct_features(MeEleNopDoaApiDtoOrderGetProductFeatures[] product_features) {
        this.product_features = product_features;
    }

    private Integer product_fee;

    /**
     * @return 商品总价，单位：分
     */
    public Integer getProduct_fee() {
        return product_fee;
    }

    /**
     * 设置商品总价，单位：分     *
     * 参数示例：<pre>100000</pre>     
     * 此参数必填
     */
    public void setProduct_fee(Integer product_fee) {
        this.product_fee = product_fee;
    }

    private String product_name;

    /**
     * @return 商品名称
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * 设置商品名称     *
     * 参数示例：<pre>紫薯</pre>     
     * 此参数必填
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    private Integer product_price;

    /**
     * @return 商品单价
     */
    public Integer getProduct_price() {
        return product_price;
    }

    /**
     * 设置商品单价     *
     * 参数示例：<pre>100000</pre>     
     * 此参数必填
     */
    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    private MeEleNopDoaApiDtoOrderGetProductSubsidy product_subsidy;

    /**
     * @return 订单优惠信息;一维数组
     */
    public MeEleNopDoaApiDtoOrderGetProductSubsidy getProduct_subsidy() {
        return product_subsidy;
    }

    /**
     * 设置订单优惠信息;一维数组     *
     * 参数示例：<pre>[]</pre>     
     * 此参数必填
     */
    public void setProduct_subsidy(MeEleNopDoaApiDtoOrderGetProductSubsidy product_subsidy) {
        this.product_subsidy = product_subsidy;
    }

    private Integer product_type;

    /**
     * @return 商品类型,1.单品 2 套餐 3 配料
     */
    public Integer getProduct_type() {
        return product_type;
    }

    /**
     * 设置商品类型,1.单品 2 套餐 3 配料     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setProduct_type(Integer product_type) {
        this.product_type = product_type;
    }

    private String sub_biz_order_id;

    /**
     * @return 子订单ID，可区分同商品ID的不同属性，订单逆向操作必须字段
     */
    public String getSub_biz_order_id() {
        return sub_biz_order_id;
    }

    /**
     * 设置子订单ID，可区分同商品ID的不同属性，订单逆向操作必须字段     *
     * 参数示例：<pre>34567834567800000000</pre>     
     * 此参数必填
     */
    public void setSub_biz_order_id(String sub_biz_order_id) {
        this.sub_biz_order_id = sub_biz_order_id;
    }

    private Integer supply_type;

    /**
     * @return 0代表普通配送，1代表冷链配送
     */
    public Integer getSupply_type() {
        return supply_type;
    }

    /**
     * 设置0代表普通配送，1代表冷链配送     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setSupply_type(Integer supply_type) {
        this.supply_type = supply_type;
    }

    private Integer total_fee;

    /**
     * @return 订单总金额，单位：分
     */
    public Integer getTotal_fee() {
        return total_fee;
    }

    /**
     * 设置订单总金额，单位：分     *
     * 参数示例：<pre>200000</pre>     
     * 此参数必填
     */
    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }

    private Integer total_weight;

    /**
     * @return 总重量，单位：克
     */
    public Integer getTotal_weight() {
        return total_weight;
    }

    /**
     * 设置总重量，单位：克     *
     * 参数示例：<pre>10000</pre>     
     * 此参数必填
     */
    public void setTotal_weight(Integer total_weight) {
        this.total_weight = total_weight;
    }

    private String upc;

    /**
     * @return 商品upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * 设置商品upc     *
     * 参数示例：<pre>""</pre>     
     * 此参数必填
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    private Integer weight_type;

    /**
     * @return 是否是称重品。2：非称重品，1和3：称重品
     */
    public Integer getWeight_type() {
        return weight_type;
    }

    /**
     * 设置是否是称重品。2：非称重品，1和3：称重品     *
     * 参数示例：<pre>2</pre>     
     * 此参数必填
     */
    public void setWeight_type(Integer weight_type) {
        this.weight_type = weight_type;
    }

    private String coupon_id;

    /**
     * @return 券id
     */
    public String getCoupon_id() {
        return coupon_id;
    }

    /**
     * 设置券id     *
     * 参数示例：<pre>123</pre>     
     * 此参数必填
     */
    public void setCoupon_id(String coupon_id) {
        this.coupon_id = coupon_id;
    }

}
