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
public class SkuShopCategoryUpdateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1400443041237650132L;

    @JSONField(name = "shop_id")
    private String shopId;
    private String name;
    @JSONField(name = "category_id")
    private String categoryId;
    private int rank = 1;

    @Override
    public String getCmd() {
        return "sku.shop.category.update";
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
