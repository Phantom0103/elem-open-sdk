package elem.retail.dto.cpc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-30
 */
@Getter
@Setter
public class CpcGetResidueDegreeRequest extends BaseElemRequest {

    private static final long serialVersionUID = 5982352443996418445L;

    @JSONField(name = "platform_shop_id")
    private String platformShopId;

    @Override
    public String getCmd() {
        return "cpc.getResidueDegree";
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
