package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetUser {

    private String address;

    /**
     * @return 客户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置客户地址     *
     * 参数示例：<pre>上地 彩虹大厦</pre>     
     * 此参数必填
     */
    public void setAddress(String address) {
        this.address = address;
    }

    private String city;

    /**
     * @return 客户所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置客户所在城市     *
     * 参数示例：<pre>北京市</pre>     
     * 此参数必填
     */
    public void setCity(String city) {
        this.city = city;
    }

    private MeEleNopDoaApiDtoOrderGetCoord coord;

    /**
     * @return 客户百度经纬度
     */
    public MeEleNopDoaApiDtoOrderGetCoord getCoord() {
        return coord;
    }

    /**
     * 设置客户百度经纬度     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setCoord(MeEleNopDoaApiDtoOrderGetCoord coord) {
        this.coord = coord;
    }

    private MeEleNopDoaApiDtoOrderGetCoordAmap coordAmap;

    /**
     * @return 客户高德经纬度
     */
    public MeEleNopDoaApiDtoOrderGetCoordAmap getCoordAmap() {
        return coordAmap;
    }

    /**
     * 设置客户高德经纬度     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setCoordAmap(MeEleNopDoaApiDtoOrderGetCoordAmap coordAmap) {
        this.coordAmap = coordAmap;
    }

    private String district;

    /**
     * @return 客户所在区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置客户所在区     *
     * 参数示例：<pre>海淀区</pre>     
     * 此参数必填
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    private Object gender;

    /**
     * @return 顾客性别: 1-男 ，2-女 ，0-未知
     */
    public Object getGender() {
        return gender;
    }

    /**
     * 设置顾客性别: 1-男 ，2-女 ，0-未知     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setGender(Object gender) {
        this.gender = gender;
    }

    private String name;

    /**
     * @return 客户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置客户名称     *
     * 参数示例：<pre>张三</pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

    private String phone;

    /**
     * @return 客户电话，订单完成后48小时内可返回客户联系电话。 匿名订单会返回隐私小号，因小号存在有效期，如遇小号过期拨打不通， 可调用order.get接口重新获取。
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置客户电话，订单完成后48小时内可返回客户联系电话。 匿名订单会返回隐私小号，因小号存在有效期，如遇小号过期拨打不通， 可调用order.get接口重新获取。     *
     * 参数示例：<pre>13261158090</pre>     
     * 此参数必填
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String privacy_phone;

    /**
     * @return 客户隐私电话，如132****8090
     */
    public String getPrivacy_phone() {
        return privacy_phone;
    }

    /**
     * 设置客户隐私电话，如132****8090     *
     * 参数示例：<pre>132****8090</pre>     
     * 此参数必填
     */
    public void setPrivacy_phone(String privacy_phone) {
        this.privacy_phone = privacy_phone;
    }

    private String province;

    /**
     * @return 客户所在省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置客户所在省份     *
     * 参数示例：<pre>北京市</pre>     
     * 此参数必填
     */
    public void setProvince(String province) {
        this.province = province;
    }

    private String user_id;

    /**
     * @return 客户ID
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * 设置客户ID     *
     * 参数示例：<pre>130395477</pre>     
     * 此参数必填
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    private MeEleNopDoaApiDtoOrderGetCoordAmap coord_amap;

    /**
     * @return 客户高德经纬度
     */
    public MeEleNopDoaApiDtoOrderGetCoordAmap getCoord_amap() {
        return coord_amap;
    }

    /**
     * 设置客户高德经纬度     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setCoord_amap(MeEleNopDoaApiDtoOrderGetCoordAmap coord_amap) {
        this.coord_amap = coord_amap;
    }

    private String accurate_address;

    /**
     * @return 精确地址
     */
    public String getAccurate_address() {
        return accurate_address;
    }

    /**
     * 设置精确地址     *
     * 参数示例：<pre>123123</pre>     
     * 此参数必填
     */
    public void setAccurate_address(String accurate_address) {
        this.accurate_address = accurate_address;
    }

}
