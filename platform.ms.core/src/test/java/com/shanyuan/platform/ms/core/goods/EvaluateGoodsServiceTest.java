package com.shanyuan.platform.ms.core.goods;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.goods.bo.SyEvaluateGoodsBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;

/**
 * 
 * @author sunyue
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class EvaluateGoodsServiceTest {
	
	@Autowired
	private SyEvaluateGoodsService syEvaluateGoodsService;
	
	//查询商品的评价
	
	public void getEvaluateGoodsList() {
		SyGoodsCommon agc = new SyGoodsCommon();
		agc.setGoodsCommonid(105684);
		
		List<SyEvaluateGoodsBo> list = syEvaluateGoodsService.getEvaluateGoodsList(agc, "geval_addtime desc");
		System.err.println(list.size());
	}
	@Test
	public void getEvaluateGoodsList22() {
		SyGoodsCommon agc = new SyGoodsCommon();
		agc.setGoodsCommonid(105684);
		List<SyEvaluateGoodsBo> evaluateGoodsInfoList = syEvaluateGoodsService.getEvaluateGoodsInfoList(976325, null, null, null, "picture", null, null);
		System.err.println(JSON.toJSONString(evaluateGoodsInfoList));
	}
	
	
	//发布商品的评价
	//@Test
	public void editEvaluateGoods() {
		SyEvaluateGoods seg = new SyEvaluateGoods();
		seg.setGevalOrderid(99999);
		seg.setGevalGoodsid(106240);
		seg.setGevalOrderno(9000000000546701l);
		seg.setGevalOrdergoodsid(1060240);
		seg.setGevalGoodsname("苹果");
		seg.setGevalGoodsprice(new BigDecimal(23));
		seg.setGevalScores((byte)3);
		seg.setGevalContent("评价人未及时作出评价，系统默认给予五星评价！");
		seg.setGevalIsanonymous((byte)1);
		seg.setGevalAddtime(1495004545);
		seg.setGevalStoreid(2387);
		seg.setGevalStorename(2387+"");
		seg.setGevalFrommemberid(6688);
		seg.setGevalFrommembername("孙月");
		seg.setGevalState((byte)0);
		seg.setPublisherId(6666);
		seg.setEdittime(0);
		seg.setGevalType((byte)1);
		seg.setGoodsCommonid(105773);
		int n = syEvaluateGoodsService.editEvaluateGoods(seg, null);
		System.err.println(n);
		
	}

}
