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
public class ShopAnnouncementGetRequest extends BaseElemRequest {

    private static final long serialVersionUID = -7978581177413029369L;
    
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;

    @Override
    public String getCmd() {
        return "shop.announcement.get";
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
