package com.shanyuan.platform.ms.core.user;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherOrder;


/**
 * @author 曹勇军
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class VoucherServiceTest {
	
	@Autowired
	private VoucherService voucherService;
	
	/**
	 * @author Rzm
	 * 使用优惠券
	 */
	@Test
	public void useVoucherTest() {
		SyVoucherOrder syVoucherOrder=new SyVoucherOrder();
		syVoucherOrder.setAmount(new BigDecimal(20));
		syVoucherOrder.setBuyerId(938934);
		syVoucherOrder.setGoodsId(978171);
		syVoucherOrder.setOrderId(1026527);
		syVoucherOrder.setRecId(2);
		syVoucherOrder.setUseTime(1506501753);
		syVoucherOrder.setVoucherCode("290559845690187780");
		voucherService.useVoucher(syVoucherOrder);
	}
	/**
	 * @author Rzm
	 * 将voucherCode对应的优惠券改为已经使用状态
	 */
	@Test
	public void updateVoucherStatusTest() {
		String voucherCode="150559842351229932";
		voucherService.updateVoucherStatus(voucherCode);
	}
	@Test
	public void voucherStatusTest(){
		SyVoucher syVoucherOrder=new SyVoucher();
		syVoucherOrder.setVoucherTId(1);
		voucherService.updateVouchertused(syVoucherOrder);
		
	}
	
	//@Test
	public void deleteVoucherOrderTest() {
		Integer orderId=1026527;
		voucherService.deleteVoucherOrder(orderId);
	}
	
	/**
	 * @author 曹勇军
	 * 测试前sql
	 * 如果已经有了voucher_code=123123123123 就不要再insert了
	  INSERT INTO sy.sy_voucher (voucher_code, voucher_t_id, 	voucher_title, 	voucher_desc, 	voucher_start_date, 	voucher_end_date, 	voucher_price, 	voucher_limit, 	voucher_store_id, 	voucher_state, 	voucher_active_date, 	voucher_used_date, 	voucher_type, 	voucher_owner_id, 	voucher_owner_name, 	voucher_order_id, 	voucher_t_type, 	voucher_owner_mobile	)
		VALUES	(	'123123123123', 	'1', 	'测试用例', 	'测试用例', 	1498838400, 	1506787200, 	5, 	20.00, 	0, 	2, 	1498838400, 	1506787200, 	2, 	123, 	'测试', 	999999, 	1, 	'123123'	);

		
	  INSERT INTO sy.sy_voucher_order ( 	order_id, 	goods_id, 	voucher_code, 	use_time, 	amount, 	buyer_id	)
		VALUES	( 	999999, 	1, 	'123123123', 	1498838400, 	1, 	'11123'	);
	  
	 * 期望sy_voucher_order无数据  对应的sy_voucher表中voucher_code=123123123123的数据voucher_start_date变为1
	 * 
	 */
//	@Test
	public void testDeleteVoucherOrder() {
		Integer orderId=999999;
		voucherService.deleteVoucherOrder(orderId);
	}
	
	/**
	 * @author 曹勇军
	 * 插入order_id,goods_id,voucher_code,use_time,amount,buyer_id
	 * 然后把voucher_state 改为2 已使用
	 */
//	@Test
	public void testUseVoucher(){
		
		SyVoucherOrder syVoucherOrder=new SyVoucherOrder();
		syVoucherOrder.setOrderId(1);
		syVoucherOrder.setGoodsId(1);
		syVoucherOrder.setVoucherCode("123123123");
		syVoucherOrder.setUseTime(DateUtil.getNowInt());
		syVoucherOrder.setAmount(new BigDecimal(10));
		syVoucherOrder.setBuyerId(1);
		voucherService.useVoucher(syVoucherOrder);
	}
@Test
public void testOneVoucher(){
		List<SyVoucher>voucherList =  new ArrayList<SyVoucher>();
		SyVoucher sy=new SyVoucher();
		sy.setVoucherId(0);
		sy.setVoucherLimit(new BigDecimal(50));
		sy.setVoucherPrice(10);
		sy.setVoucherTActivityId(1);
		sy.setVoucherEndDate(1527607303);
		sy.setVoucherActiveDate(1527607303);
		
		SyVoucher sy1=new SyVoucher();
		sy1.setVoucherId(1);
		sy1.setVoucherLimit(new BigDecimal(50));
		sy1.setVoucherPrice(15);
		sy1.setVoucherTActivityId(1);
		sy1.setVoucherEndDate(1527607303);
		sy1.setVoucherActiveDate(1527607303);
		SyVoucher sy2=new SyVoucher();
		sy2.setVoucherId(2);
		sy2.setVoucherLimit(new BigDecimal(50));
		sy2.setVoucherPrice(15);
		sy2.setVoucherTActivityId(2);
		sy2.setVoucherEndDate(1527607000);
		sy2.setVoucherActiveDate(1527607303);
		SyVoucher sy3=new SyVoucher();
		sy3.setVoucherId(3);
		sy3.setVoucherLimit(new BigDecimal(50));
		sy3.setVoucherPrice(15);
		sy3.setVoucherTActivityId(3);
		sy3.setVoucherEndDate(1527607000);
		sy3.setVoucherActiveDate(1527600200);
		SyVoucher sy4=new SyVoucher();
		sy4.setVoucherId(4);
		sy4.setVoucherLimit(new BigDecimal(50));
		sy4.setVoucherPrice(15);
		sy4.setVoucherTActivityId(3);
		sy4.setVoucherEndDate(1527607000);
		sy4.setVoucherActiveDate(1527600200);
		SyVoucher sy5=new SyVoucher();
		sy5.setVoucherId(5);
		sy5.setVoucherLimit(new BigDecimal(50));
		sy5.setVoucherPrice(15);
		sy5.setVoucherTActivityId(4);
		sy5.setVoucherEndDate(1527607000);
		sy5.setVoucherActiveDate(1527600100);
		SyVoucher sy6=new SyVoucher();//用这张
		sy6.setVoucherId(6);
		sy6.setVoucherLimit(new BigDecimal(50));
		sy6.setVoucherPrice(15);
		sy6.setVoucherTActivityId(4);
		sy6.setVoucherEndDate(1527607000);
		sy6.setVoucherActiveDate(1527600000);
		voucherList.add(sy);
		voucherList.add(sy1);
		voucherList.add(sy2);
		voucherList.add(sy3);
		voucherList.add(sy4);
		voucherList.add(sy5);
		voucherList.add(sy6);
		Map<Integer,List<GoodsInfo>> activityMap = new HashMap<Integer,List<GoodsInfo>>();
		List<GoodsInfo> glist=new ArrayList<GoodsInfo>();
		GoodsInfo g=new GoodsInfo();
		g.setGoodsMoneyTotal(new BigDecimal(10));
		GoodsInfo g1=new GoodsInfo();
		g1.setGoodsMoneyTotal(new BigDecimal(20));
		glist.add(g1);
		glist.add(g);
		activityMap.put(1, glist);
		List<GoodsInfo> glist2=new ArrayList<GoodsInfo>();
		GoodsInfo g2=new GoodsInfo();
		g2.setGoodsMoneyTotal(new BigDecimal(30));
		GoodsInfo g21=new GoodsInfo();
		g21.setGoodsMoneyTotal(new BigDecimal(20));
		glist2.add(g21);
		glist2.add(g2);
		activityMap.put(2, glist2);
		List<GoodsInfo> glist3=new ArrayList<GoodsInfo>();
		GoodsInfo g3=new GoodsInfo();
		g3.setGoodsMoneyTotal(new BigDecimal(60));
		glist3.add(g3);
		activityMap.put(3, glist3);
		List<GoodsInfo> glist4=new ArrayList<GoodsInfo>();
		GoodsInfo g4=new GoodsInfo();
		g4.setGoodsMoneyTotal(new BigDecimal(55));
		glist4.add(g4);
		activityMap.put(4, glist4);
		
		
		
		Map<String ,Object> oneVocher= voucherService.getOneVocher(voucherList, activityMap, null);
		System.out.println("======"+ JSON.toJSONString(oneVocher));
	}
	
	
	/**
	 * @author caoyongjun
	 * 根据购买商品列表筛选出参与满减活动的商品
	 */
	//@Test
	public void testCalOrderVoucherInfoDetail(){
		Integer memberId=8516;
		
		SyGoods goods=new SyGoods();
		goods.setGoodsPrice(new BigDecimal(10));
		goods.setGoodsId(105449);
		SyGoodsCommon goodsCommon=new SyGoodsCommon();
		goodsCommon.setGoodsCommonid(105861);
		goodsCommon.setSupportCountyId(1L);
		goodsCommon.setAssistId(0);
		GoodsInfo goodsInfo=new GoodsInfo(goods,goodsCommon,1);
		
		SyGoods goods2=new SyGoods();
		goods2.setGoodsPrice(new BigDecimal(20));
		goods2.setGoodsId(105450);
		SyGoodsCommon goodsCommon2=new SyGoodsCommon();
		goodsCommon2.setGoodsCommonid(105862);
		goodsCommon2.setSupportCountyId(2L);
		goodsCommon2.setAssistId(0);
		GoodsInfo goodsInfo2=new GoodsInfo(goods2,goodsCommon2,2);
		
		String disOrderKey1="1";
		
		DisOrderGoodsInfo info=new DisOrderGoodsInfo(disOrderKey1);
		info.addGoodsInfo(goodsInfo);
		info.addGoodsInfo(goodsInfo2);
		
		Map<String,DisOrderGoodsInfo> map=new HashMap<String,DisOrderGoodsInfo>();
		map.put(disOrderKey1, info);
		
		voucherService.calOrderVoucherInfoDetail(memberId, map, null);
	}
}