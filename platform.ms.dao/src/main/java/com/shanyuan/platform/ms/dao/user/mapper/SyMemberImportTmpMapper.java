package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyMemberImportTmp;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberImportTmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyMemberImportTmpMapper {
    int countByExample(SyMemberImportTmpExample example);

    int deleteByExample(SyMemberImportTmpExample example);

    int deleteByPrimaryKey(String memberMobile);

    int insert(SyMemberImportTmp record);

    int insertSelective(SyMemberImportTmp record);

    List<SyMemberImportTmp> selectByExample(SyMemberImportTmpExample example);

    SyMemberImportTmp selectByPrimaryKey(String memberMobile);

    int updateByExampleSelective(@Param("record") SyMemberImportTmp record, @Param("example") SyMemberImportTmpExample example);

    int updateByExample(@Param("record") SyMemberImportTmp record, @Param("example") SyMemberImportTmpExample example);

    int updateByPrimaryKeySelective(SyMemberImportTmp record);

    int updateByPrimaryKey(SyMemberImportTmp record);
}