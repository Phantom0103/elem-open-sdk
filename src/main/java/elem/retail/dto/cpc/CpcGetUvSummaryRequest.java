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
public class CpcGetUvSummaryRequest extends BaseElemRequest {

    private static final long serialVersionUID = 2254710237819173809L;

    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "begin_date")
    private String begin_date;
    @JSONField(name = "end_date")
    private String endDate;

    @Override
    public String getCmd() {
        return "cpc.getUVSummary";
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
