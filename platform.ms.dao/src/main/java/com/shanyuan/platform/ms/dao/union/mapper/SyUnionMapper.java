package com.shanyuan.platform.ms.dao.union.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionExample;

public interface SyUnionMapper {
    int countByExample(SyUnionExample example);

    int deleteByExample(SyUnionExample example);

    int deleteByPrimaryKey(Integer unionId);

    int insert(SyUnion record);

    int insertSelective(SyUnion record);

    List<SyUnion> selectByExampleWithBLOBs(SyUnionExample example);

    List<SyUnion> selectByExample(SyUnionExample example);
    
    List<String> selectUnionChannel();

    SyUnion selectByPrimaryKey(Integer unionId);

    int updateByExampleSelective(@Param("record") SyUnion record, @Param("example") SyUnionExample example);

    int updateByExampleWithBLOBs(@Param("record") SyUnion record, @Param("example") SyUnionExample example);

    int updateByExample(@Param("record") SyUnion record, @Param("example") SyUnionExample example);

    int updateByPrimaryKeySelective(SyUnion record);

    int updateByPrimaryKeyWithBLOBs(SyUnion record);

    int updateByPrimaryKey(SyUnion record);

    /**
	 * 获取平台公益人士总数(除去贫困户)
	 * @return
	 * @author zhangwd
	 */
	Integer selectMemberCountWithoutPoor();

	/**
	 * 获取联盟中助理人的数量
	 * @param list
	 * @return
	 */
	Integer selectUnionAgentCount(List<Long> areaIds);
	
	/**
	 * 获取联盟的捐款总金额
	 * @param unionChannel
	 * @return
	 * @author zhangwd
	 */
	BigDecimal selectJuanKuanOrderAmount(String unionChannel);

	/**
	 * 获取联盟的义卖总金额
	 * @param unionChannel
	 * @return
	 * @author zhangwd
	 */
	BigDecimal selectBazaarOrderAmount(String unionChannel);

	/**
	 * 获取联盟中所有的订单数
	 * @param unionChannel
	 * @return
	 * @author zhangwd
	 */
	Integer selectOrderCircleTotal(String unionChannel);

	/**
	 * 获取联盟中爱心购买的商品数量
	 * @param unionChannel
	 * @return
	 * @author zhangwd
	 */
	Integer selectGoodsTotalByUnion(String unionChannel);

	/**
	 * 查询昨天销售最多的4个产品(大爱超市)
	 * @param dataMap
	 * @return
	 * @author zhangwd
	 */
	Map<Integer, Integer> selectGoodsCommonIdsTotal(Map<String, Object> dataMap);

	/**
	 * 过去7天新增注册人数最多的单位（10个）
	 * @param circleData
	 * @return
	 * @author zhangwd
	 */
	Map<String, Object> selectNewEnrollTopCircle(Map<String, Object> circleData);
}