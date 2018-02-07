package com.shanyuan.platform.ms.facade.statistics.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.core.statistics.PointDetailsCountService;
import com.shanyuan.platform.ms.core.statistics.PointsStatisticsService;
import com.shanyuan.platform.ms.core.statistics.domain.PointDomain;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCount;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.facade.statistics.PointStatisticsFacade;

/**
 * 
 * @author yangjian
 * @date 2018/01/19
 *
 */
@Component
public class PointStatisticsFacadeImpl implements PointStatisticsFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PointsStatisticsService pointsStatisticsService;
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private PointDetailsCountService pointDetailsCountService;

	@Override
	public List<PointDomain> getPointDetail(Integer unionId) {
		List<PointDetailsCount> detailsByTime = pointDetailsCountService.getDetailsByTime(DateUtil.getYYYYMMDDByDate(DateUtil.getNowDate()),unionId);
		List<PointDomain> pointNum = new ArrayList<PointDomain>();
		for (PointDetailsCount pointDetailsCount : detailsByTime) {
			PointDomain p = new PointDomain();
			BeanUtils.copyProperties(pointDetailsCount, p);
			pointNum.add(p);
		}
//		List<PointDomain> pointNum = pointsStatisticsService.getPointNum(unionId);
		return pointNum;
	}

	@Override
	public void dealPointDetailCount() {
		logger.info("start deal point count for all union");
		List<PointDetailsCount> records = new ArrayList<PointDetailsCount>();
		Integer cTime = DateUtil.getYYYYMMDDByDate(new Date());
		List<SyUnion> allUnion = unionService.getAllUnion();
		for (SyUnion syUnion : allUnion) {
			List<PointDomain> pointNum = pointsStatisticsService.getPointNum(syUnion.getUnionId());
			for (PointDomain pointDomain : pointNum) {
				PointDetailsCount count = new PointDetailsCount(pointDomain.getUnionId(), syUnion.getUnionChannel(), 
						syUnion.getUnionName(), pointDomain.getTag(), pointDomain.getTotalNum(), pointDomain.getValidNum(), cTime);
				records.add(count);
			}
			
		}
		List<PointDomain> pointNum = pointsStatisticsService.getPointNum(null);
		for (PointDomain pointDomain : pointNum) {
			PointDetailsCount count = new PointDetailsCount(0, "", 
					"所有联盟", pointDomain.getTag(), pointDomain.getTotalNum(), pointDomain.getValidNum(), cTime);
			records.add(count);
		}
		pointDetailsCountService.batchInsert(records);
		logger.info("end deal point count for all union");
	}

}
