package elem.retail.dto.order;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
@Getter
@Setter
public class OrderQueryAcceptanceCodeResult extends ElemResponseData {

    private static final long serialVersionUID = -8019777734644397973L;

    private List<String> rcodes;
}
