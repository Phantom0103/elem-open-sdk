package com.alibaba.ocean.rawsdk.example;

import java.util.UUID;

import com.alibaba.fastjson.JSON;
import com.alibaba.ocean.rawsdk.ApiExecutor;
import com.alibaba.ocean.rawsdk.common.BizResultWrapper;
import com.alibaba.ocean.rawsdk.example.param.CBCRequestBody;
import com.alibaba.ocean.rawsdk.example.param.CommonBusinessCatParam;
import com.alibaba.ocean.rawsdk.example.param.CommonBusinessCatResult;

/**
 *
 */
public class SdkExample {

    public static void main(String[] args) {
        // 初始化引擎类
        String appkey = "填写自己的APP ID";
        String secKey = "填写自己的APP Secret";
        ApiExecutor apiExecutor = new ApiExecutor(appkey, secKey);

        // 组装业务参数，此处的CommonBusinessCatParam需要替换相应的XXXXParam类
        CommonBusinessCatParam param = new CommonBusinessCatParam();
        param.setTicket(UUID.randomUUID().toString().toUpperCase());

        Integer category_id = 166;
        // 此处的CBCRequestBody需要替换为相应的XXXXBody
        CBCRequestBody body = new CBCRequestBody();
        body.setCategory_id(category_id);
        param.setBody(body);

        /**
         * 调用接口获取结果
         */
        try {
            // 此处的CommonBusinessCatResult需要替换相应的XXXXResult
            BizResultWrapper<CommonBusinessCatResult> result = apiExecutor.send(param);
            System.out.println("Result:" + JSON.toJSONString(result));
            if (null == result.getBody()) {
                System.out.println("返回数据中对象为空");
                return;
            }
            if (!result.isSuccess()) {
                System.out.println("--请求结果失败--");
            } else {
                System.out.println("请求成功");
            }
        } catch (Exception e) {
            System.out.println("请求失败，请求异常");
            System.out.println(e);
        }

    }

}
