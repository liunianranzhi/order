package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SySeller;
import com.shanyuan.platform.ms.dao.store.entity.SySellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SySellerMapper {
    int countByExample(SySellerExample example);

    int deleteByExample(SySellerExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(SySeller record);

    int insertSelective(SySeller record);

    List<SySeller> selectByExample(SySellerExample example);

    SySeller selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") SySeller record, @Param("example") SySellerExample example);

    int updateByExample(@Param("record") SySeller record, @Param("example") SySellerExample example);

    int updateByPrimaryKeySelective(SySeller record);

    int updateByPrimaryKey(SySeller record);
}