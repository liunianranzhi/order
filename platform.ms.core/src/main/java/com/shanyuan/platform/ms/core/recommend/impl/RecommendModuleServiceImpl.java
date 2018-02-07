package com.shanyuan.platform.ms.core.recommend.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.recommend.RecommendModuleService;
import com.shanyuan.platform.ms.core.recommend.impl.exceptype.BizServiceExcepType;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModule;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModuleExample;
import com.shanyuan.platform.ms.dao.recommend.mapper.SyRecommendModuleMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/31
 *
 */
@Component
public class RecommendModuleServiceImpl implements RecommendModuleService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SyRecommendModuleMapper syRecommendModuleMapper;

	@Override
	public SyRecommendModule getInfoByModuleCode(String moduleCode) throws CoreServiceException {
		SyRecommendModuleExample syRecommendModuleExample = new SyRecommendModuleExample();
		syRecommendModuleExample.createCriteria().andModuleCodeEqualTo(moduleCode);
		List<SyRecommendModule> modules = syRecommendModuleMapper.selectByExample(syRecommendModuleExample);
		if(!CollectionUtils.isEmpty(modules)){
			return modules.get(0);
		}
		return null;
	}

	@Override
	public SyRecommendModule getInfoByCodeAndParendId(String moduleCode, Integer parendId) throws CoreServiceException {
		SyRecommendModuleExample syRecommendModuleExample = new SyRecommendModuleExample();
		if(!ObjectUtils.isEmpty(parendId)){
			syRecommendModuleExample.createCriteria().andModuleCodeEqualTo(moduleCode).andParentIdEqualTo(parendId);
		}else{
			syRecommendModuleExample.createCriteria().andModuleCodeEqualTo(moduleCode);
		}
		List<SyRecommendModule> modules = syRecommendModuleMapper.selectByExample(syRecommendModuleExample);
		if(!CollectionUtils.isEmpty(modules)){
			return modules.get(0);
		}
		return null;
	}
	
	@Override
	public List<SyRecommendModule> getSonRecommendModuleList(Integer recId) throws CoreServiceException{
		
		if (ObjectUtils.isEmpty(recId)) {
			logger.info("[推荐系统模块id为空]  recId={}", recId);
			throw new CoreServiceException(BizServiceExcepType.REC_ID_IS_NULL);
		}
		
		SyRecommendModuleExample syRecommendModuleExample = new SyRecommendModuleExample();
		syRecommendModuleExample.createCriteria().andParentIdEqualTo(recId);
		return syRecommendModuleMapper.selectByExample(syRecommendModuleExample);
	}

}
