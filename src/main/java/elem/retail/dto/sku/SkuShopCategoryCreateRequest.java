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
public class SkuShopCategoryCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -8710232489842027350L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "parent_category_id")
    private String parentCategoryId;
    private String name;
    private int rank = 1;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "store_id")
    private String storeId;

    @Override
    public String getCmd() {
        return "sku.shop.category.create";
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
