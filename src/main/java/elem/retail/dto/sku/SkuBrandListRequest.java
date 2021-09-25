package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-25
 */
@Getter
@Setter
public class SkuBrandListRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1586877391723674602L;

    @JSONField(name = "cat3_id")
    private Long cat3Id;
    private String keyword;
    private int page = 1;

    @Override
    public String getCmd() {
        return "sku.brand.list";
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
