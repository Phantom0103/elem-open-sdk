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
 * @date 2021-09-14
 */
@Getter
@Setter
public class SkuSpecUpdateAppendRequest extends BaseElemRequest {

    private static final long serialVersionUID = -3441222818046379014L;

    @JSONField(name = "item_id")
    private String itemId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "store_id")
    private String storeId;

    @JSONField(name = "cat_property")
    private List<CatProperty> catProperties;

    @JSONField(name = "sku_spec")
    private List<SkuSpec> skuSpecs;

    @Getter
    @Setter
    public static class CatProperty {
        private Long propId;
        private String propText;
        private Boolean saleProp;
        private Long valueId;
        private String valueText;
    }

    @Getter
    @Setter
    public static class SkuSpec {
        @JSONField(name = "left_num")
        private Double leftNum;
        private String mcChargeUnit;
        private String mcScSkuId;
        private String mcSellUnit;
        @JSONField(name = "product_spec_id")
        private String productSpecId;
        @JSONField(name = "sku_spec_id")
        private String skuSpecId;
        @JSONField(name = "sale_price")
        private Integer salePrice;
        @JSONField(name = "sku_spec_custom_id")
        private String skuSpecCustomId;
        private String upc;
        private Integer weight;

        @JSONField(name = "spec_property")
        private List<SpecProperty> specProperties;

        @Getter
        @Setter
        public static class SpecProperty {
            @JSONField(name = "prop_id")
            private Long propId;
            @JSONField(name = "prop_text")
            private String propText;
            @JSONField(name = "value_id")
            private Long valueId;
            @JSONField(name = "value_text")
            private String valueText;
        }
    }

    @Override
    public String getCmd() {
        return "sku.spec.update.append";
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
