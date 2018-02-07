package com.shanyuan.platform.ms.core.store;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
public interface CircleService {

	/**
	 * 根据主键查询
	 * @param circleId
	 * @return
	 */
	SyCircle selectByPrimaryKey(Integer circleId) throws CoreServiceException;
	
	/**
	 * 根据名称和code查询
	 * @param name
	 * @param code
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyCircle> selectByNameAndCode(String name, String code) throws CoreServiceException;
	
	/**
	 * 根据code获取列表
	 * @param code
	 * @return
	 * @throws CoreServiceException
	 */
	SyCircle selectByCode(String code, Integer parentCircleId, String channel) throws CoreServiceException;
	
	/**
	 * 根据parentid获取parentid为此的列表
	 * @param parentCircleId
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyCircle> selectByParentId(Integer parentCircleId) throws CoreServiceException;
	
	List<SyCircle> getAllCircle() throws CoreServiceException;
	
}
