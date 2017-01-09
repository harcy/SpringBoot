package com.sap;

import com.sap.configure.DataSourceConfig;
import com.sap.configure.MybatisConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@MapperScan("com.sap.mapper")
public class BootdemoApplication {

    /*@Autowired
    private DataSourceConfig dataSourceConfig;

    @Autowired
    private MybatisConfig mybatisConfig;

    @Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dataSourceConfig.getDriverClassName());
		dataSource.setUrl(dataSourceConfig.getUrl());
		dataSource.setUsername(dataSourceConfig.getUserName());
		return dataSource;
	}

    @Bean
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(getDataSource());
        sqlSessionFactoryBean.setConfigLocation(new ClassPathXmlApplicationContext().getResource
                (mybatisConfig.getConfigLocation()));
        sqlSessionFactoryBean.setTypeAliasesPackage(mybatisConfig.getTypeAliasesPackage());
        return sqlSessionFactoryBean.getObject();
    }*/

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}
}
