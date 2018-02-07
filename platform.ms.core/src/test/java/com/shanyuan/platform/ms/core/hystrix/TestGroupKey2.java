package com.shanyuan.platform.ms.core.hystrix;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Component
public class TestGroupKey2 {
	
	@HystrixCommand(fallbackMethod="fallback")
	@HystrixProperty(name="execution.isolation.strategy", value = "THREAD")
	public void group1(int i,String threadName){
		System.out.println("2group:"+i+"  threadName:"+threadName);
	}
	
	public void fallback(int i,String threadName){
		System.out.println("2fallback:"+i+"  threadName:"+threadName);
	}
}
