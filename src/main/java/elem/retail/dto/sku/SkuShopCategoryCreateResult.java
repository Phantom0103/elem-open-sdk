package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuShopCategoryCreateResult extends ElemResponseData {

    private static final long serialVersionUID = -7347944967758200745L;

    @JSONField(name = "category_id")
    private String category_id;
    @JSONField(name = "category_name")
    private String categoryName;
}
