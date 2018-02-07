package com.shanyuan.platform.ms.dao.recommend.mapper;

import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendPoor;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendPoorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyRecommendPoorMapper {
    int countByExample(SyRecommendPoorExample example);

    int deleteByExample(SyRecommendPoorExample example);

    int deleteByPrimaryKey(Integer recommendPid);

    int insert(SyRecommendPoor record);

    int insertSelective(SyRecommendPoor record);

    List<SyRecommendPoor> selectByExample(SyRecommendPoorExample example);

    SyRecommendPoor selectByPrimaryKey(Integer recommendPid);

    int updateByExampleSelective(@Param("record") SyRecommendPoor record, @Param("example") SyRecommendPoorExample example);

    int updateByExample(@Param("record") SyRecommendPoor record, @Param("example") SyRecommendPoorExample example);

    int updateByPrimaryKeySelective(SyRecommendPoor record);

    int updateByPrimaryKey(SyRecommendPoor record);
}