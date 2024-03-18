package com.apihug.demo.external.infra.cloud.order;

import javax.annotation.Generated;

/**
 * Reference:
 *
 * @see <a href="https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/#spring-cloud-feign-overriding-defaults">Spring Cloud OpenFeign#Overriding Feign Defaults</a></br>
 * <p>
 * A custom configuration class for the feign client. Can contain override</br>
 * {@code @Bean } definition for the pieces that make up the client, for instance</br>
 * {@link feign.codec.Decoder}, {@link feign.codec.Encoder}, {@link feign.Contract}.</br>
 * <p>
 * You does not need to be annotated with {@code @Configuration}.</br>
 * However, if it is,then take care to exclude it from any {@code @ComponentScan} that</br>
 * would otherwise include this configuration as it will become the default source for {@link feign.codec.Decoder}, {@link feign.codec.Encoder}, {@link feign.Contract}, etc.,</br>
 * <p>
 * when specified. This can be avoided by putting it in a separate, non-overlapping package from any {@code @ComponentScan} or {@code @SpringBootApplication}, or it can be explicitly excluded in {@code @ComponentScan}.
 * <p>
 * </br>
 * Tips:</br></br>
 * <code>
 * Do not use @Configuration annotation as it would apply to all Feign clients
 * unless we exclude the package from @ComponentScan or putting it in a separate,
 * non-overlapping package from any @ComponentScan or @SpringBootApplication.
 * </code>
 * @see org.springframework.cloud.openfeign.FeignClient
 * @see org.springframework.cloud.openfeign.FeignAutoConfiguration
 * @see org.springframework.cloud.openfeign.EnableFeignClients
 */
@Generated("H.O.P.E. Infra Team")
public class DemoOrderConfiguration {
    //I turned this should not be overwrite
}
