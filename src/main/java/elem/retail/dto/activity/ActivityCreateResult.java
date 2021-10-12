package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-12
 */
@Getter
@Setter
public class ActivityCreateResult extends ElemResponseData {

    private static final long serialVersionUID = -8431407462330453044L;

    @JSONField(name = "activity_id")
    private Long activityId;
}
