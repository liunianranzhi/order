package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyBizApplyRecharge;
import com.shanyuan.platform.ms.dao.order.entity.SyBizApplyRechargeExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyBizApplyRechargeMapper {
    int countByExample(SyBizApplyRechargeExample example);

    int deleteByExample(SyBizApplyRechargeExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyBizApplyRecharge record);

    int insertSelective(SyBizApplyRecharge record);

    List<SyBizApplyRecharge> selectByExample(SyBizApplyRechargeExample example);

    SyBizApplyRecharge selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyBizApplyRecharge record, @Param("example") SyBizApplyRechargeExample example);

    int updateByExample(@Param("record") SyBizApplyRecharge record, @Param("example") SyBizApplyRechargeExample example);

    int updateByPrimaryKeySelective(SyBizApplyRecharge record);

    int updateByPrimaryKey(SyBizApplyRecharge record);

    /**
     * 采集的总金额
     * @return
     * @author zhangwd
     */
    BigDecimal selectBizApplyRechargeAmount();
}