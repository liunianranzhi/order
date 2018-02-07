package com.shanyuan.platform.ms.dao.recommend.mapper;

import com.shanyuan.platform.ms.dao.recommend.entity.RecommendGoodsBo;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommend;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyRecommendMapper {
    int countByExample(SyRecommendExample example);

    int deleteByExample(SyRecommendExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SyRecommend record);

    int insertSelective(SyRecommend record);

    List<SyRecommend> selectByExample(SyRecommendExample example);

    SyRecommend selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SyRecommend record, @Param("example") SyRecommendExample example);

    int updateByExample(@Param("record") SyRecommend record, @Param("example") SyRecommendExample example);

    int updateByPrimaryKeySelective(SyRecommend record);

    int updateByPrimaryKey(SyRecommend record);

    /**
     * 根据集采模板查询集采推荐商品
     * @param hashMap  recId, status
     * @return
     * @author zhangwd
     */
	List<RecommendGoodsBo> selectRecommendGoodsByBizModule(HashMap<String, Object> hashMap);

}