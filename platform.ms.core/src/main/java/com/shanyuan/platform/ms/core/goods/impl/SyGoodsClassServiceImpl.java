package com.shanyuan.platform.ms.core.goods.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.dao.goods.entity.BizGoodsClassManager;
import com.shanyuan.platform.ms.dao.goods.entity.BizGoodsClassManagerExample;
import com.shanyuan.platform.ms.dao.goods.mapper.BizGoodsClassManagerMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ClassConstant;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.goods.SyGoodsClassService;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.GoodsExcepType;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClass;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsClassMapper;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsCommonMapper;

/** 
 * @author  wang chunru 
 * @date    2017年10月31日 下午4:58:39 
 * @Description   商品类型管理实现类
 */
@Component
public class SyGoodsClassServiceImpl implements SyGoodsClassService {
	
	@Autowired
	private SyGoodsClassMapper syGoodsClassMapper;
	
	@Autowired
	private SyGoodsCommonMapper syGoodsCommonMapper;
	
	@Autowired
	private BizGoodsClassManagerMapper goodsClassManagerMapper;
	
	@Autowired
	private ConstantReload constantReload;
	
	/**
	 * @Author wang chunru
	 * @Description 获取模块显示商品类型列表
	 * @param module 类型所属模块值
	 * @return List<SyGoodsClassBo>
	 * @throws
	 */
	@Override
	public List<SyGoodsClassBo> getGoodsClassListByModule(Integer module) throws CoreServiceException {
		
		/*List<SyGoodsClass> list = syGoodsClassMapper.selectGoodsClassListByModule(module);
		List<SyGoodsClassBo> listBo = new ArrayList<SyGoodsClassBo>();
		SyGoodsClassBo rootBo = new SyGoodsClassBo();
		
		for (SyGoodsClass syGoodsClass : list) {
			syGoodsClass.setGcImage(consistClassImageUrl(syGoodsClass.getGcImage()));
			if(syGoodsClass.getGcParentId() == 0){
				BeanUtils.copyProperties(syGoodsClass, rootBo);
			}else{
				SyGoodsClassBo goodsClassBo = new SyGoodsClassBo();
				BeanUtils.copyProperties(syGoodsClass, goodsClassBo);
				goodsClassBo.setUrl(consistUrlFromModule(syGoodsClass.getGcId()+"",module));
				listBo.add(goodsClassBo);
			}
		}*/
		Integer moduleClassId = 1149;
		switch (module) {
		case 1:
			moduleClassId = 1149;
			break;
		case 2:
			moduleClassId = 1151;
			break;
		case 3:
			moduleClassId = 1150;
			break;
		default:
			moduleClassId = 1149;
			break;
		}
		List<SyGoodsClassBo> listBo = new ArrayList<SyGoodsClassBo>();
		
		if(module != 3){
			return listBo;
		}
		
		SyGoodsClassBo bo1 = new SyGoodsClassBo();
		bo1.setGcId(1436);
		bo1.setGcParentId(1150);
		bo1.setGcSort((short)1);
		bo1.setGcName("食品饮料");
		bo1.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon1.png");
		bo1.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=1436");
		listBo.add(bo1);
		
		SyGoodsClassBo bo2 = new SyGoodsClassBo();
		bo2.setGcId(1560);
		bo2.setGcParentId(1150);
		bo2.setGcSort((short)2);
		bo2.setGcName("数码家电");
		bo2.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon2.png");
		bo2.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=1560");
		listBo.add(bo2);
		
		SyGoodsClassBo bo3 = new SyGoodsClassBo();
		bo3.setGcId(1572);
		bo3.setGcParentId(1150);
		bo3.setGcSort((short)3);
		bo3.setGcName("生活日用");
		bo3.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon3.png");
		bo3.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=1572");
		listBo.add(bo3);
		
		SyGoodsClassBo bo4 = new SyGoodsClassBo();
		bo4.setGcId(1573);
		bo4.setGcParentId(1150);
		bo4.setGcSort((short)4);
		bo4.setGcName("珠宝首饰");
		bo4.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon4.png");
		bo4.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=1573");
		listBo.add(bo4);

		SyGoodsClassBo bo5 = new SyGoodsClassBo();
		bo5.setGcId(1559);
		bo5.setGcParentId(1150);
		bo5.setGcSort((short)5);
		bo5.setGcName("服装鞋帽");
		bo5.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon5.png");
		bo5.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=1559");
		listBo.add(bo5);

		SyGoodsClassBo bo6 = new SyGoodsClassBo();
		bo6.setGcId(1563);
		bo6.setGcParentId(1150);
		bo6.setGcSort((short)6);
		bo6.setGcName("健康护理");
		bo6.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon6.png");
		bo6.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=1563");
		listBo.add(bo6);
		
		SyGoodsClassBo bo7 = new SyGoodsClassBo();
		bo7.setGcId(1590);
		bo7.setGcParentId(1150);
		bo7.setGcSort((short)7);
		bo7.setGcName("母婴用品");
		bo7.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon7.png");
		bo7.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=1590");
		listBo.add(bo7);
		
		//创建类型：全部
		SyGoodsClassBo allBo = new SyGoodsClassBo();
		allBo.setGcImage("https://cdnres.17shanyuan.com/bocm/platformjs/static/image/syShop/sy_icon8.png");
		allBo.setGcName("全部商品");
		allBo.setGcParentId(1150);
		allBo.setGcSort((short)99);
		allBo.setUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=");
		//allBo.setUrl("/rs-goods/goods/getGoodsClassList?moduleClassId="+moduleClassId);
		
		allBo.setGcId(-1);
		listBo.add(allBo);
		return listBo;
		
	}
	
	/**
	 * @Author yangjian
	 * @Description 根据父id查分类列表
	 * @param parentId 父id
	 * @return List<SyGoodsClassBo>
	 * @throws CoreServiceException
	 */
	@Override
	public List<SyGoodsClassInfo> getGoodsClassListByParentId(Integer parentId) throws CoreServiceException {
		List<SyGoodsClassInfo> syGoodsClasses = this.syGoodsClassMapper.selectGoodsClassListByParentId(parentId);
		return syGoodsClasses;
	}
	/**
	 * @Author wang chunru
	 * @Description 获取指定模块商品所有类型
	 * @param moduleClassId 所属模块类型ID
	 * @return List<SyGoodsClassBo>
	 * @throws
	 */
	@Override
	public SyGoodsClassBo getGoodsClassList(Integer moduleClassId) throws CoreServiceException {
		
		//获取指定模块下所有商品类型列表
		List<SyGoodsClass> goodsClassList = syGoodsClassMapper.selectGoodsClassList(moduleClassId);
		
		Map<Integer,SyGoodsClassBo> map = new HashMap<Integer, SyGoodsClassBo>();
		
		List<SyGoodsClassBo> list = new ArrayList<SyGoodsClassBo>();
		SyGoodsClassBo rootBo = new SyGoodsClassBo(); ;
		
		for (SyGoodsClass goodsClass : goodsClassList) {
			SyGoodsClassBo bo = new SyGoodsClassBo();
			BeanUtils.copyProperties(goodsClass, bo);
			bo.setUrl(consistUrlFromClass(bo.getGcId()+"",moduleClassId));
			bo.setGcImage(consistClassImageUrl(bo.getGcImage(), moduleClassId));
			if(bo.getGcParentId() == 0){
				rootBo = bo;
			}else{
			}
			map.put(bo.getGcId(), bo);
			list.add(bo);
		}
		for (SyGoodsClassBo bo : list) {
			SyGoodsClassBo temp = map.get(bo.getGcParentId());
			if(temp != null){
				List<SyGoodsClassBo> subList = temp.getSubDeepList();
				if(subList == null) {
					subList = new ArrayList<SyGoodsClassBo>();
				}
				 
				subList.add(bo);
				temp.setSubDeepList(subList);
			}
		}
		return map.get(rootBo.getGcId());
		
		/*//存放各级商品类型列表
		Map<Integer,List<SyGoodsClassBo>> map = new HashMap<Integer, List<SyGoodsClassBo>>();
		
		//获取父级商品类型列表
		List<SyGoodsClassBo> parentList = getRootList(moduleClassId);
		
		//获取各级商品类型列表
		map = getDeepList(goodsClassList, parentList, map, 1,moduleClassId);
		
		//级联各级商品列表之间的依赖关系
		List<SyGoodsClassBo> goodsClassBoList = calGoodsClssList(map);
		if(!ObjectUtils.isEmpty(goodsClassBoList)){
			//一级产品类型排序：升序
			Collections.sort(goodsClassBoList, new Comparator<SyGoodsClassBo>() {
				
				@Override
				public int compare(SyGoodsClassBo o1, SyGoodsClassBo o2) {
					return o1.getGcSort().compareTo(o2.getGcSort());
				}
			});
		}
		
		return goodsClassBoList;*/
	}
	/**
	 * 根据ClassID拼接URL
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return String
	 * @throws
	 */
	private String consistUrlFromClass(String classId,Integer moduleClassId){
		StringBuffer sb = new StringBuffer();
		//sb.append(constantReload.getCdnHost());
		String prefix = "/rs-goods/goods/sy-goods-search?goodstype=";
		if(ClassConstant.ModuleClassId.MODULE_LOVE_MARKET_CLASS_ID.equals(moduleClassId)){
			prefix = "/rs-goods/goods/help-goods-search?goodstype=";
		}else if(ClassConstant.ModuleClassId.MODULE_PURCHASE_TYPE_CLASS_ID.equals(moduleClassId)){
			prefix = "/rs-goods/goods/searchBizGoods=";
		}else if(ClassConstant.ModuleClassId.MODULE_SY_SHOP_TYPE_CLASS_ID.equals(moduleClassId)){
			prefix = "/rs-goods/goods/sy-goods-search?goodstype=";
		}
		sb.append(prefix);
		sb.append(classId);
		return sb.toString();
	}
	/**
	 * 根据Module拼接URL
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return String
	 * @throws
	 */
	@SuppressWarnings("unused")
	private String consistUrlFromModule(String classId,Integer module){
		StringBuffer sb = new StringBuffer();
		sb.append(constantReload.getCdnHost());
		String prefix = "/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=";
		if(ClassConstant.ModuleType.MODULE_LOVE_MARKET_TYPE.equals(module)){
			prefix = "";
		}else if(ClassConstant.ModuleType.MODULE_PURCHASE_TYPE.equals(module)){
			
		}else if(ClassConstant.ModuleType.MODULE_SY_SHOP_TYPE.equals(module)){
			prefix = "/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=";
		}
		sb.append(prefix);
		sb.append(classId);
		return sb.toString();
	}
	
	/**
	 * 拼接图片路径
	 * @Author  wang chunru
	 * @Description 
	 * @param 
	 * @return String
	 * @throws
	 */
	private String consistClassImageUrl(String image,Integer moduleClassId){
		if(StringUtils.isEmpty(image)){
			return "";
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append(constantReload.getCdnHost());
		String prefix = "";
		if(ClassConstant.ModuleClassId.MODULE_LOVE_MARKET_CLASS_ID.equals(moduleClassId)){
			prefix = "";
		}else if(ClassConstant.ModuleClassId.MODULE_PURCHASE_TYPE_CLASS_ID.equals(moduleClassId)){
			prefix = "/goods_class/";
		}else if(ClassConstant.ModuleClassId.MODULE_SY_SHOP_TYPE_CLASS_ID.equals(moduleClassId)){
			prefix = "/bocm/platformjs/static/image/syShop/";
		}
		sb.append(prefix);
		sb.append(image);
		return sb.toString();
	}
	
	@Override
	public BizGoodsClassManager getGoodsClassByGcId(Integer gcId, byte classState)throws CoreServiceException{
		
		if (ObjectUtils.isEmpty(gcId)) {
			throw new CoreServiceException(GoodsExcepType.EMPTY_PARAMS);
		}

		BizGoodsClassManagerExample bgcme = new BizGoodsClassManagerExample();
		bgcme.createCriteria().andGcIdEqualTo(gcId).andClassStateEqualTo(classState);
		List<BizGoodsClassManager> selectByExample = goodsClassManagerMapper.selectByExample(bgcme);
		if (ObjectUtils.isEmpty(selectByExample)) {
			return null;
		}
		return selectByExample.get(0);
	}
	public Map<Integer,List<SyGoodsClassInfo>>  selectGoodsClassByParentIds(List<Integer> parentIds) throws CoreServiceException {
		Map<Integer,List<SyGoodsClassInfo>> goodsClass =new HashMap<Integer,List<SyGoodsClassInfo>>();
		if(ObjectUtils.isEmpty(parentIds)) {
			return goodsClass;
		}else {
			
			List<SyGoodsClassInfo> syGoodsClasses = this.syGoodsClassMapper.selectGoodsClassByParentIds(parentIds);
			if(ObjectUtils.isEmpty(syGoodsClasses)) {
				return null;
			}
			Iterator<Integer> iterator = parentIds.iterator();
			while (iterator.hasNext()) {
				Integer pid = iterator.next();
			
				Iterator<SyGoodsClassInfo> iterator2 = syGoodsClasses.iterator();
				List<SyGoodsClassInfo> list= new ArrayList<SyGoodsClassInfo>();
				while (iterator2.hasNext()) {
					SyGoodsClassInfo classinfo = iterator2.next();
					Integer gcParentId = classinfo.getGcParentId();
					if(pid.equals(gcParentId)) {
						list.add(classinfo);
					}
				}
				if(!ObjectUtils.isEmpty(list)) {
					goodsClass.put(pid, list);
				}
				
			}
	}
	return goodsClass;
  }
	/**
	 * @author by zy
	 * @param gcIds
	 * @param goodsState
	 * @param goodsProjectType
	 * @return
	 */
	public List<Integer> selectGoodsByGcid(List<Integer> gcIds,Integer goodsState,Integer goodsProjectType)throws CoreServiceException{
		
		if(ObjectUtils.isEmpty(gcIds)) {
			return null;
		}else {
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("gcIds", gcIds);
			goodsState = ObjectUtils.isEmpty(goodsState)?1:goodsState;
			goodsProjectType = ObjectUtils.isEmpty(goodsProjectType)?17:goodsProjectType;
			map.put("goodsState", goodsState);
			map.put("goodsProjectType", goodsProjectType);
			List<Integer> selectGoodsByGcid = syGoodsCommonMapper.selectGoodsByGcid(map);
			return selectGoodsByGcid;
		}
		
	}
	
}
