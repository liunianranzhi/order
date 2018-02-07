package com.shanyuan.platform.ms.dao.omorder.mapper;

import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderSettlement;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderSettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmOrderSettlementMapper {
    int countByExample(OmOrderSettlementExample example);

    int deleteByExample(OmOrderSettlementExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OmOrderSettlement record);

    int insertSelective(OmOrderSettlement record);

    List<OmOrderSettlement> selectByExample(OmOrderSettlementExample example);

    OmOrderSettlement selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OmOrderSettlement record, @Param("example") OmOrderSettlementExample example);

    int updateByExample(@Param("record") OmOrderSettlement record, @Param("example") OmOrderSettlementExample example);

    int updateByPrimaryKeySelective(OmOrderSettlement record);

    int updateByPrimaryKey(OmOrderSettlement record);
}