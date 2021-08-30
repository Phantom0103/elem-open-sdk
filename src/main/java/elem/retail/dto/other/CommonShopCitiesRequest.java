package elem.retail.dto.other;

import com.alibaba.fastjson.JSON;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-30
 */
@Getter
@Setter
public class CommonShopCitiesRequest extends BaseElemRequest {

    private static final long serialVersionUID = -4004402722117101513L;

    private int pid;
    private int level;

    @Override
    public String getCmd() {
        return "common.shopcities";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
