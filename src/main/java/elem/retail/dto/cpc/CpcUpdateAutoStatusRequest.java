package elem.retail.dto.cpc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-30
 */
@Getter
@Setter
public class CpcUpdateAutoStatusRequest extends BaseElemRequest {

    private static final long serialVersionUID = 505959982235770817L;

    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "auto_status")
    private String autoStatus;
    @JSONField(name = "launch_hours")
    private List<Integer> launchHours;

    @Override
    public String getCmd() {
        return "cpc.updateAutoStatus";
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
