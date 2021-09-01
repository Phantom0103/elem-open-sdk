package elem.retail.dto.other;

import com.alibaba.fastjson.JSON;
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
public class CommonShopCategoryRequest extends BaseElemRequest {

    private static final long serialVersionUID = -2439524573151761605L;

    private String categoryId;
    private Integer level;

    @Override
    public String getCmd() {
        return "common.shopcategories";
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
