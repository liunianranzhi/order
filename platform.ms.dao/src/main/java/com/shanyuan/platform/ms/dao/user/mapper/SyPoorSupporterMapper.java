package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SupportPoorBo;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorSupporter;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorSupporterExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyPoorSupporterMapper {
    int countByExample(SyPoorSupporterExample example);

    int deleteByExample(SyPoorSupporterExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyPoorSupporter record);

    int insertSelective(SyPoorSupporter record);

    List<SyPoorSupporter> selectByExample(SyPoorSupporterExample example);

    SyPoorSupporter selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyPoorSupporter record, @Param("example") SyPoorSupporterExample example);

    int updateByExample(@Param("record") SyPoorSupporter record, @Param("example") SyPoorSupporterExample example);

    int updateByPrimaryKeySelective(SyPoorSupporter record);

    int updateByPrimaryKey(SyPoorSupporter record);
    /**
	 * 我支持的贫困户列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return List<SupportPoorBo>
	 * @throws
	 */
	List<SupportPoorBo> getMySupportPoorList(@Param("memberId")Integer memberId, @Param("channel")String channel);
    
 
}