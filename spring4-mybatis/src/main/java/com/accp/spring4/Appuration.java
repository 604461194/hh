package com.accp.spring4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Import({MybatisConfiguration.class})
@EnableTransactionManagement //启用源注解的事务
@ComponentScan
public class Appuration {
	
}
