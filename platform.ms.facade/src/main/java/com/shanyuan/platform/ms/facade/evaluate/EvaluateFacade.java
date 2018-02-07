package com.shanyuan.platform.ms.facade.evaluate;


import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;

public interface EvaluateFacade {
	/**一键好评
	 * @author 钟颖
	 * @param orderId
	 * @param memberId
	 * @param memberName
	 * @throws CoreServiceException
	 */
	void onePraise(Integer orderId,Integer memberId,String memberName) throws CoreServiceException;
	/** 评论列表
	 * @author 钟颖
	 * @param gevalOrderId
	 * @param memberId
	 * @param goodsCommonId
	 * @param pageSize
	 * @param currentPage
	 * @param type
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String ,Object>  getEvaluateGoodsManagerList(Integer gevalOrderId,Integer memberId ,Integer goodsCommonId ,Integer pageSize,Integer currentPage,String type)
			throws CoreServiceException;
	/**添加或编辑评价
	 * @author 钟颖
	 * @param goodsMap
	 * @param memberId
	 * @param orderid
	 * @param servicescores
	 * @param deliveryscores
	 * @param memberName
	 * @param isanonymous
	 * @param dotype
	 * @throws CoreServiceException
	 */
	void addEvaluate(String goodsMap,Integer memberId,Integer orderid,
			Integer servicescores,Integer deliveryscores,String memberName,String isanonymous,String dotype) throws CoreServiceException;
}
