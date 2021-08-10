package elem.retail.dto.order;

import com.alibaba.fastjson.JSONObject;
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
 * @Date 2021-08-03
 */
@Getter
@Setter
public class OrderGetResult extends ElemResponseData {

    private static final long serialVersionUID = -7463196883326593949L;

    private String source;
    private Order order;
    private User user;
    private Shop shop;

    @JSONField(name = "discount")
    private List<Discount> discounts;

    private List<List<Product>> products;

    @Getter
    @Setter
    public static class Discount {
        @JSONField(name = "activity_id")
        private String activityId;
        private int fee;
        @JSONField(name = "shop_rate")
        private int shopRate;
        @JSONField(name = "logistics_rate")
        private int logisticsRate;
        @JSONField(name = "agent_rate")
        private int agentRate;
        @JSONField(name = "baidu_rate")
        private int baiduRate;
        @JSONField(name = "user_rate")
        private int userRate;
        private String type;
        @JSONField(name = "custom_activity_id")
        private String customActivityId;
        @JSONField(name = "rule_id")
        private String ruleId;
        @JSONField(name = "coupon_id")
        private String couponId;
        private String desc;

        private List<Product> products;

        @Getter
        @Setter
        public static class Product {
            @JSONField(name = "activity_id")
            private String activityId;
            @JSONField(name = "activity_product_num")
            private int activityProductNum;
            @JSONField(name = "baidu_product_id")
            private String baiduProductId;
            @JSONField(name = "now_price")
            private int nowPrice;
            @JSONField(name = "orig_price")
            private int origPrice;
            @JSONField(name = "save_price")
            private int savePrice;
        }
    }

    @Getter
    @Setter
    public static class Order {
        @JSONField(name = "atshop_time", deserializeUsing = Long2DateDeserializer.class)
        private Date atShopTime;
        @JSONField(name = "business_type")
        private String businessType;
        @JSONField(name = "cancel_time", deserializeUsing = Long2DateDeserializer.class)
        private Date cancelTime;
        @JSONField(name = "cold_box_fee")
        private long coldBoxFee;
        private long commission;
        @JSONField(name = "confirm_time", deserializeUsing = Long2DateDeserializer.class)
        private Date confirmTime;
        @JSONField(name = "create_time", deserializeUsing = Long2DateDeserializer.class)
        private Date createTime;
        @JSONField(name = "delivery_party")
        private String deliveryParty;
        @JSONField(name = "delivery_phone")
        private String deliveryPhone;
        @JSONField(name = "delivery_time", deserializeUsing = Long2DateDeserializer.class)
        private Date deliveryTime;
        @JSONField(name = "discount_fee")
        private int discountFee;
        @JSONField(name = "down_flag")
        private long downFlag;
        @JSONField(name = "eleme_order_id")
        private String elemOrderId;
        @JSONField(name = "expect_time_mode")
        private int expectTimeMode;
        @JSONField(name = "finished_time", deserializeUsing = Long2DateDeserializer.class)
        private Date finishedTime;
        @JSONField(name = "invoice_title")
        private String invoiceTitle;
        @JSONField(name = "is_cold_box_order")
        private int isColdBoxOrder;
        @JSONField(name = "is_private")
        private int isPrivate;
        @JSONField(name = "latest_send_time", deserializeUsing = Long2DateDeserializer.class)
        private Date latestSendTime;
        @JSONField(name = "meal_num")
        private String mealNum;
        @JSONField(name = "need_invoice")
        private int needInvoice;
        @JSONField(name = "order_flag")
        private int orderFlag;
        @JSONField(name = "order_from")
        private String orderFrom;
        @JSONField(name = "order_id")
        private String orderId;
        @JSONField(name = "order_index")
        private int orderIndex;
        @JSONField(name = "package_fee")
        private int packageFee;
        @JSONField(name = "pay_status")
        private int payStatus;
        @JSONField(name = "pay_type")
        private int payType;
        @JSONField(name = "pick_up_code")
        private String pickUpCode;
        @JSONField(name = "pickup_time", deserializeUsing = Long2DateDeserializer.class)
        private Date pickUpTime;
        private String remark;
        @JSONField(name = "responsible_party")
        private String responsibleParty;
        @JSONField(name = "send_fee")
        private int sendFee;
        @JSONField(name = "send_immediately")
        private int sendImmediately;
        @JSONField(name = "send_time", deserializeUsing = Long2DateDeserializer.class)
        private Date sendTime;
        @JSONField(name = "shop_fee")
        private int shopFee;
        private int status;
        @JSONField(name = "taxer_id")
        private String taxerId;
        @JSONField(name = "total_fee")
        private int totalFee;
        @JSONField(name = "user_fee")
        private int userFee;
        @JSONField(name = "is_prescription")
        private int isPrescription;
        @JSONField(name = "merchant_total_fee")
        private int merchantTotalFee;
        @JSONField(name = "promise_out_time", deserializeUsing = Long2DateDeserializer.class)
        private Date promiseOutTime;
        @JSONField(name = "picking_time")
        private int pickingTime;

        @JSONField(name = "delivery_fee")
        private DeliveryFee deliveryFee;
        @JSONField(name = "third_pl_info")
        private ThirdPlInfo thirdPlInfo;
        private Ext ext;

        @Getter
        @Setter
        public static class DeliveryFee {
            @JSONField(name = "platform_delivery_fee")
            private int platformDeliveryFee;
            @JSONField(name = "shop_delivery_fee")
            private int shopDeliveryFee;
            @JSONField(name = "delivery_fee_discount")
            private int deliveryFeeDiscount;
        }

        @Getter
        @Setter
        public static class Ext {
            @JSONField(name = "giver_phone")
            private String giverPhone;
            private String greeting;
            @JSONField(name = "online_cancel_status")
            private int onlineCancelStatus;
            @JSONField(name = "part_refund")
            private int partRefund;
            @JSONField(name = "part_refund_status")
            private int partRefundStatus;
            @JSONField(name = "taoxi_flag")
            private int taoxiFlag;
            @JSONField(name = "user_cancel")
            private int userCancel;
        }

        @Getter
        @Setter
        public static class ThirdPlInfo {
            @JSONField(name = "pick_up_code")
            private String pickUpCode;
            private String token;
            @JSONField(name = "merchant_pick_time", deserializeUsing = Long2DateDeserializer.class)
            private Date merchantPickTime;
        }
    }

    @Getter
    @Setter
    public static class Product {
        @JSONField(name = "activity_id")
        private String activityId;
        @JSONField(name = "baidu_product_id")
        private String baiduProductId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "is_free_gift")
        private int isFreeGift;
        @JSONField(name = "package_amount")
        private int packageAmount;
        @JSONField(name = "package_fee")
        private int packageFee;
        @JSONField(name = "package_price")
        private int packagePrice;
        @JSONField(name = "prescription_id")
        private String prescriptionId;
        @JSONField(name = "product_amount")
        private int productAmount;
        @JSONField(name = "product_custom_index")
        private String productCustomIndex;
        @JSONField(name = "product_fee")
        private int productFee;
        @JSONField(name = "product_name")
        private String productName;
        @JSONField(name = "product_price")
        private int productPrice;
        @JSONField(name = "product_type")
        private int productType;
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;
        @JSONField(name = "supply_type")
        private int supplyType;
        @JSONField(name = "total_fee")
        private int totalFee;
        @JSONField(name = "total_weight")
        private int totalWeight;
        private String upc;
        @JSONField(name = "weight_type")
        private int weightType;
        private String customSkuSpecId;

        @JSONField(name = "product_subsidy")
        private ProductSubsidy productSubsidy;

        @JSONField(name = "gm_ids")
        private List<String> gmIds;

        @JSONField(name = "product_features")
        private List<ProductFeature> productFeatures;

        private List<Property> properties;

        @Getter
        @Setter
        public static class ProductFeature {
            @JSONField(name = "baidu_feature_id")
            private long baiduFeatureId;
            private String name;
            private String option;
        }

        @Getter
        @Setter
        public static class ProductSubsidy {
            @JSONField(name = "agent_rate")
            private int agentRate;
            @JSONField(name = "baidu_rate")
            private int baiduRate;
            @JSONField(name = "logistics_rate")
            private int logisticsRate;
            @JSONField(name = "shop_rate")
            private int shopRate;
            @JSONField(name = "user_rate")
            private int userRate;
            private int discount;

            @JSONField(name = "discount_detail")
            private List<DiscountDetail> discountDetails;

            @Getter
            @Setter
            public static class DiscountDetail {
                @JSONField(name = "shop_rate")
                private int shopRate;
                @JSONField(name = "activity_id")
                private String activityId;
                @JSONField(name = "baidu_rate")
                private int baiduRate;
                private String type;
                @JSONField(name = "custom_activity_id")
                private String customActivityId;
                @JSONField(name = "coupon_id")
                private String couponId;
            }
        }

        @Getter
        @Setter
        public static class Property {
            private String name;
            private String value;
        }
    }

    @Getter
    @Setter
    public static class Shop {
        @JSONField(name = "baidu_shop_id")
        private String baiduShopId;
        private String id;
        private String name;
    }

    @Getter
    @Setter
    public static class User {
        @JSONField(name = "user_id")
        private String userId;
        private String name;
        private String phone;
        private String gender;
        @JSONField(name = "privacy_phone")
        private String privacyPhone;
        private String address;
        private String province;
        private String city;
        private String district;
        @JSONField(name = "accurate_address")
        private String accurateAddress;

        private Coord coord;
        @JSONField(name = "coord_amap")
        private CoordAmap coordAmap;

        @Getter
        @Setter
        public static class Coord {
            private String latitude;
            private String longitude;
        }

        @Getter
        @Setter
        private static class CoordAmap {
            private String latitude;
            private String longitude;
        }
    }

    @Override
    public void parse(JSONObject json) {

    }

}
