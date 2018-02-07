package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;
import com.shanyuan.platform.ms.dao.goods.entity.BizGoodsClassManager;
import com.shanyuan.platform.ms.dao.goods.entity.BizGoodsClassManager;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;


public interface SyGoodsClassService {
	/**
	 * @Author wang chunru
	 * @Description 获取模块显示类型列表
	 * @param module 类型所属模块值
	 * @return List<SyGoodsClassBo>
	 * @throws
	 */
	List<SyGoodsClassBo> getGoodsClassListByModule(Integer module);
	
	/**
	 * @Author yangjian
	 * @Description 根据父id查分类列表
	 * @param parentId 父id
	 * @return List<SyGoodsClassBo>
	 * @throws CoreServiceException
	 */
	List<SyGoodsClassInfo> getGoodsClassListByParentId(Integer parentId) throws CoreServiceException;

	/**
	 * @Author wang chunru
	 * @Description 获取指定模块商品所有类型
	 * @param moduleClassId 所属模块类型ID
	 * @return SyGoodsClassBo
	 * @throws
	 */
	SyGoodsClassBo getGoodsClassList(Integer moduleClassId) throws CoreServiceException;

	/**
	 * 查询商品一级分类信息 根据 模板id
	 * @param gcId  模板id
	 * @param classState 分类状态：0默认，1上线，2下线
	 * @return
	 * @zhangwd
	 */
	BizGoodsClassManager getGoodsClassByGcId(Integer gcId, byte classState)throws CoreServiceException;
	/**
	 * @author zy
	 * @param parentIds
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer,List<SyGoodsClassInfo>>  selectGoodsClassByParentIds(List<Integer> parentIds) throws CoreServiceException;
	/**
	 * @author zy
	 * @param gcIds
	 * @param goodsState
	 * @param goodsProjectType
	 * @return
	 * @throws CoreServiceException
	 */
	List<Integer> selectGoodsByGcid(List<Integer> gcIds,Integer goodsState,Integer goodsProjectType)throws CoreServiceException;
}
