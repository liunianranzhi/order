package com.shanyuan.platform.ms.dao.goods.mapper;

import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoodsExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SyEvaluateGoodsMapper {
    int countByExample(SyEvaluateGoodsExample example);
    
    

    int deleteByExample(SyEvaluateGoodsExample example);

    int deleteByPrimaryKey(Integer gevalId);

    int insert(SyEvaluateGoods record);

    int insertSelective(SyEvaluateGoods record);

    List<SyEvaluateGoods> selectByExample(SyEvaluateGoodsExample example);

    SyEvaluateGoods selectByPrimaryKey(Integer gevalId);

    int updateByExampleSelective(@Param("record") SyEvaluateGoods record, @Param("example") SyEvaluateGoodsExample example);

    int updateByExample(@Param("record") SyEvaluateGoods record, @Param("example") SyEvaluateGoodsExample example);

    int updateByPrimaryKeySelective(SyEvaluateGoods record);

    int updateByPrimaryKey(SyEvaluateGoods record);
    //获得多单的评价
    List<SyEvaluateGoods> selectEvaluateList(List<Integer> list);
    
    /**
     * 获得评论数  和 评论总积分
     * @param members
     * @return
     */
    SyEvaluateGoods selectEvaluateGoodsScore(Integer members);

    /**
     * 获取评论条数
     * @Author wang chunru
     * @Description 
     * @param 
     * @return double
     * @throws
     */
	double selectEvaluateCount(@Param("memberId")Integer memberId, @Param("score")Integer score);
	
	List<SyEvaluateGoods> selectByPicture(Map<String,Object> map);
	/**
	 * 获取好差评评论
	 * @zhongying
	 * @param sy
	 * @return
	 */
	Integer selectNumByParam(SyEvaluateGoods sy);



}