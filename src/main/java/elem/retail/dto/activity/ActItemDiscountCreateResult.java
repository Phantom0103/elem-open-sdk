package elem.retail.dto.activity;

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
public class ActItemDiscountCreateResult extends ElemResponseData {

    private static final long serialVersionUID = -1086009053963467629L;

    private Long activityId;
}
