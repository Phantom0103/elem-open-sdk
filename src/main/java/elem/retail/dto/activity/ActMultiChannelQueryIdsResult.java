package elem.retail.dto.activity;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-12
 */
@Getter
@Setter
public class ActMultiChannelQueryIdsResult extends ElemResponseData {

    private static final long serialVersionUID = 3116761276192333502L;

    private Integer total;
    private List<Long> activityIdList;
}
