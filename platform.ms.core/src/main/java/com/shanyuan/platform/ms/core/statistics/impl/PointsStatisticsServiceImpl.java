package com.shanyuan.platform.ms.core.statistics.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.PointsUtils;
import com.shanyuan.platform.ms.core.constant.MemberConstant;
import com.shanyuan.platform.ms.core.constant.PointConstant;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.statistics.PointsStatisticsService;
import com.shanyuan.platform.ms.core.statistics.domain.PointDomain;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.dao.statistics.entity.MemberPointsNum;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCount;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCountExample;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTag;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;
import com.shanyuan.platform.ms.dao.statistics.mapper.PointDetailsCountMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.PointDetailsTagMapper;
import com.shanyuan.platform.ms.dao.statistics.mapper.PointDetailsTagsMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMemberExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleMemberMapper;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionExample;
import com.shanyuan.platform.ms.dao.union.mapper.SyUnionMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLogExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyPointsLogMapper;
@Component
public class PointsStatisticsServiceImpl implements PointsStatisticsService{

	//用户积分明细
	@Autowired
	private SyMemberMapper syMemberMapper;
	
	@Autowired
	private SyUnionMapper syUnionMapper;
	
	@Autowired
	private SyCircleMemberMapper syCircleMemberMapper;
	
	@Autowired
	private PointDetailsTagMapper detailsTagMapper;
	
	@Autowired
	private SyPointsLogMapper logMapper;
	
	@Autowired
	private PointDetailsTagsMapper pointDetailsTagsMapper;
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private PointDetailsCountMapper pointDetailsCountMapper;
	
	@Override
	public int alterTempTableService(StatisticsTable statisticsTable) {
		int alterTempTable = detailsTagMapper.alterTempTable(statisticsTable);
		return alterTempTable;
	}
	
	public Page<SyPointsLog> getPointsInfosService(Integer memberId,Integer pageNum, Integer type){
		SyPointsLogExample example = new SyPointsLogExample();
		example.createCriteria().andPlMemberidEqualTo(memberId);
		Page<SyPointsLog> page;
		if(type.equals(StatisticsConstant.ReqType.LIST)){
			page = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
			logMapper.selectByExample(example);
		}else{
			page = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.LIMIT_PAGE);
			logMapper.selectByExample(example);
		}
		return page;
	}
	
	public Page<PointDetailsTag> getUserDetailsInfos(Long pointTag,String name,Integer unionId,String phone,String trueName,Integer currentPage, Integer type) {
			PointDetailsTag detailsTag = new PointDetailsTag();
		if(PointConstant.PointsTagNum.TOTAL_POINTS_NUM.equals(name)) {
			detailsTag.setTotalPointTag(pointTag);
			detailsTag.setUnionId(unionId);
			detailsTag.setMemberMobile(phone);
			detailsTag.setMemberTruename(trueName);
		}else {
			detailsTag.setValidPointTag(pointTag);
			detailsTag.setUnionId(unionId);
			detailsTag.setMemberMobile(phone);
			detailsTag.setMemberTruename(trueName);
		}
		Page<PointDetailsTag> startPage;
		if(type.equals(StatisticsConstant.ReqType.LIST)){
			startPage = PageHelper.startPage(currentPage, StatisticsConstant.currentPage.CURRENT_PAGE);
			detailsTagMapper.selectAllInfosByConditoin(detailsTag);
		}else{
			startPage = PageHelper.startPage(currentPage, StatisticsConstant.currentPage.LIMIT_PAGE);
			detailsTagMapper.selectAllInfosByConditoin(detailsTag);
		}
		return startPage;
	}
	
	public List<SyMember> getAllValidMemberInfo(Integer start, Integer limit) {
		SyMemberExample example = new SyMemberExample();
		example.createCriteria().andMemberStateEqualTo(MemberConstant.MemberState.MEMBER_OPEN_STATE);
		example.setOrderByClause("member_id LIMIT " + start + ","+ limit);
		List<SyMember> syMemberList = syMemberMapper.selectByExample(example);
		return syMemberList;
	}
	
	@Override
	public int createPointTempTable(StatisticsTable statisticsTable) {
		int result = detailsTagMapper.createNewTable(statisticsTable);
		return result;
	}
	
	public SyUnion getUnionByMemberId(Integer memberId) {
		SyCircleMemberExample circleMemberExample = new SyCircleMemberExample();
		circleMemberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyCircleMember> syCircleMemberList = syCircleMemberMapper.selectByExample(circleMemberExample);
		if(!ObjectUtils.isEmpty(syCircleMemberList)) {
			for (SyCircleMember syCircleMember : syCircleMemberList) {
				if(!StringUtils.isEmpty(syCircleMember.getCode())) {
					String code = syCircleMember.getCode();
					SyUnionExample syUnionExample = new SyUnionExample();
					syUnionExample.createCriteria().andUnionChannelEqualTo(code);
					List<SyUnion> selectByExample = syUnionMapper.selectByExample(syUnionExample);
					if(!ObjectUtils.isEmpty(selectByExample)) {
						return syUnionMapper.selectByExample(syUnionExample).get(0);
					}
				}
			}
		}
		return null;
	}
	
	public int batchInsertServiceImpl(List<PointDetailsTag> list) {
		return detailsTagMapper.batchInsert(list);
	}

	@Override
	public int dropTempTableService(StatisticsTable statisticsTable) {
		int dropTempTable = detailsTagMapper.dropTempTable(statisticsTable);
		return dropTempTable;
	}

	@Override
	public Page<MemberPointsNum> getTotalPointsNum(Integer unionId, Integer pageNum) {
		Page<MemberPointsNum> startPage = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
		pointDetailsTagsMapper.selectTotalPointsByUnionId(unionId);
		return startPage;
	}

	@Override
	public Page<MemberPointsNum> getValidPointsNum(Integer unionId, Integer pageNum) {
		Page<MemberPointsNum> startPage = PageHelper.startPage(pageNum, StatisticsConstant.currentPage.CURRENT_PAGE);
		pointDetailsTagsMapper.selectValidPointsByUnionId(unionId);
		return startPage;
	}

	@Override
	public List<PointDomain> getPointNum(Integer unionId) {
		List<PointDomain> result = new ArrayList<PointDomain>();
		for (Long tag : PointsUtils.getTags()) {
			Integer totalCount = pointDetailsTagsMapper.selectTotalNumByTagAndUnion(unionId, tag);
			Integer validCount = pointDetailsTagsMapper.selectValidNumByTagAndUnion(unionId, tag);
			PointDomain pointDomain;
			if(ObjectUtils.isEmpty(unionId)){
				
				pointDomain = new PointDomain(0, "所有联盟", tag, totalCount, validCount);
			}else{
				SyUnion union = unionService.getUnionById(unionId);
				pointDomain = new PointDomain(unionId, union.getUnionName(), tag, totalCount, validCount);
			}
			result.add(pointDomain);
		}
		return result;
	}
	
	public List<PointDetailsCount> getPointNumByTable(Integer unionId){
		PointDetailsCountExample example = new PointDetailsCountExample();
		example.createCriteria().andUnionIdEqualTo(unionId).andCTimeEqualTo(DateUtil.getYYYYMMDDByDate(new Date()));
		List<PointDetailsCount> selectByExample = pointDetailsCountMapper.selectByExample(example);
		return selectByExample;
	}
}
