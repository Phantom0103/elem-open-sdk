## 饿了么零售开放平台SDK
### 简介
饿了么开放平台的SDK都是每个接口单独一个，而且不支持自动重试，也没有超时设置。这个项目主要是想整合所有的API到一个SDK中，实现异常自动重试等功能，简化开发者对接成本。
### 使用说明
导入依赖包：  
maven
```maven
<dependency>
  <groupId>io.github.phantom0103</groupId>
  <artifactId>elem-open-sdk</artifactId>
  <version>2.4.0</version>
</dependency>
```
gradle
```gradle
implementation 'io.github.phantom0103:elem-open-sdk:2.4.0'
```
下面以查看订单详情（order.get）接口调用为例，分别发起普通调用和自动重试调用：
1. 普通调用
```java
OrderGetRequest request = new OrderGetRequest();
request.setOrderId("5033586381979339461");
OrderGetExecutor executor = new OrderGetExecutor("your appid", "your secret", request);
ElemResponse response = executor.execute();

if (ElemConstants.OK_CODE.equals(response.getCode())) {
    OrderGetResult order = (OrderGetResult) response.getData();
    System.out.println(JSON.toJSONString(order));
} else {
    System.out.println(response.getMessage());
}
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
AutoRetryFeature feature = new AutoRetryFeature(3, 500L, "gw.UNKOWN");
ElemResponse response = executor.execute(feature);

if (ElemConstants.OK_CODE.equals(response.getCode())) {
    OrderGetResult order = (OrderGetResult) response.getData();
    System.out.println(JSON.toJSONString(order));
} else {
    System.out.println(response.getMessage());
}
```
3. 带勾子的调用
```java
OrderGetRequest request = new OrderGetRequest();
request.setOrderId("5033586381979339461");
OrderGetExecutor executor = new OrderGetExecutor("your appid", "your secret", request);
executor.setHook(new ElemApiHook() {
    @Override
    public void doBeforeRequest(String ticket, ElemRequest request) {
        System.out.println("开始执行: " + ticket);
    }

    @Override
    public void doAfterResponse(String ticket, ElemRequest request, HttpResponseData responseData) {
        System.out.println("ticket: " + ticket + ", " + responseData.getBody());
    }
});
ElemResponse response = executor.execute();

if (ElemConstants.OK_CODE.equals(response.getCode())) {
    OrderGetResult order = (OrderGetResult) response.getData();
    System.out.println(JSON.toJSONString(order));
} else {
    System.out.println(response.getMessage());
}
```
### 参考
饿了么零售开放平台：https://open-retail.ele.me/#/apidoc