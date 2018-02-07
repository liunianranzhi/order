package com.shanyuan.platform.ms.dao.goods.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.shanyuan.platform.ms.dao.goods.entity.OpenGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonCountInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonExample;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonQUERY;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonWithBLOBs;

public interface SyGoodsCommonMapper {
    int countByExample(SyGoodsCommonExample example);

    int deleteByExample(SyGoodsCommonExample example);

    int deleteByPrimaryKey(Integer goodsCommonid);

    int insert(SyGoodsCommonWithBLOBs record);

    int insertSelective(SyGoodsCommonWithBLOBs record);

    List<SyGoodsCommonWithBLOBs> selectByExampleWithBLOBs(SyGoodsCommonExample example);

    List<SyGoodsCommon> selectByExample(SyGoodsCommonExample example);

    SyGoodsCommonWithBLOBs selectByPrimaryKey(Integer goodsCommonid);

    int updateByExampleSelective(@Param("record") SyGoodsCommonWithBLOBs record, @Param("example") SyGoodsCommonExample example);

    int updateByExampleWithBLOBs(@Param("record") SyGoodsCommonWithBLOBs record, @Param("example") SyGoodsCommonExample example);

    int updateByExample(@Param("record") SyGoodsCommon record, @Param("example") SyGoodsCommonExample example);

    int updateByPrimaryKeySelective(SyGoodsCommonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SyGoodsCommonWithBLOBs record);

    int updateByPrimaryKey(SyGoodsCommon record);
    
    List<SyGoodsCommon> selectByGoodsCertType(SyGoodsCommonQUERY syGoodsCommonQUERY);
    
    List<SyGoodsCommon> selectByGoodsByQUERY(SyGoodsCommonQUERY syGoodsCommonQUERY);
    
    Integer countByGoodsCertType(SyGoodsCommonQUERY syGoodsCommonQUERY);
    
    Integer countByGoodsByQUERY(SyGoodsCommonQUERY syGoodsCommonQUERY);
    
    List<SyGoodsCommon> selectBySyGoodsByQUERY(SyGoodsCommonQUERY syGoodsCommonQUERY);
    
    Integer countBySyGoodsByQUERY(SyGoodsCommonQUERY syGoodsCommonQUERY);
    
    List<SyGoodsCommon> syGoodsTypeTopList(Map<String,Object> paramMap);
    
    List<SyGoodsCommonCountInfo> countGoodsCountList(SyGoodsCommonExample example);

	SyGoodsCommon selectGoodsDetail(Integer goodsCommonId);
    
    List<SyGoodsCommon>  selectHelpGoodsList (Map<String,Object> map);
    
    SyGoodsCommon  selectCartGoodsInfoByGoodsId(Integer goodsId);

	int selectGoodsCommonCount(Integer memberId);

	/**
	 * 贫困户自营的商品数量
	 * @param list
	 * @return
	 */
	Integer selectPoorSelfSaleCount(List<Long> areaIds);


	/**
	 * 通过集采分类id查询集采商品idList
	 * @param gcId
	 * @return
	 * @author zhangwd
	 */
	List<Integer> selectGoodsCommonIdListByGcId(Integer[] gcId);

	Integer countBizGoodsByQUERY(SyGoodsCommonQUERY syGoodsCommonQUERY);
	
	List<SyGoodsCommon> selectBizGoodsByQUERY (SyGoodsCommonQUERY syGoodsCommonQUERY);
	List<Integer> selectGoodsByGcid (Map map);
	
	List<OpenGoods> selectOpenGoodsByBatch(Map<String,Object> map);
	
	Integer countOpenGoodsByBatch(Map<String,Object> map);

	/**
	 * 查询善缘商场的商品goodsCommonid 根据gcId
	 * @param gcId
	 * @return
	 * @author zhangwd
	 */
	List<Integer> selectSyGoodsCommonIdList(Integer gcId);

	/**
	 * 查询大爱超市的商品goodsCommonid 根据gcId
	 * @param gcId
	 * @return
	 * @author zhangwd
	 */
	List<Integer> selectDaaiGoodsCommonIdList(Integer gcId);
	
	int updateSaleNum(Integer goodsCommonid);
	
	List<Integer> memberHasGoods();
}	
