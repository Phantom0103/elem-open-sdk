package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetOrderGetDataResultDataDto {

    private MeEleNopDoaApiDtoOrderGetDiscount[] discount;

    /**
     * @return 优惠信息
     */
    public MeEleNopDoaApiDtoOrderGetDiscount[] getDiscount() {
        return discount;
    }

    /**
     * 设置优惠信息     *
     * 参数示例：<pre>[]</pre>     
     * 此参数必填
     */
    public void setDiscount(MeEleNopDoaApiDtoOrderGetDiscount[] discount) {
        this.discount = discount;
    }

    private MeEleNopDoaApiDtoOrderGetOrder order;

    /**
     * @return 订单信息
     */
    public MeEleNopDoaApiDtoOrderGetOrder getOrder() {
        return order;
    }

    /**
     * 设置订单信息     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setOrder(MeEleNopDoaApiDtoOrderGetOrder order) {
        this.order = order;
    }

    private MeEleNopDoaApiDtoOrderGetProduct[][] products;

    /**
     * @return 订单商品信息数组，数组内第一个层数组为分袋，第二层数组为商品信息
     */
    public MeEleNopDoaApiDtoOrderGetProduct[][] getProducts() {
        return products;
    }

    /**
     * 设置订单商品信息数组，数组内第一个层数组为分袋，第二层数组为商品信息     *
     * 参数示例：<pre>[]</pre>     
     * 此参数必填
     */
    public void setProducts(MeEleNopDoaApiDtoOrderGetProduct[][] products) {
        this.products = products;
    }

    private MeEleNopDoaApiDtoOrderGetShop shop;

    /**
     * @return 商户信息
     */
    public MeEleNopDoaApiDtoOrderGetShop getShop() {
        return shop;
    }

    /**
     * 设置商户信息     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setShop(MeEleNopDoaApiDtoOrderGetShop shop) {
        this.shop = shop;
    }

    private String source;

    /**
     * @return 账号
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置账号     *
     * 参数示例：<pre>1231132</pre>     
     * 此参数必填
     */
    public void setSource(String source) {
        this.source = source;
    }

    private MeEleNopDoaApiDtoOrderGetUser user;

    /**
     * @return 用户信息
     */
    public MeEleNopDoaApiDtoOrderGetUser getUser() {
        return user;
    }

    /**
     * 设置用户信息     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setUser(MeEleNopDoaApiDtoOrderGetUser user) {
        this.user = user;
    }

}
