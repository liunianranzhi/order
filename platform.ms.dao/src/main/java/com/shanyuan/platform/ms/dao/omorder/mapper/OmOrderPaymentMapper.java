package com.shanyuan.platform.ms.dao.omorder.mapper;

import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderPayment;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmOrderPaymentMapper {
    int countByExample(OmOrderPaymentExample example);

    int deleteByExample(OmOrderPaymentExample example);

    int deleteByPrimaryKey(String payId);

    int insert(OmOrderPayment record);

    int insertSelective(OmOrderPayment record);

    List<OmOrderPayment> selectByExample(OmOrderPaymentExample example);

    OmOrderPayment selectByPrimaryKey(String payId);

    int updateByExampleSelective(@Param("record") OmOrderPayment record, @Param("example") OmOrderPaymentExample example);

    int updateByExample(@Param("record") OmOrderPayment record, @Param("example") OmOrderPaymentExample example);

    int updateByPrimaryKeySelective(OmOrderPayment record);

    int updateByPrimaryKey(OmOrderPayment record);
}