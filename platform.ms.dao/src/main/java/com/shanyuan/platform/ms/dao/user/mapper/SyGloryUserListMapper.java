package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyGloryUserList;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryUserListExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SyGloryUserListMapper {
    int countByExample(SyGloryUserListExample example);

    int deleteByExample(SyGloryUserListExample example);

    int deleteByPrimaryKey(Integer gloryMemberId);

    int insert(SyGloryUserList record);

    int insertSelective(SyGloryUserList record);

    List<SyGloryUserList> selectByExample(SyGloryUserListExample example);

    SyGloryUserList selectByPrimaryKey(Integer gloryMemberId);

    int updateByExampleSelective(@Param("record") SyGloryUserList record, @Param("example") SyGloryUserListExample example);

    int updateByExample(@Param("record") SyGloryUserList record, @Param("example") SyGloryUserListExample example);

    int updateByPrimaryKeySelective(SyGloryUserList record);

    int updateByPrimaryKey(SyGloryUserList record);
    /**
     * 获取用户获得的勋章
     * @Author wang chunru
     * @Description 
     * @param 
     * @return List<SyGloryUserList>
     * @throws
     */
	List<SyGloryUserList> selectGloryUserListByMemberId(Integer memberId);
    
  
}