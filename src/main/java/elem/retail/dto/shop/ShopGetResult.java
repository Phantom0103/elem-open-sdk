package elem.retail.dto.shop;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-08
 */
@Getter
@Setter
public class ShopGetResult extends ElemResponseData {

    private static final long serialVersionUID = -6036002322979335125L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "supplier_name")
    private String supplierName;
    private String name;
    @JSONField(name = "shop_logo")
    private String shopLogo;
    private String province;
    private String city;
    private String county;
    private String address;
    private String brand;
    private String category1;
    private String category2;
    private String category3;
    private String phone;
    @JSONField(name = "service_phone")
    private String servicePhone;
    @JSONField(name = "ivr_phone")
    private String ivrPhone;
    private String longitude;
    private String latitude;
    @JSONField(name = "book_ahead_time")
    private Integer bookAheadTime;
    @JSONField(name = "invoice_support")
    private String invoiceSupport;
    @JSONField(name = "package_box_price")
    private int packageBoxPrice;
    @JSONField(name = "delivery_party")
    private int deliveryParty;
    @JSONField(name = "delivery_type")
    private String deliveryType;
    @JSONField(name = "pick_time")
    private Integer pickTime;
    private String status;
    @JSONField(name = "coord_type")
    private String coordType;
    @JSONField(name = "service_phones")
    private List<String> servicePhones;
    @JSONField(name = "business_form_id")
    private String businessFormId;
    @JSONField(name = "order_status_push")
    private Integer orderStatusPush;
    @JSONField(name = "min_order_price")
    private int minOrderPrice;
    @JSONField(name = "order_push")
    private Integer orderPush;
    private List<String> threshold;

    @JSONField(name = "business_time")
    private List<BusinessTime> businessTimes;

    @JSONField(name = "categorys")
    private List<Category> categories;

    @JSONField(name = "delivery_region")
    private List<DeliveryRegion> deliveryRegions;

    @Getter
    @Setter
    public static class BusinessTime {
        private String start;
        private String end;
    }

    @Getter
    @Setter
    public static class Category {
        private String category1;
        private String category2;
        private String category3;
    }

    @Getter
    @Setter
    public static class DeliveryRegion {
        private String name;
        @JSONField(name = "delivery_time")
        private int deliveryTime;
        @JSONField(name = "delivery_fee")
        private int deliveryFee;
        @JSONField(name = "min_buy_free")
        private int minBuyFree;
        @JSONField(name = "min_order_price")
        private int minOrderPrice;

        @JSONField(name = "region")
        private List<Region> regions;

        @Getter
        @Setter
        public static class Region {
            private String longitude;
            private String latitude;
        }
    }
}
