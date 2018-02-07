package com.shanyuan.platform.ms.core.recommend;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModule;

/**
 * 推荐系统模块
 * @author yangjian
 * @date 2017/10/31
 *
 */
public interface RecommendModuleService {

	/**
	 * 根据模块标识符获取模块
	 * @param moduleCode
	 * @return
	 */
	public SyRecommendModule getInfoByModuleCode(String moduleCode) throws CoreServiceException;
	
	/**
	 * 根据模块标识符和parentid获取模块
	 * 根据标识符可以获取唯一的模块，不需要parentid
	 * @param moduleCode
	 * @param parendId
	 * @return
	 * @throws CoreServiceException
	 */
	public SyRecommendModule getInfoByCodeAndParendId(String moduleCode, Integer parendId) throws CoreServiceException;

	/**
	 * 查询推荐系统模块的子模板列表
	 * @param recId  模板id
	 * @return
	 * @author zhangwd
	 */
	List<SyRecommendModule> getSonRecommendModuleList(Integer recId) throws CoreServiceException;

	
}
