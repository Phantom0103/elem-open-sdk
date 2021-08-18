## 饿了么零售开放平台SDK
### 简介
饿了么开放平台的SDK都是每个接口单独一个，而且不支持自动重试，也没有超时设置。这个项目主要是想整合所有的API到一个SDK中，实现异常自动重试等功能，简化开发者对接成本。
### 使用说明
下面以查看订单详情（order.get）接口调用为例，分别发起普通调用和自动重试调用：
1. 普通调用
```java
OrderGetRequest request = new OrderGetRequest();
request.setOrderId("5033586381979339461");
OrderGetExecutor executor = new OrderGetExecutor("your appid", "your secret", request);
ElemResponse response = executor.execute();
```
2. 自动重试调用
```java
OrderGetRequest request = new OrderGetRequest();
request.setOrderId("5033586381979339461a");
OrderGetExecutor executor = new OrderGetExecutor("your appid", "your secret", request);
// executor.setConnectTimeout(60000);
// executor.setReadTimeout(60000);

/**
* 默认的重试错误码："gw.ISPInvokeError", "gw.ISPConnectError", "gw.ISPInvokeTimeout"。
* 重试3次，最多执行4次
*/
AutoRetryFeature feature = new AutoRetryFeature(3, 500L, "UNKOWN");
ElemResponse response = executor.execute(feature);
```
### 参考
饿了么零售开放平台：https://open-retail.ele.me/#/apidoc