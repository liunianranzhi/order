package com.shanyuan.platform.ms.dao.statistics.mapper;

import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCount;
import com.shanyuan.platform.ms.dao.statistics.entity.PointDetailsCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointDetailsCountMapper {
    int countByExample(PointDetailsCountExample example);

    int deleteByExample(PointDetailsCountExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(PointDetailsCount record);

    int insertSelective(PointDetailsCount record);

    List<PointDetailsCount> selectByExample(PointDetailsCountExample example);

    PointDetailsCount selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") PointDetailsCount record, @Param("example") PointDetailsCountExample example);

    int updateByExample(@Param("record") PointDetailsCount record, @Param("example") PointDetailsCountExample example);

    int updateByPrimaryKeySelective(PointDetailsCount record);

    int updateByPrimaryKey(PointDetailsCount record);
    
    int batchInsert(@Param("records") List<PointDetailsCount> records);
}