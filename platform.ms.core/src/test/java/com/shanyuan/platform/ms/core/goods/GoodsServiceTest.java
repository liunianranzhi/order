package com.shanyuan.platform.ms.core.goods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

/**
 * 
 * @author sunyue
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class GoodsServiceTest {
	
	@Autowired
	private SyGoodsClassService syGoodsClassService;
	
	@Autowired
	private SyGoodsService syGoodsService;
	
	@Autowired
	GoodsListService goodsListService;

/*	@Test
	public void checkBuyAreaStr() {
		goodsListService.getTopicGoodsList(null );
	}*/
	
//	@Test
	public void testUpdateSaleCountAndStockCount() {
		Integer goodsId=100281;
		Integer count=1;
		syGoodsService.updateSaleCountAndStockCount(goodsId, count);
	}
	/**
	 * 测试地区文案
	 */
	//@Test
	public void checkBuyAreaStr() {
		SyGoodsCommon goodscommon=new SyGoodsCommon();
		goodscommon.setGoodsName("12132");
		goodscommon.setBuyArea("上海市,江苏省,浙江省,安徽省,江西省");
		SyAddress syAddress =new SyAddress();
		syAddress.setAreaInfo("湖北省,南宁区,123市");
		String checkBuyAreaStr = goodsListService.checkBuyAreaStr(goodscommon, syAddress);
	 System.err.println("eee:"+checkBuyAreaStr);
	 System.err.println("flag:"+ObjectUtils.isEmpty(checkBuyAreaStr));
	}
	
	
	//@Test
	public void getGoodsInfo() {
		List<Integer> goodsIds = new ArrayList<Integer>();
		goodsIds.add(100281);
		goodsIds.add(100282);

		List<SyGoods> goodsList=syGoodsService.getGoodsInfo(goodsIds, "goods_id desc");
		System.err.println(goodsList.size());
	}
	
	//@Test
	public void testGetGoodsInfoList() {
		Map<Integer, Integer> goodsNumMap=new HashMap<Integer, Integer>();
		goodsNumMap.put(100299, 100299);goodsNumMap.put(100300, 100300);
		int buyerId=1;
		
		List<Integer> goodsIds=new ArrayList<Integer>();
		goodsIds.add(100300);
		goodsIds.add(100299);
		goodsListService.getGoodsInfoList(goodsNumMap,goodsIds, buyerId,null);
	}
	
	
	//@Test
	public void testsyGoodsClassService() {
		
		SyGoodsClassBo goodsClassList = syGoodsClassService.getGoodsClassList(1771);
		System.err.println(goodsClassList);
	}
}
