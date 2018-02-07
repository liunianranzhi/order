package com.shanyuan.platform.ms.dao.store.mapper;

import com.shanyuan.platform.ms.dao.store.entity.SyBocOrg;
import com.shanyuan.platform.ms.dao.store.entity.SyBocOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

public interface SyBocOrgMapper {
    int countByExample(SyBocOrgExample example);

    int deleteByExample(SyBocOrgExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyBocOrg record);

    int insertSelective(SyBocOrg record);
    @Cacheable(cacheNames="sy_boc_org_code"  ,key="'sy_boc_org_code'")
    List<String> selectDistinctOrgCode();
    List<SyBocOrg> selectByExample(SyBocOrgExample example);

    SyBocOrg selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyBocOrg record, @Param("example") SyBocOrgExample example);

    int updateByExample(@Param("record") SyBocOrg record, @Param("example") SyBocOrgExample example);

    int updateByPrimaryKeySelective(SyBocOrg record);

    int updateByPrimaryKey(SyBocOrg record);
}