package elem.retail.dto.im;

import com.elem.retail.api.ElemResponseData;

/**
 * @author zhouw
 * @date 2022-01-27
 */
public class ImGetImStatusResult extends ElemResponseData {

    private static final long serialVersionUID = -5025506696369174141L;

    private String imStatus;

    public String getImStatus() {
        return imStatus;
    }

    public void setImStatus(String imStatus) {
        this.imStatus = imStatus;
    }
}
