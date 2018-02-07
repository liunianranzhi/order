package com.shanyuan.platform.ms.portal.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@SpringBootApplication
//@EnableSwagger2
/** 配置扫描mapper **/
@MapperScan(basePackages ="com.shanyuan.platform.ms.dao.*.mapper")
@ComponentScan(basePackages="com.shanyuan")
public class OrderApplication {
	public static void main(String[] args) {
		 SpringApplication.run(OrderApplication.class,args);

	}
}
