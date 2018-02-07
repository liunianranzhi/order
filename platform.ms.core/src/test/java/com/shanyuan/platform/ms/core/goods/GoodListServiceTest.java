package com.shanyuan.platform.ms.core.goods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class GoodListServiceTest {
	@Autowired
	private GoodsListService goodsListService;
	/**
	 * 返回商品列表测试
	 */
	@Test
	public void getGoodsInfoList() {
		Map<Integer, Integer> idsNum = new HashMap<>();
		idsNum.put(1, 100281);
		List<Integer> goodsIdList = new ArrayList<>();
		goodsIdList.add(135);
		Integer buyerId = 100281;
		SyAddress syAddress = new SyAddress();
		syAddress.setAddressId(buyerId);
		
		List<GoodsInfo> list= goodsListService.getGoodsInfoList(idsNum, goodsIdList, buyerId, syAddress);
		System.out.println(list);
	}
	/**
	 * 判断是否符合购买地区测试
	 */
	@Test
	public void checkBuyAreaStrTest() {
		SyGoodsCommon goodscommon = new SyGoodsCommon();
		goodscommon.setGoodsName("家物用 - 捐款");
		SyAddress syAddress = new SyAddress();
		syAddress.setAddress("北京");
		String backarea = goodsListService.checkBuyAreaStr(goodscommon, syAddress);
		System.out.println("result:" + backarea);
	}
}
