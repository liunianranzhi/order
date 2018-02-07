package com.shanyuan.platform.ms.dao.project.mapper;

import com.shanyuan.platform.ms.dao.project.entity.SyProject;
import com.shanyuan.platform.ms.dao.project.entity.SyProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyProjectMapper {
    int countByExample(SyProjectExample example);

    int deleteByExample(SyProjectExample example);

    int deleteByPrimaryKey(Integer projId);

    int insert(SyProject record);

    int insertSelective(SyProject record);

    List<SyProject> selectByExampleWithBLOBs(SyProjectExample example);

    List<SyProject> selectByExample(SyProjectExample example);

    SyProject selectByPrimaryKey(Integer projId);

    int updateByExampleSelective(@Param("record") SyProject record, @Param("example") SyProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") SyProject record, @Param("example") SyProjectExample example);

    int updateByExample(@Param("record") SyProject record, @Param("example") SyProjectExample example);

    int updateByPrimaryKeySelective(SyProject record);

    int updateByPrimaryKeyWithBLOBs(SyProject record);

    int updateByPrimaryKey(SyProject record);
    
    SyProject selectProjectAndStoreByPrimaryKey(Integer projId);
}