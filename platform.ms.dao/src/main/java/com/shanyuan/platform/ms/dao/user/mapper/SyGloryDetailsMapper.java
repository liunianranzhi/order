package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyGloryDetails;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryDetailsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyGloryDetailsMapper {
    int countByExample(SyGloryDetailsExample example);

    int deleteByExample(SyGloryDetailsExample example);

    int deleteByPrimaryKey(Integer gloryDetialId);

    int insert(SyGloryDetails record);

    int insertSelective(SyGloryDetails record);

    List<SyGloryDetails> selectByExample(SyGloryDetailsExample example);

    SyGloryDetails selectByPrimaryKey(Integer gloryDetialId);

    int updateByExampleSelective(@Param("record") SyGloryDetails record, @Param("example") SyGloryDetailsExample example);

    int updateByExample(@Param("record") SyGloryDetails record, @Param("example") SyGloryDetailsExample example);

    int updateByPrimaryKeySelective(SyGloryDetails record);

    int updateByPrimaryKey(SyGloryDetails record);
    /**
     * 查询勋章详情列表
     * @Author wang chunru
     * @Description 
     * @param 
     * @return List<SyGloryDetails>
     * @throws
     */
	List<SyGloryDetails> selectGloryDetailsByMemberId(Integer memberId);
}