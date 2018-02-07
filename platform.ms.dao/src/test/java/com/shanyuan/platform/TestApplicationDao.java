package com.shanyuan.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
/** 配置扫描mapper **/
//@MapperScan(basePackages = {"com.shanyuan.platform.ms.dao.user.mapper",
//		"com.shanyuan.platform.ms.dao.auth.mapper","com.shanyuan.platform.ms.dao.order.mapper",
//		"com.shanyuan.platform.ms.dao.store.mapper","com.shanyuan.platform.ms.dao.goods.mapper"
//})
@MapperScan(basePackages ="com.shanyuan.platform.ms.dao.*.mapper")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestApplicationDao {

	   public static void main(String[] args) {
	       ConfigurableApplicationContext cal=  SpringApplication.run(TestApplicationDao.class,args);
	       cal.getBean(TestCusomer.class);
	        
	    }
		
		
}
