package elem.retail.dto.other;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-30
 */
@Getter
@Setter
public class CommonLpdspUpdstatusResult extends ElemResponseData {

    private static final long serialVersionUID = -614228567842452377L;

    private boolean success;
    private String resultCode;
    private String resultMsg;
    private Map extData;
}
