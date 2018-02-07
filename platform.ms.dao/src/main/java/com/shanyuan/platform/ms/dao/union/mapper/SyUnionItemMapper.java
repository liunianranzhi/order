package com.shanyuan.platform.ms.dao.union.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItem;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyUnionItemMapper {
    int countByExample(SyUnionItemExample example);

    int deleteByExample(SyUnionItemExample example);

    int deleteByPrimaryKey(Integer unionItemId);

    int insert(SyUnionItem record);

    int insertSelective(SyUnionItem record);

    List<SyUnionItem> selectByExample(SyUnionItemExample example);

    SyUnionItem selectByPrimaryKey(Integer unionItemId);

    int updateByExampleSelective(@Param("record") SyUnionItem record, @Param("example") SyUnionItemExample example);

    int updateByExample(@Param("record") SyUnionItem record, @Param("example") SyUnionItemExample example);

    int updateByPrimaryKeySelective(SyUnionItem record);

    int updateByPrimaryKey(SyUnionItem record);
    
    List<SyUnionItem> selectUnionItemInfo(@Param("unionCode") String unionCode);
    
    
}