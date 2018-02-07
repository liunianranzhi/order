package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportAreaExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SySupportAreaMapper {
    int countByExample(SySupportAreaExample example);

    int deleteByExample(SySupportAreaExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SySupportArea record);

    int insertSelective(SySupportArea record);

    List<SySupportArea> selectByExample(SySupportAreaExample example);

    SySupportArea selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SySupportArea record, @Param("example") SySupportAreaExample example);

    int updateByExample(@Param("record") SySupportArea record, @Param("example") SySupportAreaExample example);

    int updateByPrimaryKeySelective(SySupportArea record);

    int updateByPrimaryKey(SySupportArea record);
    
    List<SySupportArea> selectProvince(String channel);
    
    List<SySupportArea> selectSupportAreaInfo(Map<String, Object> map);
    
}