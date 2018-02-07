package com.shanyuan.platform.ms.core.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.order.OrderService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class OrderServiceTest {
	@Autowired
	private DealOrderService dealOrderService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private QueryOrderService queryService;
	@Autowired
	private OmOrderService OmOrderService;
	//添加运费
	 //@Test
		 public void addOmOrderShipping() {
			 SyAddress syAddress = new  SyAddress();
			 syAddress.setAddress("宜丰县欢迎您");
			 syAddress.setAreaId(123132L);
			 syAddress.setCityId(12345l);
			 syAddress.setTrueName("zhongying");
			 syAddress.setTelPhone("12378974654");
			 syAddress.setAddressId(1);
			 Integer addOmOrderShipping = OmOrderService.addOmOrderShipping("1231", "1231", syAddress);
			 System.out.println(addOmOrderShipping);
		 }
			@Test
			public void addOrderCommon() {
				//8847
				SyAddress syAddress = new SyAddress();
				syAddress.setTrueName("ceshi");
				syAddress.setAreaInfo("");
				syAddress.setAddress("我们");
				syAddress.setTelPhone("123456789");
				Integer addOrderCommon = dealOrderService.addOrderCommon(1111,111111, "","111111", new BigDecimal(2),null,null,syAddress);
				System.out.println(addOrderCommon);
			}
	 //@Test
	 public void addOmOrderPayMent() {
		 SyAddress syAddress = new  SyAddress();
		 syAddress.setAddress("宜丰县欢迎您");
		 syAddress.setAreaId(123132L);
		 syAddress.setCityId(12345l);
		 syAddress.setTrueName("zhongying");
		 syAddress.setTelPhone("12378974654");
		 syAddress.setAddressId(1);
		 DisOrderGoodsInfo	 dis =  new DisOrderGoodsInfo();
		 dis.setMoneyPay(new BigDecimal(1234));
		 String addOmOrderPayMent = OmOrderService.addOmOrderPayMent("124", "124", dis);
		 System.out.println(addOmOrderPayMent);
	 }
	//移动到goodsService
//	@Test
//	public void testUpdateSaleCountAndStockCount() {
//		Integer goodsId=100281;
//		Integer count=1;
//		orderService.updateSaleCountAndStockCount(goodsId, count);
//	}
	// @Test
	 public void getPayedInfoCount() {
		 Integer payedInfoCount = queryService.getPayedInfoCount(38, "1", new Byte("0"));
		 System.out.println(payedInfoCount);
	 }
	 //@Test
	 public void getFundFeeByOrderId() {
		 List<Integer> orderIds= new ArrayList<Integer>();
		 orderIds.add(63712);
		 orderIds.add(63890);
		 orderIds.add(64097);
		 List<SyOrder> fundFeeByOrderId = queryService.getFundFeeByOrderId(orderIds, 17);
		 System.out.println(JSON.toJSONString(fundFeeByOrderId));
	 }
		
	//@Test
	public void testGoodsFreight(){
		
		SyGoods goods=new SyGoods();
		goods.setGoodsPrice(new BigDecimal(10));
		goods.setGoodsId(105449);
		SyGoodsCommon goodsCommon=new SyGoodsCommon();
		goodsCommon.setTransportId(3);
		goodsCommon.setGoodsProjectType(11);
		
		GoodsInfo goodsInfo=new GoodsInfo(goods,goodsCommon,1);
		
		
		SyGoods goods2=new SyGoods();
		goods2.setGoodsPrice(new BigDecimal(20));
		goods2.setGoodsId(105450);
		SyGoodsCommon goodsCommon2=new SyGoodsCommon();
		goodsCommon2.setTransportId(17);
		goodsCommon2.setGoodsProjectType(11);
		GoodsInfo goodsInfo2=new GoodsInfo(goods2,goodsCommon2,2);
		
		String disOrderKey1="1";
		
		Map<String,DisOrderGoodsInfo> disOrderGoods=new HashMap<String,DisOrderGoodsInfo>();
		DisOrderGoodsInfo info=new DisOrderGoodsInfo(disOrderKey1);
		info.addGoodsInfo(goodsInfo);
		info.addGoodsInfo(goodsInfo2);
		
		SyGoods goods3=new SyGoods();
		goods3.setGoodsPrice(new BigDecimal(20));
		goods3.setGoodsId(105452);
		SyGoodsCommon goodsCommon3=new SyGoodsCommon();
		goodsCommon3.setTransportId(3);
		goodsCommon3.setGoodsProjectType(11);
		GoodsInfo goodsInfo3=new GoodsInfo(goods3,goodsCommon3,4);
		
		String disOrderKey2="2";
		DisOrderGoodsInfo info2=new DisOrderGoodsInfo(disOrderKey2);
		info2.addGoodsInfo(goodsInfo3);
		
		disOrderGoods.put(disOrderKey1, info);
		disOrderGoods.put(disOrderKey2, info2);
		
		orderService.goodsFreight(disOrderGoods, 632700000000L);
	}
	
}

