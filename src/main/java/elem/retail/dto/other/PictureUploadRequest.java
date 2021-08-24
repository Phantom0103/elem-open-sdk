package elem.retail.dto.other;

import com.alibaba.fastjson.JSON;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-24
 */
@Getter
@Setter
public class PictureUploadRequest extends BaseElemRequest {

    private static final long serialVersionUID = -5253093705336318513L;

    private String url;
    private String data;
    private String type;

    @Override
    public String getCmd() {
        return "picture.upload";
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
