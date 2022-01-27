package elem.retail.dto.im;

import com.elem.retail.api.ElemResponseData;

/**
 * @author zhouw
 * @date 2022-01-27
 */
public class ImGetImOnlineStatusResult extends ElemResponseData {

    private static final long serialVersionUID = 4033548492491732482L;

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
