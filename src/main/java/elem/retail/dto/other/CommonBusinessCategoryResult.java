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
public class CommonBusinessCategoryResult extends ElemResponseData {

    private static final long serialVersionUID = -7473445197978923740L;

    @JSONField(name = "category_id")
    private String categoryId;

    @JSONField(name = "category_name")
    private String categoryName;

    @JSONField(name = "business_form_id")
    private String businessFormId;
}
