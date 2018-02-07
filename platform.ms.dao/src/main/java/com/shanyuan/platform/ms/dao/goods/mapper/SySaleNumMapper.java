package com.shanyuan.platform.ms.dao.goods.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.goods.entity.SySaleNum;
import com.shanyuan.platform.ms.dao.goods.entity.SySaleNumExample;

public interface SySaleNumMapper {
    int countByExample(SySaleNumExample example);

    int deleteByExample(SySaleNumExample example);

    int insert(SySaleNum record);

    int insertSelective(SySaleNum record);

    List<SySaleNum> selectByExample(SySaleNumExample example);

    int updateByExampleSelective(@Param("record") SySaleNum record, @Param("example") SySaleNumExample example);

    int updateByExample(@Param("record") SySaleNum record, @Param("example") SySaleNumExample example);
    
    void updateSaleNum(SySaleNum record);
} 