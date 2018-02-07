package com.shanyuan.platform.ms.core.goods.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.goods.ConditionService;
import com.shanyuan.platform.ms.core.goods.bo.AreaBo;
import com.shanyuan.platform.ms.core.store.SyAreaFullService;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleArea;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleAreaExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyAreaFullMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleAreaMapper;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannelExample;
import com.shanyuan.platform.ms.dao.union.mapper.SyAreaChannelMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Component
public class ConditionServiceImpl implements ConditionService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SyAreaChannelMapper syAreaChannelMapper;
	
	@Autowired
	private SyCircleAreaMapper  syCircleAreaMapper;
	
	@Autowired
	private SyAreaFullMapper  syAreaFullMapper;
	
	@Autowired
	private SyAreaFullService  syAreaFullService;

	/**
	 * 获取用户角色的查询条件 by sunyue
	 *
	 * @param circleId
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<Long> getQueryConditionForMember(Integer circleId, String channel) throws CoreServiceException {
		List<Long> areaIds = new ArrayList<>();
		if (LoginConstant.CircleCode.CODE_YKJLB.equalsIgnoreCase(channel)) {
			return areaIds;
		}
		if(!ObjectUtils.isEmpty(circleId)) {
			logger.info("该用户已登录，圈子id为:{}", circleId);
			// php 从redis 中取  改为 从circle_area 表中查
			SyCircleArea sca = this.getAreaid(circleId);
			if (!ObjectUtils.isEmpty(sca)) {
				String area_str = sca.getAreaIdStr();
				if (!StringUtils.isEmpty(area_str)) {
					areaIds = Arrays.asList(Long.valueOf(area_str));
					return areaIds;
				}
			}else {    // 没有登陆
				if (!StringUtils.isEmpty(channel)) {
					SyAreaChannelExample sace = new SyAreaChannelExample();
					sace.createCriteria().andUnionChannelEqualTo(channel)
							.andTypeEqualTo(GoodsConstant.AgentChannelType.AREA_CHANNEL_HELP);
					List<SyAreaChannel> areaChannelList = syAreaChannelMapper.selectByExample(sace);
					if (!ObjectUtils.isEmpty(areaChannelList)) {
						for (SyAreaChannel syAreaChannel : areaChannelList) {
							areaIds.add(syAreaChannel.getAreaId().longValue());
						}
						return areaIds;
					}
				}
			}
		}else {    // 没有登陆
			if (!StringUtils.isEmpty(channel)) {
				SyAreaChannelExample sace = new SyAreaChannelExample();
				sace.createCriteria().andUnionChannelEqualTo(channel)
						.andTypeEqualTo(GoodsConstant.AgentChannelType.AREA_CHANNEL_HELP);
				List<SyAreaChannel> areaChannelList = syAreaChannelMapper.selectByExample(sace);
				if (!ObjectUtils.isEmpty(areaChannelList)) {
					for (SyAreaChannel syAreaChannel : areaChannelList) {
						areaIds.add(syAreaChannel.getAreaId().longValue());
					}
					return areaIds;
				}
			}
		}
		return areaIds;	
	}
	
	@Override
	public List<Long> getAreadIdsByChannel(String channel){
		List<Long> areaIds = new ArrayList<>();
		if (!StringUtils.isEmpty(channel)) {
			SyAreaChannelExample sace = new SyAreaChannelExample();
			sace.createCriteria().andUnionChannelEqualTo(channel)
					.andTypeEqualTo(GoodsConstant.AgentChannelType.AREA_CHANNEL_HELP);
			List<SyAreaChannel> areaChannelList = syAreaChannelMapper.selectByExample(sace);
			if (!ObjectUtils.isEmpty(areaChannelList)) {
				for (SyAreaChannel syAreaChannel : areaChannelList) {
					areaIds.add(syAreaChannel.getAreaId().longValue());
				}
				return areaIds;
			}
		}
		return areaIds;
	}
	
	/**
	 * 获取县 的id
	 * @param circleId
	 * @return
	 */
	public SyCircleArea getAreaid(Integer circleId) {
		SyCircleAreaExample scae = new SyCircleAreaExample();
		scae.createCriteria().andCircleIdEqualTo(circleId);
		List<SyCircleArea> sca = syCircleAreaMapper.selectByExample(scae);
		if(!ObjectUtils.isEmpty(sca)) {
			return sca.get(0);
		}
		return null;
	}

	
	/**
	 * 获取通过渠道id获取联盟特产馆列表  
	 * @author sunyue
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<AreaBo> getSpecialtyStoresByUnionChannel (String channel){
		List<AreaBo> result = new ArrayList<>();
		SyAreaChannelExample sace = new SyAreaChannelExample();
		sace.createCriteria().andUnionChannelEqualTo(channel).andStoreScoreGreaterThan((short)0);
		sace.setOrderByClause("store_score desc");
		List<SyAreaChannel> areaChannelInfo = this.syAreaChannelMapper.selectByExample(sace);
		
		if(!CollectionUtils.isEmpty(areaChannelInfo)) {
			for (SyAreaChannel syAreaChannel : areaChannelInfo) {
				SyAreaFull areaInfo = this.syAreaFullMapper.selectByPrimaryKey(syAreaChannel.getAreaId());
				SyAreaFull cityInfo = syAreaFullMapper.selectByPrimaryKey(areaInfo.getAreaParentId());
				SyAreaFull provinceInfo = syAreaFullMapper.selectByPrimaryKey(cityInfo.getAreaParentId());
				AreaBo ab = new AreaBo(areaInfo.getAreaId(),cityInfo.getAreaId(),provinceInfo.getAreaId(),areaInfo.getAreaName(),cityInfo.getAreaName(),provinceInfo.getAreaName(), syAreaChannel.getSpecialtyStore());
				result.add(ab);
			}
		}
		if(CollectionUtils.isEmpty(result)) {
			return null;
		}
		return result;
	}
	
}

