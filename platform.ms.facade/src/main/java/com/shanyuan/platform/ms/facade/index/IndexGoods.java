package com.shanyuan.platform.ms.facade.index;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;


public interface IndexGoods {
	

	/**
	 * 大家帮 添加缓存接口
	 * @param memberId
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	 IndexGoodsDomain getHelpGoodsList(Integer memberId, String channel) throws CoreServiceException;
	 /**
	  * 优秀主理人
	  * @param memberId
	  * @param channel
	  * @return
	  * @throws CoreServiceException
	  */
	 IndexGoodsDomain getAgentList(Integer memberId, String channel) throws CoreServiceException;
	 /**
	  * 子联盟商品   添加缓存
	  * @param unionCode
	  * @return
	  * @throws CoreServiceException
	  */
	 IndexGoodsDomain getUnionItemGoodsList(String unionCode) throws CoreServiceException;
	/**
	 * 特产馆  添加缓存
	 * @param memberId
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	 IndexGoodsDomain getSpecialGoodsList(Integer memberId, String channel) throws CoreServiceException ;

}
