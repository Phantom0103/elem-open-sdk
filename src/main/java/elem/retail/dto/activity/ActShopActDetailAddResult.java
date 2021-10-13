package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActShopActDetailAddResult extends ElemResponseData {

    private static final long serialVersionUID = 535953569961507118L;

    private Long activityId;

    @JSONField(name = "detailFailList")
    private List<DetailFail> detailFails;

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
