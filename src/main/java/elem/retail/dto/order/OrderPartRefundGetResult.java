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
 * @Date 2021-08-26
 */
@Getter
@Setter
public class OrderPartRefundGetResult extends ElemResponseData {

    private static final long serialVersionUID = 4600049107301148805L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "refund_order_id")
    private String refundOrderId;
    private int type;
    private int commission;
    private int fee;
    @JSONField(name = "package_fee")
    private int packageFee;
    @JSONField(name = "refund_price")
    private int refundPrice;
    @JSONField(name = "send_fee")
    private int sendFee;
    @JSONField(name = "shop_fee")
    private int shopFee;
    @JSONField(name = "user_fee")
    private int userFee;
    @JSONField(name = "total_price")
    private int totalPrice;
    @JSONField(name = "is_refund_all")
    private int isRefundAll;

    @JSONField(name = "refund_detail")
    private List<RefundDetail> refundDetails;

    @JSONField(name = "order_detail")
    private List<OrderDetail> orderDetails;

    @JSONField(name = "history_refund_detail")
    private List<List<HistoryRefundDetail>> historyRefundDetails;

    @Getter
    @Setter
    public static class RefundDetail {
        @JSONField(name = "refund_id")
        private String refundId;
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;
        @JSONField(name = "total_refund")
        private int totalRefund;
        private String upc;
        @JSONField(name = "apply_time", deserializeUsing = Long2DateDeserializer.class)
        private Date applyTime;
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        private int type;
        @JSONField(name = "gm_ids")
        private List<String> gmIds;
        @JSONField(name = "is_free_gift")
        private int isFreeGift;
        private int number;
        private String name;
        @JSONField(name = "shop_ele_refund")
        private int shopEleRefund;
        @JSONField(name = "shop_refund")
        private int shopRefund;
        private String status;
        private String desc;

        @JSONField(name = "product_features")
        private List<ProductFeature> productFeatures;
    }

    @Getter
    @Setter
    public static class OrderDetail {
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "gm_ids")
        private List<String> gmIds;
        @JSONField(name = "is_free_gift")
        private int isFreeGift;
        private int number;
        private String name;
        @JSONField(name = "product_fee")
        private int productFee;
        @JSONField(name = "product_price")
        private int productPrice;
        @JSONField(name = "total_weight")
        private int totalWeight;
        private String upc;

        @JSONField(name = "product_features")
        private List<ProductFeature> productFeatures;

        @JSONField(name = "product_subsidy")
        private List<ProductSubsidy> productSubsidies;

        @Getter
        @Setter
        public static class ProductSubsidy {
            @JSONField(name = "agent_rate")
            private int agentRate;
            @JSONField(name = "baidu_rate")
            private int baiduRate;
            private int discount;
            @JSONField(name = "logistics_rate")
            private int logisticsRate;
            @JSONField(name = "shop_rate")
            private int shopRate;
            @JSONField(name = "user_rate")
            private int userRate;

            @JSONField(name = "discount_detail")
            private List<DiscountDetail> discountDetails;

            @Getter
            @Setter
            public static class DiscountDetail {
                @JSONField(name = "activity_id")
                private String activityId;
                @JSONField(name = "baidu_rate")
                private int baiduRate;
                @JSONField(name = "shop_rate")
                private int shopRate;
                private String type;
                @JSONField(name = "custom_activity_id")
                private String customActivityId;
                @JSONField(name = "coupon_id")
                private String couponId;
            }
        }
    }

    @Getter
    @Setter
    public static class HistoryRefundDetail {
        @JSONField(name = "refund_id")
        private String refundId;
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;
        @JSONField(name = "total_refund")
        private int totalRefund;
        private String upc;
        @JSONField(name = "apply_time", deserializeUsing = Long2DateDeserializer.class)
        private Date applyTime;
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        private int type;
        @JSONField(name = "gm_ids")
        private List<String> gmIds;
        @JSONField(name = "is_free_gift")
        private int isFreeGift;
        private int number;
        private String name;
        @JSONField(name = "shop_ele_refund")
        private int shopEleRefund;
        private String status;
        private String desc;
        @JSONField(name = "product_features")
        private List<ProductFeature> productFeatures;
    }

    @Getter
    @Setter
    public static class ProductFeature {
        @JSONField(name = "baidu_feature_id")
        private Long baiduFeatureId;
        private String name;
        private String option;
    }
}
