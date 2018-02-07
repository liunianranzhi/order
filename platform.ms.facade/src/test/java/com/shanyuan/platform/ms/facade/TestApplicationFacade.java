/**
 * 
 */
package com.shanyuan.platform.ms.facade;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.github.pagehelper.PageHelper;

@SpringBootApplication
/** 配置扫描mapper **/
//@MapperScan(basePackages = {"com.shanyuan.platform.ms.dao.user.mapper",
//		"com.shanyuan.platform.ms.dao.auth.mapper","com.shanyuan.platform.ms.dao.order.mapper",
//		"com.shanyuan.platform.ms.dao.store.mapper","com.shanyuan.platform.ms.dao.goods.mapper"
//})
@MapperScan(basePackages ={"com.shanyuan.platform.ms.dao.*.mapper"})
@ComponentScan(basePackages = { "com.shanyuan.platform.ms"})  
public class TestApplicationFacade {

	   public static void main(String[] args) {
	        SpringApplication.run(TestApplicationFacade.class,args);
	        
	    }
}
