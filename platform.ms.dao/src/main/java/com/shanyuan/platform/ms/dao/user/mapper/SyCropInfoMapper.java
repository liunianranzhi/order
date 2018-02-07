package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyCropInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyCropInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyCropInfoMapper {
    int countByExample(SyCropInfoExample example);

    int deleteByExample(SyCropInfoExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyCropInfo record);

    int insertSelective(SyCropInfo record);

    List<SyCropInfo> selectByExample(SyCropInfoExample example);

    SyCropInfo selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyCropInfo record, @Param("example") SyCropInfoExample example);

    int updateByExample(@Param("record") SyCropInfo record, @Param("example") SyCropInfoExample example);

    int updateByPrimaryKeySelective(SyCropInfo record);

    int updateByPrimaryKey(SyCropInfo record);
}