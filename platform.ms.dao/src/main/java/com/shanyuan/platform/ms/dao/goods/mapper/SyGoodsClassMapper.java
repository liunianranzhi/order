package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClass;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassExample;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyGoodsClassMapper {
    int countByExample(SyGoodsClassExample example);

    int deleteByExample(SyGoodsClassExample example);

    int deleteByPrimaryKey(Integer gcId);

    int insert(SyGoodsClass record);

    int insertSelective(SyGoodsClass record);

    List<SyGoodsClass> selectByExample(SyGoodsClassExample example);

    SyGoodsClass selectByPrimaryKey(Integer gcId);

    int updateByExampleSelective(@Param("record") SyGoodsClass record, @Param("example") SyGoodsClassExample example);

    int updateByExample(@Param("record") SyGoodsClass record, @Param("example") SyGoodsClassExample example);

    int updateByPrimaryKeySelective(SyGoodsClass record);

    int updateByPrimaryKey(SyGoodsClass record);

	List<SyGoodsClass> selectGoodsClassListByModule(Integer module);
	
	/**
	 * 根据父id查询详情
	 * by yj
	 * @param parentId
	 * @return
	 */
	List<SyGoodsClassInfo> selectGoodsClassListByParentId(Integer parentId);
	/**
	 * zy
	 * @param parentIds
	 * @return
	 */
	List<SyGoodsClassInfo> selectGoodsClassByParentIds(List<Integer> parentIds);
	
	List<SyGoodsClass> selectGoodsClassList(Integer moduleClassId);
}