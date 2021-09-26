package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
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
public class SkuCategoryListRequest extends BaseElemRequest {

    private static final long serialVersionUID = -894457547441746139L;

    private String keyword;
    private int depth = 1;
    private long parentId;

    @Override
    public String getCmd() {
        return "sku.category.list";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return keyword;
    }
}
