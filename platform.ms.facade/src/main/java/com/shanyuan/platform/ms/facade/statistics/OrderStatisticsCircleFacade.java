package com.shanyuan.platform.ms.facade.statistics;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.StatCircleInfoDomain;

/**
 * 
 * @author yangjian
 * @date 2017/12/27
 *
 */
public interface OrderStatisticsCircleFacade {
	
	/**
	 * 获取用户circle信息
	 * @author yangjian
	 * @param buyerId
	 * @return
	 */
	public StatCircleInfoDomain getBuyerCircleInfo(Integer buyerId);
	
	/**
	 * 查询map获取CircleInfo
	 * @param circleId
	 * @return
	 */
	public StatCircleInfoDomain getBuyerCircleInfoByMap(Integer circleId);
	
	public JSONObject getChannelUnion();
	
}
