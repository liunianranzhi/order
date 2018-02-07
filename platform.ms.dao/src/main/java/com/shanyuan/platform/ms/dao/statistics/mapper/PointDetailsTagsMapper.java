package com.shanyuan.platform.ms.dao.statistics.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.statistics.entity.MemberPointsNum;

public interface PointDetailsTagsMapper {
	List<MemberPointsNum> selectPointsByUnionId(@Param("unionId") Integer unionId);
	List<MemberPointsNum> selectTotalPointsByUnionId(@Param("unionId") Integer unionId);
	List<MemberPointsNum> selectValidPointsByUnionId(@Param("unionId") Integer unionId);
	
	Integer selectTotalNumByTagAndUnion(@Param("unionId") Integer unionId, @Param("tag") Long tag);
	
	Integer selectValidNumByTagAndUnion(@Param("unionId") Integer unionId, @Param("tag") Long tag);
}