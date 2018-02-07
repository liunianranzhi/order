package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyPointsOrder;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyPointsOrderMapper {
    int countByExample(SyPointsOrderExample example);

    int deleteByExample(SyPointsOrderExample example);

    int deleteByPrimaryKey(Integer pointOrderid);

    int insert(SyPointsOrder record);

    int insertSelective(SyPointsOrder record);

    List<SyPointsOrder> selectByExample(SyPointsOrderExample example);

    SyPointsOrder selectByPrimaryKey(Integer pointOrderid);

    int updateByExampleSelective(@Param("record") SyPointsOrder record, @Param("example") SyPointsOrderExample example);

    int updateByExample(@Param("record") SyPointsOrder record, @Param("example") SyPointsOrderExample example);

    int updateByPrimaryKeySelective(SyPointsOrder record);

    int updateByPrimaryKey(SyPointsOrder record);
}