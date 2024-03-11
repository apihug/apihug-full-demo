# 现在开始

[English](./README.md) | [简体中文](./README_cn.md)

## 完整示范

1. ApiHug 如何运作
2. 开发模型(单例-微服务)

本项目的 proto 包已发行到maven 库: <a target="_blank" href="https://search.maven.org/artifact/com.apihug/demo-user-proto"><img src="https://img.shields.io/maven-central/v/com.apihug/demo-user-proto.svg?label=Maven%20Central" /></a>

💝 SDK 版本： <a target="_blank" href="https://search.maven.org/artifact/com.apihug/it-bom"><img src="https://img.shields.io/maven-central/v/com.apihug/it-bom.svg?label=Maven%20Central" /></a>， 注意 Apihug 采用整包发行， Gradle plugin + 基础包公用一个版本。

💝 IDEA 插件： [ApiHug - API design Copilot](https://plugins.jetbrains.com/plugin/23534-apihug--api-design-copilot)  &nbsp;&nbsp; [Plugin Handbook](./docs/IDE/README.md)  &nbsp;&nbsp; [Plugin FAQ](./docs/IDE/999_FAQ.md)  &nbsp;&nbsp;   ![Rating](https://img.shields.io/jetbrains/plugin/r/rating/23534-apihug--api-design-copilot) ![Downloads](https://img.shields.io/jetbrains/plugin/d/23534-apihug--api-design-copilot)


😆 视频教程：

1. [ApiHug101-Bilibili](https://www.bilibili.com/video/BV1KK421k7J8/)
2. [ApiHug101 Youtube](https://youtube.com/@ApiHug?si=C1yw0poHA01zbmyj)

## 快速构建

### 0. 整体构建项目

```shell - windows
#windows
./gradlew.bat clean build -x test -x wireTest -x stubTest
```

```shell - others
#others
sh gradlew clean build -x test -x wireTest -x stubTest
```

### 1. 单独构建 Wire(协议) (可选)

```shell - windows
#windows
./gradlew.bat demo-order-proto:clean wire build -x test -x wireTest
```
```shell - others
#others
./gradlew.bat demo-order-proto:clean wire build -x test -x wireTest
```

### 2. 单独构建 Stub(应用)

每次修改了应用的依赖协议(自己、第三方)，都要重新跑下这个命令，重新生成 stubs。


```shell - windows
#windows
./gradlew.bat demo-order:clean stub build -x test -x stubTest
```

```shell - others
#others
sh gradlew demo-order:clean stub build -x test -x stubTest
```

### 3. 启动应用

```shell - windows
#windows
./gradlew.bat demo-order:bootRun
``` 
```shell - others
#others
sh gradlew demo-order:bootRun
``` 

👍 跑完上面命令后，在控制台可以发现输出如下:

```shell
Application 'demo-order' is running! Access URLs:

	Local                             http://localhost:18189/                                         
	External                          http://192.168.0.1:18189/                                        
	OAS                               http://192.168.0.1:18189/v3/api-docs                             
	Actuator                          http://192.168.0.1:18189/management                              
	Profile(s)                        dev    
```

🥳 恭喜! 开启您愉悦的开发之旅吧!

## 参考

更多内容敬请参考:

1. [Apihug.com Git官方](https://github.com/apihug/apihug.com/)
2. [Apihug Wire 插件](https://github.com/apihug/apihug.com/blob/master/docs/handbook/004_dsl_implement_wire.md)
3. [Apihug Stub 插件](https://github.com/apihug/apihug.com/blob/master/docs/handbook/005_dsl_implement_stub.md)
4. [Apihug 其他](https://github.com/apihug/apihug.com/blob/master/docs/handbook/099_trivial.md)
5. [Apihug FAQ](https://github.com/apihug/apihug.com/blob/master/docs/handbook/999_faq.md)
6. [Gradle 官方文档](https://docs.gradle.org)
7. [Spring Boot Gradle 插件参考](https://docs.spring.io/spring-boot/docs/3.2.0/gradle-plugin/reference/html/)
8. [ApiHug - API设计助手IDEA插件](https://plugins.jetbrains.com/plugin/23534-apihug--api-design-copilot)
9. [ApiHug - IDEA FAQ](https://github.com/apihug/apihug.com/blob/master/docs/IDE/999_FAQ.md)
10. [ApiHug - IDEA 手册](https://github.com/apihug/apihug.com/blob/master/docs/IDE/README.md)