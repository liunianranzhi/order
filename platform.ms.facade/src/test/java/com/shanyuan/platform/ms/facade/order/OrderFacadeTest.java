package com.shanyuan.platform.ms.facade.order;

import java.util.HashMap;
import java.util.Map;

import com.shanyuan.platform.ms.facade.order.domain.PayedOrderDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.OrderListInfo;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;
import com.shanyuan.platform.ms.facade.order.domain.OrderDetailDomain;


/**
 * @author 曹勇军
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class OrderFacadeTest {
	
	@Autowired
	private OrderFacade orderFacade;
	
	@Rollback(false)
	@Transactional
	//@Test
	public void newSubmit(){
		 Map<String, Object> submitOrder = orderFacade.submitOrder(830,1, 1, 106255, 3, "15827202128", "158**2128", 0, 1000, 0, 0, null,null);
		//2224 订单为空
		//CommonVO donationDetailList = orderFacade.getDonationDetailList(2224,null,null);
		 String jsonString = JSON.toJSONString(submitOrder);
		 System.out.println("==="+jsonString);
	  }
    @Test
	public void pubmit(){
		Integer orderid=1288594;Integer memberid=559857;
        PayedOrderDomain submitOrder =orderFacade.getPayedOrderDetail(orderid,memberid);
		//2224 订单为空
		//CommonVO donationDetailList = orderFacade.getDonationDetailList(2224,null,null);
		String jsonString = JSON.toJSONString(submitOrder);
		System.out.println("==="+jsonString);
	}
	/**
	 * t1 测试
	 */
	@Rollback(true)
	@Transactional
	//@Test
	public void newSubmitZy(){
		 Map<String, Object > submitOrder = orderFacade.submitOrder(752276,null, 559857, 994950, 1, "15827202128", "158**2128", 1000, 0, 0, 0, null,null);
		 String jsonString = JSON.toJSONString(submitOrder);
		 System.out.println("==="+jsonString);
	  }
	@Rollback(false)
	@Transactional
	//@Test
	public void SubmitPifa(){
		 Map<String, Object > submitOrder = orderFacade.submitOrder(2002565,null, 8474, 106301, 6, "15827202128", "158**2128", 0, 1000, 0, 0, null,null);
		 String jsonString = JSON.toJSONString(submitOrder);
		 System.out.println("==="+jsonString);
	  }
	/**
	 * t1测试预提交
	 */
	@Rollback(false)
	@Transactional
//	@Test
	public void preSubmitZy(){
		OrderListInfo orderPreSubmit = orderFacade.getOrderPreSubmit(null,0, 559857, 978165, 1, 1000, 0);
		String jsonString = JSON.toJSONString(orderPreSubmit);
		System.out.println("==="+jsonString);
	}
	//@Test
	public void getDonationDetailList(){
		//2224 订单为空
		Map<String, Object> donationDetailList = orderFacade.getDonationDetailList(2224,null,null);
		 String jsonString = JSON.toJSONString(donationDetailList);
		 System.out.println("==="+jsonString);
	  }
	/**
	 * 订单详情
	 */
	//@Test
	public void getUnPayOrderDetail(){
		 Long paySn=460559850139182482L;
		 OrderDetailDomain unPayOrderDetail = orderFacade.getUnPayOrderDetail(paySn);
		// List<OrderRecordInfo> orderRecoderList = orderFacade.getOrderRecoderList(memberId, "40",null,null);
		 String jsonString = JSON.toJSONString(unPayOrderDetail);
		 System.out.println(jsonString);
	  }
	/**
	 *个人购买记录
	 */
   // @Test
	public void getOrderRecoderList(){
	 Integer memberId=1;
	 Map<String, Object> orderRecoderList = orderFacade.getOrderRecoderList(memberId, "40",null,null);
	 System.out.println(JSON.toJSONString(orderRecoderList));
    }
	//t2数据库
	//@Test
	public void getOrderPreSubmit(){
		Integer memberId=1;
		OrderListInfo orderPreSubmit = orderFacade.getOrderPreSubmit(null,1, 559857, null, null, 2000, 0);
		System.out.println(JSON.toJSONString(orderPreSubmit));
	}

	//@Test
	@Rollback(true)
	@Transactional
	public void testSubmitOrder(){
		Integer addressId=2002561;
		Integer ifcart=1;
		Integer memberId=8516;
		Integer goodsId=null,goodsNum=null;
//		Integer goodsId=100893,goodsNum=3;//100893
		Integer sharedMid=null;
		Integer sharedGoodsGommonid=null;
		Map<String,String> userWords=new HashMap<String,String>();
		userWords.put("2386-2407-0-0", "测试留言");
		String memberName="aaa";
		String memberTruename="bbb";
		Integer bocPoints=10;
		Integer bocPointsUsed=12;
		CommonVO domain=null;
		try {
		 Map<String, Object> submitOrder = orderFacade.submitOrder(addressId, ifcart, memberId, goodsId, goodsNum, 
					memberName, memberTruename, bocPoints, bocPointsUsed, sharedMid, sharedGoodsGommonid,null,  userWords);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(domain);
	}
	
	/**
	 * 覆盖多个优惠券，运费
	 */
	//@Test
	public void SubmitOrder(){
		Integer addressId=979;
		Integer ifcart=1;
		Integer memberId=2751;
		try {
			orderFacade.submitOrder(addressId, ifcart, memberId, null, null, null, null, null, null, null,null, null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 覆盖多个扶贫码
	 */
	//@Test
	@Rollback(true)
	@Transactional
	public void containCoupon(){
		Integer addressId=830;
		Integer ifcart=1;
		Integer memberId=1;
		
		orderFacade.submitOrder(addressId, ifcart, memberId, null, null, "小小", null, null, null, null,null, null, null);
	}
	/**
	 * 
	 * 优惠券 ，
	 */
	//@Test
	@Rollback(true)
	@Transactional
	public void containCoupon001(){
		//t1 数据库
		Integer addressId=6482;
		Integer ifcart=1;
		Integer memberId=8474;
		
		orderFacade.submitOrder(addressId, null, memberId, 106256, 2, "小小", null, null, null, null, 100368,null, null);
	}
	//@Test
	@Rollback(true)
	@Transactional
	public void contain001(){
		Integer addressId=659;
		Integer ifcart=0;
		Integer goodsId=100282;
		Integer memberId=2130;
		
		orderFacade.submitOrder(addressId, ifcart, memberId, goodsId, 2, "小小", null, null, null, null, 100368,null, null);
	}
	/**
	 * 订单列表
	 */
	//@Test
	public void queryList(){
		Integer ifcart=1;
		Integer memberId=412;
		/*CommonVO orderList = orderFacade.getOrderList(ifcart, memberId, null, null, 1, 1);
		System.out.println(JSON.toJSONString(orderList));*/
		//orderFacade.submitOrder(addressId, ifcart, memberId, goodsId, 2, "小小", null, null, null, null, 100368, null);
	}
	
	/**
	 * 积分、分享
	 */
       // @Test
		@Rollback(true)
		@Transactional
		public void containShare(){
			Integer addressId=704;
			Integer ifcart=1;
			Integer memberId=1001;
			
			orderFacade.submitOrder(addressId, ifcart, memberId, null, null, "小小", null, null, null,8516 ,105362 ,null, null);
		}
	/**
	 * 一个扶贫码支付多单
	 */
	@Rollback(true)
	@Transactional
	//@Test
	public void containCoupon002(){
		Integer addressId=1;
		Integer ifcart=1;
		Integer memberId=2226;
		
		orderFacade.submitOrder(addressId, ifcart, memberId, null, null, "小小", null, null, null, null, null, null,null);
	}
	
	@Rollback(false)
	//@Test
	public void testOrderSubmit001() {
		
		/** @param addressId=地址
		 * @param ifcart=1:来源购物车
		 * @param memberId=用户id
		 * @param goodsId=来源不是购物车时有值，商品的id
		 * @param goodsNum=来源不是购物车时有值，商品的数量
		 * @param memberName=用户名
		 * @param memberTruename=用户真实姓名
		 * @param bocPoints=中元积分
		 * @param bocPointsUsed=已使用积分
		 * @param sharedMid=分享人id
		 * @param sharedGoodsGommonid=分享人分享的商品id
		 * @param buyerChannel=用户channel
		 * @param userWords=Map  用户对订单的留言
		*/
		
		try {
			Map<String, String> userWords = new HashMap<>();
			//1, 1, 1, null, null, "18301487900", "zhangwende", 5000, 100, null, null, "boc", userWords
			 Map<String, Object> submitOrder = orderFacade.submitOrder(1, 1, 1, null, null, 
															"18301487900", "zhangwende", 5000, 0, null,null,
															null, userWords);
			
		
		} catch (CoreServiceException e) {
			throw new CoreServiceException(e.getMessage());
			
		}
		
		
	}
	/***
	 * @param ifcart=1:来源购物车
	 * @param memberId=用户id
	 * @param goodsId=来源不是购物车时有值，商品的id
	 * @param goodsNum=来源不是购物车时有值，商品的数量
	 * @param bocPoints=中元积分
	 * @param bocPointsUsed=已使用积分
	 * @return 
	 * @throws CoreServiceException
   */
	@Rollback(false)
	@Transactional
	@Test
	public void preSubmitZW(){
		/*(Integer ifcart,Integer memberId,
				Integer goodsId,Integer goodsNum,
				Integer bocPoints,Integer bocPointsUsed*/
		 OrderListInfo orderPreSubmit = orderFacade.getOrderPreSubmit(null,1, 1035469, 106300, 6, 1000, 0);
		 String jsonString = JSON.toJSONString(orderPreSubmit);
		 System.out.println("==="+jsonString);
	  }
	
	
	@Test
	public void testString () {
		
		//System.err.println(String.);
		
	}
}
