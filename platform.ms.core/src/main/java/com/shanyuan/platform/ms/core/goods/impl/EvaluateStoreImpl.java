package com.shanyuan.platform.ms.core.goods.impl;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.EvaluateStore;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.EvaluateExcepType;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStore;
import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStoreExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyEvaluateStoreMapper;
/**
 * 
 * @author zhongying
 *
 */
@Component
public class EvaluateStoreImpl implements EvaluateStore{
	
	private static final Logger logger = LoggerFactory.getLogger(EvaluateStoreImpl.class);
	@Autowired
	private SyEvaluateStoreMapper  syEvaluateStoreMapper;
	
	/**
	 * 
	 * @param orderid
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyEvaluateStore>  getStoreEvaluateByOid(Integer orderid) throws CoreServiceException{
		SyEvaluateStoreExample example =new SyEvaluateStoreExample();
		example.createCriteria().andSevalOrderidEqualTo(orderid);
		List<SyEvaluateStore> selectByExample = syEvaluateStoreMapper.selectByExample(example);
		return selectByExample;
	}
	/**
	 * by zy
	 */
	public int insertStoreEvaluate(SyOrderGoods syOrderGoods,Integer orderId,Integer memberId,String 
			memberName,Integer servicescores,Integer deliveryscores	)throws CoreServiceException {
		int row = 0;
		try {
			Integer publisherId = syOrderGoods.getPublisherId();
			Integer storeId = syOrderGoods.getStoreId();
			publisherId = ObjectUtils.isEmpty(publisherId)?0:publisherId;
			storeId = ObjectUtils.isEmpty(storeId)?0:storeId;
			Long orderSn = syOrderGoods.getOrderSn();
			String orderno = ObjectUtils.isEmpty(orderSn)?"":orderSn.toString();
			SyEvaluateStore record =new SyEvaluateStore();
			record.setSevalOrderid(orderId);
			record.setSevalOrderno(orderno);
			record.setSevalStoreid(storeId);
			record.setPublisherId(publisherId);
			record.setSevalStorename(storeId.toString());
			record.setSevalMemberid(memberId);
			record.setSevalMembername(memberName);
			record.setSevalServicecredit(servicescores.byteValue());
			record.setSevalDeliverycredit(deliveryscores.byteValue());
			record.setSevalAddtime(DateUtil.getNowInt());
			record.setSevalType(new Byte("1"));
			row = this.addStoreEvaluate(record);
		}catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("evaluate store 新增评论失败！");
			throw new CoreServiceException(EvaluateExcepType.INSERT_EVALUATE_STORE,"新增店铺评论失败！",e);
		}
		return row;
	}
	/*by zy
	 * 评价店铺
	 */
	public int addStoreEvaluate(SyEvaluateStore record)throws CoreServiceException {
		int i=0;
		try {
			i = syEvaluateStoreMapper.insertSelective(record);
		}catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("evaluate store 新增评论失败！");
			throw new CoreServiceException(EvaluateExcepType.INSERT_EVALUATE_STORE,"新增店铺评论失败！",e);
		}
		return i;
	}
}
