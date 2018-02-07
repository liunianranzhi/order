package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.bo.AreaBo;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleArea;

/**
 * 
 * @author sunyue
 *
 */
public interface ConditionService {
	
	/**
	 * 获取用户角色的查询条件   by sunyue
	 * @param circleId
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public List<Long> getQueryConditionForMember(Integer circleId, String channel) throws CoreServiceException;
	
	
	/**
	 * 获取通过渠道id获取联盟特产馆列表  
	 * @author sunyue
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AreaBo>  getSpecialtyStoresByUnionChannel (String channel) throws CoreServiceException;
	
	/**
	 * 获取县
	 * @param circleId
	 * @return
	 * @throws CoreServiceException
	 */
	public SyCircleArea getAreaid(Integer circleId) throws CoreServiceException;

	
	List<Long> getAreadIdsByChannel(String channel);
}
