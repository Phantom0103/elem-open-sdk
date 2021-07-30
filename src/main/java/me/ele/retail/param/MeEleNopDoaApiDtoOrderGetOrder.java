package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetOrder {

    private Long atshop_time;

    /**
     * @return 到店时间
     */
    public Long getAtshop_time() {
        return atshop_time;
    }

    /**
     * 设置到店时间     *
     * 参数示例：<pre>123121231</pre>     
     * 此参数必填
     */
    public void setAtshop_time(Long atshop_time) {
        this.atshop_time = atshop_time;
    }

    private String business_type;

    /**
     * @return 取货类型 0-外卖到家，1-用户到店自提
     */
    public String getBusiness_type() {
        return business_type;
    }

    /**
     * 设置取货类型 0-外卖到家，1-用户到店自提     *
     * 参数示例：<pre>0</pre>     
     * 此参数必填
     */
    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    private String cancel_time;

    /**
     * @return 订单取消时间
     */
    public String getCancel_time() {
        return cancel_time;
    }

    /**
     * 设置订单取消时间     *
     * 参数示例：<pre>154444333</pre>     
     * 此参数必填
     */
    public void setCancel_time(String cancel_time) {
        this.cancel_time = cancel_time;
    }

    private Long cold_box_fee;

    /**
     * @return 冷链费用，单位：分
     */
    public Long getCold_box_fee() {
        return cold_box_fee;
    }

    /**
     * 设置冷链费用，单位：分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setCold_box_fee(Long cold_box_fee) {
        this.cold_box_fee = cold_box_fee;
    }

    private Long commission;

    /**
     * @return 佣金，单位：分
     */
    public Long getCommission() {
        return commission;
    }

    /**
     * 设置佣金，单位：分     *
     * 参数示例：<pre>10</pre>     
     * 此参数必填
     */
    public void setCommission(Long commission) {
        this.commission = commission;
    }

    private Long confirm_time;

    /**
     * @return 确认时间
     */
    public Long getConfirm_time() {
        return confirm_time;
    }

    /**
     * 设置确认时间     *
     * 参数示例：<pre>155444443</pre>     
     * 此参数必填
     */
    public void setConfirm_time(Long confirm_time) {
        this.confirm_time = confirm_time;
    }

    private String create_time;

    /**
     * @return 创建时间
     */
    public String getCreate_time() {
        return create_time;
    }

    /**
     * 设置创建时间     *
     * 参数示例：<pre>1478845425</pre>     
     * 此参数必填
     */
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    private MeEleNopDoaApiDtoOrderGetDeliveryFee delivery_fee;

    /**
     * @return 订单附加信息
     */
    public MeEleNopDoaApiDtoOrderGetDeliveryFee getDelivery_fee() {
        return delivery_fee;
    }

    /**
     * 设置订单附加信息     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setDelivery_fee(MeEleNopDoaApiDtoOrderGetDeliveryFee delivery_fee) {
        this.delivery_fee = delivery_fee;
    }

    private String delivery_party;

    /**
     * @return 物流类型 1蜂鸟 2蜂鸟自配送 3蜂鸟众包 4饿了么众包 5蜂鸟配送 6饿了么自配送 7全城送 8快递配送
     */
    public String getDelivery_party() {
        return delivery_party;
    }

    /**
     * 设置物流类型 1蜂鸟 2蜂鸟自配送 3蜂鸟众包 4饿了么众包 5蜂鸟配送 6饿了么自配送 7全城送 8快递配送     *
     * 参数示例：<pre>6</pre>     
     * 此参数必填
     */
    public void setDelivery_party(String delivery_party) {
        this.delivery_party = delivery_party;
    }

    private String delivery_phone;

    /**
     * @return 骑士手机号
     */
    public String getDelivery_phone() {
        return delivery_phone;
    }

    /**
     * 设置骑士手机号     *
     * 参数示例：<pre>14333434334</pre>     
     * 此参数必填
     */
    public void setDelivery_phone(String delivery_phone) {
        this.delivery_phone = delivery_phone;
    }

    private Long delivery_time;

    /**
     * @return 送餐时间
     */
    public Long getDelivery_time() {
        return delivery_time;
    }

    /**
     * 设置送餐时间     *
     * 参数示例：<pre>1478845425</pre>     
     * 此参数必填
     */
    public void setDelivery_time(Long delivery_time) {
        this.delivery_time = delivery_time;
    }

    private Integer discount_fee;

    /**
     * @return 优惠总金额，单位：分
     */
    public Integer getDiscount_fee() {
        return discount_fee;
    }

    /**
     * 设置优惠总金额，单位：分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setDiscount_fee(Integer discount_fee) {
        this.discount_fee = discount_fee;
    }

    private Long down_flag;

    /**
     * @return 是否降级;1:是,0:否;极少数订单因网络或信息交互异常，导致订单部分字段（如订单金额）生成延迟，此时订单会被标记为“已降级”状态，需开发者重新调用查看订单详情接口获取完整订单数据。
     */
    public Long getDown_flag() {
        return down_flag;
    }

    /**
     * 设置是否降级;1:是,0:否;极少数订单因网络或信息交互异常，导致订单部分字段（如订单金额）生成延迟，此时订单会被标记为“已降级”状态，需开发者重新调用查看订单详情接口获取完整订单数据。     *
     * 参数示例：<pre>0</pre>     
     * 此参数必填
     */
    public void setDown_flag(Long down_flag) {
        this.down_flag = down_flag;
    }

    private String eleme_order_id;

    /**
     * @return 饿了么订单ID
     */
    public String getEleme_order_id() {
        return eleme_order_id;
    }

    /**
     * 设置饿了么订单ID     *
     * 参数示例：<pre>12312312321</pre>     
     * 此参数必填
     */
    public void setEleme_order_id(String eleme_order_id) {
        this.eleme_order_id = eleme_order_id;
    }

    private Integer expect_time_mode;

    /**
     * @return 送达时间类型 1定时达 2限时达（错峰配送）
     */
    public Integer getExpect_time_mode() {
        return expect_time_mode;
    }

    /**
     * 设置送达时间类型 1定时达 2限时达（错峰配送）     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setExpect_time_mode(Integer expect_time_mode) {
        this.expect_time_mode = expect_time_mode;
    }

    private MeEleNopDoaApiDtoOrderGetExt ext;

    /**
     * @return 订单附加信息
     */
    public MeEleNopDoaApiDtoOrderGetExt getExt() {
        return ext;
    }

    /**
     * 设置订单附加信息     *
     * 参数示例：<pre>{}</pre>     
     * 此参数必填
     */
    public void setExt(MeEleNopDoaApiDtoOrderGetExt ext) {
        this.ext = ext;
    }

    private Long finishedTime;

    /**
     * @return 完成时间
     */
    public Long getFinishedTime() {
        return finishedTime;
    }

    /**
     * 设置完成时间     *
     * 参数示例：<pre>145454545454</pre>     
     * 此参数必填
     */
    public void setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
    }

    private String invoice_title;

    /**
     * @return 发票抬头
     */
    public String getInvoice_title() {
        return invoice_title;
    }

    /**
     * 设置发票抬头     *
     * 参数示例：<pre>信息科技公司</pre>     
     * 此参数必填
     */
    public void setInvoice_title(String invoice_title) {
        this.invoice_title = invoice_title;
    }

    private Integer is_cold_box_order;

    /**
     * @return 是否是冷链订单 1是 0否
     */
    public Integer getIs_cold_box_order() {
        return is_cold_box_order;
    }

    /**
     * 设置是否是冷链订单 1是 0否     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setIs_cold_box_order(Integer is_cold_box_order) {
        this.is_cold_box_order = is_cold_box_order;
    }

    private Integer is_private;

    /**
     * @return 是否匿名订单 1是 0否
     */
    public Integer getIs_private() {
        return is_private;
    }

    /**
     * 设置是否匿名订单 1是 0否     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setIs_private(Integer is_private) {
        this.is_private = is_private;
    }

    private Long latest_send_time;

    /**
     * @return 用户期望最晚送达时间
     */
    public Long getLatest_send_time() {
        return latest_send_time;
    }

    /**
     * 设置用户期望最晚送达时间     *
     * 参数示例：<pre>145444444443</pre>     
     * 此参数必填
     */
    public void setLatest_send_time(Long latest_send_time) {
        this.latest_send_time = latest_send_time;
    }

    private String meal_num;

    /**
     * @return 餐具数量
     */
    public String getMeal_num() {
        return meal_num;
    }

    /**
     * 设置餐具数量     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setMeal_num(String meal_num) {
        this.meal_num = meal_num;
    }

    private Integer need_invoice;

    /**
     * @return 是否需要发票 1是 2否
     */
    public Integer getNeed_invoice() {
        return need_invoice;
    }

    /**
     * 设置是否需要发票 1是 2否     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setNeed_invoice(Integer need_invoice) {
        this.need_invoice = need_invoice;
    }

    private Integer order_flag;

    /**
     * @return 订单标识:目前0表示不是部分退款订单，1表示订单为部分退款订单
     */
    public Integer getOrder_flag() {
        return order_flag;
    }

    /**
     * 设置订单标识:目前0表示不是部分退款订单，1表示订单为部分退款订单     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setOrder_flag(Integer order_flag) {
        this.order_flag = order_flag;
    }

    private String order_from;

    /**
     * @return 订单来源 1 饿了么星选 2饿了么
     */
    public String getOrder_from() {
        return order_from;
    }

    /**
     * 设置订单来源 1 饿了么星选 2饿了么     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setOrder_from(String order_from) {
        this.order_from = order_from;
    }

    private String order_id;

    /**
     * @return 订单ID
     */
    public String getOrder_id() {
        return order_id;
    }

    /**
     * 设置订单ID     *
     * 参数示例：<pre>12312321321321321</pre>     
     * 此参数必填
     */
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    private Integer order_index;

    /**
     * @return 订单当日流水号，从1开始递增
     */
    public Integer getOrder_index() {
        return order_index;
    }

    /**
     * 设置订单当日流水号，从1开始递增     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setOrder_index(Integer order_index) {
        this.order_index = order_index;
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

    private Integer pay_status;

    /**
     * @return 付款状态 1 未支付 2 已支付
     */
    public Integer getPay_status() {
        return pay_status;
    }

    /**
     * 设置付款状态 1 未支付 2 已支付     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setPay_status(Integer pay_status) {
        this.pay_status = pay_status;
    }

    private Integer pay_type;

    /**
     * @return 付款类型 2 在线支付
     */
    public Integer getPay_type() {
        return pay_type;
    }

    /**
     * 设置付款类型 2 在线支付     *
     * 参数示例：<pre>2</pre>     
     * 此参数必填
     */
    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    private String pick_up_code;

    /**
     * @return 用户到店自提取货码
     */
    public String getPick_up_code() {
        return pick_up_code;
    }

    /**
     * 设置用户到店自提取货码     *
     * 参数示例：<pre>csdfe</pre>     
     * 此参数必填
     */
    public void setPick_up_code(String pick_up_code) {
        this.pick_up_code = pick_up_code;
    }

    private Long pickup_time;

    /**
     * @return 骑手取货时间
     */
    public Long getPickup_time() {
        return pickup_time;
    }

    /**
     * 设置骑手取货时间     *
     * 参数示例：<pre>1454454543</pre>     
     * 此参数必填
     */
    public void setPickup_time(Long pickup_time) {
        this.pickup_time = pickup_time;
    }

    private String remark;

    /**
     * @return 订单备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置订单备注     *
     * 参数示例：<pre>不要辣</pre>     
     * 此参数必填
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String responsible_party;

    /**
     * @return 取消订单责任承担方，已废弃
     */
    public String getResponsible_party() {
        return responsible_party;
    }

    /**
     * 设置取消订单责任承担方，已废弃     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setResponsible_party(String responsible_party) {
        this.responsible_party = responsible_party;
    }

    private Integer send_fee;

    /**
     * @return 配送费，单位：分
     */
    public Integer getSend_fee() {
        return send_fee;
    }

    /**
     * 设置配送费，单位：分     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setSend_fee(Integer send_fee) {
        this.send_fee = send_fee;
    }

    private Integer send_immediately;

    /**
     * @return 是否是预约单 1即时单 2预约单
     */
    public Integer getSend_immediately() {
        return send_immediately;
    }

    /**
     * 设置是否是预约单 1即时单 2预约单     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setSend_immediately(Integer send_immediately) {
        this.send_immediately = send_immediately;
    }

    private Long send_time;

    /**
     * @return 用户期望最早送达时间
     */
    public Long getSend_time() {
        return send_time;
    }

    /**
     * 设置用户期望最早送达时间     *
     * 参数示例：<pre>1454334343</pre>     
     * 此参数必填
     */
    public void setSend_time(Long send_time) {
        this.send_time = send_time;
    }

    private Integer shop_fee;

    /**
     * @return 商户应收金额（蜂鸟物流），单位：分（自配送为用户实付）
     */
    public Integer getShop_fee() {
        return shop_fee;
    }

    /**
     * 设置商户应收金额（蜂鸟物流），单位：分（自配送为用户实付）     *
     * 参数示例：<pre>100</pre>     
     * 此参数必填
     */
    public void setShop_fee(Integer shop_fee) {
        this.shop_fee = shop_fee;
    }

    private Integer status;

    /**
     * @return 订单状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态     *
     * 参数示例：<pre>10</pre>     
     * 此参数必填
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    private String taxer_id;

    /**
     * @return 纳税人识别号
     */
    public String getTaxer_id() {
        return taxer_id;
    }

    /**
     * 设置纳税人识别号     *
     * 参数示例：<pre>231231</pre>     
     * 此参数必填
     */
    public void setTaxer_id(String taxer_id) {
        this.taxer_id = taxer_id;
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

    private Integer user_fee;

    /**
     * @return 用户实付金额，单位：分
     */
    public Integer getUser_fee() {
        return user_fee;
    }

    /**
     * 设置用户实付金额，单位：分     *
     * 参数示例：<pre>100000</pre>     
     * 此参数必填
     */
    public void setUser_fee(Integer user_fee) {
        this.user_fee = user_fee;
    }

    private Long finished_time;

    /**
     * @return 完成时间
     */
    public Long getFinished_time() {
        return finished_time;
    }

    /**
     * 设置完成时间     *
     * 参数示例：<pre>145454545454</pre>     
     * 此参数必填
     */
    public void setFinished_time(Long finished_time) {
        this.finished_time = finished_time;
    }

    private Integer is_prescription;

    /**
     * @return 是否处方药订单 0:不是 1:是
     */
    public Integer getIs_prescription() {
        return is_prescription;
    }

    /**
     * 设置是否处方药订单 0:不是 1:是     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setIs_prescription(Integer is_prescription) {
        this.is_prescription = is_prescription;
    }

}
