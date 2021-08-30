package elem.retail.dto.other;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-30
 */
@Getter
@Setter
public class CommonShopCitiesResult extends ElemResponseData {

    private static final long serialVersionUID = -7555991999489572649L;

    @JSONField(name = "city_id")
    private String cityId;
    @JSONField(name = "city_name")
    private String cityName;
    @JSONField(name = "parent_id")
    private String parentId;
    @JSONField(name = "is_open")
    private String isOpen;
}
