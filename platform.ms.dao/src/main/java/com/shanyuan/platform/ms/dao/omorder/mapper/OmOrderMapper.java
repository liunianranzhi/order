package com.shanyuan.platform.ms.dao.omorder.mapper;

import com.shanyuan.platform.ms.dao.omorder.entity.OmOrder;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmOrderMapper {
    int countByExample(OmOrderExample example);

    int deleteByExample(OmOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OmOrder record);

    int insertSelective(OmOrder record);

    List<OmOrder> selectByExample(OmOrderExample example);

    OmOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OmOrder record, @Param("example") OmOrderExample example);

    int updateByExample(@Param("record") OmOrder record, @Param("example") OmOrderExample example);

    int updateByPrimaryKeySelective(OmOrder record);

    int updateByPrimaryKey(OmOrder record);
}