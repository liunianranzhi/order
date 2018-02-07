package com.shanyuan.platform.ms.core.goods;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonCountInfo;

/**
 * 
 * @author sunyue
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class GoodsCommonServiceTest {

	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	@Test
	public void updateCommonNums() {
		syGoodsCommonService.updateSaleNum(984325);
	}
	public void getGoodsCommonInfo() {
		List<Integer> goodsIds = new ArrayList<Integer>();
		goodsIds.add(100368);
		//goodsIds.add(100369);

		List<SyGoodsCommon> goodsList=syGoodsCommonService.getGoodsCommonInfo(goodsIds);
		System.err.println(goodsList.size());
	}
//	@Test
	public void updateSyshopBuyNum() {
		Integer buyerId=22;
		Integer goodsId=105349;
		Integer buyNum=6;
		
		try {
			syGoodsCommonService.updateSyshopBuyNum(buyerId, goodsId,buyNum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	//@Test
	public void goodscountTest(){
		List<Integer> publisherId = new ArrayList<Integer>();
		publisherId.add(951203);
		List<SyGoodsCommonCountInfo> goodsCountList = this.syGoodsCommonService.getGoodsCountList(publisherId);
		System.out.println(JSONObject.toJSON(goodsCountList));
	}
}
