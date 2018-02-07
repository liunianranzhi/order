package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivity;
import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyOrgActivityMapper {
    int countByExample(SyOrgActivityExample example);

    int deleteByExample(SyOrgActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(SyOrgActivity record);

    int insertSelective(SyOrgActivity record);

    List<SyOrgActivity> selectByExampleWithBLOBs(SyOrgActivityExample example);

    List<SyOrgActivity> selectByExample(SyOrgActivityExample example);

    SyOrgActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") SyOrgActivity record, @Param("example") SyOrgActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") SyOrgActivity record, @Param("example") SyOrgActivityExample example);

    int updateByExample(@Param("record") SyOrgActivity record, @Param("example") SyOrgActivityExample example);

    int updateByPrimaryKeySelective(SyOrgActivity record);

    int updateByPrimaryKeyWithBLOBs(SyOrgActivity record);

    int updateByPrimaryKey(SyOrgActivity record);
    
    List<SyOrgActivity> selectByGoodsId(Integer goodsId);
}