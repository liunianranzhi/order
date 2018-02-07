package com.shanyuan.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
/** 配置扫描mapper **/
@MapperScan(basePackages ="com.shanyuan.platform.ms.dao.*.mapper")
public class TestApplicationCore {
//    com.netflix.client.config.DefaultClientConfigImpl
	   public static void main(String[] args) {
	        SpringApplication.run(TestApplicationCore.class,args);   
	        
	        
	    }
		
		
}
