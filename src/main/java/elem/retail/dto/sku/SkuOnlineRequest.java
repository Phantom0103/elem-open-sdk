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
public class SkuOnlineRequest extends BaseElemRequest {

    private static final long serialVersionUID = 158321302742448256L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "sku_id")
    private String skuId;
    private String upc;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "item_id")
    private String itemId;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "store_id")
    private String storeId;

    @Override
    public String getCmd() {
        return "sku.online";
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
