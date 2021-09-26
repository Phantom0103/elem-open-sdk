package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-26
 */
@Getter
@Setter
public class SkuPriceUpdateOneRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3014381922911899120L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "skuid_price")
    private String skuIdPrice;
    @JSONField(name = "upc_price")
    private String upcPrice;
    @JSONField(name = "itemid_price")
    private String itemIdPrice;

    @Override
    public String getCmd() {
        return "sku.price.update.one";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
