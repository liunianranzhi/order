package com.shanyuan.platform.ms.dao.recommend.mapper;

import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendResource;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyRecommendResourceMapper {
    int countByExample(SyRecommendResourceExample example);

    int deleteByExample(SyRecommendResourceExample example);

    int deleteByPrimaryKey(Integer resId);

    int insert(SyRecommendResource record);

    int insertSelective(SyRecommendResource record);

    List<SyRecommendResource> selectByExample(SyRecommendResourceExample example);

    SyRecommendResource selectByPrimaryKey(Integer resId);

    int updateByExampleSelective(@Param("record") SyRecommendResource record, @Param("example") SyRecommendResourceExample example);

    int updateByExample(@Param("record") SyRecommendResource record, @Param("example") SyRecommendResourceExample example);

    int updateByPrimaryKeySelective(SyRecommendResource record);

    int updateByPrimaryKey(SyRecommendResource record);
}