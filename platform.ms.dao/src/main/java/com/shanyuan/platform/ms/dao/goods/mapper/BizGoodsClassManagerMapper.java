package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.BizGoodsClassManager;
import com.shanyuan.platform.ms.dao.goods.entity.BizGoodsClassManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizGoodsClassManagerMapper {
    int countByExample(BizGoodsClassManagerExample example);

    int deleteByExample(BizGoodsClassManagerExample example);

    int deleteByPrimaryKey(Integer gcId);

    int insert(BizGoodsClassManager record);

    int insertSelective(BizGoodsClassManager record);

    List<BizGoodsClassManager> selectByExample(BizGoodsClassManagerExample example);

    BizGoodsClassManager selectByPrimaryKey(Integer gcId);

    int updateByExampleSelective(@Param("record") BizGoodsClassManager record, @Param("example") BizGoodsClassManagerExample example);

    int updateByExample(@Param("record") BizGoodsClassManager record, @Param("example") BizGoodsClassManagerExample example);

    int updateByPrimaryKeySelective(BizGoodsClassManager record);

    int updateByPrimaryKey(BizGoodsClassManager record);
}