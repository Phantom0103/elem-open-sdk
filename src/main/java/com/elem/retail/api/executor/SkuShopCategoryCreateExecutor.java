package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuShopCategoryCreateRequest;
import elem.retail.dto.sku.SkuShopCategoryCreateResult;

import java.io.Serializable;

/**
 * 店铺内分类：是商家自己对每个门店自定义的一套前台类目，用于展示给消费者。提供给合作方新增商家自定义分类所用。分类限制规则：
 * 1. 商品分类目前只支持两级分类；
 * 2. 一级分类的数量上限是50个；
 * 3. 二级分类的数量上限是20个；
 * 4. 叶子分类下的商品上线是1000个。
 *
 * @author zhouw
 * @description 新增店铺内分类
 * @date 2021-09-27
 */
public class SkuShopCategoryCreateExecutor extends ElemApiExecutor {

    private SkuShopCategoryCreateRequest request;

    public SkuShopCategoryCreateExecutor(String appid, String secret, SkuShopCategoryCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuShopCategoryCreateResult.class;
    }
}
