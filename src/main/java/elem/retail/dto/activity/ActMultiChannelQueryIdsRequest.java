package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-12
 */
@Getter
@Setter
public class ActMultiChannelQueryIdsRequest extends BaseElemRequest {

    private static final long serialVersionUID = -4388536159920176142L;

    @JSONField(name = "query_activity_type")
    private String queryActivityType;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "store_id")
    private String storeId;

    private int page = 1;
    @JSONField(name = "page_size")
    private int pageSize = 20;

    @Override
    public String getCmd() {
        return "act.multi.channel.queryids";
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
