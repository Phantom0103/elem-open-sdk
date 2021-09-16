package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;

/**
 * @author zhouw
 * @description
 * @date 2021-09-16
 */
public class SkuOnlineOneRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3130025342063766280L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "sku_id")
    private String skuId;
    private String upc;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;

    @Override
    public String getCmd() {
        return "sku.online.one";
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
