package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuShopCategoryGetRequest;
import elem.retail.dto.sku.SkuShopCategoryGetResult;

import java.io.Serializable;

/**
 * 获取店铺内分类，店铺内分类有一级和二级两个层级。
 * 1. 商品分类目前只支持两级分类；
 * 2. 一级分类的数量上限是50个；
 * 3. 二级分类的数量上限是20个；
 * 4. 叶子分类下的商品上线是1000个。
 *
 * @author zhouw
 * @description 获取店铺内分类
 * @date 2021-09-27
 */
public class SkuShopCategoryGetExecutor extends ElemApiExecutor {

    private SkuShopCategoryGetRequest request;

    public SkuShopCategoryGetExecutor(String appid, String secret, SkuShopCategoryGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuShopCategoryGetResult.class;
    }
}
