package com.shanyuan.platform.ms.core.hystrix;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;

/**
 * @author 曹勇军
 *
 */
@Component
public class Test2 {
	@CacheResult(cacheKeyMethod = "getCacheKey")
    @HystrixCommand(commandKey = "findUserById", groupKey = "UserService", threadPoolKey = "userServiceThreadPool")
    public Book findById2(int id) {
        
        return new Book(id,"測試");
    }
	
    @HystrixCommand
    public Future<Book> findById3(int id) {
        
	 return new AsyncResult<Book>(){
 		@Override
         public Book invoke() {
 			Book b3=new Book(id,"ceshi");
			System.out.println("inner     "+b3.getId()+":" + b3.getName()+"="+b3);
			return b3;
 		 }
	 };
    }
	
	public String getCacheKey(int id) {
        return String.valueOf(id);
    }
}
