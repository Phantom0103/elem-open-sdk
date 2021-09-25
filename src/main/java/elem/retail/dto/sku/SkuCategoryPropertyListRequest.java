package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-25
 */
@Getter
@Setter
public class SkuCategoryPropertyListRequest extends BaseElemRequest {

    private static final long serialVersionUID = -6143516976661907926L;

    @JSONField(name = "cat3_id")
    private Long cat3Id;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;

    @Override
    public String getCmd() {
        return "sku.category.property.list";
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
