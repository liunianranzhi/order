/**
 * 
 */
package com.shanyuan.platform.ms.facade.order;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.Future;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;

/**
 * @author 曹勇军
 *
 */
public interface NewOrderFacade {
	Future<Object> submitOmOrder(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
			,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonId,String status,SyAddress syAddress )throws CoreServiceException;
}
