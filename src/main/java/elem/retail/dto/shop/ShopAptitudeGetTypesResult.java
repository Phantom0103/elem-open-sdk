package elem.retail.dto.shop;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-09
 */
@Getter
@Setter
public class ShopAptitudeGetTypesResult extends ElemResponseData {

    private static final long serialVersionUID = -5871507481071898873L;

    private Integer id;
    private String name;

    @JSONField(name = "child")
    private List<Child> childList;

    @Getter
    @Setter
    public static class Child {
        private Integer id;
        private String name;
    }
}
