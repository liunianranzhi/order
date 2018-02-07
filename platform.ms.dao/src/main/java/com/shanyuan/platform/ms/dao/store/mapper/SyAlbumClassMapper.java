package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyAlbumClass;
import com.shanyuan.platform.ms.dao.store.entity.SyAlbumClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyAlbumClassMapper {
    int countByExample(SyAlbumClassExample example);

    int deleteByExample(SyAlbumClassExample example);

    int deleteByPrimaryKey(Integer aclassId);

    int insert(SyAlbumClass record);

    int insertSelective(SyAlbumClass record);

    List<SyAlbumClass> selectByExample(SyAlbumClassExample example);

    SyAlbumClass selectByPrimaryKey(Integer aclassId);

    int updateByExampleSelective(@Param("record") SyAlbumClass record, @Param("example") SyAlbumClassExample example);

    int updateByExample(@Param("record") SyAlbumClass record, @Param("example") SyAlbumClassExample example);

    int updateByPrimaryKeySelective(SyAlbumClass record);

    int updateByPrimaryKey(SyAlbumClass record);
}