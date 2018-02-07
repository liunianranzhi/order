package com.shanyuan.platform.ms.facade.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.ServiceResult;
import com.shanyuan.platform.ms.base.rest.service.AsyncRestService;
import com.shanyuan.platform.ms.base.rest.service.RestService;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;

/**
 * rest方法测试
 * @author yangjian
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class RestTest {
	
	@Autowired
	private RestService restService;
	
	@Autowired
	private AsyncRestService asyncRestService;
	
	@Test
	public void restTestPostHeader(){
		JSONObject j = new JSONObject();
		j.put("token", "c7e9029c30f1841877ef1df67d071693");
		ServiceResult parsePostResultWithHeader = restService.parsePostResultWithHeader(new HttpHeaders(), j, "https://apit.17shanyuan.com/1.0/rs-user/homepage/statistics-datum");
		System.out.println(parsePostResultWithHeader.getContent());
	}
	
	@Test
	public void asyncRestTestHeader(){
		JSONObject j = new JSONObject();
		j.put("token", "c7e9029c30f1841877ef1df67d071693");
		ServiceResult parsePostResultWithHeader = asyncRestService.parsePostResultWithHeader(new HttpHeaders(), j, "https://apit.17shanyuan.com/1.0/rs-user/homepage/statistics-datum");
		try {
			Thread.sleep(2000);
			System.out.println(parsePostResultWithHeader.getContent());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
