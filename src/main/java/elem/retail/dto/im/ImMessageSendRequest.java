package elem.retail.dto.im;

import com.alibaba.fastjson.JSON;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @date 2022-01-27
 */
@Getter
@Setter
public class ImMessageSendRequest extends BaseElemRequest {

    private static final long serialVersionUID = -4592982863899303760L;

    private String platformShopId;
    private String bizType;
    private String subBizType;

    private Payload payload;

    @Getter
    @Setter
    public static class Payload {
        private String groupId;
        private String msgId;
        private List<String> receiverIds;
        private String content;
        private String contentType;
    }

    @Override
    public String getCmd() {
        return "im.message.send";
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
