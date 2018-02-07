package com.shanyuan.platform.ms.core.user;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyCoupon;

public interface CouponService {
	/***
	 * 计算扶贫码
	 * @param disOrderGoods 
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	 Map<String,CouponPayInfo> getCouponPayInfoData(Map<String,DisOrderGoodsInfo> disOrderGoods,Integer memberId) throws CoreServiceException;
	 /**
	  * 获得个人的扶贫码
	  * @param memberId
	  * @param orderby
	  * @return
	  * @throws CoreServiceException
	  */
	 List<SyCoupon> getMemberCouponList(Integer memberId,String orderby) throws CoreServiceException ;
	 /**
	  * 添加扶贫码order 记录 更新相余额
	  * @param orderId
	  * @param memberId
	  * @param couponPayInfo
	  * @return
	  * @throws CoreServiceException
	  */
	 int addOrderCoupon(Integer orderId,Integer memberId,CouponPayInfo couponPayInfo) throws CoreServiceException;

	 /**
	  * 扶贫码冲正
	  * @param orderId
	  * @param memberId
	  * @param couponPayInfo
	  * @return CoreServiceException
	  * @author zhangwd
	  */
	 Boolean chongzhengCoupon(Integer orderId, Integer memberId, CouponPayInfo couponPayInfo) throws CoreServiceException;
	 
}
