package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-14
 */
@Getter
@Setter
public class SkuSpecUpdateAppendResult extends ElemResponseData {

    private static final long serialVersionUID = -8029841507515835135L;

    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "item_id")
    private String itemId;
    private String tip;

    @Getter
    @Setter
    public static class SkuSpecResult {
        private String upc;
        @JSONField(name = "sku_spec_id")
        private String skuSpecId;
        @JSONField(name = "sku_spec_custom_id")
        private String skuSpecCustomId;
    }
}
