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
public class SkuStockUpdateOneRequest extends BaseElemRequest {

    private static final long serialVersionUID = -6555219428011340850L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "skuid_stocks")
    private String skuIdStocks;
    @JSONField(name = "upc_stocks")
    private String upcStocks;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;

    @Override
    public String getCmd() {
        return "sku.stock.update.one";
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
