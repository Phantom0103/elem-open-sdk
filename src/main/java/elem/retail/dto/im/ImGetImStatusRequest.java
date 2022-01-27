package elem.retail.dto.im;

import com.alibaba.fastjson.JSON;
import com.elem.retail.api.BaseElemRequest;

/**
 * @author zhouw
 * @date 2022-01-27
 */
public class ImGetImStatusRequest extends BaseElemRequest {

    private static final long serialVersionUID = -7508390133064687516L;

    private String platformShopId;

    @Override
    public String getCmd() {
        return "im.getIMStatus";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return platformShopId;
    }

    public String getPlatformShopId() {
        return platformShopId;
    }

    public void setPlatformShopId(String platformShopId) {
        this.platformShopId = platformShopId;
    }
}
