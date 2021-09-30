package elem.retail.dto.cpc;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-30
 */
@Getter
@Setter
public class CpcGetWagerInformationResult extends ElemResponseData {

    private static final long serialVersionUID = -7461138886061429079L;

    private String status;
    @JSONField(name = "restaurant_id")
    private Long restaurantId;
    private String grade;
    @JSONField(name = "auto_status")
    private String autoStatus;
    @JSONField(name = "launch_hours")
    private String launchHours;
    private String budget;
    @JSONField(name = "wager_speed_mode")
    private String wagerSpeedMode;
}
