package com.shanyuan.platform.ms.dao.user.mapper;

import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyShopAccountMapper {
    int countByExample(SyShopAccountExample example);

    int deleteByExample(SyShopAccountExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyShopAccount record);

    int insertSelective(SyShopAccount record);

    List<SyShopAccount> selectByExample(SyShopAccountExample example);

    SyShopAccount selectByPrimaryKey(Integer recId); 
    
    List<SyShopAccount> selectByMemberId(Integer memberId); 

    int updateByExampleSelective(@Param("record") SyShopAccount record, @Param("example") SyShopAccountExample example);

    int updateByExample(@Param("record") SyShopAccount record, @Param("example") SyShopAccountExample example);

    int updateByPrimaryKeySelective(SyShopAccount record);

    int updateByPrimaryKey(SyShopAccount record);
    
    SyShopAccount selectSyShopAccountByMemberId(Integer memberId);
}