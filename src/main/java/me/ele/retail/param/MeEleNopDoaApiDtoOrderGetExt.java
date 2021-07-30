package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetExt {

    private String giver_phone;

    /**
     * @return 订购人电话
     */
    public String getGiver_phone() {
        return giver_phone;
    }

    /**
     * 设置订购人电话     *
     * 参数示例：<pre>123333200</pre>     
     * 此参数必填
     */
    public void setGiver_phone(String giver_phone) {
        this.giver_phone = giver_phone;
    }

    private String greeting;

    /**
     * @return 祝福语
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * 设置祝福语     *
     * 参数示例：<pre>祝福你</pre>     
     * 此参数必填
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    private Integer online_cancel_status;

    /**
     * @return 全单退状态（订单为全单退订单时会有此字段）10:发起申请,20:客服介入,30:客服拒绝,40:客服同意,50:商户拒绝,60:商户同意,70:申请失效
     */
    public Integer getOnline_cancel_status() {
        return online_cancel_status;
    }

    /**
     * 设置全单退状态（订单为全单退订单时会有此字段）10:发起申请,20:客服介入,30:客服拒绝,40:客服同意,50:商户拒绝,60:商户同意,70:申请失效     *
     * 参数示例：<pre>70</pre>     
     * 此参数必填
     */
    public void setOnline_cancel_status(Integer online_cancel_status) {
        this.online_cancel_status = online_cancel_status;
    }

    private Integer part_refund;

    /**
     * @return 部分退款标识,1商户发起 2用户发起
     */
    public Integer getPart_refund() {
        return part_refund;
    }

    /**
     * 设置部分退款标识,1商户发起 2用户发起     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setPart_refund(Integer part_refund) {
        this.part_refund = part_refund;
    }

    private Integer part_refund_status;

    /**
     * @return 部分退状态（订单为部分退订单时会有此字段）10表示商家/用户发起部分退款申请 20表示部分退款成功 30用户申请仲裁,客服介入 40表示部分退款失败 50表示商家拒绝用户发起的部分退款申请
     */
    public Integer getPart_refund_status() {
        return part_refund_status;
    }

    /**
     * 设置部分退状态（订单为部分退订单时会有此字段）10表示商家/用户发起部分退款申请 20表示部分退款成功 30用户申请仲裁,客服介入 40表示部分退款失败 50表示商家拒绝用户发起的部分退款申请     *
     * 参数示例：<pre>10</pre>     
     * 此参数必填
     */
    public void setPart_refund_status(Integer part_refund_status) {
        this.part_refund_status = part_refund_status;
    }

    private Integer taoxi_flag;

    /**
     * @return 淘系订单标识,0非淘系订单 1淘系订单
     */
    public Integer getTaoxi_flag() {
        return taoxi_flag;
    }

    /**
     * 设置淘系订单标识,0非淘系订单 1淘系订单     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setTaoxi_flag(Integer taoxi_flag) {
        this.taoxi_flag = taoxi_flag;
    }

    private Integer user_cancel;

    /**
     * @return 1表示订单完成前用户全单取消申请流程，2表示订单完成后用户全单退款申请流程
     */
    public Integer getUser_cancel() {
        return user_cancel;
    }

    /**
     * 设置1表示订单完成前用户全单取消申请流程，2表示订单完成后用户全单退款申请流程     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setUser_cancel(Integer user_cancel) {
        this.user_cancel = user_cancel;
    }

}
