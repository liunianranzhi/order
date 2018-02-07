package com.shanyuan.platform.ms.facade.goods.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.dao.goods.entity.BizGoodsClassManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.RecommendConstant.RecommendModuleCode;
import com.shanyuan.platform.ms.core.constant.RecommendConstant.RecommendStatus;
import com.shanyuan.platform.ms.core.goods.SyGoodsClassService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.GoodsExcepType;
import com.shanyuan.platform.ms.core.recommend.RecommendModuleService;
import com.shanyuan.platform.ms.core.recommend.RecommendService;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;
import com.shanyuan.platform.ms.dao.recommend.entity.RecommendGoodsBo;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModule;
import com.shanyuan.platform.ms.facade.constant.GoodsFacadeConstant.GoodsClassRootGCID;
import com.shanyuan.platform.ms.facade.goods.BizBuyFacade;
import org.springframework.util.StringUtils;

/**
 * 
 * @author zhangwd
 *
 */
@Component
public class BizBuyFacadeImpl implements BizBuyFacade {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private RecommendModuleService recommendModuleService;
	
	@Autowired
	private RecommendService recommendService;
	
	@Autowired
	private SyGoodsClassService syGoodsClassService;
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	
	/**
	 * 获取善缘甄选-集采推荐商品
	 */
	@Override
	public Map<String, Object>  getBizBuyRecomGoods () throws CoreServiceException{
		//获取集采模板
		SyRecommendModule reModule = recommendModuleService.getInfoByModuleCode(RecommendModuleCode.BIZBUY);
		//获取集采子模板列表
		List<SyRecommendModule> reModuleList = recommendModuleService.getSonRecommendModuleList(reModule.getRecId());
		Map<String, Object> recommendGoodsBosMap = new HashMap<>();
		List<Map<String, Object>> rgbList = new ArrayList<>();
		Map<String, Object> hashMap = null;
		for (SyRecommendModule rm : reModuleList) {
			hashMap = new HashMap<>();
			//获取集采模板相对应的商品
			List<RecommendGoodsBo> recommendGoodsBos =  recommendService.getRecommendGoodsByBizModule(rm.getRecId(),RecommendStatus.ENABLE);
			for (RecommendGoodsBo rGB : recommendGoodsBos) {
				rGB.setTouchUrl("/bocm/index.php?act=project&op=project_detail&first_in_detail=1&gc_id=" + rGB.getGoodsCommonid());
                if(StringUtils.isEmpty(rGB.getImgUrl())){
                    String rurl = ImageUtil.cdn_end_point+"/goods/" + rGB.getStoreId() + "/" + rGB.getGoodsImage();
                    rGB.setRealImageurl(rurl);
                }else{
                    rGB.setRealImageurl(ImageUtil.cdn_end_point + "/index_pop/" + rGB.getImgUrl());
                }

//				rGB.setRealImageurl(rGB.getImgUrl());
				//rGB.setImgUrl("");
			}
			
			hashMap.put("recId", rm.getRecId());
			hashMap.put("parentId", rm.getParentId());
			hashMap.put("moduleCode", rm.getModuleCode());
			hashMap.put("moduleName", rm.getModuleName());
			hashMap.put("moduleDesc", rm.getModuleDesc());
			hashMap.put("icon", rm.getIcon());
			hashMap.put("recommendGoods", recommendGoodsBos);
			rgbList.add(hashMap);
		}
		recommendGoodsBosMap.put("bizBuyRecomGoods", rgbList);
		recommendGoodsBosMap.put("bizBuyImgUrl", ImageUtil.php_point + "/bocm/platformjs/static/image/goods/dwjc_v1.png");
		recommendGoodsBosMap.put("bizBuyTouchUrl", "/bocm/index.php?act=index&op=showvue#/syselection_list");
		recommendGoodsBosMap.put("couponImgUrl", ImageUtil.php_point + "/bocm/platformjs/static/image/goods/fpmdz.png");
		
		recommendGoodsBosMap.put("couponTouchUrl", "/bocm/index.php?act=bizbuy&op=biz_buy_model&buy_model=coupon");
		recommendGoodsBosMap.put("syzxTouchUrl", "/bocm/index.php?act=index&op=showvue#/syselection_list");
		return recommendGoodsBosMap;
	}
	
	
	/**
	 * by zy
	 */
	public List<SyGoodsClassInfo> getBizGoodsClass() throws CoreServiceException {
		List<SyGoodsClassInfo> goodsClassList = syGoodsClassService.getGoodsClassListByParentId(1771);
		List<Integer> gc1=new ArrayList<Integer>();
		for(SyGoodsClassInfo sy:goodsClassList) {
			Integer gcId = sy.getGcId();
			if(!gc1.contains(gcId)) {
				gc1.add(gcId);
			}
		}
		//查出第一级
		Map<Integer, List<SyGoodsClassInfo>> selectGoodsClass = syGoodsClassService.selectGoodsClassByParentIds(gc1);
		List<Integer> gc2=new ArrayList<Integer>();
		for(Integer key :selectGoodsClass.keySet()) {
			List<SyGoodsClassInfo> list = selectGoodsClass.get(key);
			for(SyGoodsClassInfo gc22:list) {
				Integer gcId = gc22.getGcId();
				if(!gc2.contains(gcId)) {
					gc2.add(gcId);
				}
			}
		}
		//查出第er级
		Map<Integer, List<SyGoodsClassInfo>> selectGoodsClass2 = syGoodsClassService.selectGoodsClassByParentIds(gc1);
		List<Integer> gc3=new ArrayList<Integer>();
		for(Integer key :selectGoodsClass2.keySet()) {
			List<SyGoodsClassInfo> list = selectGoodsClass2.get(key);
			for(SyGoodsClassInfo gc22:list) {
				Integer gcId = gc22.getGcId();
				if(!gc3.contains(gcId)) {
					gc3.add(gcId);
				}
			}
		}
		//查出第san级
		Map<Integer, List<SyGoodsClassInfo>> selectGoodsClass3 = syGoodsClassService.selectGoodsClassByParentIds(gc1);
		//子类为key
		Map<Integer,Integer> map4=new HashMap<Integer,Integer>();
		List<Integer> gc4=new ArrayList<Integer>();//用来判断是否有这个商品
		for(Integer key :selectGoodsClass3.keySet()) {
			List<SyGoodsClassInfo> list = selectGoodsClass2.get(key);
			for(SyGoodsClassInfo gc22:list) {
				Integer gcId = gc22.getGcId();
					List<Integer> fullBizClass = syGoodsCommonService.getFullBizClass(gcId);

					Iterator<Integer> iterator = fullBizClass.iterator();
					while (iterator.hasNext()) {
						Integer ngcid = iterator.next();
						if(!gc4.contains(gcId)) {
							gc4.add(gcId);
							map4.put(ngcid, gcId);
						}
					}
			}
		}
		//查询是否有 商品 gcid
		List<Integer> selectGoodsByGcid = syGoodsClassService.selectGoodsByGcid(gc4,null,null);
		if(!ObjectUtils.isEmpty(selectGoodsByGcid)) {


		Iterator<Integer> goods = selectGoodsByGcid.iterator();
			for(Integer key :selectGoodsClass3.keySet()) {
				List<SyGoodsClassInfo> list2 = selectGoodsClass3.get(key);
				Iterator<SyGoodsClassInfo> iterator2 = list2.iterator();
				boolean erkey=false;
				while (iterator2.hasNext()) {
					boolean flag=false;
					SyGoodsClassInfo info = iterator2.next();
					Integer gcId = info.getGcId();
					while (goods.hasNext()) {
						Integer ggcId = goods.next();
						Integer ngcid = map4.get(ggcId);
						//有商品
						if(ngcid.equals(gcId)) {
							flag=true;
						}
					}
					//z这个class 有商品
					if(!flag) {
						iterator2.remove();
					}else {
						erkey=true;
					}

				}
				//这会不会有问题？
				/*if(!erkey) {
					selectGoodsClass3.remove(key);
				}*/

			}
			//di
			for(Integer key :selectGoodsClass2.keySet()) {
				List<SyGoodsClassInfo> list2 = selectGoodsClass2.get(key);
				Iterator<SyGoodsClassInfo> iterator3 = list2.iterator();
				while (iterator3.hasNext()) {
					SyGoodsClassInfo info = iterator3.next();
					Integer gcId = info.getGcId();
					List<SyGoodsClassInfo> list = selectGoodsClass3.get(gcId);
					info.setSubGoodsClassList(list);
				}
			}
			for(Integer key :selectGoodsClass.keySet()) {
				List<SyGoodsClassInfo> list2 = selectGoodsClass.get(key);
				Iterator<SyGoodsClassInfo> iterator3 = list2.iterator();
				while (iterator3.hasNext()) {
					SyGoodsClassInfo info = iterator3.next();
					Integer gcId = info.getGcId();
					List<SyGoodsClassInfo> list = selectGoodsClass2.get(gcId);
					info.setSubGoodsClassList(list);
				}
			}
			Iterator<SyGoodsClassInfo> iterator = goodsClassList.iterator();
			while (iterator.hasNext()) {
				SyGoodsClassInfo next = iterator.next();
				Integer gcId = next.getGcId();
				List<SyGoodsClassInfo> list = selectGoodsClass.get(gcId);
				next.setSubGoodsClassList(list);
			}
		}
		return goodsClassList;
	}
	/**
	 * 集采商品分类
	 *
	 */
	@Cacheable(value = CommonRedisKey.GoodsClass.GOODS_CLASS_SET, key = "'"+CommonRedisKey.GoodsClass.GOODS_CLASS_LIST+"_' + #gcType", unless = "#result.size() == 0")
	@Override
	public List<SyGoodsClassInfo> getBizBuyGoodsClassList(String gcType) throws CoreServiceException {
		
		if(ObjectUtils.isEmpty(gcType)){
			logger.info("gcType 为空");
			throw new CoreServiceException(GoodsExcepType.EMPTY_PARAMS);
		}
		Integer gcId = GoodsClassRootGCID.BIZ_GC_ID; //默认集采
		if (GoodsConstant.GoodsOfShop.SY_SHOP.equalsIgnoreCase(gcType)) {
			gcId = GoodsClassRootGCID.SY_SHOP_GC_ID;
		}
		if (GoodsConstant.GoodsOfShop.DAAI_SHOP.equalsIgnoreCase(gcType)) {
			gcId = GoodsClassRootGCID.DAAI_GC_ID;
		}
		//一级分类
		List<SyGoodsClassInfo> goodsClassList = syGoodsClassService.getGoodsClassListByParentId(gcId);

		Iterator<SyGoodsClassInfo> fIt = goodsClassList.iterator();
		while (fIt.hasNext()) {
			SyGoodsClassInfo fGCL =  fIt.next();
			logger.info("[一级分类]  gc_id={}", fGCL.getGcId());
			//二级分类
			List<SyGoodsClassInfo> secondGCList = syGoodsClassService.getGoodsClassListByParentId(fGCL.getGcId());
			Iterator<SyGoodsClassInfo> sIt = secondGCList.iterator();
			while (sIt.hasNext()) {
				SyGoodsClassInfo sGCL = sIt.next();
				logger.info("[二级分类]  gc_id={}", sGCL.getGcId());
				//三级分类
				List<SyGoodsClassInfo> thirdGCList = syGoodsClassService.getGoodsClassListByParentId(sGCL.getGcId());
				Iterator<SyGoodsClassInfo> tIt = thirdGCList.iterator();
				while (tIt.hasNext()) {
					SyGoodsClassInfo tGCL = tIt.next();
					logger.info("[三级分类]  gc_id={}", tGCL.getGcId());
					//三级分类图片  如果商品没有图片就不显示
					List<Integer> goodsCommonIds = syGoodsCommonService.getGoodsCommonIdListByGcId(tGCL.getGcId(), gcType);
					logger.info("[三级分类下的goods_commonid]  goods_commonid={}", goodsCommonIds);
					if (ObjectUtils.isEmpty(goodsCommonIds) || ObjectUtils.isEmpty(tGCL.getGcImage())) {
					//if (ObjectUtils.isEmpty(goodsCommonIds)) {
						tIt.remove();//移除没有商品和图片的三级分类
					}else {
						tGCL.setGcImage(ImageUtil.cdn_end_point + "/goods_class/" +  tGCL.getGcImage());
						
						if (GoodsConstant.GoodsOfShop.SY_SHOP.equalsIgnoreCase(gcType)) {
							tGCL.setImgTouchUrl("/bocm/index.php?act=goods&op=syshop_goods_list&goods_type=" + tGCL.getGcId());
						}
						if (GoodsConstant.GoodsOfShop.DAAI_SHOP.equalsIgnoreCase(gcType)) {
							tGCL.setImgTouchUrl("/daaimarket/market_goods_list?channel=&searchquery=&goodstype=" +tGCL.getGcId()+ "&ownertype=&goodscert="); 
						}
						if (GoodsConstant.GoodsOfShop.BIZ_BUY.equalsIgnoreCase(gcType)) {
							tGCL.setImgTouchUrl("/bocm/index.php?act=goods&op=bizbuy_goods_list&goods_type="+tGCL.getGcId() +":" +tGCL.getGcName());
						}
					}
					//有三级分类 添加到二级分类中
					if (!ObjectUtils.isEmpty(thirdGCList)) {
						sGCL.setSubGoodsClassList(thirdGCList);
					}
				}
				//移除没有3级分类的2级分类
				if (sGCL.getSubGoodsClassList().size() == 0 ) {
					sIt.remove();
				}
			}
			//一级分类图片 biz_goods_class_manager
			BizGoodsClassManager goodsClassManager = syGoodsClassService.getGoodsClassByGcId(fGCL.getGcId(), (byte)1);
			if (!ObjectUtils.isEmpty(goodsClassManager)) {
					fGCL.setImg(ImageUtil.cdn_end_point + "/classoperate/" + goodsClassManager.getClassRecommendImage());
				fGCL.setImgTouchUrl(goodsClassManager.getRecommendImageTouchUrl());
			}else{
				//一级分类默认图片
				fGCL.setImg(ImageUtil.cdnres_point + "/bocm/platformjs/static/image/icon-banner4.jpg");
			}
			if (!ObjectUtils.isEmpty(secondGCList)) {
				fGCL.setSubGoodsClassList(secondGCList);
			}
			//移除没有2级分类的1级分类
			if (fGCL.getSubGoodsClassList().size() == 0) {
				fIt.remove();
			}
		}
		return goodsClassList;
	}

	
	
 }
