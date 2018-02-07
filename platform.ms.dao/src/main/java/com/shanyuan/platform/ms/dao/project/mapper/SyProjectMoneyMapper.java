package com.shanyuan.platform.ms.dao.project.mapper;

import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoney;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyProjectMoneyMapper {
    int countByExample(SyProjectMoneyExample example);

    int deleteByExample(SyProjectMoneyExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(SyProjectMoney record);

    int insertSelective(SyProjectMoney record);

    List<SyProjectMoney> selectByExample(SyProjectMoneyExample example);

    SyProjectMoney selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") SyProjectMoney record, @Param("example") SyProjectMoneyExample example);

    int updateByExample(@Param("record") SyProjectMoney record, @Param("example") SyProjectMoneyExample example);

    int updateByPrimaryKeySelective(SyProjectMoney record);

    int updateByPrimaryKey(SyProjectMoney record);

    /**
	 * 捐款交易总金额
	 * @author zhangwd
	 */
	Double selectJuanKuanOrderSumMoney();
}