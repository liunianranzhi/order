package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStore;

public interface EvaluateStore {
	/**
	 * 获得店铺评价单条
	 * @author 钟颖
	 * @param orderid
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyEvaluateStore>  getStoreEvaluateByOid(Integer orderid) throws CoreServiceException;
	/**
	 * 添加店铺评价
	 * @author 钟颖
	 * @param record
	 * @return
	 * @throws CoreServiceException
	 */
	int addStoreEvaluate(SyEvaluateStore record)throws CoreServiceException;
	/**
	 * @author 钟颖
	 * @param syOrderGoods
	 * @param orderId
	 * @param memberId
	 * @param memberName
	 * @param servicescores
	 * @param deliveryscores
	 * @return
	 * @throws CoreServiceException
	 */
	int insertStoreEvaluate(SyOrderGoods syOrderGoods,Integer orderId,Integer memberId,String 
			memberName,Integer servicescores,Integer deliveryscores	)throws CoreServiceException ;
}
