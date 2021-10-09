package elem.retail.dto.activity;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-09
 */
@Getter
@Setter
public class ActXdiscountyCreateResult extends ElemResponseData {

    private static final long serialVersionUID = 7356212629897683089L;

    private Long activityId;
}
