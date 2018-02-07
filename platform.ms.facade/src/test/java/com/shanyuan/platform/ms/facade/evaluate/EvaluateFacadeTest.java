package com.shanyuan.platform.ms.facade.evaluate;


import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;

/** 
 * @author  zhongying
 * @date    2017年11月7日 下午6:56:58 
 * @Description   评价列表
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class EvaluateFacadeTest {
	
	@Autowired
	private EvaluateFacade evaluateFacade;
	
	//@Test
	public void getEvaluateOrder(){
		Integer goodscommonId=null;
		Integer memberId=0;
		Integer pageSize=0;
		Integer currentPage=0;
		String type="";
		Map<String ,Object> evaluateGoodsManagerList = evaluateFacade.getEvaluateGoodsManagerList(null, goodscommonId, memberId, pageSize, currentPage, type);
		System.out.println("===="+JSON.toJSONString(evaluateGoodsManagerList));
	}
	@Test
	public void addEvaluate() {
		evaluateFacade.addEvaluate("{968214:{\"image\":\"0001.jpg\",\"scores\":\"4\",\"image2\":\"0002.jpg\",\"content\":\"好，很好，非常好\"}}", 559857, 824904, 3, 3, "zhongying", "1","add");
	}
	
//@Test
	public void getEvaluateGoods(){
		Integer goodscommonId=967391;
		Integer memberId=0;
		Integer pageSize=null;
		Integer currentPage=null;
		String type="goods";
		Map<String ,Object> evaluateGoodsManagerList = evaluateFacade.getEvaluateGoodsManagerList(null, goodscommonId, memberId, pageSize, currentPage, type);
		System.out.println("goods===="+JSON.toJSONString(evaluateGoodsManagerList));
	}
///	@Test
	public void getEvaluateAll(){
		Integer goodscommonId=967391;
		Integer memberId=0;
		Integer pageSize=null;
		Integer currentPage=null;
		String type="all";
		//(Integer gevalOrderId,Integer goodscommonId,Integer memberId ,Integer pageSize,Integer currentPage,String type)
		//测订单
		Map<String ,Object> evaluateGoodsManagerList = evaluateFacade.getEvaluateGoodsManagerList(null, goodscommonId, memberId, 20, 1, type);
		System.out.println("all===="+JSON.toJSONString(evaluateGoodsManagerList));
	}
	//@Test
	public void getEvaluatewell(){
		Integer goodscommonId=0;
		Integer memberId=0;
		Integer pageSize=null;
		Integer currentPage=null;
		String type="well";
		//测订单
		Map<String ,Object> evaluateGoodsManagerList = evaluateFacade.getEvaluateGoodsManagerList(null, goodscommonId, memberId, pageSize, 20, type);
		System.out.println("well===="+JSON.toJSONString(evaluateGoodsManagerList));
	}
	//@Test
	public void getEvaluatemiddle(){
		Integer goodscommonId=0;
		Integer memberId=0;
		Integer pageSize=null;
		Integer currentPage=null;
		String type="middle";
		//(Integer gevalOrderId,Integer goodscommonId,Integer memberId ,Integer pageSize,Integer currentPage,String type)
		//测订单
		Map<String ,Object> evaluateGoodsManagerList = evaluateFacade.getEvaluateGoodsManagerList(null, goodscommonId, memberId, pageSize, currentPage, type);
		System.out.println("middle===="+JSON.toJSONString(evaluateGoodsManagerList));
	}
		//@Test
	public void getEvaluateN(){
		Integer goodscommonId=0;
		Integer memberId=0;
		Integer pageSize=null;
		Integer currentPage=null;
		String type="negative";
		Map<String ,Object> evaluateGoodsManagerList = evaluateFacade.getEvaluateGoodsManagerList(null, goodscommonId, memberId, pageSize, currentPage, type);
		System.out.println("negative===="+JSON.toJSONString(evaluateGoodsManagerList));
	}
	//@Test
	public void getEvaluateP(){
		Integer goodscommonId=967391;
		Integer memberId=0;
		Integer pageSize=null;
		Integer currentPage=null;
		String type="picture";
		Map<String ,Object> evaluateGoodsManagerList = evaluateFacade.getEvaluateGoodsManagerList(null, goodscommonId, memberId, pageSize, currentPage, type);
		System.out.println("picture===="+JSON.toJSONString(evaluateGoodsManagerList));
	}
	
}
