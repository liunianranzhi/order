package com.shanyuan.platform.ms.core.store;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;

/**
 * @author 曹勇军
 *
 */
public interface SyAreaFullService {
	
	SyAreaFull getSyAreaFullById(Long areaId);
	
	/**
	 * 获取所有省份
	 * @author yangjian 
	 * @return
	 */
	List<SyAreaFull> getProvinceList() throws CoreServiceException;
	
	/**
	 * 根据父id查询列表
	 * @author yangjian
	 * @param parentId
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyAreaFull> getSyAreaFullByParentId(Long parentId) throws CoreServiceException;
}
