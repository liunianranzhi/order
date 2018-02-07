package com.shanyuan.platform.ms.core.recommend;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.recommend.entity.RecommendGoodsBo;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommend;
import com.shanyuan.platform.ms.dao.recommend.mapper.SyRecommendMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class RecommendServieTest {
	
	@Autowired
	private RecommendService recommendService;
	@Autowired
	private SyRecommendMapper syre;
	
	@Test
	public void recommendTest(){
		List<SyRecommend> recommend = recommendService.getRecommend("boc", "project", 6);
		List<SyRecommend> recommends = recommendService.getRecommend("", "project", 6);
		System.out.println(JSONObject.toJSON(recommend));
		System.out.println(JSONObject.toJSON(recommends));
	}

	
	@Test
	public void  getRecommendGoodsByBizModule() {
		HashMap<String,Object> hashMap = new HashMap<>();
		hashMap.put("recId", 2);
		hashMap.put("status", 1);
		
		List<RecommendGoodsBo> list = syre.selectRecommendGoodsByBizModule(hashMap);
		System.err.println(list);
	}
}
