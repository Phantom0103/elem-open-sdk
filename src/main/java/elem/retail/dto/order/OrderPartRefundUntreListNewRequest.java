package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-25
 */
@Getter
@Setter
public class OrderPartRefundUntreListNewRequest extends BaseElemRequest {

    private static final long serialVersionUID = -2884792280608926529L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    private int page = 1;

    @Override
    public String getCmd() {
        return "order.partrefund.untrelist.new";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return this.getBaiduShopId();
    }
}
