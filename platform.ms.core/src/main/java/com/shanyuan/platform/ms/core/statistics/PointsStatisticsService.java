package com.shanyuan.platform.ms.core.statistics;

import java.util.List;

import com.github.pagehelper.Page;
import com.shanyuan.platform.ms.core.statistics.domain.PointDomain;
import com.shanyuan.platform.ms.dao.statistics.entity.MemberPointsNum;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsTag;
import com.shanyuan.platform.ms.dao.statistics.entity.StatisticsTable;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;

public interface PointsStatisticsService {

	/**
	 * 分批次获取有效会员信息
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<SyMember> getAllValidMemberInfo(Integer start, Integer limit);
	
	public SyUnion getUnionByMemberId(Integer memberId);
	
	public int batchInsertServiceImpl(List<PointDetailsTag> list);
	
	public Page<PointDetailsTag> getUserDetailsInfos(Long pointTag,String name,Integer unionId,String phone,String trueName,Integer currentPage, Integer type);
	
	public Page<SyPointsLog> getPointsInfosService(Integer memberId,Integer pageNum, Integer type);
	
	int createPointTempTable(StatisticsTable statisticsTable);
	
	int alterTempTableService(StatisticsTable statisticsTable);
	
	int dropTempTableService(StatisticsTable statisticsTable);
	
	/**
	 * 根据联盟获取累计积分人数和可用积分人数
	 */
	public Page<MemberPointsNum> getTotalPointsNum(Integer unionId, Integer pageNum);
	
	public Page<MemberPointsNum> getValidPointsNum(Integer unionId, Integer pageNum);
	
	/**
	 * @author yangjian
	 * @param unionId
	 * @return
	 */
	public List<PointDomain> getPointNum(Integer unionId);
	
}
