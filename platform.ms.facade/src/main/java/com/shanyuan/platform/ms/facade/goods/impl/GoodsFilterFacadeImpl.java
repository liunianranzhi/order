package com.shanyuan.platform.ms.facade.goods.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.UserConstant.UnionType;
import com.shanyuan.platform.ms.core.goods.SyGoodsClassService;
import com.shanyuan.platform.ms.core.goods.SySupportAreaService;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.GoodsExcepType;
import com.shanyuan.platform.ms.core.store.SyAreaFullService;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.facade.goods.GoodsFilterFacade;
import com.shanyuan.platform.ms.facade.goods.domain.AreaFullInfo;
import com.shanyuan.platform.ms.facade.goods.domain.AreaInfo;
import com.shanyuan.platform.ms.facade.goods.domain.GoodsClassInfo;
import com.shanyuan.platform.ms.facade.goods.domain.SupportAreaInfo;

@Component
public class GoodsFilterFacadeImpl implements GoodsFilterFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SyGoodsClassService syGoodsClassService;
	
	@Autowired
	private SyAreaFullService syAreaFullService;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private SySupportAreaService sySupportAreaService;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate ;
	/**
	 * 省市区
	 */
	@Override
	public List<AreaInfo>  getAreaByPid(Long parentId) throws CoreServiceException {
		parentId =ObjectUtils.isEmpty(parentId)?0L:parentId;
		if(!parentId.equals(0L)) {
			SyAreaFull parent = this.syAreaFullService.getSyAreaFullById(parentId);
			if(ObjectUtils.isEmpty(parent)) {
				logger.info("错误的地址id parentId={}",parentId);
				throw new CoreServiceException(GoodsExcepType.WRONG_AREAID,"错误的地址id");
			}
		}
		List<SyAreaFull> childTreeNodes = this.syAreaFullService.getSyAreaFullByParentId(parentId); 
		List<AreaInfo> list=new ArrayList<AreaInfo>();
		for(SyAreaFull sy :childTreeNodes) {
			AreaInfo bo=new AreaInfo();
			BeanUtils.copyProperties(sy, bo);
			list.add(bo);
		}
	return list;
	}
	/**
	 * 获取所有分类
	 * @return
	 */
	@Override
	@Cacheable(value = CommonRedisKey.GoodsFilterRedisKey.DACS_GOODS_CLASS_SET, key = "'"+ CommonRedisKey.GoodsFilterRedisKey.DACS_GOODS_CLASS + "'", unless = "#result == null")
	public List<GoodsClassInfo> getGoodsClass() throws CoreServiceException {
		Integer parentId = this.constantReload.getDaaiGcId();
		List<GoodsClassInfo> resultList = new ArrayList<GoodsClassInfo>();
		List<SyGoodsClassInfo> levelTwoList = this.syGoodsClassService.getGoodsClassListByParentId(parentId);
		for (SyGoodsClassInfo levelTwo : levelTwoList) {
			List<SyGoodsClassInfo> levelThreeList = this.syGoodsClassService.getGoodsClassListByParentId(levelTwo.getGcId());
			GoodsClassInfo goodsClassInfo = new GoodsClassInfo();
			goodsClassInfo.setSyGoodsClass(levelTwo);
			goodsClassInfo.setChildClass(levelThreeList);
			resultList.add(goodsClassInfo);
		}
		return resultList;
	}

	/**
	 * 获取所有证书
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public JSONObject getAllCert() throws CoreServiceException {
		//有序jsonobject
		JSONObject resultJson = new JSONObject(16, true);
		resultJson.put("eu", GoodsConstant.GoodsCerts.eu);
		resultJson.put("green", GoodsConstant.GoodsCerts.green);
		resultJson.put("wgh", GoodsConstant.GoodsCerts.wgh);
		resultJson.put("organic", GoodsConstant.GoodsCerts.organic);
		return resultJson;
	}

	/**
	 * 获取所有产品销售者类型
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public JSONObject getAllOwnerType() throws CoreServiceException {
		JSONObject resultJson = new JSONObject(16, true);
		resultJson.put("all", GoodsConstant.GoodsOwnerType.all);
		resultJson.put("poor", GoodsConstant.GoodsOwnerType.poor);
		resultJson.put("agent", GoodsConstant.GoodsOwnerType.agent);
		return resultJson;
	}
	
	
	

	/**
	 * 根据省id获取地域信息
	 * @param provinceId 省id
	 * @param deep 查询深度 1：省 2：市 3：区县 4：乡镇 5：村
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public AreaFullInfo  getAreaByProvince(Long provinceId, Integer deep) throws CoreServiceException {
		deep = ObjectUtils.isEmpty(deep) ? 3 : deep;
		provinceId = ObjectUtils.isEmpty(provinceId) ?0L: provinceId;
		String key="select_area_list_"+provinceId+"_"+deep;
		ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
		String string = ops.get(key);
		AreaFullInfo parse = JSON.parseObject(string, AreaFullInfo.class);
		AreaFullInfo areaInfo= new AreaFullInfo();
		if(ObjectUtils.isEmpty(string)) {
			AreaFullInfo recursiveTree = this.recursiveTree(provinceId, deep);
			areaInfo =recursiveTree;
			ops.set(key, JSON.toJSONString(recursiveTree));
			//stringRedisTemplate.expire(key, 30, TimeUnit.SECONDS);
		}else {
			areaInfo = parse;
		}
		return areaInfo;
	}
	
	/**
	 * 递归拼接返回城市数据
	 * @param parentId
	 * @return
	 */
	private AreaFullInfo recursiveTree(Long parentId, Integer deep) {
		SyAreaFull parent = this.syAreaFullService.getSyAreaFullById(parentId);
		List<SyAreaFull> childTreeNodes = this.syAreaFullService.getSyAreaFullByParentId(parentId); 
		AreaFullInfo result = new AreaFullInfo();
		result.setArea(parent);
		for (SyAreaFull child : childTreeNodes) {
			if(child.getAreaDeep() <= deep){
				AreaFullInfo areaFullInfo = this.recursiveTree(child.getAreaId(), deep);
				result.getChildrenArea().add(areaFullInfo);
			}
		}
		return result;
	}

	/**
	 * 获取所有省份
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<SyAreaFull> getAllProvince() throws CoreServiceException {
		return this.syAreaFullService.getProvinceList();
	}

	/**
	 * 获取当前渠道帮扶省份
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<SySupportArea> getProvince(String channel) throws CoreServiceException {
		return this.sySupportAreaService.getProvince(channel);
	}
	
	/**
	 * 根据渠道获取当前帮扶地区信息
	 * @param channel
	 * @param deep 查询深度 1：省 2：市 3：区县 4：乡镇 5：村
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<AreaFullInfo> getAreaByChannel(String channel, Integer deep) throws CoreServiceException {
		deep = ObjectUtils.isEmpty(deep) ? 3 : deep;
		List<SySupportArea> province = this.getProvince(channel);
		List<AreaFullInfo> resultList = new ArrayList<AreaFullInfo>();
		for (SySupportArea sySupportArea : province) {
			Long provinceId = sySupportArea.getAreaid1();
			AreaFullInfo result = this.recursiveTree(provinceId, deep);
			resultList.add(result);
		}
		return resultList;
	}

	/**
	 * 根据渠道获取帮扶省市县信息
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Cacheable(value = CommonRedisKey.GoodsFilterRedisKey.DACS_SUPPORT_AREA_LIST, key = "'"+ CommonRedisKey.GoodsFilterRedisKey.DACS_SUPPORT_AREA_LIST +"_' + #channel")
	@Override
	public List<SupportAreaInfo> getSupportAreaByChannel(String channel, String token) throws CoreServiceException {
		channel = !UnionType.YKJLB.equals(channel) ? channel : null; 
		return this.getSupportAreaTree(channel);
	}
	
	private List<SupportAreaInfo> getSupportAreaTree(String channel) {
		//定义结果list
		List<SupportAreaInfo> resultList = new ArrayList<SupportAreaInfo>();
		//拼接条件
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("unionChannel", channel);
		//获取该channel全部信息
		List<SySupportArea> list = this.sySupportAreaService.getSupportAreaInfo(condition);
		if(CollectionUtils.isEmpty(list)){
			logger.info("there is no support area for this channel:{}", channel);
			return null;
		}
		
		//生成省列表
		for (SySupportArea sySupportArea : list) {
			SupportAreaInfo reAreaInfo = new SupportAreaInfo();
			reAreaInfo.setSupportAreaId(sySupportArea.getAreaid1());
			reAreaInfo.setSupportAreaName(sySupportArea.getAreaname1());
			//用contains 方法需要重写equals方法，默认 == ，new对象以后始终不相等，会重复添加
			if(!resultList.contains(reAreaInfo)){
				resultList.add(reAreaInfo);
			}
		}
		//生成市列表
		for (SupportAreaInfo sySupportAreaInfo : resultList) {
			for (SySupportArea sySupportArea : list) {
				if(sySupportArea.getAreaid1().equals(sySupportAreaInfo.getSupportAreaId())){
					SupportAreaInfo areaInfo = new SupportAreaInfo();
					areaInfo.setSupportAreaId(sySupportArea.getAreaid2());
					areaInfo.setSupportAreaName(sySupportArea.getAreaname2());
					if(!sySupportAreaInfo.getChildrenList().contains(areaInfo)){
						sySupportAreaInfo.getChildrenList().add(areaInfo);
					}
				}
			}
		}
		//生成县列表
		for (SupportAreaInfo sySupportAreaInfo : resultList) {
			for (SupportAreaInfo sySupportAreaInfo2 : sySupportAreaInfo.getChildrenList()) {
				for (SySupportArea sySupportArea : list) {
					if(sySupportArea.getAreaid2().equals(sySupportAreaInfo2.getSupportAreaId())){
						SupportAreaInfo areaInfo = new SupportAreaInfo();
						areaInfo.setSupportAreaId(sySupportArea.getAreaid3());
						areaInfo.setSupportAreaName(sySupportArea.getAreaname3());
						if(!sySupportAreaInfo2.getChildrenList().contains(areaInfo)){
							sySupportAreaInfo2.getChildrenList().add(areaInfo);
						}
					}
				}
			}
		}
		return resultList;
	}
	
}