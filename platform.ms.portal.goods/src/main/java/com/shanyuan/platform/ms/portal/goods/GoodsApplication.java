package com.shanyuan.platform.ms.portal.goods;

/**
 * @author 曹勇军
 *
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableEurekaClient
@SpringBootApplication
//@EnableSwagger2
@EnableCaching
/** 配置扫描mapper **/
@MapperScan(basePackages ="com.shanyuan.platform.ms.dao.*.mapper")
@ComponentScan(basePackages="com.shanyuan")
public class GoodsApplication {
	public static void main(String[] args) {
		 SpringApplication.run(GoodsApplication.class,args);
	//	 new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}