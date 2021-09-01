package elem.retail.dto.other;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-01
 */
public class CommonShopCategoryGetResult extends ElemResponseData {

    private static final long serialVersionUID = -2761846264373670035L;

    @JSONField(name = "category_id")
    private String categoryId;
    private String name;
}
