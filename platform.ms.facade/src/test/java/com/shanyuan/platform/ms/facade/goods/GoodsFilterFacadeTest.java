package com.shanyuan.platform.ms.facade.goods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;
import com.shanyuan.platform.ms.facade.goods.domain.GoodsClassInfo;

/**
 * 
 * @author yangjian
 * @date 2017/11/01
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class GoodsFilterFacadeTest {
	
	@Autowired
	private GoodsFilterFacade goodsFilterFacade;
	
	@Test
	public void goodsClassTest(){
		List<GoodsClassInfo> goodsClass = this.goodsFilterFacade.getGoodsClass();
		for (GoodsClassInfo goodsClassInfo : goodsClass) {
			System.out.println(goodsClassInfo.toJsonString(goodsClassInfo));
		}
	}
	@Test
	public void getArea(){
		System.out.println("==="+JSONObject.toJSON(this.goodsFilterFacade.getAreaByProvince(0L,2)));
	}
	
	@Test
	public void supportAreaTest(){
		System.out.println(JSONObject.toJSON(this.goodsFilterFacade.getSupportAreaByChannel("boc", "")));
	}
	
	//@Test
	public void areaTest(){
		System.out.println(JSONObject.toJSON(goodsFilterFacade.getAreaByChannel("boc", 2)));
	}

}
