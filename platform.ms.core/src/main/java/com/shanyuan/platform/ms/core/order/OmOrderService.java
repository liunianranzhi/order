package com.shanyuan.platform.ms.core.order;


import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrder;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

public interface OmOrderService {
	
	String addOmOrder(DisOrderGoodsInfo dis,String type,String paySn,String orderStatus,Integer memberId) 
			throws CoreServiceException ;
	OmOrder  getOmOrder(DisOrderGoodsInfo dis,String type,String paySn,String orderStatus,Integer memberId)
			throws CoreServiceException;
	
	Integer addOmOrderGoods(GoodsInfo goodsInfo, String orderId,String mainId,Integer goodsHelpRate,Integer buyerId,
			Integer sharedMid,Integer sharedGoodsCommonId)
			throws CoreServiceException;

    Integer addOrderCoupon(String orderId, String mainId,Integer memberId, CouponPayInfo couponPayInfo)
			throws CoreServiceException;
	Integer addOrderVoucher(OmOrderVoucher voucher)throws CoreServiceException;
	Integer addOrderSettement(DisOrderGoodsInfo dis,String orderId,String mainId)
			throws CoreServiceException ;
	Integer addOmOrderShipping(String mainId,String orderId,SyAddress aressInfo) throws CoreServiceException ;
	String addOmOrderPayMent(String mainId,String orderId,DisOrderGoodsInfo dis) throws CoreServiceException;
}


