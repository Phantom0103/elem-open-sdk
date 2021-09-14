package elem.retail.dto.sku;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-14
 */
@Getter
@Setter
public class SkuUploadRtfRequest extends BaseElemRequest {

    private static final long serialVersionUID = -7455304567784799058L;
    
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "rtf_detail")
    private String rtfDetail;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;

    @Override
    public String getCmd() {
        return "sku.uploadrtf";
    }

    @Override
    public String getBody() {
        return JSONObject.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
