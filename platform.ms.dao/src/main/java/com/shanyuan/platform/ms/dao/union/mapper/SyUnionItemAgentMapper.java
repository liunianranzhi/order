package com.shanyuan.platform.ms.dao.union.mapper;

import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemAgent;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemAgentExample;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemGoodsList;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyUnionItemAgentMapper {
    int countByExample(SyUnionItemAgentExample example);

    int deleteByExample(SyUnionItemAgentExample example);

    int deleteByPrimaryKey(Integer itemAgentId);

    int insert(SyUnionItemAgent record);

    int insertSelective(SyUnionItemAgent record);

    List<SyUnionItemAgent> selectByExample(SyUnionItemAgentExample example);

    SyUnionItemAgent selectByPrimaryKey(Integer itemAgentId);

    int updateByExampleSelective(@Param("record") SyUnionItemAgent record, @Param("example") SyUnionItemAgentExample example);

    int updateByExample(@Param("record") SyUnionItemAgent record, @Param("example") SyUnionItemAgentExample example);

    int updateByPrimaryKeySelective(SyUnionItemAgent record);

    int updateByPrimaryKey(SyUnionItemAgent record);
    
    List<SyUnionItemGoodsList>  selectUnionItemGoods(@Param("unionItemId") Integer unionItemId);
}