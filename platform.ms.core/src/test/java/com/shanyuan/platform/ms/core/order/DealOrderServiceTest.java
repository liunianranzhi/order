package com.shanyuan.platform.ms.core.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.goods.GoodsListService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderParams;
import com.shanyuan.platform.ms.core.user.CouponService;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class DealOrderServiceTest {
	
	@Autowired
	private DealOrderService dealOrderService;
	@Autowired
	private CouponService couponService;
	@Autowired
	private QueryOrderService queryService;
	@Autowired
	private GoodsListService goodsListService;
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	//@Test
	public List<GoodsInfo> getGoodsInfoList() {
		HashMap<Integer, Integer> idsNum=new HashMap<Integer,Integer>();
		idsNum.put(100282, 1);
		idsNum.put(100281, 2);
		
		List<Integer> goodsIds=new ArrayList<Integer>();
		goodsIds.add(100282);
		goodsIds.add(100281);
		List<GoodsInfo> goodsInfoList = goodsListService.getGoodsInfoList(idsNum, goodsIds,38,null);
		System.out.println("00000000000000"+JSON.toJSONString(goodsInfoList));
		return goodsInfoList;
	}
	
	 class MytestPaySnRunnable implements Runnable  {
	     private final ConcurrentHashMap<Long, Integer> ch ;
	     private final DealOrderService deservice;
	     public MytestPaySnRunnable(ConcurrentHashMap<Long, Integer> c,DealOrderService d) {
	         this.ch = c ;
	         this.deservice =d;
	     }
	     
	     
        @Override
        public void run() {
             for(int i =0 ;i<100;i++) {
                 Long l = this.deservice.getPaySn(i);
                 if(ch.containsKey(l)) {
                     System.err.println("i am wrong " + l + " i:"+i);
                 }else {
                     Integer  mm = ch.putIfAbsent(l, i);
                     
                 }
             }
        }
	    
	}
	
	//@Test
	public void testPaySn() {
		 final ConcurrentHashMap<Long, Integer> ch = new  ConcurrentHashMap<Long, Integer> ();
		 for(int i =0;i<100;i++) {
		     Runnable run = new MytestPaySnRunnable(ch,this.dealOrderService)  ;
		     new Thread(run).start();
		 }
		 
	 
		 
		 
//		   Set<Long> mySet = new HashSet<Long>();
//		   for(int i =0 ;i<100000; i++) {
//			   Long ps = this.dealOrderService.getPaySn(memberId);
//				if(mySet.contains(ps)) {
//					System.out.println(ps);  
//				}
//				mySet.add(ps);
//		   }
//		   System.out.println(mySet.size());
	}
	//@Test
	public void ceshi() {
		HashMap<Integer, Integer> idsNum=new HashMap<Integer,Integer>();
		idsNum.put(100361, 1);
		idsNum.put(100363, 1);
		idsNum.put(100367, 2);
		List<Integer> goodsIds = new ArrayList<Integer>();
		goodsIds.add(100361);
		goodsIds.add(100363);
		goodsIds.add(100367);
		
		List<GoodsInfo> goodsInfoList = goodsListService.getGoodsInfoList(idsNum,goodsIds, 38,null);
		System.out.println("00000000000000"+JSON.toJSONString(goodsInfoList));
		Map<String, DisOrderGoodsInfo> disOrderGoods = dealOrderService.splitToOrder(goodsInfoList);
		Integer memberId=2129;
		System.out.println("============="+JSON.toJSONString(disOrderGoods));
		for(String key:disOrderGoods.keySet()) {
			 DisOrderGoodsInfo disogInfo=disOrderGoods.get(key);
		
				System.out.println("============="+JSON.toJSONString(goodsInfoList));
		}
		
	
	}
	//@Test
	public void selectByPrimaryKey() {
		SyOrder orderPaySnList = queryService.selectByPrimaryKey(271);
		System.out.println(JSON.toJSONString(orderPaySnList));
	}
	
	// @Test
		public void getOrderListByParam() {
		 //List<SyOrder> orderListByParam = queryService.getOrderListByParam("paySn", 38, null, 620556975000443038L);
			List<SyOrder> orderListByParam = queryService.getOrderListByParam("orderState", 38, null, null);
			System.out.println(JSON.toJSONString(orderListByParam));
		}
 //@Test	
  public void getOrderGoodsListByIds() {
	  List<Integer> orderids= new ArrayList<Integer>();
	  orderids.add(271);
	  orderids.add(272);
	  orderids.add(273);
	  orderids.add(274);
	 /* List<SyOrderGoods> orderGoodsListByIds = queryService.getOrderGoodsListByIds(orderids);
	  System.out.println(JSON.toJSONString(orderGoodsListByIds));*/
	}
	//@Test
	public Map<String, DisOrderGoodsInfo> splitToOrder() {
		List<GoodsInfo>  goodsInfoList = new  ArrayList<GoodsInfo>();
		GoodsInfo g1=new GoodsInfo();
		g1.setStoreId(1111111);
		g1.setAssistId(111112);
		g1.setGoodsId(222222);
		g1.setGoodsCommonid(222223);
		g1.setPublisherId(111113);
		g1.setGoodsProjectType(17);
		g1.setBizOperationMid(111114);
		g1.setGoodsNum(1);
		g1.setGoodsPrice(new BigDecimal("12.3"));
		g1.setPoorType(new Byte("0"));
		GoodsInfo g2=new GoodsInfo();
		g2.setStoreId(1111111);
		g2.setAssistId(111112);
		g2.setGoodsId(222222);
		g2.setGoodsCommonid(222223);
		g2.setPublisherId(111113);
		g2.setGoodsProjectType(17);
		g2.setBizOperationMid(111114);
		g2.setGoodsNum(2);
		g2.setGoodsPrice(new BigDecimal("12.3"));
		g2.setPoorType(new Byte("0"));
		GoodsInfo g3=new GoodsInfo();
		g3.setStoreId(1111112);
		g3.setAssistId(111112);
		g3.setGoodsId(222222);
		g3.setGoodsCommonid(222223);
		g3.setPublisherId(111113);
		g3.setGoodsProjectType(17);
		g3.setBizOperationMid(111114);
		g3.setGoodsNum(1);
		g3.setGoodsPrice(new BigDecimal("12.3"));
		g3.setPoorType(new Byte("0"));
		GoodsInfo g4=new GoodsInfo();
		g4.setStoreId(1111112);
		g4.setAssistId(111113);
		g4.setGoodsId(222222);
		g4.setGoodsCommonid(222223);
		g4.setPublisherId(111113);
		g4.setGoodsProjectType(17);
		g4.setBizOperationMid(111114);
		g4.setGoodsPrice(new BigDecimal("12.3"));
		g4.setPoorType(new Byte("0"));
		g4.setGoodsNum(1);
		goodsInfoList.add(g1);
		goodsInfoList.add(g2);
		goodsInfoList.add(g3);
		goodsInfoList.add(g4);
		Map address=new  HashMap<String,String>();
		address.put("2265-2275-0-0", "你好");
		//Map<String, DisOrderGoodsInfo> splitToOrder = dealOrderService.splitToOrder(goodsInfoList);
		System.out.println("===="+JSON.toJSONString(address));
		return null;
	}
	//@Test
	public void getPaySn() {
			Integer memberId=12324;
			Long paySn = dealOrderService.getPaySn(memberId);
			System.out.println("===="+paySn);
		}
	
	//@Test
	public void addOrderPay() {
		Long paySn=12321341L;
		Integer memberId=12324;
		Integer orderPayId = dealOrderService.addOrderPay(paySn, memberId);
		System.out.println("===="+orderPayId);
	}
	//@Test
	public void addOrder() {
		GoodsInfo g1=new GoodsInfo();
		g1.setStoreId(1111111);
		g1.setAssistId(111112);
		g1.setGoodsId(222222);
		g1.setGoodsCommonid(222223);
		g1.setPublisherId(111113);
		g1.setGoodsProjectType(17);
		g1.setBizOperationMid(111114);
		g1.setGoodsNum(1);
		g1.setGoodsPrice(new BigDecimal("12.3"));
		g1.setPoorType(new Byte("0"));
		GoodsInfo g2=new GoodsInfo();
		g2.setStoreId(1111111);
		g2.setAssistId(111112);
		g2.setGoodsId(222222);
		g2.setGoodsCommonid(222223);
		g2.setPublisherId(111113);
		g2.setGoodsProjectType(17);
		g2.setBizOperationMid(111114);
		g2.setGoodsNum(2);
		g2.setGoodsPrice(new BigDecimal("13.3"));
		Long paySn=12321341L;
		Integer memberId=12324;
		Integer orderPayId=9094;
		//Integer bizOperationMid=0;
		//Integer sharedGoodsCommonId=0;
		DisOrderGoodsInfo disogInfo=new DisOrderGoodsInfo("11111-11112-11113-12324");
	
		disogInfo.addGoodsInfo(g1);
		disogInfo.addGoodsInfo(g2);
		
		String memberName="ceshi";
		String memberTruename="wowo";
		String buyerChannel="boc";
		BigDecimal storeDisCount=new BigDecimal("22.2");
		BigDecimal platformDiscount=new BigDecimal("33.2");
		Integer sharedMid=0;
		String appVariant="";
		System.out.println("999999999999:"+disogInfo.getAllGoodsAmount());
		OrderParams orderParams = new OrderParams();
		orderParams.setDisogInfo(disogInfo);
		orderParams.setPaySn(paySn);
		orderParams.setOrderPayId(orderPayId);
		orderParams.setBizOperationMid(0);
		orderParams.setMemberId(memberId);
		orderParams.setMemberName(memberName);
		orderParams.setMemberTruename(memberTruename);
		orderParams.setAppVariant(appVariant);
		orderParams.setBuyerChannel(buyerChannel);
		orderParams.setSharedGoodsCommonId(null);
		orderParams.setSharedMid(sharedMid);
		disogInfo.setStoreDisCount(storeDisCount);
		disogInfo.setPlatformDiscount(platformDiscount);
		//Integer addOrderCommon = dealOrderService.addOrder(addOrder)
		//System.out.println(addOrderCommon);
	}

	//@Test
	public void addOrderGoods() {
		Integer memberId=12324;
		Integer orderId=0;
		Integer sharedGoodsCommonId=0;
		DisOrderGoodsInfo disogInfo=new DisOrderGoodsInfo("12324");
		BigDecimal storeDisCount=new BigDecimal("22.2");
		BigDecimal platformDiscount=new BigDecimal("33.2");
		BigDecimal paymoney=new BigDecimal("33.2");
		Integer sharedMid=0;
		String appVariant="";
		GoodsInfo g2= new GoodsInfo();
		g2.setStoreId(1111111);
		g2.setAssistId(111112);
		g2.setGoodsId(222222);
		g2.setGoodsCommonid(222223);
		g2.setPublisherId(111113);
		g2.setGoodsProjectType(17);
		g2.setBizOperationMid(111114);
		g2.setGoodsNum(2);
		g2.setGoodsPrice(new BigDecimal("13.3"));
		//Integer addOrderCommon = dealOrderService.addOrderGoods(g2, appVariant, orderId, memberId, sharedMid, sharedGoodsCommonId, paymoney, storeDisCount, platformDiscount);
		//System.out.println("==========="+addOrderCommon);
	}
	
	//@Test
	public void addOrderLog() {
		Integer orderId=55555;
			/*SyAddress syAddress = new SyAddress();
			syAddress.setTrueName("ceshi");
			syAddress.setAreaInfo("");
			syAddress.setAddress("我们");
			syAddress.setTelPhone("123456789");
			in
			SyGoodsCommonWithBLOBs sy=	new SyGoodsCommonWithBLOBs();*/
			Integer addOrderCommon = dealOrderService.addOrderLog(orderId);
			System.out.println("==========="+addOrderCommon);
		}
	
	//@Test
	public void getCouponPayInfoData() {
		List<GoodsInfo>  goodsInfoList = new  ArrayList<GoodsInfo>();
		SyGoods goods1=	new SyGoods();
		SyGoodsCommon goodc1=	new SyGoodsCommon();
		goods1.setGoodsId(11111);
		goods1.setGoodsPrice(new BigDecimal("12.3"));
		GoodsInfo g1=new GoodsInfo(goods1,goodc1,2);
		g1.setStoreId(1111111);
		g1.setAssistId(111112);
		g1.setGoodsId(222222);
		g1.setGoodsCommonid(222223);
		g1.setPublisherId(111113);
		g1.setGoodsProjectType(17);
		g1.setBizOperationMid(111114);
		g1.setPoorType(new Byte("0"));
		SyGoods goods2=	new SyGoods();
		SyGoodsCommon goodc2=	new SyGoodsCommon();
		goods2.setGoodsId(11112);
		goods2.setGoodsPrice(new BigDecimal("0.3"));
		GoodsInfo g2=new GoodsInfo(goods2,goodc2,2);
		g2.setStoreId(1111111);
		g2.setAssistId(111112);
		g2.setGoodsId(222222);
		g2.setGoodsCommonid(222223);
		g2.setPublisherId(111113);
		g2.setGoodsProjectType(17);
		g2.setBizOperationMid(111114);
		g2.setGoodsNum(2);
		g2.setPoorType(new Byte("0"));
		SyGoods goods3=	new SyGoods();
		SyGoodsCommon goodc3=	new SyGoodsCommon();
		goods3.setGoodsId(11112);
		goods3.setGoodsPrice(new BigDecimal("0.3"));
		GoodsInfo g3=new GoodsInfo(goods3,goodc3,2);
		g3.setStoreId(1111112);
		g3.setAssistId(111112);
		g3.setGoodsId(222222);
		g3.setGoodsCommonid(222223);
		g3.setPublisherId(111113);
		g3.setGoodsProjectType(17);
		g3.setBizOperationMid(111114);
		g3.setGoodsNum(1);
		g3.setPoorType(new Byte("0"));
		
		SyGoods goods4=	new SyGoods();
		SyGoodsCommon goodc4=	new SyGoodsCommon();
		goods4.setGoodsId(11111);
		goods4.setGoodsPrice(new BigDecimal("12.3"));
		GoodsInfo g4=new GoodsInfo(goods4,goodc4,1);
		g4.setStoreId(1111112);
		g4.setAssistId(111113);
		g4.setGoodsId(222222);
		g4.setGoodsCommonid(222223);
		g4.setPublisherId(111113);
		g4.setGoodsProjectType(17);
		g4.setBizOperationMid(111114);
		
		g4.setPoorType(new Byte("0"));
		goodsInfoList.add(g1);
		goodsInfoList.add(g2);
		goodsInfoList.add(g3);
		goodsInfoList.add(g4);
		Map<String, DisOrderGoodsInfo> splitToOrder = dealOrderService.splitToOrder(goodsInfoList);
		Map<String, CouponPayInfo> couponPayInfoData = couponService.getCouponPayInfoData(splitToOrder, 2226);
	System.out.println(JSON.toJSONString(couponPayInfoData));
	System.out.println(JSON.toJSONString(couponPayInfoData.get("1111112-111113-111112-111114")));
	//return couponPayInfoData;
	}
	
	
	/*public void addOrderCoupon() {
		Map<String, CouponPayInfo> couponPayInfoData = this.getCouponPayInfoData();
		Map<String, DisOrderGoodsInfo>  disOrderGoods= this.splitToOrder();
		for (String key :disOrderGoods.keySet()) {
			if(couponPayInfoData!=null) {
				disOrderGoods.get(key).setCouponPayInfo(couponPayInfoData.get(key));
			}
		}
		for(String key :disOrderGoods.keySet()) {
			 DisOrderGoodsInfo disogInfo = disOrderGoods.get(key);
			Integer assistId=disogInfo.getGoodsInfoList().get(0).getAssistId();
			BigDecimal totalCouponMoney = disogInfo.getCouponPayInfo().getTotalCouponMoney().multiply(new BigDecimal("100"));
			if(assistId>0&&totalCouponMoney.compareTo(new BigDecimal(0))==1) {
				couponService.addOrderCoupon(11111, 1111, disogInfo.getCouponPayInfo());
			 }
			
		}
		
	}*/
	
	/** 处理订单信息(整合下单数据)
	 * @param disOrderGoods   处理前的订单信息
	 * @param userWords  	每单的卖家留言
	 * @param addressId
	 * @param memberId
	 */
	//@Test
	public void dealOrder() {
		
		HashMap<String, String> userWords = new HashMap<>();
		//disOrderGoods.put(key, value);
		
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
		
		//Map<String, DisOrderGoodsInfo> dealOrder = this.dealOrderService.dealOrder(disOrderGoods, userWords, 1L, 1);
		//Iterator<String> iterator = dealOrder.keySet().iterator();
		
		/*while (iterator.hasNext()) {
			String next = iterator.next();
			
			System.err.println(next + "-------" + dealOrder.get(next) );
			
		}*/
		
	}
//	@Test
	public void ceshi2() {
		Map address=new  HashMap<String,String>();
		address.put("2265-2275-0-0", "你好");
		//Map<String, DisOrderGoodsInfo> splitToOrder = dealOrderService.splitToOrder(goodsInfoList);
		System.out.println("===="+JSON.toJSONString(address)); 
	}
}
