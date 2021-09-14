package elem.retail.dto.sku;

import com.elem.retail.api.ElemResponseData;

/**
 * @author zhouw
 * @description
 * @date 2021-09-14
 */
public class SkuUploadRtfResult extends ElemResponseData {

    private static final long serialVersionUID = -1566514687935172377L;

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
