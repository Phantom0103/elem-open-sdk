package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-26
 */
@Getter
@Setter
public class SkuCategoryListResult extends ElemResponseData {

    private static final long serialVersionUID = 7145614472772915566L;

    @JSONField(name = "cat_id")
    private String catId;
    @JSONField(name = "cat_name")
    private String catName;
    private int depth;
    @JSONField(name = "parent_id")
    private long parentId;
}
