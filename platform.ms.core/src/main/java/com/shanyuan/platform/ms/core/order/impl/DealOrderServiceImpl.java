package com.shanyuan.platform.ms.core.order.impl;

import com.shanyuan.platform.ms.dao.order.entity.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.OrderUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant.PayMentCode;
import com.shanyuan.platform.ms.core.constant.OrderConstant.ProjectType;
import com.shanyuan.platform.ms.core.member.PushService;
import com.shanyuan.platform.ms.core.order.CalculateFeeService;
import com.shanyuan.platform.ms.core.order.DealOrderService;
import com.shanyuan.platform.ms.core.order.OrderService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.user.CouponService;
import com.shanyuan.platform.ms.core.user.InviteInfoDealService;
import com.shanyuan.platform.ms.core.user.VoucherService;
import com.shanyuan.platform.ms.core.user.bo.VoucherBo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.PointServiceExcepType;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderCommonMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderLogMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderPayMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;

import de.ailis.pherialize.Pherialize;
/***
 * 
 * @author zy
 *
 */
@Component
public class DealOrderServiceImpl implements DealOrderService {

	private static final Logger logger = LoggerFactory.getLogger(DealOrderServiceImpl.class);
	@Autowired
	private CalculateFeeService calculateFee ;
	@Autowired
	private StringRedisTemplate stringRedisTemplate ;
	@Autowired
	private SyOrderMapper orderMapper ;
	
	@Autowired
	private SyOrderPayMapper orderPayMapper ;
	@Autowired
	private SyOrderGoodsMapper orderGoodsMapper ;
	@Autowired
	private SyOrderCommonMapper orderCommonMapper ;
	@Autowired
	private SyOrderLogMapper orderLogMapper ;

	@Autowired
	private CouponService couponService;
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private VoucherService voucherService ;
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private InviteInfoDealService inviteInfoDealService;
	@Autowired
	private PushService pushService;
	
	/**
	 * 
	 * @param publisherid
	 * @param orderid
	 * @param ownertype
	 * @param goodsProjectType
	 * @param companyName
	 * @param goodsname
	 * @param phone
	 * @param goodsNum
	 * @return
	 */
	public void sendMessageForOrder(Integer publisherid,Integer orderid, String ownertype) {
		try{
			String pageUrl = this.constantReload.getShopSiteApiUrl() + "/index.php?act=home&op=send_goods_batch_boc";
			if(OrderConstant.ownerType.OWNER_TYPE_POOR.equals(ownertype)) {
				pageUrl = this.constantReload.getShopSiteApiUrl() + "/index.php?act=home&op=my_goods_send_boc&poor_member_id="+publisherid+"&order_id="+orderid;
			}
			
			String loadUrl = this.constantReload.getShopSiteApiUrl() + "/index.php?act=index&op=notify_page&page_url=" + URLEncoder.encode(pageUrl, "UTF-8");
			//发送推送消息
			this.inviteInfoDealService.sendNotifyToMemberForIncPoints(publisherid, "新订单", "新订单", "亲，您有一笔新订单，请速速查看！", loadUrl);
		}catch (UnsupportedEncodingException e){
			logger.info(e.getMessage(), new CoreServiceException(PointServiceExcepType.UNSUPPORTED_ENCODING));
		}
	}
	
	public void sendSMS(String companyName,String goodsname,String phone,Integer goodsNum) {
		try{
		String text= this.constantReload.getSmsSign()+companyName+"有新订单，产品："+goodsname+"，数量："+goodsNum+"，请尽快登录善源商场后台查看订单详情。";
		 pushService.sendSMS(phone, text, 1);
		}catch (Exception e){
			logger.info(e.getMessage(), new CoreServiceException(PointServiceExcepType.SEND_SMS_FAIL));
		}
	}
	//更新redis中订单总额和订单总数
	public void updateRedisInfo(BigDecimal orderamount, Integer orderid) throws CoreServiceException{
		String amount="sy_platform_order_amount";
		String count="sy_platform_order_count";
		String days = DateUtil.getDays();
		String todayAmount="sy_platform_order_amount_"+days;
		String todayCount="sy_platform_order_count_"+days;
		try {
			BigDecimal zorderamount = orderamount;
			ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
			String str = opsForValue.get(amount);
			String zcount = opsForValue.get(count);
			String tamount = opsForValue.get(todayAmount);
			String tcount = opsForValue.get(todayCount);
			if (!ObjectUtils.isEmpty(str)) {
				BigDecimal orderAmountago = new BigDecimal(str);
				zorderamount=orderAmountago.add(orderamount);
			}
			Integer allcount=1;
			if (!ObjectUtils.isEmpty(zcount)) {
				Integer agocount = Integer.parseInt(zcount);
				allcount =agocount+1;
			}
			BigDecimal ztodayorderamount = orderamount;
			if (!ObjectUtils.isEmpty(tamount)) {
				BigDecimal agotamount = new BigDecimal(tamount);
				ztodayorderamount=agotamount.add(orderamount);
			}
			Integer alltcount=1;
			if (!ObjectUtils.isEmpty(tcount)) {
				Integer agocount = Integer.parseInt(tcount);
				alltcount =agocount+1;
			}
			opsForValue.set(amount, zorderamount.toString());
			opsForValue.set(count, allcount.toString());
			opsForValue.set(todayAmount, ztodayorderamount.toString());
			opsForValue.set(todayCount, alltcount.toString());
		}catch(Exception e) {
			logger.error("UPDATE_REDIS_INFO:"+orderid,e);
			throw new CoreServiceException(OrderServiceExcepType.UPDATE_REDIS_INFO,"更新redis",e);
		} 
	}
	/*public void updateRedisInfo(Long orderamount, Integer orderid) throws CoreServiceException{
		String amount="sy_platform_order_amount";
		String count="sy_platform_order_count";
		String days = DateUtil.getDays();
		String todayAmount="sy_platform_order_amount_"+days;
		String todayCount="sy_platform_order_count_"+days;
		try {
			BigDecimal zorderamount = orderamount;
			ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
			String str = opsForValue.get(amount);
			String zcount = opsForValue.get(count);
			String tamount = opsForValue.get(todayAmount);
			String tcount = opsForValue.get(todayCount);
			if (!ObjectUtils.isEmpty(str)) {
				BigDecimal orderAmountago = new BigDecimal(str);
				zorderamount=orderAmountago.add(orderamount);
			}
			Integer allcount=1;
			if (!ObjectUtils.isEmpty(zcount)) {
				Integer agocount = Integer.parseInt(zcount);
				allcount =agocount+1;
			}
			BigDecimal ztodayorderamount = orderamount;
			if (!ObjectUtils.isEmpty(tamount)) {
				BigDecimal agotamount = new BigDecimal(tamount);
				ztodayorderamount=agotamount.add(orderamount);
			}
			Integer alltcount=1;
			if (!ObjectUtils.isEmpty(tcount)) {
				Integer agocount = Integer.parseInt(tcount);
				alltcount =agocount+1;
			}
			opsForValue.set(amount, zorderamount.toString());
			opsForValue.set(count, allcount.toString());
			opsForValue.set(todayAmount, ztodayorderamount.toString());
			opsForValue.set(todayCount, alltcount.toString());
		}catch(Exception e) {
			logger.error("UPDATE_REDIS_INFO:"+orderid,e);
			throw new CoreServiceException(OrderServiceExcepType.UPDATE_REDIS_INFO,"更新redis",e);
		} 
	}*/
	/**
	 * 
	 * @param paySn
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public Integer updatePayInfo(Long paySn, Integer memberId) throws CoreServiceException{
		int row =0;
		try {
			SyOrderPay record=new  SyOrderPay();
			SyOrderPayExample example =new SyOrderPayExample();
			record.setApiPayState("1");
			example.createCriteria().andPaySnEqualTo(paySn);
			 row = orderPayMapper.updateByExampleSelective(record,example);
		}catch(Exception e) {
			logger.error("update_order_pay:"+paySn,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_PAY_FAIL,e.getMessage(),e);
		} 
		return row;
	}	
	/**
	 * 修改
	 * @param ds
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public Integer updateOrderPay(DisOrderGoodsInfo ds, Integer memberId) throws CoreServiceException{
		
		int row =0;
		try {
			SyOrder record =new SyOrder();
			 record.setOrderState(OrderConstant.OrderState.ORDER_STATE_PAYED);
			 record.setPaymentTime(DateUtil.getNowInt());
			 Integer assistId=ds.getGoodsInfoList().get(0).getAssistId();
			 Integer goodsProjectType = ds.getGoodsInfoList().get(0).getGoodsProjectType();
			 BigDecimal couponPay = ds.getCouponPay();
			 BigDecimal orderAmount = ds.getOrderAmount();
			 BigDecimal moneyPay = ds.getMoneyPay();
			 couponPay = ObjectUtils.isEmpty(couponPay)?BigDecimal.ZERO:couponPay;
			 orderAmount = ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO:orderAmount;
			 moneyPay = ObjectUtils.isEmpty(moneyPay)?BigDecimal.ZERO:moneyPay;
			
			 if(assistId>0&&couponPay.compareTo(orderAmount)==0
					 &&moneyPay.compareTo(BigDecimal.ZERO)==0) {
				 String paymentCode=PayMentCode.PAYMENT_CODE_BIZ_PAY;
				 record.setPaymentCode(paymentCode);
			 }else if(ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)&&orderAmount.compareTo(BigDecimal.ZERO)==0
					 &&moneyPay.compareTo(BigDecimal.ZERO)==0){
				 String paymentCode=PayMentCode.PAYMENT_CODE_POINTS_PAY;
				 record.setPaymentCode(paymentCode);
				 
			 }
            record.setServiceFee(BigDecimal.ZERO);
            record.setServiceFeeRate((short)0);
			SyOrderExample example =new SyOrderExample();
			example.createCriteria().andOrderSnEqualTo(ds.getOrderSn()).andBuyerIdEqualTo(memberId);
			row= orderMapper.updateByExampleSelective(record,example);
	}catch(Exception e) {
		logger.error("update_order:memberId:"+memberId,e);
		throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_FAIL,e.getMessage(),e);
	}
		return row;
	}
	
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public Integer addPayOrderLog(Integer orderId,String logRole,String msg,String state) {
		Integer LogId=null;
		try {
			SyOrderLog orderLog=new SyOrderLog();
			orderLog.setOrderId(orderId);
			orderLog.setLogRole(logRole);
			orderLog.setLogMsg(msg);
			orderLog.setLogOrderstate(state);
			orderLog.setLogTime(DateUtil.getNowInt());
			orderLogMapper.insertSelective(orderLog);
			LogId = orderLog.getLogId();
		}catch(Exception e) {
			logger.error("insert_order_log:"+orderId,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_LOG_FAIL,e.getMessage(),e);
		} 
	 return  LogId;
	}
	
	
	/***
	 * 拆单
	 * @author zy
	 */
   @Override
	public Map<String, DisOrderGoodsInfo> splitToOrder(List<GoodsInfo> goodsInfoList) {
		Map<String, DisOrderGoodsInfo> disOrderGoods = new HashMap<String, DisOrderGoodsInfo>();
		for (int i = 0; i < goodsInfoList.size(); i++) {
			GoodsInfo goodsInfo = goodsInfoList.get(i);
			String disKey = goodsInfo.getDisOrderKey();
			DisOrderGoodsInfo doInfo = disOrderGoods.get(disKey);
			if (ObjectUtils.isEmpty(doInfo)) {
				doInfo = new DisOrderGoodsInfo(disKey);
			}
			doInfo.addGoodsInfo(goodsInfo);
			disOrderGoods.put(disKey, doInfo);
		}
		
		logger.info("disOrderGoods :"+JSON.toJSONString(disOrderGoods));
		
		return disOrderGoods;

	}
   
   @Transactional(timeout=36000,rollbackFor=Throwable.class)
   @Override
	public void delOrder(Integer orderId)throws CoreServiceException{
		try {
			SyOrder	record = new SyOrder();
			record.setDeleted(new Byte("1"));
			record.setOrderId(orderId);
			orderMapper.updateByPrimaryKeySelective(record);
		}catch(Exception e) {
			logger.error("del_order:"+orderId,e);
			throw new CoreServiceException(OrderServiceExcepType.DELETE_ORDER_FAIL,e.getMessage(),e);
		} 
	}
   /**
	 * 生成支付单号
	 * @author zy
	 * FORMAT(两位随机数，10位秒数+3毫秒数 +3位用户编码 前三位)
	 * 碰撞率 100并发 86%个唯一的健，1000 64.8% 10000 39% 10w 30%
	 */

	
	@Deprecated
	public Long getPaySn2(Integer memberId) {
		//TODO 大并发时 数据会碰撞，考虑以后整合
		if(ObjectUtils.isEmpty(memberId)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"参数为空！");	
		}
		Random rd=new Random();
		Long haomiao=System.currentTimeMillis();
		String paysn=""+(10+rd.nextInt(89));
		paysn+=((haomiao-946656000*1000)+"").substring(0,10);//秒数 距1970年1月1日
		String mtimestr=haomiao+"";
		paysn+=mtimestr.substring(mtimestr.length()-3,mtimestr.length());
		if(memberId>=1000){
			paysn+=(memberId+"").substring(0,3);
		}else{
			paysn+=(memberId*1000+"").substring(0,3);
		}

		return Long.parseLong(paysn);
	}
	 
	
	 /**
		 * 生成支付单号
		 * @author lee
		 * FORMAT(10位秒数 +5位队列长度+3位用户编码 前三位)
		 * 支持最大并发为 每秒10w之内
		 */
		@Override
		public Long getPaySn(Integer memberId) {
			//TODO 大并发时 数据会碰撞，考虑以后整合
			if(ObjectUtils.isEmpty(memberId)) {
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"参数为空！");	
			}
			StringBuilder paysn =new StringBuilder();
			int ntime = DateUtil.getNowInt();
			paysn.append(ntime);
			String nkey = "paysn_"+ntime ;
			ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
			int	rnum = ops.increment(nkey, 1).intValue(); 
			this.stringRedisTemplate.expire(nkey, 30, TimeUnit.SECONDS);
			String rnumStr = String.format("%05d", rnum);
			paysn.append(rnumStr);
            if(memberId>=1000){
                paysn.append((memberId+"").substring(0,3));
            }else{
                paysn.append((memberId*1000+"").substring(0,3));
            }

			return Long.parseLong(paysn.toString());
		}
	/**
	 * 保存支付编号
	 * @author zy
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public Integer addOrderPay(Long paySn, Integer memberId) throws CoreServiceException {
		SyOrderPay record=new SyOrderPay();
		Integer PayId=0;
		if(ObjectUtils.isEmpty(paySn)||ObjectUtils.isEmpty(memberId)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"参数为空！");	
		}
		try {
			record.setPaySn(paySn);
			record.setBuyerId(memberId);
		    orderPayMapper.insert(record);
		    PayId= record.getPayId();
		}catch(Exception e) {
			logger.error("insert_order_pay_fail:"+paySn,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_PAY_FAIL,"保存支付单编号失败",e);
		} 
		return PayId;
	}
	
/**
 * 生成订单
 * @author zy
 * 
 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public Integer addOrder(DisOrderGoodsInfo  ds,Long paySn,String orderStatus,String buyerChannel,
			String appVariant,Integer orderPayId,Integer memberId,String memberTruename) throws CoreServiceException {
		 Integer orderId = 0;
	try {
		 SyOrder order =this.getSyOrder(ds, paySn, orderStatus, buyerChannel, appVariant, orderPayId, memberId, memberTruename);
		 orderMapper.insertSelective(order);
		 orderId = order.getOrderId();
		}catch(Exception e) {
			logger.error("insert_order:"+paySn,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_FAIL,"插入订单失败",e);
		} 
		return orderId;
	}
	
	public SyOrder getSyOrder(DisOrderGoodsInfo  ds,Long paySn,String orderStatus,String buyerChannel,
			String appVariant,Integer orderPayId,Integer memberId,String memberTruename) throws CoreServiceException {
		if(ObjectUtils.isEmpty(ds)||ObjectUtils.isEmpty(ds.getGoodsInfoList())) {
			throw new CoreServiceException(OrderServiceExcepType.ORDER_EMPTY,"订单为空！");
		}
		SyOrder order=new SyOrder();
		order.setPaySn(paySn);
	
		order.setBuyerChannel(buyerChannel);
		BigDecimal rate= new BigDecimal("100");
		appVariant = ObjectUtils.isEmpty(appVariant)?"":appVariant;
		order.setAppVariant(appVariant);
		 BigDecimal storeDisCount = ObjectUtils.isEmpty(ds.getStoreDisCount())?BigDecimal.ZERO:ds.getStoreDisCount().multiply(rate);
		 BigDecimal platformDiscount = ObjectUtils.isEmpty(ds.getPlatformDiscount())?BigDecimal.ZERO:ds.getPlatformDiscount().multiply(rate);
		 Integer storeId=ds.getGoodsInfoList().get(0).getStoreId();
		 Integer publisherId=ds.getGoodsInfoList().get(0).getPublisherId();
		 Integer assistId=ds.getGoodsInfoList().get(0).getAssistId();
		 Integer bizOperationMid = ds.getGoodsInfoList().get(0).getBizOperationMid();
		 bizOperationMid = ObjectUtils.isEmpty(bizOperationMid)?0:bizOperationMid;
		 order.setBizOperationMid(bizOperationMid);
		 String storeName=ds.getGoodsInfoList().get(0).getStoreName();
		 storeName = ObjectUtils.isEmpty(storeName)?"":storeName;
		 publisherId = ObjectUtils.isEmpty(publisherId)?0:publisherId;
		 assistId = ObjectUtils.isEmpty(assistId)?0:assistId;
		 storeId = ObjectUtils.isEmpty(storeId)?0:storeId;
		 String channel=ds.getGoodsInfoList().get(0).getChannel();
		
		 channel = ObjectUtils.isEmpty(channel)?"":channel;
		 Long orderSn = ds.getOrderSn();
		 order.setOrderSn(orderSn);
		 Byte poorType=ds.getGoodsInfoList().get(0).getPoorType();
		 Integer goodsProjectType = ds.getGoodsInfoList().get(0).getGoodsProjectType();
		 goodsProjectType = ObjectUtils.isEmpty(goodsProjectType)?0:goodsProjectType;
		 Long supportCountyId=ds.getGoodsInfoList().get(0).getSupportCountyId();
		 supportCountyId = ObjectUtils.isEmpty(supportCountyId)?0L:supportCountyId;
		 Integer time=DateUtil.getNowInt();
		 order.setStoreId(storeId);
		 order.setPublisherId(publisherId);
		 order.setAssistId(assistId);
		 order.setStoreName(storeName);
		 order.setBuyerId(memberId);
		 order.setBuyerName(memberTruename);
		 order.setAddTime(time);
		 order.setPaymentCode("online");
		 order.setGoodsProjectType(goodsProjectType);
		 order.setChannel(channel);
		
		 order.setFinnshedTime(0);
		 order.setBuyerEmail("");
		 order.setPdAmount(BigDecimal.ZERO);
		 order.setOrderState(orderStatus);
		 order.setOrderFrom("1");
		 order.setApplyerId(0);
		 order.setAgentFee(BigDecimal.ZERO);
		 order.setRefundId(0);
		 order.setWarnLevel((byte)0);
		 order.setCommunicationStatus((byte)1);
		 order.setDelayedDeliveryState("0");
		 order.setDiscountAmount(storeDisCount);
		 order.setPlatformPay(platformDiscount);
		 order.setSupportCountyId(supportCountyId);
		 order.setRefundId(0);
		 order.setShippingFee(ds.getShipFee().multiply(rate));
		 String tradeMode = ds.getGoodsInfoList().get(0).getTradeMode();
		 //订单金额 =商品总金额+运费-店铺优惠
		 BigDecimal orderAmount = ds.getOrderAmount();
		 orderAmount =ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO:orderAmount.multiply(rate);
		 order.setOrderAmount(orderAmount);
		 //实际支付金额 money_pay：订单总金额-平台优惠-扶贫码支付
		 BigDecimal paymoney = ds.getMoneyPay();
		 paymoney =ObjectUtils.isEmpty(paymoney)?BigDecimal.ZERO:paymoney.multiply(rate);
		 order.setMoneyPay(paymoney);
		//商品总金额
		 BigDecimal goodsAmount = ds.getAllGoodsAmount();
		 goodsAmount =ObjectUtils.isEmpty(goodsAmount)?BigDecimal.ZERO:goodsAmount.multiply(rate);
		 order.setGoodsAmount(goodsAmount); 
		 BigDecimal serviceFee = ds.getServiceFee();
		 serviceFee =ObjectUtils.isEmpty(serviceFee)?BigDecimal.ZERO:serviceFee.multiply(rate);
		 BigDecimal serviceRate = ds.getServiceRate();
		 serviceRate =ObjectUtils.isEmpty(serviceRate)?BigDecimal.ZERO:serviceRate;
		 BigDecimal fundFee = ds.getFundFee();
		 fundFee =ObjectUtils.isEmpty(fundFee)?BigDecimal.ZERO:fundFee.multiply(rate);
		 BigDecimal foundRate = ds.getFundRate();
		 foundRate =ObjectUtils.isEmpty(foundRate)?BigDecimal.ZERO:foundRate;
		 order.setServiceFeeRate(serviceRate.shortValue());
		 order.setFundFeeRate(foundRate.shortValue());
		 order.setServiceFee(serviceFee);
		 order.setFundFee(fundFee);
		 String tradeModeQkys =  OrderConstant.TradeType.TRADE_MODE_QKYS;
		 if(tradeModeQkys.equals(tradeMode)) {
			 order.setTradeMode(tradeModeQkys);
			 order.setPresellTime(ds.getGoodsInfoList().get(0).getPresellTime()); 
		 }else {
			 order.setTradeMode(OrderConstant.TradeType.TRADE_MODE_PT);
			 order.setPresellTime(0); 
		 }
		 BigDecimal couponPay= ds.getCouponPay();
		 couponPay =ObjectUtils.isEmpty(couponPay)?BigDecimal.ZERO:couponPay.multiply(rate);
		 order.setCouponPay(couponPay);
		 order.setAssistId(assistId);
		 //集采
		 if(poorType>0) {
			 order.setVer(new Byte("1"));
		 }else {
			 order.setVer(new Byte("0"));
		 }
		
		return order;
	}
	
	/**
	 * order_goods
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public Integer addOrderGoods(GoodsInfo goodsInfo, String appVariant, Integer orderId, Integer buyerId,
			Integer sharedMid, Integer sharedGoodsCommonId)throws CoreServiceException { 
		Integer recId=0;
		if(ObjectUtils.isEmpty(orderId)||ObjectUtils.isEmpty(buyerId)||ObjectUtils.isEmpty(goodsInfo)||ObjectUtils.isEmpty(goodsInfo.getGoodsId())||ObjectUtils.isEmpty(goodsInfo.getGoodsCommonid())) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		SyOrderGoods orderGoods=new SyOrderGoods();
		try {
			BigDecimal defaultmoney =new BigDecimal("0.00");
			orderGoods.setOrderId(orderId);
			orderGoods.setGoodsId(goodsInfo.getGoodsId());
			orderGoods.setStoreId(goodsInfo.getStoreId());
			orderGoods.setGoodsCommonid(goodsInfo.getGoodsCommonid());
			orderGoods.setShippingExpressId(new Byte("0"));
			orderGoods.setShippingCode("");
			orderGoods.setPackageNum(0L);
			orderGoods.setGevalId(0);
			orderGoods.setGoodsType(goodsInfo.getGoodsType());//默认
			orderGoods.setPromotionsId(goodsInfo.getPromotionsid());
			Short r=0;
			orderGoods.setCommisRate(r);
			 BigDecimal storeDiscount = goodsInfo.getStoreDiscount();
			 BigDecimal platDiscount = goodsInfo.getPlatDiscount();
			 BigDecimal moneyToal = goodsInfo.getGoodsMoneyTotal();
			orderGoods.setDiscountMoney(defaultmoney);
			platDiscount = ObjectUtils.isEmpty(platDiscount)?BigDecimal.ZERO:platDiscount;
			storeDiscount = ObjectUtils.isEmpty(storeDiscount)?BigDecimal.ZERO:storeDiscount;
			moneyToal = ObjectUtils.isEmpty(moneyToal)?BigDecimal.ZERO:moneyToal;
			appVariant = ObjectUtils.isEmpty(appVariant)?"":appVariant;
			orderGoods.setAppVariant(appVariant);
			orderGoods.setDiscountMoney(storeDiscount);
			orderGoods.setPlatformPayMoney(platDiscount);
			orderGoods.setGoodsPayPrice(moneyToal);
			Byte wholesaleType = goodsInfo.getWholesaleType();
			String wholesaleInfo = goodsInfo.getWholesaleInfo();
			String goodsName = goodsInfo.getGoodsName();
			goodsName = ObjectUtils.isEmpty(goodsName)?"":goodsName;
			BigDecimal goodsPrice = goodsInfo.getGoodsPrice();
			goodsPrice = ObjectUtils.isEmpty(goodsPrice)?BigDecimal.ZERO:goodsPrice;
			BigDecimal purchasePrice = goodsInfo.getPurchasePrice();
			purchasePrice =ObjectUtils.isEmpty(purchasePrice)?BigDecimal.ZERO:purchasePrice;
			orderGoods.setWholesaleInfo(wholesaleInfo);
			orderGoods.setWholesaleType(wholesaleType);
			orderGoods.setGoodsName(goodsName);
			orderGoods.setGoodsPrice(goodsPrice);
			orderGoods.setGoodsNum(goodsInfo.getGoodsNum());
			orderGoods.setGoodsImage(goodsInfo.getGoodsImage());
			orderGoods.setPoorMid(goodsInfo.getPoorMid());
			Integer poorMid = goodsInfo.getPoorMid();
			poorMid =ObjectUtils.isEmpty(poorMid)?0:poorMid;
			orderGoods.setPoorMid(poorMid);
			Byte poorType = goodsInfo.getPoorType();
			poorType =ObjectUtils.isEmpty(poorType)?new Byte("0"):poorType;
			orderGoods.setPoorType(poorType);
			String channel = goodsInfo.getChannel();
			channel =ObjectUtils.isEmpty(channel)?"":channel;
			orderGoods.setChannel(channel);
			Long goodsStorage = goodsInfo.getGoodsStorage();
			goodsStorage =ObjectUtils.isEmpty(goodsStorage)?0:goodsStorage;
			orderGoods.setGoodsStorage(goodsStorage);
			
			orderGoods.setGoodsSpec(goodsInfo.getGoodsSpec());
			
			orderGoods.setBuyerId(buyerId);
			orderGoods.setPurchasePrice(purchasePrice);
			Short mFeeRate=!ObjectUtils.isEmpty(goodsInfo.getmFeeRate())?goodsInfo.getmFeeRate():0;
			orderGoods.setmFeeRate(mFeeRate);
			orderGoods.setmFeeRate2(mFeeRate);
			if(!ObjectUtils.isEmpty(orderGoods.getGoodsCommonid())&&!ObjectUtils.isEmpty(sharedGoodsCommonId)&&orderGoods.getGoodsCommonid().equals(sharedGoodsCommonId)) {
				orderGoods.setSharedMid(sharedMid);
			}else {
				orderGoods.setSharedMid(0);
			}	
			
			orderGoods.setOwnerType(goodsInfo.getOwnerType());
			if(goodsInfo.getGoodsProjectType()==OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP) {
				orderGoods.setBocPointsPrice(goodsInfo.getBocPointsPrice());
				orderGoods.setBocPointRate(OrderUtil.getBocPointsRate().intValue());
				orderGoods.setGoodsCode(goodsInfo.getGoodsCode());
			}else {
				orderGoods.setBocPointsPrice(defaultmoney);
				orderGoods.setBocPointRate(0);
				orderGoods.setGoodsCode("");
			}
			 orderGoodsMapper.insertSelective(orderGoods);
			 recId = orderGoods.getRecId();
		}catch(Exception e) {
			logger.error("insert_order_goods:"+orderId,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_GOODS_FAIL,e.getMessage(),e);
		} 
		return recId;
	}
	/**
	 * 
	 * @param storeId店铺id
	 * @param remark 
	 * @param orderMessage买家留言
	 * @param weight
	 * @param transport_type
	 * @param goodsInfo
	 * @param recAddressInfo地址信息
	 * @return
	 * @throws CoreServiceException
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public Integer addOrderCommon(Integer orderId,Integer storeId,String remark ,String orderMessage,BigDecimal weight,Byte transport_type,GoodsInfo goodsInfo, SyAddress recAddressInfo) throws CoreServiceException {
		try {
			if(ObjectUtils.isEmpty(storeId)||ObjectUtils.isEmpty(orderId)) {
				throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
			}
			if(ObjectUtils.isEmpty(remark)) {
				remark="";
			}
			if(ObjectUtils.isEmpty(weight)) {
				weight=new BigDecimal(0);
			}
			if(ObjectUtils.isEmpty(transport_type)) {
				transport_type=new Byte("0");
			}
			SyOrderCommonWithBLOBs orderCommon=new SyOrderCommonWithBLOBs();
			orderCommon.setStoreId(storeId);
			orderCommon.setOrderMessage(orderMessage);
			Byte defaultnum=new Byte("0");
			orderCommon.setShippingExpressId(defaultnum);
			orderCommon.setShippingTime(0);
			orderCommon.setEvaluationTime(0);
			orderCommon.setEvalsellerTime(0);
			orderCommon.setEvalsellerState("0");
			orderCommon.setOrderPointscount(0);
			orderCommon.setDaddressId(0);
			orderCommon.setOrderId(orderId);
			orderCommon.setReciverProvinceId(0);
			String specName = goodsInfo.getSpecName();
			String specValue = goodsInfo.getSpecValue();
			String goodsAttr = goodsInfo.getGoodsAttr();
			specName= !ObjectUtils.isEmpty(specName)?specName:"";
			specValue= !ObjectUtils.isEmpty(specValue)?specValue:"";
			goodsAttr= !ObjectUtils.isEmpty(goodsAttr)?goodsAttr:"";
			String trueName = recAddressInfo.getTrueName();
			trueName= !ObjectUtils.isEmpty(trueName)?trueName:"";
			Byte poorType = goodsInfo.getPoorType();
			poorType= !ObjectUtils.isEmpty(poorType)?poorType:new Byte("0");
			orderCommon.setReciverName(trueName);
			orderCommon.setSpecName(specName);
			orderCommon.setSpecValue(specValue);
			orderCommon.setGoodsAttr(goodsAttr);
			orderCommon.setPoorType(poorType);
			
		
			Map<String,String> addressMap=new HashMap<String,String>();
			addressMap.put("address",recAddressInfo.getAreaInfo()+"&nbsp;"+recAddressInfo.getAddress());
			addressMap.put("phone",recAddressInfo.getTelPhone());
			
			String phpseriaStr = Pherialize.serialize(addressMap);
			orderCommon.setReciverInfo(phpseriaStr);
		
			orderCommonMapper.insertSelective(orderCommon);
			orderId=orderCommon.getOrderId();
		}catch(Exception e) {
			logger.error("insert_order_common:"+orderId,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_GOODS_FAIL,e.getMessage(),e);
		} 
		
		return  orderId;
	}
	/***
	 * 添加log
	 * @author zy
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public Integer addOrderLog(Integer orderId) {
		Integer LogId=null;
		try {
			SyOrderLog orderLog=new SyOrderLog();
			orderLog.setOrderId(orderId);
			orderLog.setLogRole("买家");
			orderLog.setLogMsg("提交了订单");
			orderLog.setLogOrderstate("1");
			orderLog.setLogTime(DateUtil.getNowInt());
			orderLogMapper.insertSelective(orderLog);
			LogId = orderLog.getLogId();
		}catch(Exception e) {
			logger.error("insert_order_log:"+orderId,e);
			throw new CoreServiceException(OrderServiceExcepType.INSERT_ORDER_LOG_FAIL,e.getMessage(),e);
		} 
	 return  LogId;
	}

	/**
	 * 处理订单信息(整合下单数据)
	 * @param disOrderGoods   处理前的订单信息
	 * @param userWords  	每单的卖家留言
	 * @param addressId  地址id
	 * @param memberId	用户id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public  Map<String, Object> dealOrder(Map<String, DisOrderGoodsInfo> disOrderGoods, Map<String, String> userWords, Long cityId,  Integer memberId,Integer voucherId) {
		Map<String, Object> allInfoData = new HashMap<String, Object>();
		// 计算扶贫码
		Map<String, CouponPayInfo> couponPayInfoData = couponService.getCouponPayInfoData(disOrderGoods, memberId);
		if(logger.isDebugEnabled()) {
			logger.info("order couponPayInfo:"+JSON.toJSONString(couponPayInfoData));
		}
		// 计算运费费
		Map<String, BigDecimal> transportFeeInfoData = orderService.goodsFreight(disOrderGoods, cityId);
		if(logger.isDebugEnabled()) {
			logger.info("order transportInfo:"+JSON.toJSONString(couponPayInfoData));
		}
		Map<String, Object> calOrderVoucherInfoDetail = voucherService.calOrderVoucherInfoDetail(memberId,disOrderGoods,voucherId);
		if(logger.isDebugEnabled()) {
			logger.info("order voucherInfo:"+JSON.toJSONString(calOrderVoucherInfoDetail));
		}
		Map<String, BigDecimal> vourchOrderData = (Map<String, BigDecimal>) calOrderVoucherInfoDetail.get("voucher_order_amount_list");
		Map<Integer, BigDecimal> vourchGoods = (Map<Integer, BigDecimal>) calOrderVoucherInfoDetail.get("voucher_goods_amount_list");
		SyVoucher vourchInfo = (SyVoucher) calOrderVoucherInfoDetail.get("voucher_info");
		String resultkey = (String) calOrderVoucherInfoDetail.get("cost_mode");

		Integer needPoints = 0;
		for (String key : disOrderGoods.keySet()) {
			if (couponPayInfoData != null) {
				disOrderGoods.get(key).setCouponPayInfo(couponPayInfoData.get(key));
			}
			if (transportFeeInfoData != null) {
				disOrderGoods.get(key).setShipFee(transportFeeInfoData.get(key));
			}
			if (!ObjectUtils.isEmpty(vourchOrderData) && !ObjectUtils.isEmpty(resultkey)) {
				if ("store_pay".equals(resultkey)) {
					disOrderGoods.get(key).setStoreDisCount(vourchOrderData.get(key));
					disOrderGoods.get(key).setPlatformDiscount(BigDecimal.ZERO);
				} else if ("platform_pay".equals(resultkey)) {
					disOrderGoods.get(key).setPlatformDiscount(vourchOrderData.get(key));
					disOrderGoods.get(key).setStoreDisCount(BigDecimal.ZERO);
				}

			}else {
				disOrderGoods.get(key).setStoreDisCount(BigDecimal.ZERO);
				disOrderGoods.get(key).setPlatformDiscount(BigDecimal.ZERO);
			}
			needPoints += disOrderGoods.get(key).getAllBocPointsUsed();
			// 每个订单所对应的用户留言
			if (ObjectUtils.isEmpty(userWords) || ObjectUtils.isEmpty(userWords.get(key))) {
				disOrderGoods.get(key).setOrderMessage("");
			} else {
				disOrderGoods.get(key).setOrderMessage(userWords.get(key));
			}
		}
		allInfoData.put("cost_mode", resultkey);
		allInfoData.put("voucher_goods_amount_map", vourchGoods);
		allInfoData.put("store_cart_map", disOrderGoods);
		allInfoData.put("needPoints", needPoints);
		allInfoData.put("vourchInfo", vourchInfo);
		return allInfoData;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public  Map<String, Object> calOrder(Map<String, DisOrderGoodsInfo> disOrderGoods, Map<String, String> userWords, Long cityId,  Integer memberId,Integer voucherId)throws CoreServiceException  {
		Map<String, Object> allInfoData = new HashMap<String, Object>();
		
		// 计算运费费
		Map<String, BigDecimal> transportFeeInfoData = orderService.goodsFreight(disOrderGoods, cityId);
		Map<String, Object> calOrderVoucherInfoDetail = voucherService.calOrderVoucherInfoDetail(memberId,disOrderGoods,voucherId);
		Map<String, BigDecimal> vourchOrderData = (Map<String, BigDecimal>) calOrderVoucherInfoDetail.get("voucher_order_amount_list");
		Map<Integer, BigDecimal> vourchGoods = (Map<Integer, BigDecimal>) calOrderVoucherInfoDetail.get("voucher_goods_amount_list");
		SyVoucher vourchInfo = (SyVoucher) calOrderVoucherInfoDetail.get("voucher_info");
		String resultkey = (String) calOrderVoucherInfoDetail.get("cost_mode");
		List<SyVoucher> actualVoucherList =(List<SyVoucher>)calOrderVoucherInfoDetail.get("actualVoucherList");
		
		for (String key : disOrderGoods.keySet()) {
			DisOrderGoodsInfo disOrderGoodsInfo = disOrderGoods.get(key);
			BigDecimal shipFee = BigDecimal.ZERO;
			if(!ObjectUtils.isEmpty(transportFeeInfoData)) {
				shipFee =ObjectUtils.isEmpty(transportFeeInfoData.get(key))?BigDecimal.ZERO:transportFeeInfoData.get(key);	
			}
		/*	BigDecimal orderStoreDisCount =BigDecimal.ZERO;
			BigDecimal orderplatDisCount =BigDecimal.ZERO;
			if (!ObjectUtils.isEmpty(vourchOrderData) && !ObjectUtils.isEmpty(resultkey)) {
				if ("store_pay".equals(resultkey)) {
					orderStoreDisCount= vourchOrderData.get(key);
				} else if ("platform_pay".equals(resultkey)) {
					orderplatDisCount = vourchOrderData.get(key);
				}

			}*/
			disOrderGoodsInfo.setShipFee(shipFee);
		}//end
		
		// 计算扶贫码
		Map<String, CouponPayInfo> couponPayInfoData = couponService.getCouponPayInfoData(disOrderGoods, memberId);
		
		Integer needPoints = 0;
		//贫困户可获得的金额
		BigDecimal allHelpFee=BigDecimal.ZERO;
		//善企捐赠
		BigDecimal allFundFee=BigDecimal.ZERO;
		//可获得积分
		Integer allCanGetPoints=0;
		//总支付的钱
		BigDecimal allPayMoney=BigDecimal.ZERO;
		//new shipfee
		
		
		Map<String, DisOrderGoodsInfo> disorders=new HashMap<String, DisOrderGoodsInfo> ();
		for (String key : disOrderGoods.keySet()) {
			DisOrderGoodsInfo disOrderGoodsInfo = disOrderGoods.get(key);
			BigDecimal orderStoreDisCount =BigDecimal.ZERO;
			BigDecimal orderplatDisCount =BigDecimal.ZERO;
			BigDecimal allGoodsAmount =BigDecimal.ZERO;
			BigDecimal orderAmount =BigDecimal.ZERO;
			BigDecimal moneyPay =BigDecimal.ZERO;
			BigDecimal shipFee = BigDecimal.ZERO;
			if(!ObjectUtils.isEmpty(transportFeeInfoData)) {
				shipFee =ObjectUtils.isEmpty(transportFeeInfoData.get(key))?BigDecimal.ZERO:transportFeeInfoData.get(key);	
			}
			BigDecimal couponPay =BigDecimal.ZERO;
			//需要的积分
			Integer  allBocPointsUsed = 0;
			
			if (!ObjectUtils.isEmpty(vourchOrderData) && !ObjectUtils.isEmpty(resultkey)) {
				if ("store_pay".equals(resultkey)) {
					orderStoreDisCount= vourchOrderData.get(key);
				} else if ("platform_pay".equals(resultkey)) {
					orderplatDisCount = vourchOrderData.get(key);
				}

			}
			
			 Integer goodsProjectType =0;
			 Integer assistId =0;
			
			List<GoodsInfo> goodsInfoList = disOrderGoodsInfo.getGoodsInfoList();
			for(GoodsInfo goodInfo:goodsInfoList) {
				BigDecimal storeDisCount =BigDecimal.ZERO;
				BigDecimal platDisCount =BigDecimal.ZERO;
				Integer goodsId = goodInfo.getGoodsId();
				Integer needPoint = 0;
				Integer needRate = 0;//使用默认需要积分比例
				BigDecimal goodsMoneyTotal = goodInfo.getGoodsMoneyTotal();
				assistId = goodInfo.getAssistId();
				goodsMoneyTotal =ObjectUtils.isEmpty(goodsMoneyTotal)?new BigDecimal("0.00"):goodsMoneyTotal;
				allGoodsAmount =allGoodsAmount.add(goodsMoneyTotal);
				goodsProjectType = goodInfo.getGoodsProjectType();
				//需要的积分数
				if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
					BigDecimal bocprice = goodInfo.getBocPointsPrice();
					bocprice =ObjectUtils.isEmpty(bocprice)?BigDecimal.ZERO:bocprice;
					needRate = OrderUtil.getBocPointsRate().intValue(); //使用默认需要积分比例
					needPoint=bocprice.multiply(new BigDecimal(needRate)).setScale(2, BigDecimal.ROUND_UP).intValue();
					Integer goodsNum = goodInfo.getGoodsNum();
					goodsNum = ObjectUtils.isEmpty(goodsNum)?0:goodsNum;
					allBocPointsUsed += needPoint*goodsNum;
				}
				goodInfo.setNeedPoint(needPoint);
				 //服务费率
				 //BigDecimal serviceFeeRate = OrderConstant.FeeRate.SERVICE_RATE;
				//BigDecimal  fundFeeRate = calculateFee.getFundFeeRate(goodsProjectType, publisherId, channel, assistId, ownerType);
				//因为运费并没有拆在商品上 所以只存费率
				BigDecimal voucherPrice  =BigDecimal.ZERO;
				if(!ObjectUtils.isEmpty(vourchGoods)) {
					if(!ObjectUtils.isEmpty(vourchGoods.get(goodsId))) {
						voucherPrice=vourchGoods.get(goodsId);
					}
				}
				if ("store_pay".equals(resultkey)) {
					storeDisCount=voucherPrice;
				} else if ("platform_pay".equals(resultkey)) {
					platDisCount = voucherPrice;
				}
				goodInfo.setPlatDiscount(platDisCount);
				goodInfo.setStoreDiscount(storeDisCount);
				goodInfo.setNeedPoint(needPoint);
				goodInfo.setNeedRate(needRate);
				
			}//end  goods
			
			disOrderGoodsInfo.setShipFee(shipFee);
			if (!ObjectUtils.isEmpty(couponPayInfoData) ) {
				CouponPayInfo couponPayInfo = couponPayInfoData.get(key);
				disOrderGoodsInfo.setCouponPayInfo(couponPayInfo);
				if(!ObjectUtils.isEmpty(couponPayInfo)&&assistId >0) {
					couponPay = couponPayInfo.getTotalCouponMoney();
				}
			}
			disOrderGoodsInfo.setCouponPay(couponPay);
			//这次支付的总积分
			needPoints +=allBocPointsUsed;
			//需要的积分
			disOrderGoodsInfo.setAllBocPointsUsed(allBocPointsUsed);
			disOrderGoodsInfo.setStoreDisCount(orderStoreDisCount);
			disOrderGoodsInfo.setPlatformDiscount(orderplatDisCount);
			disOrderGoodsInfo.setAllGoodsAmount(allGoodsAmount);
			orderAmount = (allGoodsAmount.add(shipFee).subtract(orderStoreDisCount)).setScale(2,BigDecimal.ROUND_UP );
			moneyPay =(orderAmount.subtract(orderplatDisCount).subtract(couponPay)).setScale(2,BigDecimal.ROUND_UP );
			disOrderGoodsInfo.setOrderAmount(orderAmount);
			disOrderGoodsInfo.setMoneyPay(moneyPay);
			disOrderGoodsInfo.setCouponPay(couponPay);
			calculateFee.getPreSumbitOrderMoney(disOrderGoodsInfo);
			if(logger.isDebugEnabled()) {
				logger.info("calculateFee getPreSumbitOrderMoney"+JSON.toJSONString(disOrderGoodsInfo));
			}
			
			// 每个订单所对应的用户留言
			if (ObjectUtils.isEmpty(userWords) || ObjectUtils.isEmpty(userWords.get(key))) {
				disOrderGoodsInfo.setOrderMessage("");
			} else {
				disOrderGoodsInfo.setOrderMessage(userWords.get(key));
			}
			Long orderSn =getPaySn(memberId);
			disOrderGoodsInfo.setOrderSn(orderSn);
			BigDecimal helpFee = disOrderGoodsInfo.getHelpFee();
			BigDecimal fundFee = disOrderGoodsInfo.getFundFee();
			BigDecimal buyerGetPoint = disOrderGoodsInfo.getBuyerGetPoint();
			
			helpFee = ObjectUtils.isEmpty(helpFee)?BigDecimal.ZERO:helpFee;
			allHelpFee = allHelpFee.add(helpFee);
			allPayMoney = allPayMoney.add(moneyPay);
			allFundFee.add(fundFee);
			allCanGetPoints += buyerGetPoint.intValue();
			disorders.put(key, disOrderGoodsInfo);
			
		}//end order
		List<VoucherBo> list=new ArrayList<VoucherBo>();
		if(!CollectionUtils.isEmpty(actualVoucherList)) {
			for(SyVoucher so:actualVoucherList) {
				Integer voucherId3 = so.getVoucherId();
				String ischeck="N";
				if(!ObjectUtils.isEmpty(vourchInfo)) {
					Integer voucherId2 = vourchInfo.getVoucherId();
					if(voucherId3==voucherId2) {
						ischeck="Y";
					}
				}
				VoucherBo bo=new VoucherBo();
				BeanUtils.copyProperties(so, bo);
				Integer voucherStartDate = so.getVoucherStartDate();
				Integer voucherEndDate = so.getVoucherEndDate();
				Long StartDate=ObjectUtils.isEmpty(voucherStartDate)?0L:voucherStartDate.longValue();
				Long endDate=ObjectUtils.isEmpty(voucherEndDate)?0L:voucherEndDate.longValue();
				String startDate =DateUtil.getIntegerNyr(StartDate);
				String endDate1 =DateUtil.getIntegerNyr(endDate);
				bo.setVoucherEndDate(endDate1);
				bo.setVoucherStartDate(startDate);
				String voucherStoreType = so.getVoucherStoreType();
				voucherStoreType =ObjectUtils.isEmpty(voucherStoreType)?"":voucherStoreType;
				bo.setVoucherStoreType(voucherStoreType);
				bo.setIscheck(ischeck);
				list.add(bo);
			}
		}
		allInfoData.put("cost_mode", resultkey);
		allInfoData.put("voucher_goods_amount_map", vourchGoods);
		allInfoData.put("store_cart_map", disorders);
		allInfoData.put("needPoints", needPoints);
		allInfoData.put("vourchInfo", vourchInfo);
		allInfoData.put("allHelpFee", allHelpFee);
		allInfoData.put("allPayMoney", allPayMoney);
		allInfoData.put("allFundFee", allFundFee);
		allInfoData.put("allCanGetPoints", allCanGetPoints);
		allInfoData.put("actualVoucherList", list);
		return allInfoData;
	}

}
