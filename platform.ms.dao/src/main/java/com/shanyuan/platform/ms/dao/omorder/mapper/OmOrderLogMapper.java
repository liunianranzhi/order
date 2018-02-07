package com.shanyuan.platform.ms.dao.omorder.mapper;

import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderLog;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmOrderLogMapper {
    int countByExample(OmOrderLogExample example);

    int deleteByExample(OmOrderLogExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(OmOrderLog record);

    int insertSelective(OmOrderLog record);

    List<OmOrderLog> selectByExample(OmOrderLogExample example);

    OmOrderLog selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") OmOrderLog record, @Param("example") OmOrderLogExample example);

    int updateByExample(@Param("record") OmOrderLog record, @Param("example") OmOrderLogExample example);

    int updateByPrimaryKeySelective(OmOrderLog record);

    int updateByPrimaryKey(OmOrderLog record);
}