package elem.retail.dto.ugc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-19
 */
@Getter
@Setter
public class UgcReplyRequest extends BaseElemRequest {

    private static final long serialVersionUID = 8368710323605842151L;

    @JSONField(name = "comment_id")
    private Long commentId;
    private String content;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "shop_id")
    private String shopId;

    @Override
    public String getCmd() {
        return "ugc.reply";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return this.getCommentId() + "";
    }
}
