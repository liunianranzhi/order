package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyRefundReturn;
import com.shanyuan.platform.ms.dao.order.entity.SyRefundReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyRefundReturnMapper {
    int countByExample(SyRefundReturnExample example);

    int deleteByExample(SyRefundReturnExample example);

    int deleteByPrimaryKey(Integer refundId);

    int insert(SyRefundReturn record);

    int insertSelective(SyRefundReturn record);

    List<SyRefundReturn> selectByExample(SyRefundReturnExample example);

    SyRefundReturn selectByPrimaryKey(Integer refundId);

    int updateByExampleSelective(@Param("record") SyRefundReturn record, @Param("example") SyRefundReturnExample example);

    int updateByExample(@Param("record") SyRefundReturn record, @Param("example") SyRefundReturnExample example);

    int updateByPrimaryKeySelective(SyRefundReturn record);

    int updateByPrimaryKey(SyRefundReturn record);
    /**
     * @author zy
     * @param list
     * @return
     */
    List<SyRefundReturn> selectRefundNumByOids(List<Integer> List);
}