package com.shanyuan.platform.ms.dao.auth.mapper;

import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyMbUserTokenMapper {
    int countByExample(SyMbUserTokenExample example);

    int deleteByExample(SyMbUserTokenExample example);

    int deleteByPrimaryKey(Integer tokenId);

    int insert(SyMbUserToken record);

    int insertSelective(SyMbUserToken record);

    List<SyMbUserToken> selectByExample(SyMbUserTokenExample example);

    SyMbUserToken selectByPrimaryKey(Integer tokenId);

    int updateByExampleSelective(@Param("record") SyMbUserToken record, @Param("example") SyMbUserTokenExample example);

    int updateByExample(@Param("record") SyMbUserToken record, @Param("example") SyMbUserTokenExample example);

    int updateByPrimaryKeySelective(SyMbUserToken record);

    int updateByPrimaryKey(SyMbUserToken record);
}