package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuStdupcExistResult extends ElemResponseData {

    private static final long serialVersionUID = -5524493351200573615L;

    private String upc;
    @JSONField(name = "std_flag")
    private int stdFlag;
}
