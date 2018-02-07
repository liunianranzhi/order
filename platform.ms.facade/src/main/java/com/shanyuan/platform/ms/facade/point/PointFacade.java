package com.shanyuan.platform.ms.facade.point;

import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.PointLogParam;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;

/** 
 * @author  wang chunru 
 * @date    2017年12月4日 下午4:25:37 
 * @Description   
 */
public interface PointFacade {
	/**
	 * 查询用户积分列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return Map<String,Object>
	 * @throws
	 */
	Map<String, Object> getUserPointList(Integer memberId, Integer pageNo) throws CoreServiceException;
	/**
	 * 添加积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	int addPoint(SyPointsLog pointLog) throws CoreServiceException;
	/**
	 * 获取积分列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return Map<String, Object>
	 * @throws
	 */
	Map<String, Object> getPointList(PointLogParam params) throws CoreServiceException;
	/**
	 * 修改积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	int updatePoint(SyPointsLog pointLog) throws CoreServiceException;
	/**
	 * 删除积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	int deletePoint(Integer pointLogId) throws CoreServiceException;

}
