package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-23
 */
@Getter
@Setter
public class ActivityNitemSpecialCreateResult extends ElemResponseData {

    private static final long serialVersionUID = -8234033607159981975L;
    
    @JSONField(name = "activity_id")
    private Long activityId;
}
