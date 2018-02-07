package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.AgentBo;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SyMemberMapper {
    int countByExample(SyMemberExample example);

    int deleteByExample(SyMemberExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(SyMemberWithBLOBs record);

    int insertSelective(SyMemberWithBLOBs record);

    List<SyMemberWithBLOBs> selectByExampleWithBLOBs(SyMemberExample example);

    List<SyMember> selectByExample(SyMemberExample example);

    SyMemberWithBLOBs selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") SyMemberWithBLOBs record, @Param("example") SyMemberExample example);

    int updateByExampleWithBLOBs(@Param("record") SyMemberWithBLOBs record, @Param("example") SyMemberExample example);

    int updateByExample(@Param("record") SyMember record, @Param("example") SyMemberExample example);

    int updateByPrimaryKeySelective(SyMemberWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SyMemberWithBLOBs record);

    int updateByPrimaryKey(SyMember record);
    
    int updateBocPointsByPrimaryKey(@Param("bocPoints") Long bocPoints,@Param("memberId") Integer memberId);
    
    int updateBocPointsUsedPoints(@Param("bocPointUsed") Long bocPoints,@Param("memberId") Integer memberId);
    
    int updateMemberAndBocPointsByPrimaryKey(@Param("points") Integer points,@Param("memberId") Integer memberId);
    
    int increasePointsByPrimaryKey(@Param("memberPoints") Integer memberPoints ,@Param("memberId") Integer memberId);

    /**
	 * 获取帮扶人帮助的贫困户列表
	 * @param dataMap
	 * @return
	 * @author zhangwd
	 */
	List<SyMember> selectPoorListBySupportMemberId(Map<String, Object> dataMap);
	
	List<AgentBo> selectMemberInfo(@Param("areaiId3")Long areaiId3);
	/**
	 * by zy
	 * @param list
	 * @return
	 */
	List<SyMember> selectMemberByStoreIds(List<Integer> list);
	
	List<AgentBo> selectGetMemberInfo(@Param("areaiId3")List<Long> areaIds3);
	
    
}