package com.shanyuan.platform.ms.facade.goods;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.util.JsonUtils;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;

/** 
 * @author  wang chunru 
 * @date    2017年10月31日 下午6:56:58 
 * @Description   商品相关逻辑测试
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class GoodsFacadeTest {
	
	@Autowired
	private GoodsFacade goodsFacade;
	
	/**
	 * 获取模块商品显示类型列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void getGoodsClassListByModule(){
		try {
			List<SyGoodsClassBo> boList =  goodsFacade.getGoodsClassListByModule(2);

			System.out.println(JsonUtils.objectToJson(boList));
			
			List<SyGoodsClassBo> boList2 =  goodsFacade.getGoodsClassListByModule(2);

			System.out.println(JsonUtils.objectToJson(boList2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 获取指定模块商品类型列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void getGoodsClassList(){
		try {
			SyGoodsClassBo syGoodsClassList =  goodsFacade
					.getGoodsClassList(1150);
			String json = JSONObject.toJSONString(syGoodsClassList);
			System.out.println("json: " + json);
			
			SyGoodsClassBo syGoodsClassList2 =  goodsFacade
					.getGoodsClassList(1150);
			String json2 = JSONObject.toJSONString(syGoodsClassList2);
			System.out.println("json2: " + json2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 获取指定模块商品类型列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void getGoodsDetail(){
		try {
			Map<String, Object> map =  goodsFacade
					.getGoodsDetail(105759);
			String json = JSONObject.toJSONString(map);
			System.out.println("json: " + json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * agentStats信息统计的定时任务
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	@Test
	public void agentStatsTask(){
		long start = new Date().getTime();
		System.out.println("【agentStatsTask】统计助理人统计信息-开始" + new Date() );
		goodsFacade.agentStatsTask();
		System.out.println("【agentStatsTask】统计助理人统计信息-结束" + (new Date().getTime() - start) );
	}
}
