package elem.retail.dto.im;

import com.alibaba.fastjson.JSON;
import com.elem.retail.api.BaseElemRequest;

/**
 * 获取门店IM线上状态
 *
 * @author zhouw
 * @date 2022-01-27
 */
public class ImGetImOnlineStatusRequest extends BaseElemRequest {

    private static final long serialVersionUID = 7730031160284653360L;

    private String platformShopId;

    @Override
    public String getCmd() {
        return "im.getIMOnlineStatus";
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
