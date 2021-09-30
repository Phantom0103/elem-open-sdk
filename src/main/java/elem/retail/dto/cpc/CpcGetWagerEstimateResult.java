package elem.retail.dto.cpc;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-30
 */
@Getter
@Setter
public class CpcGetWagerEstimateResult extends ElemResponseData {

    private static final long serialVersionUID = 2576285435546107091L;

    @JSONField(name = "estimate_budget")
    private Double estimateBudget;
    @JSONField(name = "restaurant_id")
    private Long restaurantId;
    @JSONField(name = "estimate_click")
    private Integer estimateClick;
}
