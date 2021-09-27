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
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuSpecUpdatePriceRequest extends BaseElemRequest {

    private static final long serialVersionUID = 5434841515662247256L;
    
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "item_id")
    private String itemId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;

    @JSONField(name = "sku_spec_price_list")
    private List<SkuSpecPrice> skuSpecPrices;

    @Getter
    @Setter
    public static class SkuSpecPrice {
        @JSONField(name = "sale_price")
        private Integer salePrice;
        @JSONField(name = "sku_spec_custom_id")
        private String skuSpecCustomId;
        @JSONField(name = "sku_spec_id")
        private String skuSpecId;
    }

    @Override
    public String getCmd() {
        return "sku.spec.update.price";
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
