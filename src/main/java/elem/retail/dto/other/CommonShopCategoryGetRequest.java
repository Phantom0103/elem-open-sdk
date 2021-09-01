package elem.retail.dto.other;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-01
 */
@Getter
@Setter
public class CommonShopCategoryGetRequest extends BaseElemRequest {

    private static final long serialVersionUID = 5255805815468590680L;

    @JSONField(name = "category_id")
    private String categoryId;

    @Override
    public String getCmd() {
        return "common.shop.category.get";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return categoryId;
    }
}
