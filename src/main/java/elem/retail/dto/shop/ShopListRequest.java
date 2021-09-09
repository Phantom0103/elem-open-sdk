package elem.retail.dto.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-09
 */
@Getter
@Setter
public class ShopListRequest extends BaseElemRequest {

    private static final long serialVersionUID = -845939192129808202L;

    @JSONField(name = "order_push")
    private String orderPush;
    @JSONField(name = "order_status_push")
    private String orderStatusPush;
    private String status;
    @JSONField(name = "sys_status")
    private String sysStatus;

    @Override
    public String getCmd() {
        return "shop.list";
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
