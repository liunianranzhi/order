package com.shanyuan.platform.ms.dao.omorder.mapper;

import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderVoucher;
import com.shanyuan.platform.ms.dao.omorder.entity.OmOrderVoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmOrderVoucherMapper {
    int countByExample(OmOrderVoucherExample example);

    int deleteByExample(OmOrderVoucherExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(OmOrderVoucher record);

    int insertSelective(OmOrderVoucher record);

    List<OmOrderVoucher> selectByExample(OmOrderVoucherExample example);

    OmOrderVoucher selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") OmOrderVoucher record, @Param("example") OmOrderVoucherExample example);

    int updateByExample(@Param("record") OmOrderVoucher record, @Param("example") OmOrderVoucherExample example);

    int updateByPrimaryKeySelective(OmOrderVoucher record);

    int updateByPrimaryKey(OmOrderVoucher record);
}