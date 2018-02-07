package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyBuyNum;
import com.shanyuan.platform.ms.dao.goods.entity.SyBuyNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyBuyNumMapper {
    int countByExample(SyBuyNumExample example);

    int deleteByExample(SyBuyNumExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyBuyNum record);

    int insertSelective(SyBuyNum record);

    List<SyBuyNum> selectByExample(SyBuyNumExample example);

    SyBuyNum selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyBuyNum record, @Param("example") SyBuyNumExample example);

    int updateByExample(@Param("record") SyBuyNum record, @Param("example") SyBuyNumExample example);

    int updateByPrimaryKeySelective(SyBuyNum record);
    int updateByPrimaryKey(SyBuyNum record);
    //===============by zy
    int  updateNum(SyBuyNum record);
    int  updateDownNum(SyBuyNum record);
    
}