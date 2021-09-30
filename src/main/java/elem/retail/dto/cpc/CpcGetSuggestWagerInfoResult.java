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
public class CpcGetSuggestWagerInfoResult extends ElemResponseData {

    private static final long serialVersionUID = 4784123539596773997L;

    @JSONField(name = "estimate_budget")
    private Double estimateBudget;
    @JSONField(name = "recommend_bid")
    private Double recommendBid;
    @JSONField(name = "estimate_click")
    private Integer estimateClick;
}
