/**
 * 
 */
package com.shanyuan.platform.ms.facade.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.ms.facade.TestApplicationFacade;

/**
 * @author 曹勇军
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class TestRedisHash {

	@Autowired
	StringRedisTemplate stringRedisTemplate;
	
	@Test
	public void testHash() {
		HashOperations<String, String,String> ops = stringRedisTemplate.opsForHash();
		String firstKey="ghi_1";
		String value=null;
		List<Integer> notFindGoodsIds=new ArrayList<Integer>();
		
		
		List<String> hashKeys=new ArrayList<String>();
		hashKeys.add("price");
		hashKeys.add("sellNum");
		hashKeys.add("collectNum");
		hashKeys.add("storage");
		
		List<String> result=ops.multiGet(firstKey, hashKeys);
		
		
		System.out.println(result);
		
		
	}

}
