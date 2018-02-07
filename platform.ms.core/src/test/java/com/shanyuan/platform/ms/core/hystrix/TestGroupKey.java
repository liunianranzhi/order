package com.shanyuan.platform.ms.core.hystrix;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class TestGroupKey {
	
	@HystrixCommand(fallbackMethod="fallback")
	public void group1(int i,String threadName) {
		System.out.println("group:"+i+"  threadName:"+threadName);
	}
	
	@HystrixCommand(fallbackMethod="fallback2")
	public void group2(int i,String threadName){
		System.out.println("group2:"+i+"  threadName:"+threadName);
	}
	
	
	public void fallback(int i,String threadName){
		System.out.println("fallback:"+i+"  threadName:"+threadName);
	}
	
	
	public void fallback2(int i,String threadName){
		System.out.println("fallback2:"+i+"  threadName:"+threadName);
	}
}
