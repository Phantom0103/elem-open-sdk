package elem.retail.dto.shop;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-09
 */
@Getter
@Setter
public class ShopAnnouncementGetResult extends ElemResponseData {

    private static final long serialVersionUID = 4192048002770950254L;

    private String content;
    private String description;
}
