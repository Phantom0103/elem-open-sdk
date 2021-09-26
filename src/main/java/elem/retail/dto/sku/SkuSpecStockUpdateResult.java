package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-26
 */
@Getter
@Setter
public class SkuSpecStockUpdateResult extends ElemResponseData {

    private static final long serialVersionUID = 7851380410320577982L;

    @JSONField(name = "sku_id")
    private String skuId;
}
