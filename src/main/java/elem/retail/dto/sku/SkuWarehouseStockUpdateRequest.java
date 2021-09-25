package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-25
 */
@Getter
@Setter
public class SkuWarehouseStockUpdateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -7759223439491471661L;

    @JSONField(name = "left_num")
    private Integer leftNum;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_code")
    private String storeCode;
    private String upc;

    @Override
    public String getCmd() {
        return "sku.warehouse.stock.update";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return upc;
    }
}
