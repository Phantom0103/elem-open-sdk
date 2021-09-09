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
public class ShopOpenRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3784840967750696967L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;

    @Override
    public String getCmd() {
        return "shop.open";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return baiduShopId;
    }
}
