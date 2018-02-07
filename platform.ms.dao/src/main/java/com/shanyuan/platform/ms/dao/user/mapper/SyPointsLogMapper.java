package com.shanyuan.platform.ms.dao.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLogExample;

public interface SyPointsLogMapper {
    int countByExample(SyPointsLogExample example);

    int deleteByExample(SyPointsLogExample example);

    int deleteByPrimaryKey(Integer plId);

    int insert(SyPointsLog record);

    int insertSelective(SyPointsLog record);

    List<SyPointsLog> selectByExample(SyPointsLogExample example);
    
    SyPointsLog selectByExampleDetail(SyPointsLogExample example);

    SyPointsLog selectByPrimaryKey(Integer plId);

    int updateByExampleSelective(@Param("record") SyPointsLog record, @Param("example") SyPointsLogExample example);

    int updateByExample(@Param("record") SyPointsLog record, @Param("example") SyPointsLogExample example);

    int updateByPrimaryKeySelective(SyPointsLog record);

    int updateByPrimaryKey(SyPointsLog record);
    /**
     * 查询用户积分列表
     * @Author wang chunru
     * @Description 
     * @param 
     * @return List<SyPointsLog>
     * @throws
     */
	List<SyPointsLog> selectUserPointList(Integer memberId);
	/**
     * 查询积分列表
     * @Author wang chunru
     * @Description 
     * @param 
     * @return List<SyPointsLog>
     * @throws
     */
	List<SyPointsLog> selectPointList(PageInfo<SyPointsLog> pageinfo);
}