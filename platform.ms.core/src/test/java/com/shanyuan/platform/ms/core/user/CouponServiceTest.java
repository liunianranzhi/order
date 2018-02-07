package com.shanyuan.platform.ms.core.user;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyCoupon;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class CouponServiceTest {

	@Autowired
	private CouponService couponService;
	
	@Test
	public void chongzhengCoupon() {
		
		CouponPayInfo couponPayInfo = new CouponPayInfo();
							//扶贫码、  购物劵生成批次、    支付金额
		couponPayInfo.addDetail("59af6c3b03d95", 470558012731015199L, BigDecimal.valueOf(100L));
		
		Boolean coupon = couponService.chongzhengCoupon(870807, 62199, couponPayInfo);
		System.err.println(coupon);
		
	}

	
	/**
	 * @author Rzm
	 * 根据member_id查询其对应的优惠券列表
	 */
	@Test
	public void getMemberCouponListTest() {
		Integer memberId=38;
		String orderby=null;
		List<SyCoupon> memberCouponList = couponService.getMemberCouponList(memberId, orderby);	
		System.err.println(memberCouponList.size());
	}
	/**
	 * @author Rzm
	 * 增加扶贫码，更新余额
	 */
	@Test
	public void addOrderCouponTest() {
		Integer orderId=38;
		Integer memberId=10010;
		CouponPayInfo couponPayInfo=null;
		couponService.addOrderCoupon(orderId, memberId, couponPayInfo);	
	}
	
	/**
	 * @author Rzm
	 */
	@Test
	public void chongzhengCouponTest() {
		Integer orderId=10010;
		Integer memberId=38;
		CouponPayInfo couponPayInfo=null;
		couponService.chongzhengCoupon(orderId, memberId, couponPayInfo);
	}
}
