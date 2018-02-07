package com.shanyuan.platform.ms.facade.glory;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryTypeList;

/** 
 * @author  wang chunru 
 * @date    2017年12月6日 下午5:05:53 
 * @Description   
 */
public interface GloryFacade {
	
	/**
	 * 获取勋章列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return List<SyGloryTypeList>
	 * @throws
	 */
	List<SyGloryTypeList> getGloryList(Integer onlineState) throws CoreServiceException;
	/**
	 * 添加勋章
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	int addGlory(SyGloryTypeList glory) throws CoreServiceException;
	/**
	 * 修改勋章
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	int updateGlory(SyGloryTypeList glory) throws CoreServiceException;
	/**
	 * 删除勋章
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	int deleteGlory(Integer gloryId) throws CoreServiceException;

}
