package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActivityNgiftmCreateResult extends ElemResponseData {

    private static final long serialVersionUID = -2686145422160440307L;

    @JSONField(name = "activity_id")
    private Long activityId;
}
