# 现在开始

[English](./README.md) | [简体中文](./README_cn.md)

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