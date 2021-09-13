package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-13
 */
@Getter
@Setter
public class SkuStdupcBarcodeRequest extends BaseElemRequest {

    private static final long serialVersionUID = 4563396788610849555L;

    @JSONField(name = "barcode")
    private List<String> barcodes;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "seller_id")
    private String sellerId;

    @Override
    public String getCmd() {
        return "sku.stdupc.barcode";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
