package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-08
 */
@Getter
@Setter
public class ActivityNgiftmSkuListRequest extends BaseElemRequest {

    private static final long serialVersionUID = 7019423954736885226L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "item_id")
    private String itemId;

    private int page = 1;
    @JSONField(name = "page_size")
    private int pageSize = 20;

    @Override
    public String getCmd() {
        return "activity.ngiftm.sku.list";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return activityId == null ? "" : activityId.toString();
    }
}
