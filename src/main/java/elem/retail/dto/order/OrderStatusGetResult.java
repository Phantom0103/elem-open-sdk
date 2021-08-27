package elem.retail.dto.order;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
@Getter
@Setter
public class OrderStatusGetResult extends ElemResponseData {

    private static final long serialVersionUID = -6468770439740921552L;

    private int status;
}
