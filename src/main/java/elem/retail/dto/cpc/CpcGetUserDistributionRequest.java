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
public class CpcGetUserDistributionRequest extends BaseElemRequest {

    private static final long serialVersionUID = -4916901615506514880L;

    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    private String date;

    @Override
    public String getCmd() {
        return "cpc.getUserDistribution";
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
