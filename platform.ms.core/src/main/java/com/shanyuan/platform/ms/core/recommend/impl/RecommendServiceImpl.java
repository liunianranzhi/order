package com.shanyuan.platform.ms.core.recommend.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.IndexConstant;
import com.shanyuan.platform.ms.core.constant.RecommendConstant;
import com.shanyuan.platform.ms.core.constant.RecommendConstant.RecommendStatus;
import com.shanyuan.platform.ms.core.recommend.RecommendModuleService;
import com.shanyuan.platform.ms.core.recommend.RecommendService;
import com.shanyuan.platform.ms.core.recommend.impl.exceptype.BizServiceExcepType;
import com.shanyuan.platform.ms.dao.recommend.entity.RecommendGoodsBo;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommend;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendExample;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendExample.Criteria;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModule;
import com.shanyuan.platform.ms.dao.recommend.mapper.SyRecommendMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/31
 *
 */
@Component
public class RecommendServiceImpl implements RecommendService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SyRecommendMapper syRecommendMapper;
	
	@Autowired
	private RecommendModuleService recommendModuleService;
	
	//TODO redis
	@Override
	public List<SyRecommend> getRecommend(String channel, String type, Integer parentId) throws CoreServiceException {
		List<SyRecommend> recommends = new ArrayList<SyRecommend>(); 
		SyRecommendModule syRecommendModule = recommendModuleService.getInfoByCodeAndParendId(type, parentId);
		SyRecommendExample syRecommendExample = new SyRecommendExample();
		if(!StringUtils.isEmpty(channel)){
			syRecommendExample.createCriteria().andChannelEqualTo(channel)
			.andStatusEqualTo(IndexConstant.IndexPopStatus.INDEX_POP_B)
			.andModuleIdEqualTo(syRecommendModule.getRecId());
			syRecommendExample.setOrderByClause("update_time desc limit 3");
			recommends = syRecommendMapper.selectByExample(syRecommendExample);
			return recommends;
		}else{
			syRecommendExample.createCriteria().andChannelEqualTo(RecommendConstant.RecommendModuleCode.ALLUNION)
			.andStatusEqualTo(IndexConstant.IndexPopStatus.INDEX_POP_B)
			.andModuleIdEqualTo(syRecommendModule.getRecId());
			recommends = syRecommendMapper.selectByExample(syRecommendExample);
			return recommends;
		}
	}

	@Override
	public List<SyRecommend> getAdList(String channel) throws CoreServiceException {
		SyRecommendExample syRecommendExample = new SyRecommendExample();
		int time = DateUtil.getNowInt();
		Criteria criteria = syRecommendExample.createCriteria()
				.andStatusEqualTo((byte) 1)
				.andBannerIdGreaterThan((byte) 0)
				.andStartTimeLessThan(time)
				.andEndTimeGreaterThan(time);
		if(!StringUtils.isEmpty(channel)){
			criteria.andChannelEqualTo(channel);
		}
		List<SyRecommend> recommends = syRecommendMapper.selectByExample(syRecommendExample);
		if(!CollectionUtils.isEmpty(recommends)){
			return recommends;
		}
		return new ArrayList<SyRecommend>();
	}
	
	@Override
	public List<RecommendGoodsBo> getRecommendGoodsByBizModule(Integer recId, Byte status) {
		
		if (ObjectUtils.isEmpty(recId)) {
			logger.info("[推荐系统模块id为空]  recId={}", recId);
			throw  new CoreServiceException(BizServiceExcepType.REC_ID_IS_NULL);
		}
		if (ObjectUtils.isEmpty(status)) {  //为空，给默认值
			status = RecommendStatus.ENABLE;
		}
		
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("recId", recId);
		hashMap.put("status", status);
		return syRecommendMapper.selectRecommendGoodsByBizModule(hashMap);
	}

}
