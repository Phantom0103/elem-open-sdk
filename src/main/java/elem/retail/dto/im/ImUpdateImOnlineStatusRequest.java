package elem.retail.dto.im;

import com.alibaba.fastjson.JSON;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @date 2022-01-27
 */
@Getter
@Setter
public class ImUpdateImOnlineStatusRequest extends BaseElemRequest {

    private static final long serialVersionUID = 4352419334044162857L;

    private String platformShopId;
    private String status;

    @Override
    public String getCmd() {
        return "im.updateIMOnlineStatus";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return platformShopId;
    }
}
