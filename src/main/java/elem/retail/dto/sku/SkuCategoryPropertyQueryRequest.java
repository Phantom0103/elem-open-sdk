package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-17
 */
@Getter
@Setter
public class SkuCategoryPropertyQueryRequest extends BaseElemRequest {

    private static final long serialVersionUID = 2146980507965466474L;

    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    private String upc;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;

    @Override
    public String getCmd() {
        return "sku.category.property.query";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return skuId;
    }
}
