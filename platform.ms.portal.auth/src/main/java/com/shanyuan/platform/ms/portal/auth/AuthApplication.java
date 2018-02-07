package com.shanyuan.platform.ms.portal.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableAspectJAutoProxy
@EnableEurekaClient
@SpringBootApplication
//@EnableSwagger2
/** 配置扫描mapper **/
@ComponentScan(basePackages="com.shanyuan")
public class AuthApplication {

	public static void main(String[] args) {
		 SpringApplication.run(AuthApplication.class,args);

	}

}

