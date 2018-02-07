package com.shanyuan.platform.ms.dao.order.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.user.entity.SyVoucherTemplate;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherTemplateExample;

public interface SyVoucherTemplateMapper {
    int countByExample(SyVoucherTemplateExample example);

    int deleteByExample(SyVoucherTemplateExample example);

    int deleteByPrimaryKey(Integer voucherTId);

    int insert(SyVoucherTemplate record);

    int insertSelective(SyVoucherTemplate record);

    List<SyVoucherTemplate> selectByExample(SyVoucherTemplateExample example);

    SyVoucherTemplate selectByPrimaryKey(Integer voucherTId);

    int updateByExampleSelective(@Param("record") SyVoucherTemplate record, @Param("example") SyVoucherTemplateExample example);

    int updateByExample(@Param("record") SyVoucherTemplate record, @Param("example") SyVoucherTemplateExample example);

    int updateByPrimaryKeySelective(SyVoucherTemplate record);

    int updateByPrimaryKey(SyVoucherTemplate record);
    
    List<SyVoucherTemplate> selectVoucherAndStore(SyVoucherTemplate record);
    /**
     * by zy
     * @param record
     * @return
     */
    List<SyVoucherTemplate> selectVoucherByStoreId(SyVoucherTemplate record);
}