package com.shanyuan.platform.ms.facade.statistics;

import java.util.List;

import com.shanyuan.platform.ms.core.statistics.domain.PointDomain;

/**
 * 积分业务
 * @author yangjian
 * @date 2018/01/19
 *
 */
public interface PointStatisticsFacade {
	
	public List<PointDomain> getPointDetail(Integer unionId);
	
	public void dealPointDetailCount();

}
