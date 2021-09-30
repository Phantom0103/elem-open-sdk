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
public class CpcSetWagerSpeedRequest extends BaseElemRequest {

    private static final long serialVersionUID = 2415565984299796955L;

    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "wager_speed_mode")
    private String wagerSpeedMode;

    @Override
    public String getCmd() {
        return "cpc.setWagerSpeed";
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
