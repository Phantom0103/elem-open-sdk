package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuStockIncreaseOneRequest extends BaseElemRequest {

    private static final long serialVersionUID = 9145417931197794936L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "custom_sku_id_stocks")
    private String customSkuIdStocks;
    @JSONField(name = "skuid_stocks")
    private String skuIdStocks;
    @JSONField(name = "upc_stocks")
    private String upcStocks;
    @JSONField(name = "version_id")
    private String versionId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;

    @Override
    public String getCmd() {
        return "sku.stock.increase.one";
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
