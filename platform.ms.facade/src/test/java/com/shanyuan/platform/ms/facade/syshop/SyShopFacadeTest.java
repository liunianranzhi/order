package com.shanyuan.platform.ms.facade.syshop;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class SyShopFacadeTest {

	@Autowired
	private SyShopFacade syShopFacade;
	
	@Test
	public void shopTest(){
		Map<String, Object> areaInfo = syShopFacade.getAreaInfo(3, 5);
		System.out.println(JSONObject.toJSON(areaInfo));
	}
	
}
