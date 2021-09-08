package elem.retail.dto.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-08
 */
public class ShopIdBatchUpdateRequest extends BaseElemRequest {

    private static final long serialVersionUID = 6350011879130456938L;

    @JSONField(name = "baidu_shop_ids")
    private List<String> baiduShopIds;
    @JSONField(name = "shop_ids")
    private List<String> shopIds;

    @Override
    public String getCmd() {
        return "shop.id.batchupdate";
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
