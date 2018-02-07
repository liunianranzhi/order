package com.shanyuan.platform.ms.facade.statistics.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.JsonUtils;
import com.shanyuan.platform.ms.base.common.util.StatisticsUtils;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.store.CircleMemberService;
import com.shanyuan.platform.ms.core.store.CircleService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.facade.statistics.OrderStatisticsCircleFacade;
import com.shanyuan.platform.ms.facade.statistics.impl.domain.StatCircleInfoDomain;

@Component
public class OrderStatisticsCircleFacadeImpl implements OrderStatisticsCircleFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CircleMemberService circleMemberService;
	
	@Autowired
	private CircleService circleService;
	
	@Autowired
	private UnionService unionService;

	@Override
	@Cacheable(value = CommonRedisKey.OrderStatistics.STATISTICS_ORDER_MEMBER_CIRCLE_SET, key = "'"+CommonRedisKey.OrderStatistics.STATISTICS_ORDER_MEMBER_CIRCLE + "_' + #buyerId")
	public StatCircleInfoDomain getBuyerCircleInfo(Integer buyerId) {
		SyCircleMember circleMemberInfo = circleMemberService.getCircleMemberInfoByMemberId(buyerId);
		StatCircleInfoDomain result = new StatCircleInfoDomain();
		if(ObjectUtils.isEmpty(circleMemberInfo)){
			logger.info("用户未加入circle， memberid：{}", buyerId);
			return result;
		}
		List<SyCircle> list = new ArrayList<SyCircle>();
		SyCircle circle = circleService.selectByPrimaryKey(circleMemberInfo.getCircleId());
		SyCircle pCircle = circleService.selectByPrimaryKey(circle.getParentCircleId());
		list.add(circle);
		if(!ObjectUtils.isEmpty(pCircle)){
			list.add(pCircle);
			while(!UnionConstant.ParentCircle.PARENT_CIRCLE_ID.equals(pCircle.getCircleId())){
				pCircle = circleService.selectByPrimaryKey(pCircle.getParentCircleId());
				if(UnionConstant.ParentCircle.PARENT_CIRCLE_ID.equals(pCircle.getCircleId())){
					break;
				}
				if(!ObjectUtils.isEmpty(pCircle)){
					list.add(pCircle);
				}
			}
		}
		result = initCircleInfo(list);
		return result;
	}
	
	private StatCircleInfoDomain initCircleInfo(List<SyCircle> list){
		JSONObject json = new JSONObject(16, true);
		Collections.reverse(list);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < list.size(); i++){
			if(!ObjectUtils.isEmpty(list.get(i))){
				json.put("circleIdDeep" + (i + 1), list.get(i).getCircleId());
				sb.append(list.get(i).getCircleName());
				sb.append(",");
			}else{
				break;
			}
		}
		String circleName = "";
		if(sb.toString().endsWith(",")){
			circleName = sb.toString().substring(0, sb.toString().length() - 1);
		}
		json.put("circleName", circleName);
		return JsonUtils.jsonToPojo(json.toJSONString(), StatCircleInfoDomain.class);
			
	}

	
	/**
	 * 查询map获取CircleInfo
	 * @param circleId
	 * @return
	 */
	@Override
	public StatCircleInfoDomain getBuyerCircleInfoByMap(Integer circleId) {
		StatCircleInfoDomain result = new StatCircleInfoDomain();
		JSONObject circleJson = StatisticsUtils.getStatisticsUtils().getCircleInfo();
		List<SyCircle> list = new ArrayList<SyCircle>();
		SyCircle circle = (SyCircle) circleJson.get(circleId + "");
		if(ObjectUtils.isEmpty(circle)){
			return result;
		}
		SyCircle pCircle = (SyCircle) circleJson.get(circle.getParentCircleId() + "");
		list.add(circle);
		if(!ObjectUtils.isEmpty(pCircle)){
			if(ObjectUtils.isEmpty(pCircle.getParentCircleId())){
				return initCircleInfo(list);
			}else if(UnionConstant.ParentCircle.PARENT_CIRCLE_ID.equals(pCircle.getParentCircleId())){
				list.add(pCircle);
				return initCircleInfo(list);
			}
			list.add(pCircle);
			while(!ObjectUtils.isEmpty(pCircle) && !ObjectUtils.isEmpty(pCircle.getParentCircleId()) && !UnionConstant.ParentCircle.PARENT_CIRCLE_ID.equals(pCircle.getParentCircleId())){
				pCircle = (SyCircle) circleJson.get(pCircle.getParentCircleId() + "");
				list.add(pCircle);
			}
		}
		result = initCircleInfo(list);
		return result;
	}

	@Override
	public JSONObject getChannelUnion() {
		List<SyUnion> allValidUnionList = unionService.getAllUnion();
		JSONObject result = new JSONObject();
		for (SyUnion syUnion : allValidUnionList) {
			result.put(syUnion.getUnionChannel(), syUnion);
		}
		return result;
	}

}
