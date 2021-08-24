package elem.retail.dto.ugc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-23
 */
@Getter
@Setter
public class UgcOrderCommentGetRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1278311967484118276L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "reply_status")
    private String replyStatus;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    private int page = 1;


    @Override
    public String getCmd() {
        return "ugc.ordercomment.get";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return StringUtils.isBlank(baiduShopId) ? shopId : baiduShopId;
    }
}
