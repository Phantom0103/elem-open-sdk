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
public class ImMessageReadRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1518249325521622949L;

    private String platformShopId;
    private String bizType;
    private String subBizType;

    private Payload payload;

    @Getter
    @Setter
    public static class Payload {
        private String msgId;
    }

    @Override
    public String getCmd() {
        return "im.message.read";
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
