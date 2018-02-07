package com.shanyuan.platform.ms.dao.user.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorExample;

public interface SyPoorMapper {
    int countByExample(SyPoorExample example);

    int deleteByExample(SyPoorExample example);

    int deleteByPrimaryKey(Integer poorId);

    int insert(SyPoor record);

    int insertSelective(SyPoor record);

    List<SyPoor> selectByExample(SyPoorExample example);

    SyPoor selectByPrimaryKey(Integer poorId);

    int updateByExampleSelective(@Param("record") SyPoor record, @Param("example") SyPoorExample example);

    int updateByExample(@Param("record") SyPoor record, @Param("example") SyPoorExample example);

    int updateByPrimaryKeySelective(SyPoor record);

    int updateByPrimaryKey(SyPoor record);

	SyPoor selectPoorInfo(Integer publisherId);

	int selectPoorNum(Long areaId3);


	/**
	 * 查询贫困户的销售额
	 * @param list
	 * @return
	 * @author zhangwd
	 * 
	 */
	BigDecimal selectPoorSaleMoney(List<Long> areaId3s);

	/**
	 * 查询助理人的销售额
	 * @param list
	 * @return
	 * @author zhangwd
	 */
	BigDecimal selectAgentSaleMoney(List<Long> areaId3s);

}