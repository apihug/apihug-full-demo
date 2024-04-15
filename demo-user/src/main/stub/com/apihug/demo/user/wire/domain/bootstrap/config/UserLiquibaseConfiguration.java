package com.apihug.demo.user.wire.domain.bootstrap.config;

import hope.common.async.GlobalExecutorService;
import hope.common.spring.data.liquibase.AbstractLiquibaseConfiguration;
import javax.sql.DataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;

import java.util.List;

@ConditionalOnProperty(prefix = "spring.liquibase", name = "enabled", matchIfMissing = false)
@Configuration
@AutoConfigureBefore(
    name = "org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration")
@EnableConfigurationProperties(LiquibaseProperties.class)
public class UserLiquibaseConfiguration extends AbstractLiquibaseConfiguration {

  @Autowired protected LiquibaseProperties liquibaseProperties;

  
  @Autowired
  protected DataSource dataSource;

  
  @Autowired
  protected DataSourceProperties dataSourceProperties;

  @Autowired(required = false)
  @Lazy
  protected List<Customizer> customizers;

  public UserLiquibaseConfiguration(Environment env) {
    super(env);
  }

  @Override
  protected String domain() {
    return "user";
  }

  @Bean
  public SpringLiquibase springLiquibase() {

    final Customizer customizer =
            (liquibase, domain) -> {
              if (customizers != null) {
                customizers.forEach(it -> it.customize(liquibase, domain));
              }
              liquibase.setChangeLog("classpath:liquibase/user/master.xml");
            };

    return liquibase(
        GlobalExecutorService.INSTANCE.EXECUTOR,
        dataSource,
        dataSourceProperties,
        liquibaseProperties,
        customizer);
  }
}