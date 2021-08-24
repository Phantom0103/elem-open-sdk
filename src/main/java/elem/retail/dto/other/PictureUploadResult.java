package elem.retail.dto.other;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-24
 */
@Getter
@Setter
public class PictureUploadResult extends ElemResponseData {

    private static final long serialVersionUID = 5800000322536040447L;

    private String url;

    @JSONField(name = "water_url")
    private String waterUrl;
}
