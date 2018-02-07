package com.shanyuan.platform.ms.base.hystrix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;

/**
 * @author 曹勇军
 * 為了使用java註解
 */
@Configuration
@EnableAspectJAutoProxy
public class MyHystrixConfiguration {

  @Bean
  public HystrixCommandAspect hystrixAspect() {
    return new HystrixCommandAspect();
  }

}
