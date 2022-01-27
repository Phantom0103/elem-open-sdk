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
public class ImUpdateImStatusRequest extends BaseElemRequest {

    private static final long serialVersionUID = 7035300117095833020L;

    private String platformShopId;
    private String status;

    @Override
    public String getCmd() {
        return "im.updateIMStatus";
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
