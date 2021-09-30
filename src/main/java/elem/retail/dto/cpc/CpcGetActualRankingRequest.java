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
public class CpcGetActualRankingRequest extends BaseElemRequest {

    private static final long serialVersionUID = 2946865298329887509L;

    @JSONField(name = "platform_shop_id")
    private String platformShopId;

    @Override
    public String getCmd() {
        return "cpc.getActualRanking";
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
