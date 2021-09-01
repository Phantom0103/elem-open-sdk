package elem.retail.dto.other;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-01
 */
@Getter
@Setter
public class CommonShopCategoryResult extends ElemResponseData {

    private static final long serialVersionUID = -6368444778649085006L;

    @JSONField(name = "category_id")
    private String categoryId;
    @JSONField(name = "category_name")
    private String categoryName;
    @JSONField(name = "has_child")
    private Integer hasChild;
}
