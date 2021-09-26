package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-26
 */
@Getter
@Setter
public class BatchSkuUpdateResult extends ElemResponseData {

    private static final long serialVersionUID = -2396450094370931814L;

    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "item_id")
    private String itemId;
    private String tip;

    @JSONField(name = "sku_spec_result")
    private List<SkuSpecResult> skuSpecResults;

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
