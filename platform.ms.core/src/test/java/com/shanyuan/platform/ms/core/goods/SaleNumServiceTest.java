package com.shanyuan.platform.ms.core.goods;


import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SaleNumServiceTest {
	@Autowired
	private SaleNumService saleNumService;
	
	@Test
	public void updateSaleNum() {
		GoodsInfo goodsInfo=new GoodsInfo ();
		goodsInfo.setGoodsId(1111);
		ArrayList list=new ArrayList();
		list.add(goodsInfo);
		saleNumService.updateSaleNum(list);
	}
}
