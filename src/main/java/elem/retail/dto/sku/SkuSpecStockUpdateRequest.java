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
 * @date 2021-09-26
 */
@Getter
@Setter
public class SkuSpecStockUpdateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -2774988974466511424L;

    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "shop_id")
    private String shopId;
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

    @JSONField(name = "spec_stock_list")
    private List<SpecStock> specStocks;

    @Getter
    @Setter
    public static class SpecStock {
        @JSONField(name = "sku_spec_id")
        private String skuSpecId;
        @JSONField(name = "spec_custom_id")
        private String specCustomId;
    }

    @Override
    public String getCmd() {
        return "sku.spec.stock.update";
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
