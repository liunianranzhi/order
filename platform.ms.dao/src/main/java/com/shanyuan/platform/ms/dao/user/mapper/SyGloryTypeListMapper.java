package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyGloryTypeList;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryTypeListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyGloryTypeListMapper {
    int countByExample(SyGloryTypeListExample example);

    int deleteByExample(SyGloryTypeListExample example);

    int deleteByPrimaryKey(Integer gloryId);

    int insert(SyGloryTypeList record);

    int insertSelective(SyGloryTypeList record);

    List<SyGloryTypeList> selectByExample(SyGloryTypeListExample example);

    SyGloryTypeList selectByPrimaryKey(Integer gloryId);

    int updateByExampleSelective(@Param("record") SyGloryTypeList record, @Param("example") SyGloryTypeListExample example);

    int updateByExample(@Param("record") SyGloryTypeList record, @Param("example") SyGloryTypeListExample example);

    int updateByPrimaryKeySelective(SyGloryTypeList record);

    int updateByPrimaryKey(SyGloryTypeList record);
    /**
     * 查询勋章列表
     * @Author wang chunru
     * @Description 
     * @param 
     * @return List<SyGloryTypeList>
     * @throws
     */
	List<SyGloryTypeList> selectGloryTypeList(@Param("onlineState") Integer onlineState);
}