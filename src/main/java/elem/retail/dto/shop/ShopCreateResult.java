package elem.retail.dto.shop;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-24
 */
public class ShopCreateResult extends ElemResponseData {

    private static final long serialVersionUID = -3875046613496701878L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;

    public String getBaiduShopId() {
        return baiduShopId;
    }

    public void setBaiduShopId(String baiduShopId) {
        this.baiduShopId = baiduShopId;
    }
}
