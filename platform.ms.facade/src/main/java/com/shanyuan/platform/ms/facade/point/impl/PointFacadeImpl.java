package com.shanyuan.platform.ms.facade.point.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.shanyuan.platform.ms.base.common.util.JsonUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.PointServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.PointManageService;
import com.shanyuan.platform.ms.dao.user.entity.PointLogParam;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.facade.constant.UserFacadeConstant;
import com.shanyuan.platform.ms.facade.point.PointFacade;

/** 
 * @author  wang chunru 
 * @date    2017年12月4日 下午4:26:13 
 * @Description   
 */
@Component
public class PointFacadeImpl implements PointFacade {
	private final static Logger logger = LoggerFactory.getLogger(PointFacadeImpl.class);
	
	@Autowired
	private PointManageService pointManageService;
	/**
	 * 查询用户积分列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return Map<String,Object>
	 * @throws
	 */
	@Override
	public Map<String, Object> getUserPointList(Integer memberId, Integer pageNo) throws CoreServiceException{
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<SyPointsLog> pageinfo = new PageInfo<SyPointsLog>();
		pageinfo.setPageNum(pageNo);
		pageinfo.setPageSize(UserFacadeConstant.Pages.POINT_LIST_PAGE_SIZE);
		
		pageinfo = this.pointManageService.selectUserPointList(pageinfo,memberId);
		map.put("hasNext", pageinfo.isHasNextPage());
		map.put("pointList", pageinfo.getList());
		return map;
	}
	/**
	 * 添加积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	@Override
	public int addPoint(SyPointsLog pointLog) throws CoreServiceException {
		if(ObjectUtils.isEmpty(pointLog)){
			throw new CoreServiceException(PointServiceExcepType.POINT_NULL);
		}
		if(ObjectUtils.isEmpty(pointLog.getPlMemberid())){
			throw new CoreServiceException(PointServiceExcepType.POINT_MEMBER_ID_NULL);
		}
		if(StringUtils.isEmpty(pointLog.getPlMembername())){
			throw new CoreServiceException(PointServiceExcepType.POINT_MEMBER_NAME_NULL);
		}
		if(StringUtils.isEmpty(pointLog.getPlPoints())){
			throw new CoreServiceException(PointServiceExcepType.POINT_VALUE_NULL);
		}
		if(StringUtils.isEmpty(pointLog.getPlDesc())){
			throw new CoreServiceException(PointServiceExcepType.POINT_DESC_NULL);
		}
		if(StringUtils.isEmpty(pointLog.getPlStage())){
			throw new CoreServiceException(PointServiceExcepType.POINT_STAGE_NULL);
		}
		return this.pointManageService.savePointLog(pointLog);
	}
	
	@Override
	public Map<String, Object> getPointList(PointLogParam params)
			throws CoreServiceException {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		PageInfo<SyPointsLog> pageinfo = new PageInfo<SyPointsLog>();
		pageinfo.setPageNum(ObjectUtils.isEmpty(params.getPageNo()) ? UserFacadeConstant.Pages.PAGE_NUM : params.getPageNo());;
		pageinfo.setPageSize(ObjectUtils.isEmpty(params.getPageSize()) ? UserFacadeConstant.Pages.POINT_LIST_PAGE_SIZE : params.getPageSize());
		
		pageinfo = this.pointManageService.selectPointList(pageinfo,params);
		map.put("hasNext", pageinfo.isHasNextPage());
		String json = JSONObject.toJSONString(pageinfo.getList(),JsonUtils.filter);
		map.put("pointList", JSONObject.parse(json));
		return map;
	}
	/**
	 * 修改积分日志
	 */
	@Override
	public int updatePoint(SyPointsLog pointLog) throws CoreServiceException {
		
		return this.pointManageService.updatePoint(pointLog);
	}
	/**
	 * 删除积分日志
	 */
	@Override
	public int deletePoint(Integer pointLogId) throws CoreServiceException {
		
		return this.pointManageService.deletePointLog(pointLogId);
	}

}
