package com.shanyuan.platform.ms.dao.project.mapper;

import com.shanyuan.platform.ms.dao.project.entity.SyBazaarOrder;
import com.shanyuan.platform.ms.dao.project.entity.SyBazaarOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyBazaarOrderMapper {
    int countByExample(SyBazaarOrderExample example);

    int deleteByExample(SyBazaarOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SyBazaarOrder record);

    int insertSelective(SyBazaarOrder record);

    List<SyBazaarOrder> selectByExample(SyBazaarOrderExample example);

    SyBazaarOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SyBazaarOrder record, @Param("example") SyBazaarOrderExample example);

    int updateByExample(@Param("record") SyBazaarOrder record, @Param("example") SyBazaarOrderExample example);

    int updateByPrimaryKeySelective(SyBazaarOrder record);

    int updateByPrimaryKey(SyBazaarOrder record);

    /**
	 * 义卖 交易总金额
	 * @return
	 * @author zhangwd
	 */
    Double selectBazaarOrderSumMoney();
}