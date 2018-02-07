package com.shanyuan.platform.ms.core.recommend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModule;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class RecommendModuleServiceTest {
	
	@Autowired
	private RecommendModuleService recommendModuleService;
	
	@Test
	public void moduleTest(){
		SyRecommendModule infoByModuleCode = recommendModuleService.getInfoByModuleCode("project");
		System.out.println(JSONObject.toJSON(infoByModuleCode));
	}

}
