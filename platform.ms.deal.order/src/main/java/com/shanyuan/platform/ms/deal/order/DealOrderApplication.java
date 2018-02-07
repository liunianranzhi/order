package com.shanyuan.platform.ms.deal.order;

/**
 * @author 曹勇军
 *
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
@EnableEurekaClient
@SpringBootApplication
/** 配置扫描mapper **/
@MapperScan(basePackages ="com.shanyuan.platform.ms.dao.*.mapper")
@ComponentScan(basePackages="com.shanyuan")
public class DealOrderApplication {
	public static void main(String[] args) {
		 SpringApplication.run(DealOrderApplication.class,args);

	}
}