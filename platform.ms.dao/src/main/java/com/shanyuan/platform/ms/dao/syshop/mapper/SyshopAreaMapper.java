package com.shanyuan.platform.ms.dao.syshop.mapper;

import com.shanyuan.platform.ms.dao.syshop.entity.SyCompanyInfo;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopArea;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyshopAreaMapper {
    int countByExample(SyshopAreaExample example);

    int deleteByExample(SyshopAreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(SyshopArea record);

    int insertSelective(SyshopArea record);

    List<SyshopArea> selectByExample(SyshopAreaExample example);

    SyshopArea selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") SyshopArea record, @Param("example") SyshopAreaExample example);

    int updateByExample(@Param("record") SyshopArea record, @Param("example") SyshopAreaExample example);

    int updateByPrimaryKeySelective(SyshopArea record);

    int updateByPrimaryKey(SyshopArea record);
    
    List<SyCompanyInfo> selectSyCompanyInfo();
}