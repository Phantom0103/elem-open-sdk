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
public class CpcGetWagerEstimateRequest extends BaseElemRequest {

    private static final long serialVersionUID = 735491646695677065L;

    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    private Double bid;

    @Override
    public String getCmd() {
        return "cpc.getWagerEstimate";
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
