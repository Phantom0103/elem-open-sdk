package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuStdupcExistRequest extends BaseElemRequest {

    private static final long serialVersionUID = 4501822148134535900L;

    @JSONField(name = "shop_id")
    private String shopId;
    private String upc;

    @Override
    public String getCmd() {
        return "sku.stdupc.exist";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return upc;
    }
}
