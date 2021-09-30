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
public class CpcGetUserDistributionResult extends ElemResponseData {

    private static final long serialVersionUID = -3401898166779979479L;

    private String date;
    @JSONField(name = "active_click_count")
    private Integer activeClickCount;
    @JSONField(name = "in_active_click_count")
    private Integer inActiveClickCount;
    @JSONField(name = "new_click_count")
    private Integer newClickCount;
    @JSONField(name = "lost_click_count")
    private Integer lostClickCount;
}
