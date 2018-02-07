package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowState;
import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGuideShowStateMapper {
    int countByExample(SyGuideShowStateExample example);

    int deleteByExample(SyGuideShowStateExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyGuideShowState record);

    int insertSelective(SyGuideShowState record);

    List<SyGuideShowState> selectByExample(SyGuideShowStateExample example);

    SyGuideShowState selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyGuideShowState record, @Param("example") SyGuideShowStateExample example);

    int updateByExample(@Param("record") SyGuideShowState record, @Param("example") SyGuideShowStateExample example);

    int updateByPrimaryKeySelective(SyGuideShowState record);

    int updateByPrimaryKey(SyGuideShowState record);
}