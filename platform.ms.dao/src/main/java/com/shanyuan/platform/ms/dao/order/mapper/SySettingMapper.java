package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SySetting;
import com.shanyuan.platform.ms.dao.order.entity.SySettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SySettingMapper {
    int countByExample(SySettingExample example);

    int deleteByExample(SySettingExample example);

    int deleteByPrimaryKey(String name);

    int insert(SySetting record);

    int insertSelective(SySetting record);

    List<SySetting> selectByExampleWithBLOBs(SySettingExample example);

    List<SySetting> selectByExample(SySettingExample example);

    SySetting selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SySetting record, @Param("example") SySettingExample example);

    int updateByExampleWithBLOBs(@Param("record") SySetting record, @Param("example") SySettingExample example);

    int updateByExample(@Param("record") SySetting record, @Param("example") SySettingExample example);

    int updateByPrimaryKeySelective(SySetting record);

    int updateByPrimaryKeyWithBLOBs(SySetting record);
}