package elem.retail.dto.shop;

import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-09
 */
public class ShopAptitudeGetTypesRequest extends BaseElemRequest {

    private static final long serialVersionUID = 8649370607673260199L;

    @Override
    public String getCmd() {
        return "shop.aptitude.gettypes";
    }

    @Override
    public String getBody() {
        return "{}";
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
