package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-16
 */
@Getter
@Setter
public class SkuUpdateRequest extends BaseElemRequest {

    private static final long serialVersionUID = 6539110189309664302L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "upc_update")
    private String upcUpdate;
    private String name;
    private Integer status;
    private String shelfNumber;
    @JSONField(name = "brand_id")
    private String brandId;
    @JSONField(name = "brand_name")
    private String brandName;
    @JSONField(name = "category_id")
    private String categoryId;
    @JSONField(name = "category_name")
    private String categoryName;
    @JSONField(name = "cat3_id")
    private String cat3Id;
    private String rtf;
    @JSONField(name = "left_num")
    private Integer leftNum;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "sale_price")
    private Integer salePrice;
    private String desc;
    @JSONField(name = "preparation_time")
    private Integer preparationTime;
    @JSONField(name = "process_type")
    private Integer processType;
    private Double minimum;
    @JSONField(name = "preminus_weight")
    private Double preminusWeight;
    @JSONField(name = "sale_step")
    private Double saleStep;
    @JSONField(name = "sale_unit")
    private String saleUnit;
    private Integer weight;
    private String summary;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "item_id")
    private String itemId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "package_flag")
    private Long packageFlag;
    @JSONField(name = "single_package_flag")
    private Boolean singlePackageFlag;
    @JSONField(name = "single_package_number")
    private Integer singlePackageNumber;
    @JSONField(name = "single_package_fee")
    private Long singlePackageFee;

    @JSONField(name = "category_list")
    private List<Category> categories;

    private List<Photo> photos;

    @JSONField(name = "process_detail")
    private List<ProcessDetail> processDetails;

    @JSONField(name = "sku_property")
    private List<SkuProperty> skuProperties;

    @JSONField(name = "cat_property")
    private List<CatProperty> catProperties;

    @JSONField(name = "sku_spec")
    private List<SkuSpec> skuSpecs;

    @JSONField(name = "mc_ext")
    private McExt mcExt;

    @Getter
    @Setter
    public static class Category {
        @JSONField(name = "category_id")
        private String categoryId;
        @JSONField(name = "category_name")
        private String categoryName;
    }

    @Getter
    @Setter
    public static class Photo {
        @JSONField(name = "is_master")
        private Integer isMaster;
        private String url;
    }

    @Getter
    @Setter
    public static class ProcessDetail {
        private Integer time;
        private String type;
    }

    @Getter
    @Setter
    public static class SkuProperty {
        private String name;

        @Getter
        @Setter
        public static class Detail {
            private boolean ice;
            private String k;
        }
    }

    @Getter
    @Setter
    public static class CatProperty {
        private String propId;
        private String propText;
        private String valueId;
        private String valueText;
    }

    @Getter
    @Setter
    public static class SkuSpec {
        @JSONField(name = "sku_spec_id")
        private String skuSpecId;
        private String upc;
        @JSONField(name = "sale_price")
        private Integer salePrice;
        @JSONField(name = "left_num")
        private Double leftNum;
        private Integer weight;
        @JSONField(name = "product_spec_id")
        private String productSpecId;
        @JSONField(name = "sku_spec_custom_id")
        private String skuSpecCustomId;

        @JSONField(name = "spec_property")
        private List<SpecProperty> specProperties;

        @Getter
        @Setter
        public static class SpecProperty {
            @JSONField(name = "prop_id")
            private String propId;
            @JSONField(name = "prop_text")
            private String propText;
            @JSONField(name = "value_id")
            private String valueId;
            @JSONField(name = "value_text")
            private String valueText;
        }
    }

    @Getter
    @Setter
    public static class McExt {
        @JSONField(name = "mc_sell_unit")
        private String mcSellUnit;
        @JSONField(name = "mc_charge_unit")
        private String mcChargeUnit;
        @JSONField(name = "mc_sc_item_id")
        private String mcScItemId;
        private String operatingShop;
        private String merchantCode;
        @JSONField(name = "scm_sale_type")
        private String scmSaleType;
        private List<String> tags;
        private String mcSpecialIsWeight;
        private String mcSpecialWdkiu;
        private String mcSpecialWdkbu;
        private String mcSpecialRatio;
    }

    @Override
    public String getCmd() {
        return "sku.update";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return skuId;
    }
}
