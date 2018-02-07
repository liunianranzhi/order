/**
 * 
 */
package com.shanyuan.platform.ms.facade.order.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.order.OmOrderService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.facade.order.NewOrderFacade;

/**
 * @author 曹勇军
 *
 */
@Component
public class NewOrderFacadeImpl implements NewOrderFacade{

	private static final Logger logger = LoggerFactory.getLogger(NewOrderFacadeImpl.class);
	
	@Autowired
	private OmOrderService omOrderService;
	
	/**
	  * 订单 om order 相关 表的处理
	  * @author 钟颖
	  * @param paySn 支付编号
	  * @param voucherId 优惠券主键
	  *        voucherCode 优惠券码
	  *        voucherTId   优惠券模板主键
	  * @param newDisOrderGoodsInfoMap 订单列表
	  * @param memberId 买家id
	  * @param memberName 买家姓名
	  * @param memberTruename 真实姓名
	  * @param vourchGoods 优惠商品map
	  * @param sharedMid 分享者id
	  * @param sharedGoodsCommonId 分享商品id
	  * @param status 订单状态
	  * @param syAddress 收获地址信息
	  * @return
	  */
   @HystrixCommand
	@Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	public Future<Object> submitOmOrder(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
			,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonId,String status,SyAddress syAddress )throws CoreServiceException{
		
   	return new AsyncResult<Object>(){
   		@Override
           public Object invoke() {
   			
   			logger.info("-------------new table insert data--------------");
   			
   			DisOrderGoodsInfo disOrderGoodsInfo=null;
   			String mainId=paySn.toString();
   			for(String orderKey:newDisOrderGoodsInfoMap.keySet()){
   				disOrderGoodsInfo=newDisOrderGoodsInfoMap.get(orderKey);
   				//下单
   				String orderId = omOrderService.addOmOrder(disOrderGoodsInfo, OrderConstant.orderType.order_personal, mainId,status , memberId);
   				//支付信息
   				omOrderService.addOmOrderPayMent(mainId, orderId, disOrderGoodsInfo);
   				//物流信息
   				omOrderService.addOmOrderShipping(mainId, orderId, syAddress);
   				//插入扶贫码
   				if(!ObjectUtils.isEmpty(disOrderGoodsInfo.getCouponPayInfo())){
   					omOrderService.addOrderCoupon(orderId,mainId,memberId,disOrderGoodsInfo.getCouponPayInfo());
   				}
   				//TODO 预留
   				omOrderService.addOrderSettement(disOrderGoodsInfo, orderId, mainId);
   				//插入优惠券  ordergoods
   				List<GoodsInfo> goodsInfoList = disOrderGoodsInfo.getGoodsInfoList();
   				Integer helpRate = disOrderGoodsInfo.getHelpRate().intValue();
   				BigDecimal platformDiscount = disOrderGoodsInfo.getPlatformDiscount();
   				BigDecimal storeDisCount = disOrderGoodsInfo.getStoreDisCount();
   				platformDiscount =ObjectUtils.isEmpty(platformDiscount)?BigDecimal.ZERO:platformDiscount;
   				storeDisCount =ObjectUtils.isEmpty(storeDisCount)?BigDecimal.ZERO:storeDisCount;
   				for(GoodsInfo ginfo: goodsInfoList) {
   					//goodsHelpRate
   					omOrderService.addOmOrderGoods(ginfo , orderId, mainId, helpRate,memberId, sharedMid,sharedGoodsCommonId);
   				}
   				//每一单记录  优惠券///
   				Integer voucherPrice = (storeDisCount.add(platformDiscount)).intValue();
   				if(!ObjectUtils.isEmpty(vourchGoods)&&!ObjectUtils.isEmpty(voucherInfo)&&!ObjectUtils.isEmpty(voucherPrice)&&voucherPrice>0) {
   					OmOrderVoucher voucher=	new OmOrderVoucher();
   					voucher.setVoucherPrice(voucherPrice);
   					voucher.setUseTime(new Date());
   					voucher.setOrderId(orderId);
   					voucher.setMainId(mainId);
   					voucher.setMemberId(memberId);
   					voucher.setVoucherId(voucherInfo.getVoucherId());
   					voucher.setVoucherCode(voucherInfo.getVoucherCode());
   					voucher.setVoucherTplId(voucherInfo.getVoucherTId());
   					omOrderService.addOrderVoucher(voucher);
   				}
   				
   			}
   			return null;
           }
   	};
   	
   }
}
