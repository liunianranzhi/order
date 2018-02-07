package com.shanyuan.platform.ms.dao.project.mapper;

import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyOrder;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyProjectMoneyOrderMapper {
    int countByExample(SyProjectMoneyOrderExample example);

    int deleteByExample(SyProjectMoneyOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SyProjectMoneyOrder record);

    int insertSelective(SyProjectMoneyOrder record);

    List<SyProjectMoneyOrder> selectByExample(SyProjectMoneyOrderExample example);

    SyProjectMoneyOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SyProjectMoneyOrder record, @Param("example") SyProjectMoneyOrderExample example);

    int updateByExample(@Param("record") SyProjectMoneyOrder record, @Param("example") SyProjectMoneyOrderExample example);

    int updateByPrimaryKeySelective(SyProjectMoneyOrder record);

    int updateByPrimaryKey(SyProjectMoneyOrder record);
}