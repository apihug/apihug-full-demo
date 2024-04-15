package com.apihug.demo.user.wire.domain.bootstrap.config;

import hope.common.spring.data.persistence.spring.HopeJdbcRepository;
import hope.common.spring.data.persistence.converter.HopeListConverters;
import hope.common.spring.data.persistence.config.HopeAbstractJdbcConfiguration;
import hope.common.spring.data.persistence.config.ColumnTypeMapper;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.env.Environment;
import org.springframework.data.jdbc.repository.config.DialectResolver;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.data.relational.core.mapping.RelationalPersistentProperty;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.TransactionManager;

@AutoConfigureBefore(
    value = {JdbcRepositoriesAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
@Configuration
@EnableJdbcRepositories(
    jdbcOperationsRef = "_HPP_user_namedParameterJdbcTemplate",
    transactionManagerRef = "_HPP_user_transactionManager",
    basePackages = { "com.apihug.demo.user.wire.domain.bootstrap","com.apihug.demo.user.wire.domain.repository" },
    repositoryBaseClass = HopeJdbcRepository.class)
public class UserJdbcConfiguration extends HopeAbstractJdbcConfiguration {

  public static final String NAMED_PARAMETER_JDBC_TEMPLATE = "_HPP_user_namedParameterJdbcTemplate";
  public static final String JDBC_TEMPLATE = "_HPP_user_jdbcTemplate";
  public static final String TRANSACTION_MANAGER = "_HPP_user_transactionManager";
  public static final String MYBATIS_JDBC_TEMPLATE = "_HPP_user_myBatisJdbcTemplate";

  
  @Autowired
  protected DataSource dataSource;

  @Autowired protected Environment environment;

  @Autowired protected JdbcProperties properties;

  @Primary
  // is Primary
  @Bean
  public UserPersistenceContext persistenceContext() {
    return new UserPersistenceContext();
  }

  @Primary
  // is Primary
  @Bean(name = { "_HPP_user_namedParameterJdbcTemplate", "namedParameterJdbcTemplate" })
  public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
    return new NamedParameterJdbcTemplate(jdbcTemplate());
  }

  @Primary
  // is Primary
  @Bean(name = { "_HPP_user_jdbcTemplate", "jdbcTemplate" })
  public JdbcTemplate jdbcTemplate() {

    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    JdbcProperties.Template template = properties.getTemplate();
    jdbcTemplate.setFetchSize(template.getFetchSize());
    jdbcTemplate.setMaxRows(template.getMaxRows());
    if (template.getQueryTimeout() != null) {
      jdbcTemplate.setQueryTimeout((int) template.getQueryTimeout().getSeconds());
    }

    return jdbcTemplate;
  }

  @Primary
  // is Primary
  @Bean(name = { "_HPP_user_dialect", "dialect" })
  public Dialect dialect() {
    return DialectResolver.getDialect(jdbcTemplate());
  }

  @Primary
  // is Primary
  @Bean(name = { "_HPP_user_transactionManager", "transactionManager" })
  public DataSourceTransactionManager transactionManager(
      ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {

    final DataSourceTransactionManager transactionManager =
        createTransactionManager(environment, dataSource);
    transactionManagerCustomizers.ifAvailable(
        (customizers) -> customizers.customize((TransactionManager)transactionManager));
    return transactionManager;
  }

  private DataSourceTransactionManager createTransactionManager(
      final Environment environment, final DataSource dataSource) {
    return environment.getProperty(
            "spring.dao.exceptiontranslation.enabled", Boolean.class, Boolean.TRUE)
        ? new JdbcTransactionManager(dataSource)
        : new DataSourceTransactionManager(dataSource);
  }

  @Primary
  // is Primary
  // Mybatis dynamic SQL is used for complex analyst SQL
  @ConditionalOnClass(
      name = "org.mybatis.dynamic.sql.util.spring.NamedParameterJdbcTemplateExtensions")
  @Bean(name = { "_HPP_user_myBatisJdbcTemplate", "myBatisJdbcTemplate" })
  public org.mybatis.dynamic.sql.util.spring.NamedParameterJdbcTemplateExtensions
      myBatisJdbcTemplate() {
    return new org.mybatis.dynamic.sql.util.spring.NamedParameterJdbcTemplateExtensions(
        namedParameterJdbcTemplate());
  }

  @Override
  protected List<?> userConverters() {
    final List<Converter> res  = new ArrayList<>();
    final List<Converter> _exists = HopeListConverters.getConvertersToRegister();
    res.addAll(_exists);
    final List<Converter> _custom = com.apihug.demo.user.wire.domain.bootstrap.converter.UserConverters.getConvertersToRegister();
    res.addAll(_custom);
    return res;
  }

  //Those for the customized DB table column type mapper
  public interface UserColumnTypeMapper extends ColumnTypeMapper {
      UserColumnTypeMapper DEFAULT =
          new UserColumnTypeMapper() {
            @Override
            public Class<?> getColumnType(
                RelationalPersistentProperty property) {
              return UserColumnTypeMapper.super.getColumnType(property);
            }
          };
  }
  @Autowired(required = false)
  protected UserColumnTypeMapper _mapper  = UserColumnTypeMapper.DEFAULT;

  @Override
  protected ColumnTypeMapper columnTypeMapper() {
      return _mapper;
  }
}