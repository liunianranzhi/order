package com.shanyuan.platform.ms.core.user.impl;


import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.mysql.jdbc.exceptions.jdbc4.MySQLTransactionRollbackException;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.user.CouponService;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo.CouponPay;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCoupon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCouponExample;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCouponExample.Criteria;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderCouponMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyCoupon;
import com.shanyuan.platform.ms.dao.user.entity.SyCouponExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyCouponMapper;


/**
 * 扶贫码
 * @author zy
 *
 */
@Component
public class CouponServiceImpl implements CouponService {
	
	private static final Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);
	
	@Autowired
	private SyCouponMapper couponMapper;
	@Autowired
	private SyOrderCouponMapper orderCouponMapper;
	/**
	 * 计算扶贫码
	 * @author zy
	 */
	@Override
	public Map<String,CouponPayInfo> getCouponPayInfoData(Map<String,DisOrderGoodsInfo> disOrderGoods,Integer memberId)throws CoreServiceException {
		List<SyCoupon> couponList = this.getMemberCouponList(memberId,"expired_time ");//查询该用有多少未过期购买权
		Map<String,CouponPayInfo> couponPayInfoData=new HashMap<String,CouponPayInfo>();//创捷一个map 存储key 和 CouponPayInfo对象（）
		if(couponList==null||couponList.size()<=0) {
			return couponPayInfoData;	
		}
		BigDecimal defaultnum=	new BigDecimal("0.00");
		
		for (String key :disOrderGoods.keySet()) {//
			boolean storeIsHaveCouponGoods=false;
			BigDecimal totalCouponGoodsMoney =new BigDecimal("0.00");//可以用扶贫电子码支付的商品总额
			List<GoodsInfo> list=disOrderGoods.get(key).getGoodsInfoList();
			DisOrderGoodsInfo ds = disOrderGoods.get(key);
			BigDecimal shipFee = ds.getShipFee();
			CouponPayInfo compnPayInfo=new CouponPayInfo();
			for(int i=0;i<list.size();i++) {
				GoodsInfo goodsInfo=list.get(i);
					if(goodsInfo.getAssistId()>0) {
						BigDecimal goodsMoneyTotal = goodsInfo.getGoodsMoneyTotal();
						BigDecimal tatal = ObjectUtils.isEmpty(goodsMoneyTotal)?defaultnum:goodsInfo.getGoodsMoneyTotal();
						totalCouponGoodsMoney = totalCouponGoodsMoney.add(tatal);
						storeIsHaveCouponGoods=true;
					}
			}
			totalCouponGoodsMoney = totalCouponGoodsMoney.add(shipFee);
			
			if(storeIsHaveCouponGoods) {
				BigDecimal totalCouponPayMoney=BigDecimal.ZERO;//扶贫码可以支付的金额
				for(int i=0;i<couponList.size();i++) {
					BigDecimal balance = couponList.get(i).getBalance();
					if(balance.compareTo(BigDecimal.ZERO) == 1) {//大于0的时候才可以使用
						if(totalCouponPayMoney.add(balance).compareTo(totalCouponGoodsMoney) == 1) {
							BigDecimal pay=totalCouponGoodsMoney.subtract(totalCouponPayMoney);
							totalCouponPayMoney=totalCouponPayMoney.add(pay);
							couponList.get(i).setBalance(balance.subtract(pay));
							//couponList.get(i).getCouponId();
							compnPayInfo.addDetail(
									couponList.get(i).getCouponCode(),
									couponList.get(i).getCouponBatchSn(),pay);
							break;
						}else {
							totalCouponPayMoney =totalCouponPayMoney.add(balance);
							couponList.get(i).setBalance(defaultnum);
							compnPayInfo.addDetail(
									couponList.get(i).getCouponCode(),
									couponList.get(i).getCouponBatchSn(),balance);
						}
					
					}
					
				}
				if(compnPayInfo.getTotalCouponMoney().compareTo(defaultnum) == 1) {
					couponPayInfoData.put(key,compnPayInfo);
				}
				
			}
			
		}
		return couponPayInfoData;
	}
		
	/**
	 * 查询个人有效的扶贫码
	 * @author zy
	 * @param coupon
	 * @param memberId
	 * @param orderby
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<SyCoupon> getMemberCouponList(Integer memberId,String orderby) throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		SyCouponExample coupon=	new SyCouponExample();
		int nowInt = DateUtil.getNowInt();
		orderby=ObjectUtils.isEmpty(orderby)?" expired_time ":orderby;
		coupon.createCriteria().andMemberIdEqualTo(memberId).andBalanceGreaterThan(new BigDecimal(0))
		.andStartTimeLessThanOrEqualTo(nowInt).andExpiredTimeGreaterThan(nowInt);
		coupon.setOrderByClause(orderby);
		return couponMapper.selectByExample(coupon);
	}
    /**
     * 添加记录和更新扶贫码余额
     * @author zy
     */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public int addOrderCoupon(Integer orderId, Integer memberId, CouponPayInfo couponPayInfo)
			throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)||ObjectUtils.isEmpty(orderId)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		 int id=0;
		 if(!ObjectUtils.isEmpty(couponPayInfo) && !ObjectUtils.isEmpty(couponPayInfo.getCouponPayList())){
			 
		 List<CouponPay> couponPayList = couponPayInfo.getCouponPayList();
		
		 try {
			 //TODO 未考虑扶贫码的并发 更新失敗 
			for(int i=0;i<couponPayList.size();i++) {
				CouponPay couponPay=couponPayList.get(i);
				SyCoupon sycoupon=	new SyCoupon();
				sycoupon.setCouponCode(couponPay.getCouponCode());
				sycoupon.setBalance(couponPay.getPay());
				sycoupon.setUsedTime(DateUtil.getNowInt());
				sycoupon.setMemberId(memberId);
				int affectRows1 =couponMapper.updateBlance(sycoupon);
				if(affectRows1>0) {
					SyOrderCoupon orderCoupon=new SyOrderCoupon();
					orderCoupon.setOrderId(orderId);
					orderCoupon.setBuyerId(memberId);
					String couponCode = couponPay.getCouponCode();
					couponCode = ObjectUtils.isEmpty(couponCode)?"":couponCode;
					Long couponBatchSn = couponPay.getCouponBatchSn();
					couponBatchSn = ObjectUtils.isEmpty(couponBatchSn)?0L:couponBatchSn;
					BigDecimal pay = couponPay.getPay();
					//单位分
					pay = ObjectUtils.isEmpty(pay)?new BigDecimal("0.00"):pay.multiply(new BigDecimal("100"));
					orderCoupon.setCouponCode(couponCode);
					orderCoupon.setCouponBatchSn(couponBatchSn);
					orderCoupon.setPay(pay);
					orderCoupon.setAddtime(DateUtil.getNowInt());
					id = orderCouponMapper.insertSelective(orderCoupon);
					
				}else {
					throw new CoreServiceException(OrderServiceExcepType.UPDATE_COUPON_BALANCE_FAIL,MessageFormat
							.format("[couponService][addOrderCoupon] 订单编号为:{0} 的订单扶贫码记录增加失败!", orderId));
				}
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			if(e instanceof DataIntegrityViolationException){
				throw new CoreServiceException(OrderServiceExcepType.UPDATE_COUPON_BALANCE_FAIL,MessageFormat.format("[couponService][addOrderCoupon] 订单编号为:{0} 的订单扶贫码记录增加失败!", orderId));
			}else if(e instanceof CoreServiceException) {
				throw (CoreServiceException)e;
			}else if (e instanceof MySQLTransactionRollbackException) {
				throw new CoreServiceException(OrderServiceExcepType.MYSQL_ROLLBACK_EXCEPTION,e.getMessage(),e);
			}else{
				throw new CoreServiceException(CoreServiceExcepType.DEFAULT_TYPE,e.getMessage(),e);
			}
		}
		 }
		return id;
	}
	
	 /**
	  * 扶贫码冲正
	  * @param ocId
	  * @param memberId
	  * @param couponPayInfo
	  * @return CoreServiceException
	  */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public Boolean chongzhengCoupon(Integer orderId, Integer memberId, CouponPayInfo couponPayInfo)
			throws CoreServiceException {
		
		if(ObjectUtils.isEmpty(memberId)||ObjectUtils.isEmpty(orderId)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");	
		}
		 List<CouponPay> couponPayList = couponPayInfo.getCouponPayList();
		//TODO 冲正问题 也是并发问题
			for(int i=0;i<couponPayList.size();i++) {
				CouponPay couponPay=couponPayList.get(i);
				SyCoupon sycoupon=	new SyCoupon();
				sycoupon.setCouponCode(couponPay.getCouponCode());
				sycoupon.setBalance(couponPay.getPay());
				sycoupon.setMemberId(memberId);
				
				int affectRows1 =couponMapper.updateChongzhengCoupon(sycoupon);
				
				if(affectRows1 > 0) {
					
					SyOrderCouponExample orderCoupon=new SyOrderCouponExample();
					Criteria criteria = orderCoupon.createCriteria();
					criteria.andOrderIdEqualTo(orderId);
					criteria.andBuyerIdEqualTo(memberId);
					
					String couponCode = couponPay.getCouponCode();
					couponCode = ObjectUtils.isEmpty(couponCode)?"":couponCode;
					Long couponBatchSn = couponPay.getCouponBatchSn();
					couponBatchSn = ObjectUtils.isEmpty(couponBatchSn)?0L:couponBatchSn;
					BigDecimal pay = couponPay.getPay();
					pay = ObjectUtils.isEmpty(pay)?new BigDecimal("0.00"):pay;
					
					criteria.andCouponCodeEqualTo(couponCode);
					criteria.andCouponBatchSnEqualTo(couponBatchSn);
					criteria.andPayEqualTo(pay);
					
					orderCouponMapper.deleteByExample(orderCoupon);
				}else {
					
					logger.info("扶贫码更新失败！");
					throw new CoreServiceException(OrderServiceExcepType.CHONGZHENG_COUPON_FAIL,"冲正扶贫码失败！");
				}
				
			}
		
		return true;
	}
}
