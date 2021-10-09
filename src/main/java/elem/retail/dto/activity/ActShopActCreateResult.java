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
public class ActShopActCreateResult extends ElemResponseData {

    private static final long serialVersionUID = 8496433113318601924L;

    private Long activityId;
}
