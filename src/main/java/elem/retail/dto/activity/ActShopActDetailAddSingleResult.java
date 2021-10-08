package elem.retail.dto.activity;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-08
 */
@Getter
@Setter
public class ActShopActDetailAddSingleResult extends ElemResponseData {

    private static final long serialVersionUID = 2745570860535111800L;

    private Long activityId;

    private List<DetailFail> detailFailList;

    @Getter
    @Setter
    public static class DetailFail {
        private String failCode;
        private String failReason;
        private String wid;
        private String customShopId;
        private String storeId;
    }
}
