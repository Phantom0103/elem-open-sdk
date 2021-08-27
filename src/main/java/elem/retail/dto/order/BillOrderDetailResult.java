package elem.retail.dto.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.util.Long2DateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
public class BillOrderDetailResult extends ElemResponseData {

    private static final long serialVersionUID = 6234090598752038271L;

    private String baiduShopId;
    private String shopId;
    @JSONField(name = "date", deserializeUsing = Long2DateDeserializer.class)
    private Date date;

    @JSONField(name = "order_list")
    private List<BillOrderDetail> billOrderDetailList;

    @Getter
    @Setter
    public static class BillOrderDetail {
        @JSONField(name = "order_id")
        private String orderId;
        @JSONField(name = "ele_order_id")
        private String eleOrderId;
        @JSONField(name = "order_from")
        private String orderFrom;
        @JSONField(name = "order_index")
        private String orderIndex;
        @JSONField(name = "amount")
        private long amount;
        @JSONField(name = "pay_entity")
        private String payEntity;
        @JSONField(name = "responsible_party")
        private String responsibleParty;
        @JSONField(name = "order_create_time", deserializeUsing = Long2DateDeserializer.class)
        private Date orderCreateTime;
        @JSONField(name = "trade_create_time", deserializeUsing = Long2DateDeserializer.class)
        private Date tradeCreateTime;
        @JSONField(name = "payment_date", deserializeUsing = Long2DateDeserializer.class)
        private Date paymentDate;

        @JSONField(name = "order_detail_fee")
        private OrderDetailFee orderDetailFee;

        @JSONField(name = "trade_id")
        private TradeId tradeId;

        @Getter
        @Setter
        public static class OrderDetailFee {
            @JSONField(name = "adjust_fee")
            private long adjustFee;
            @JSONField(name = "agent_rate")
            private long agentRate;
            @JSONField(name = "cold_box_fee")
            private long coldBoxFee;
            private long commission;
            @JSONField(name = "discount_value")
            private long discountValue;
            @JSONField(name = "guarantee_fee")
            private long guaranteeFee;
            @JSONField(name = "package_fee")
            private long packageFee;
            @JSONField(name = "platform_rate")
            private long platformRate;
            @JSONField(name = "product_fee")
            private long productFee;
            @JSONField(name = "send_fee")
            private long sendFee;
            @JSONField(name = "shop_rate")
            private long shopRate;
            @JSONField(name = "user_fee")
            private long userFee;
            @JSONField(name = "zhongbao_call_fee")
            private long zhongbaoCallFee;
            @JSONField(name = "actual_base_logistics_amount")
            private long actualBaseLogisticsAmount;
            @JSONField(name = "shop_in_amount")
            private long shopInAmount;
            private long actualBaseDistanceAmount;
            private long actualBaseTimeAmount;
            private long baseLogisticsAmount;
            private int orderBusinessType;
            private String businessTypeDesc;
            private long merchantCouponAmount;
            private long merchantDeliveryCouponAmount;
            private long merchantDeliverySubsidyAmount;
            private long merchantCashGiftAmount;
            private long merchantSubsidyAmount;
            private long merchantItemCouponAmount;
            private long originDeliverFee;
            private String deliveryType;
            private long deliveryTipAmount;
            private long elemeCouponAmount;
            private long elemeDeliveryCouponAmount;
            private long elemeDeliverySubsidyAmount;
            private long elemeCashGiftAmount;
            private long elemeSubsidyAmount;
            private long elemeRedPacket;
            private int isTyingOrder;
            private Integer tyingOrderType;
            private String isTyingOrderDesc;
            private String tyingOrderTypeDesc;
            private long merchantRedPacket;
            private String bookTypeDesc;
            private String isSelfDelivery;
            @JSONField(name = "addition_service_price")
            private String additionServicePrice;
            @JSONField(name = "slow_will_pay_amount")
            private String slowWillPayAmount;
        }

        @Getter
        @Setter
        public static class TradeId {
            @JSONField(name = "agent_id")
            private String agentId;
            @JSONField(name = "supplier_id")
            private String supplierId;
        }
    }
}
