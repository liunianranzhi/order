package com.shanyuan.platform.ms.core.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrder;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderPayment;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class OmOrderServiceTest {
	@Autowired
	private OmOrderService omOrderService;
	/**
	 * seller  pay_type测试
	 */
	@Test
	public void addOmOrderTest() {
		DisOrderGoodsInfo dis = new DisOrderGoodsInfo();
		GoodsInfo goodsInfo = new GoodsInfo();
		goodsInfo.setGoodsId(100281);
		List<GoodsInfo> goodsInfoList = new ArrayList<GoodsInfo>();
		goodsInfoList.add(goodsInfo);
		dis.setOrderSn(7000000000027401l);
		dis.setGoodsInfoList(goodsInfoList);
		String type = null;
		String paySn = "560495380796325048";
		String orderStatus = "40";
		Integer memberId = 123;
		String orderId = omOrderService.addOmOrder(dis, type, paySn, orderStatus, memberId);
		System.err.println(orderId);
	}
	/**
	 * getOmOrder
	 */
	@Test
	public void getOmOrderTest() {
		DisOrderGoodsInfo dis = new DisOrderGoodsInfo();
		GoodsInfo goodsInfo = new GoodsInfo();
		goodsInfo.setGoodsId(100281);
		List<GoodsInfo> goodsInfoList = new ArrayList<GoodsInfo>();
		goodsInfoList.add(goodsInfo);
		dis.setOrderSn(7000000000027401l);
		dis.setGoodsInfoList(goodsInfoList);
		String type = null;
		String paySn = null;
		String orderStatus = null;
		Integer memberId = null;
		OmOrder order = omOrderService.getOmOrder(dis, type, paySn, orderStatus, memberId);
		System.err.println(order);
	}
	/**
	 * addOmOrderGoods
	 */
	@Test
	public void addOmOrderGoodsTest() {
		GoodsInfo goodsInfo = new GoodsInfo();
		goodsInfo.setGoodsId(100281);
		goodsInfo.setGoodsCommonid(100368);
		goodsInfo.setGoodsName("手机");
		Integer recId = omOrderService.addOmOrderGoods(goodsInfo, "271", "1001", 1001, 1001, 1001, 1001);
		System.err.println(recId);
	}
	/**
	 * addOrderCoupon
	 */
	@Test
	public void addOrderCouponTest() {
		CouponPayInfo couponPayInfo = new CouponPayInfo();
		Integer id = omOrderService.addOrderCoupon("1231546489436135", "231564646465", 1001, couponPayInfo);
		System.err.println(id);
	}
	/**
	 * addOrderVoucher
	 */
	@Test
	public void addOrderVoucherTest() {
		OmOrderVoucher voucher = new OmOrderVoucher();
		voucher.setOrderId("1001");
		voucher.setMainId("1001");
		voucher.setVoucherId(1001);
		voucher.setVoucherCode("154646313153");
		voucher.setUseTime(new Date());
		voucher.setMemberId(1001);
		voucher.setVoucherTplId(13454543);
		Integer recId = omOrderService.addOrderVoucher(voucher);
		System.err.println(recId);
	}
	/**
	 * addOrderSettement
	 */
	@Test
	public void addOrderSettementTest() {
		DisOrderGoodsInfo dis = new DisOrderGoodsInfo();
		GoodsInfo goodsInfo = new GoodsInfo();
		goodsInfo.setGoodsId(100281);
		List<GoodsInfo> goodsInfoList = new ArrayList<GoodsInfo>();
		goodsInfoList.add(goodsInfo);
		dis.setOrderSn(7000000000027401l);
		dis.setGoodsInfoList(goodsInfoList);
		//orderId不可以重复
		String orderId = "12564645451";
		String mainId = "554649683153";
		Integer insert = omOrderService.addOrderSettement(dis, orderId, mainId);
		System.err.println(insert);
	}
	/**
	 * addOmOrderShipping
	 */
	@Test
	public void addOmOrderShippingTest() {
		String mainId = "546465";
		String orderId = "5623";
		SyAddress aressInfo = new SyAddress();
		aressInfo.setAddress("辽宁");
		Integer recId = omOrderService.addOmOrderShipping(mainId, orderId, aressInfo);
		System.err.println(recId);
	}
	/**
	 * addOmOrderPayMent
	 */
	@Test
	public void addOmOrderPayMentTest() {
		String mainId = "1001";
		String orderId = "1001";
		DisOrderGoodsInfo dis = new DisOrderGoodsInfo();
		GoodsInfo goodsInfo = new GoodsInfo();
		goodsInfo.setGoodsId(100281);
		List<GoodsInfo> goodsInfoList = new ArrayList<GoodsInfo>();
		goodsInfoList.add(goodsInfo);
		dis.setOrderSn(7000000000027401l);
		dis.setGoodsInfoList(goodsInfoList);
		OmOrderPayment orpay = new OmOrderPayment();
		orpay.setCreateTime(new Date());
		String recId = omOrderService.addOmOrderPayMent(mainId, orderId, dis);
		System.err.println(recId);
	}
}
