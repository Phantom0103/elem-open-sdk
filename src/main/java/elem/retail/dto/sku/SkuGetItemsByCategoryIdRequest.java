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
public class SkuGetItemsByCategoryIdRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3156198863024450848L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "category_id")
    private String categoryId;
    @JSONField(name = "category_name")
    private String categoryName;
    private int page = 1;
    @JSONField(name = "pagesize")
    private int pageSize = 20;

    @Override
    public String getCmd() {
        return "sku.getItemsByCategoryId";
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
