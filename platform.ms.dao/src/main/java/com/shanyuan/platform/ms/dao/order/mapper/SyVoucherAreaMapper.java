package com.shanyuan.platform.ms.dao.order.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyVoucherArea;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherAreaExample;

public interface SyVoucherAreaMapper {
    int countByExample(SyVoucherAreaExample example);

    int deleteByExample(SyVoucherAreaExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyVoucherArea record);

    int insertSelective(SyVoucherArea record);

    List<SyVoucherArea> selectByExample(SyVoucherAreaExample example);

    SyVoucherArea selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyVoucherArea record, @Param("example") SyVoucherAreaExample example);

    int updateByExample(@Param("record") SyVoucherArea record, @Param("example") SyVoucherAreaExample example);

    int updateByPrimaryKeySelective(SyVoucherArea record);

    int updateByPrimaryKey(SyVoucherArea record);
}