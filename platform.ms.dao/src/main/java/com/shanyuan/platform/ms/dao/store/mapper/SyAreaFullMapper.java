package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFullExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyAreaFullMapper {
    int countByExample(SyAreaFullExample example);

    int deleteByExample(SyAreaFullExample example);

    int deleteByPrimaryKey(Long areaId);

    int insert(SyAreaFull record);

    int insertSelective(SyAreaFull record);

    List<SyAreaFull> selectByExample(SyAreaFullExample example);

    SyAreaFull selectByPrimaryKey(Long areaId);

    int updateByExampleSelective(@Param("record") SyAreaFull record, @Param("example") SyAreaFullExample example);

    int updateByExample(@Param("record") SyAreaFull record, @Param("example") SyAreaFullExample example);

    int updateByPrimaryKeySelective(SyAreaFull record);

    int updateByPrimaryKey(SyAreaFull record);
    
    public List<SyAreaFull> initAreaIds();
}