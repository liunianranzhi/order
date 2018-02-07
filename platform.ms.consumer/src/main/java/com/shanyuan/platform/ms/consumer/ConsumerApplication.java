package com.shanyuan.platform.ms.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/** 配置扫描mapper **/
@MapperScan(basePackages ="com.shanyuan.platform.ms.dao.*.mapper")
@ComponentScan(basePackages="com.shanyuan")
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
