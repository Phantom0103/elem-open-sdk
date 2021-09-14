package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-14
 */
@Getter
@Setter
public class SkuPriceUpdateBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = -590109758943129697L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "skuid_price")
    private String skuIdPrice;
    @JSONField(name = "upc_price")
    private String upcPrice;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;

    @Override
    public String getCmd() {
        return "sku.price.update.batc";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return shopId;
    }
}
