package com.shanyuan.platform.ms.dao.union.mapper;

import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyAreaChannelMapper {
    int countByExample(SyAreaChannelExample example);

    int deleteByExample(SyAreaChannelExample example);

    int deleteByPrimaryKey(Integer acId);

    int insert(SyAreaChannel record);

    int insertSelective(SyAreaChannel record);

    List<SyAreaChannel> selectByExample(SyAreaChannelExample example);

    SyAreaChannel selectByPrimaryKey(Integer acId);

    int updateByExampleSelective(@Param("record") SyAreaChannel record, @Param("example") SyAreaChannelExample example);

    int updateByExample(@Param("record") SyAreaChannel record, @Param("example") SyAreaChannelExample example);

    int updateByPrimaryKeySelective(SyAreaChannel record);

    int updateByPrimaryKey(SyAreaChannel record);
    
    List<Long> getDistinctAreaId(Byte type);
    
}