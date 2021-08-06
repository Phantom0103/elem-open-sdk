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
public class OrderGetResponse extends ElemResponseData {

    private static final long serialVersionUID = -7463196883326593949L;

    private String source;
    private Order order;
    private User user;
    private Shop shop;

    private List<Discount> discounts;
    private List<List<Product>> products;

    @Getter
    @Setter
    public static class Discount {
        private String activityId;
        private int fee;
        private int shopRate;
        private int logisticsRate;
        private int agentRate;
        private int baiduRate;
        private int userRate;
        private String type;
        private String customActivityId;
        private String ruleId;
        private String couponId;
        private String desc;

        private List<Product> products;

        @Getter
        @Setter
        public static class Product {
            private String activityId;
            private int activityProductNum;
            private String baiduProductId;
            private int nowPrice;
            private int origPrice;
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
        private long coldBoxFee;
        private long commission;
        private Date confirmTime;
        private Date createTime;
        private String deliveryParty;
        private String deliveryPhone;
        private Date deliveryTime;
        private int discountFee;
        private long downFlag;
        private String elemOrderId;
        private int expectTimeMode;
        private Date finishedTime;
        private String invoiceTitle;
        private int isColdBoxOrder;
        private int isPrivate;
        private Date latestSendTime;
        private String mealNum;
        private int needInvoice;
        private int orderFlag;
        private String orderFrom;
        private String orderId;
        private int orderIndex;
        private int packageFee;
        private int payStatus;
        private int payType;
        private String pickUpCode;
        private Date pickUpTime;
        private String remark;
        private String responsibleParty;
        private int sendFee;
        private int sendImmediately;
        private Date sendTime;
        private int shopFee;
        private int status;
        private String taxerId;
        private int totalFee;
        private int userFee;
        private int isPrescription;
        private int merchantTotalFee;

        private DeliveryFee deliveryFee;
        private ThirdPlInfo thirdPlInfo;
        private Ext ext;

        @Getter
        @Setter
        public static class DeliveryFee {
            private int platformDeliveryFee;
            private int shopDeliveryFee;
            private int deliveryFeeDiscount;
        }

        @Getter
        @Setter
        public static class Ext {
            private String giverPhone;
            private String greeting;
            private int onlineCancelStatus;
            private int partRefund;
            private int partRefundStatus;
            private int taoxiFlag;
            private int userCancel;
        }

        @Getter
        @Setter
        public static class ThirdPlInfo {
            private String pickUpCode;
            private String token;
            private Date merchantPickTime;
        }
    }

    @Getter
    @Setter
    public static class Product {
        private String activityId;
        private String baiduProductId;
        private String customSkuId;
        private int isFreeGift;
        private int packageAmount;
        private int packageFee;
        private int packagePrice;
        private String prescriptionId;
        private int productAmount;
        private String productCustomIndex;
        private int productFee;
        private String productName;
        private int productPrice;
        private int productType;
        private String subBizOrderId;
        private int supplyType;
        private int totalFee;
        private int totalWeight;
        private String upc;
        private int weightType;
        private String customSkuSpecId;

        private ProductSubsidy productSubsidy;

        private List<String> gmIds;

        private List<ProductFeature> productFeatures;
        private List<Property> properties;

        @Getter
        @Setter
        public static class ProductFeature {
            private long baiduFeatureId;
            private String name;
            private String option;
        }

        @Getter
        @Setter
        public static class ProductSubsidy {
            private int agentRate;
            private int baiduRate;
            private int logisticsRate;
            private int shopRate;
            private int userRate;
            private int discount;

            private List<DiscountDetail> discountDetails;

            @Getter
            @Setter
            public static class DiscountDetail {
                private int shopRate;
                private String activityId;
                private int baiduRate;
                private String type;
                private String customActivityId;
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
        private String baiduShopId;
        private String id;
        private String name;
    }

    @Getter
    @Setter
    public static class User {
        private String userId;
        private String name;
        private String phone;
        private String gender;
        private String privacyPhone;
        private String address;
        private String province;
        private String city;
        private String district;
        private String accurateAddress;

        private Coord coord;
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
