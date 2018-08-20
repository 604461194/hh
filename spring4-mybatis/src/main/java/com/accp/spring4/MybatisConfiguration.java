package com.accp.spring4;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.github.pagehelper.PageHelper;


@MapperScan({"com.accp.spring4.mapper"})
@PropertySource({"database.properties"})
public class MybatisConfiguration {
	//用于读取*.properties文件，对象由Spring注入
	@Autowired
	private Environment env;
	/**
	 * 声明数据源
	 * @return
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(driverClassName);
//		dataSource.setUrl(url);
//		dataSource.setUsername(name);
//		dataSource.setPassword(password);
		dataSource.setDriverClassName(env.getProperty("driverClassName"));
		dataSource.setUrl(env.getProperty("url"));
		dataSource.setUsername(env.getProperty("name"));
		dataSource.setPassword(env.getProperty("password"));
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		//设置别名包
		factoryBean.setTypeAliasesPackage("com.accp.spring4.entity");
		//读取mybatis的xml配置文件
//		factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));

		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties(); 
		properties.setProperty("dialect", "mysql"); 
//		properties.setProperty("reasonable", "true"); 
//		properties.setProperty("supportMethodsArguments", "true"); 
//		properties.setProperty("returnPageInfo", "check"); 
//		properties.setProperty("params", "count=countSql"); 
		pageHelper.setProperties(properties);
//		//添加分页插件
		factoryBean.setPlugins(new Interceptor[]{ pageHelper});
		return factoryBean;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
}
