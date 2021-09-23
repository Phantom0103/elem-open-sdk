package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-23
 */
@Getter
@Setter
public class SkuListRequest extends BaseElemRequest {

    private static final long serialVersionUID = 7792559969490976725L;

    private int page = 1;
    @JSONField(name = "pagesize")
    private int pageSize = 20;

    @JSONField(name = "shop_id")
    private String shopId;
    private String upc;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "upc_type")
    private Integer upcType;
    @JSONField(name = "get_uncate")
    private Integer getUncate;
    private Integer delete;
    private Integer enabled;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    @JSONField(name = "sku_id_offset")
    private Long skuIdOffset;
    @JSONField(name = "include_cate_info")
    private Integer includeCateInfo;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "custom_cat_id")
    private String customCatId;
    @JSONField(name = "cate_id")
    private String cateId;
    @JSONField(name = "include_rank")
    private Integer includeRank;

    @Override
    public String getCmd() {
        return "sku.list";
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
