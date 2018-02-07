package com.shanyuan.platform.ms.statistics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.shanyuan.platform.ms.dao.*.mapper")
@EnableSwagger2
@ComponentScan(basePackages="com.shanyuan")
public class StatisticsOrderPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatisticsOrderPortalApplication.class, args);
	}
}
