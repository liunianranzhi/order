package com.shanyuan.platform.ms.dao.recommend.mapper;

import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModule;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyRecommendModuleMapper {
    int countByExample(SyRecommendModuleExample example);

    int deleteByExample(SyRecommendModuleExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyRecommendModule record);

    int insertSelective(SyRecommendModule record);

    List<SyRecommendModule> selectByExample(SyRecommendModuleExample example);

    SyRecommendModule selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyRecommendModule record, @Param("example") SyRecommendModuleExample example);

    int updateByExample(@Param("record") SyRecommendModule record, @Param("example") SyRecommendModuleExample example);

    int updateByPrimaryKeySelective(SyRecommendModule record);

    int updateByPrimaryKey(SyRecommendModule record);
}