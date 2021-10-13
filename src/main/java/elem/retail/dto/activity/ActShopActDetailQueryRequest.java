package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActShopActDetailQueryRequest extends BaseElemRequest {

    private static final long serialVersionUID = 2991887427245675263L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "store_id")
    private String storeId;

    private int page;
    @JSONField(name = "page_size")
    private int pageSize;

    @Override
    public String getCmd() {
        return "act.shopact.detail.query";
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
