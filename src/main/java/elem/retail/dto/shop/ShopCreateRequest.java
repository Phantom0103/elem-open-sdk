package elem.retail.dto.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-24
 */
@Getter
@Setter
public class ShopCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = 5289702069281540401L;

    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "shop_id")
    private String shopId;
    private String name;
    @JSONField(name = "shop_logo")
    private String shopLogo;
    private Integer province;
    private Integer city;
    private Integer county;
    private String address;
    private String phone;
    @JSONField(name = "ivr_phone")
    private String ivrPhone;
    @JSONField(name = "service_phone")
    private String servicePhone;
    @JSONField(name = "service_phones")
    private List<String> servicePhones;
    private String longitude;
    private String latitude;
    @JSONField(name = "coord_type")
    private String coordType;
    @JSONField(name = "invoice_support")
    private Integer invoiceSupport;
    @JSONField(name = "package_box_price")
    private Integer packageBoxPrice;
    @JSONField(name = "business_form_id")
    private Integer businessFormId;
    @JSONField(name = "biz_identity")
    private Integer bizIdentity;
    @JSONField(name = "delivery_time_type")
    private String deliveryTimeType;

    @JSONField(name = "categorys")
    private List<Category> categories;

    @JSONField(name = "delivery_region")
    private List<DeliveryRegion> deliveryRegions;

    @JSONField(name = "business_time")
    private List<BusinessTime> businessTimes;

    @JSONField(name = "im_data")
    private List<ImData> imData;

    @Getter
    @Setter
    public static class Category {
        @JSONField(name = "category1")
        private Integer category1;
        @JSONField(name = "category2")
        private Integer category2;
        @JSONField(name = "category3")
        private Integer category3;
    }

    @Getter
    @Setter
    public static class DeliveryRegion {
        private String name;
        @JSONField(name = "delivery_time")
        private Integer deliveryTime;
        @JSONField(name = "delivery_fee")
        private Integer deliveryFee;
        @JSONField(name = "min_buy_free")
        private Integer minBuyFree;
        @JSONField(name = "min_order_price")
        private Integer minOrderPrice;

        @JSONField(name = "region")
        private List<Region> regions;

        @Getter
        @Setter
        public static class Region {
            private String longitude;
            private String latitude;
        }
    }

    @Getter
    @Setter
    public static class BusinessTime {
        private String start;
        private String end;
    }

    @Getter
    @Setter
    public static class ImData {
        private String id;
        private String type;
    }

    @Override
    public String getCmd() {
        return "shop.create";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return this.getShopId();
    }
}
