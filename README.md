# Getting Started

[English](./README.md) | [简体中文](./README_cn.md)

## Quick Build

### 0. Build All

```shell - windows
#windows
./gradlew.bat clean build -x test -x wireTest -x stubTest
```

```shell - other
#others
sh gradlew clean build -x test -x wireTest -x stubTest
```

### 1. Build Wire (Individual Optional)

```shell - windows
#windows
./gradlew.bat demo-order-proto:clean wire build -x test -x wireTest
```
```shell - others
#others
sh gradlew demo-order-proto:clean wire build -x test -x wireTest
```

### 2. Build Stub (Individual)

Everytime you update application's dependence proto libraries, please run this command to re-generate your stubs.

```shell - windows
#windows
./gradlew.bat demo-order:clean stub build -x test -x stubTest
```

```shell - others
#others
sh gradlew demo-order:clean stub build -x test -x stubTest
```

### 3. Run Application

```shell - windows
#windows
./gradlew.bat demo-order:bootRun
``` 

```shell - others
#others
sh gradlew demo-order:bootRun
``` 

👍Then just kick off the application, in logger output you will find:

```shell
Application 'demo-order' is running! Access URLs:

	Local                             http://localhost:18189/                                         
	External                          http://192.168.0.1:18189/                                        
	OAS                               http://192.168.0.1:18189/v3/api-docs                             
	Actuator                          http://192.168.0.1:18189/management                              
	Profile(s)                        dev    
```

🥳 Congratulations! You have successfully started your application!

## Reference Documentation

For further reference, please consider the following sections:

1. [Apihug.com Git](https://github.com/apihug/apihug.com/)
2. [Apihug Wire Plugin](https://github.com/apihug/apihug.com/blob/master/docs/handbook/004_dsl_implement_wire.md)
3. [Apihug Stub Plugin](https://github.com/apihug/apihug.com/blob/master/docs/handbook/005_dsl_implement_stub.md)
4. [Apihug Trivial](https://github.com/apihug/apihug.com/blob/master/docs/handbook/099_trivial.md)
5. [Apihug FAQ](https://github.com/apihug/apihug.com/blob/master/docs/handbook/999_faq.md)
6. [Official Gradle documentation](https://docs.gradle.org)
7. [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.0/gradle-plugin/reference/html/)