package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyCircleMapply;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyCircleMapplyMapper {
	
    int countByExample(SyCircleMapplyExample example);

    int deleteByExample(SyCircleMapplyExample example);

    int deleteByPrimaryKey(Integer mapplyId);

    int insert(SyCircleMapply record);

    int insertSelective(SyCircleMapply record);

    List<SyCircleMapply> selectByExample(SyCircleMapplyExample example);

    SyCircleMapply selectByPrimaryKey(Integer mapplyId);

    int updateByExampleSelective(@Param("record") SyCircleMapply record, @Param("example") SyCircleMapplyExample example);

    int updateByExample(@Param("record") SyCircleMapply record, @Param("example") SyCircleMapplyExample example);

    int updateByPrimaryKeySelective(SyCircleMapply record);

    int updateByPrimaryKey(SyCircleMapply record);
}