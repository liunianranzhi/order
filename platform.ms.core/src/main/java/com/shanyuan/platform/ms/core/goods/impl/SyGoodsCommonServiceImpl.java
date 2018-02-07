
package com.shanyuan.platform.ms.core.goods.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.bo.AreaBo;
import com.shanyuan.platform.ms.core.goods.bo.GoodsCommonInfo;
import com.shanyuan.platform.ms.core.goods.bo.SpecialGoodsBo;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsCommonBo;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.GoodsExcepType;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.recommend.impl.exceptype.BizServiceExcepType;
import com.shanyuan.platform.ms.dao.goods.entity.SyBuyNum;
import com.shanyuan.platform.ms.dao.goods.entity.SyBuyNumExample;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonCountInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonExample;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsDelayMessage;
import com.shanyuan.platform.ms.dao.goods.entity.SyPlatformStats;
import com.shanyuan.platform.ms.dao.goods.mapper.SyBuyNumMapper;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsCommonMapper;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsDelayMessageMapper;
import com.shanyuan.platform.ms.dao.order.entity.SySetting;
import com.shanyuan.platform.ms.dao.order.entity.SyTransportExtend;
import com.shanyuan.platform.ms.dao.order.mapper.SySettingMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyTransportExtendMapper;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemGoodsList;
import com.shanyuan.platform.ms.dao.union.mapper.SyUnionItemAgentMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyRoleMapper;

import de.ailis.pherialize.Pherialize;


@Component
public class SyGoodsCommonServiceImpl implements SyGoodsCommonService {
	
	private static final Logger logger = LoggerFactory.getLogger(SyGoodsCommonServiceImpl.class);
	
	@Autowired
	private SyBuyNumMapper syBuyNumMapper;
	
	@Autowired
	private SyGoodsCommonMapper syGoodsCommonMapper;
	
	
	@Autowired
	private SyGoodsDelayMessageMapper syGoodsDelayMessageMapper;
	
	@Autowired
	private SyPoorMapper syPoorMapper;
	
	@Autowired
	private SyRoleMapper syRoleMapper;

	
	@Autowired
	private SyTransportExtendMapper syTransportExtendMapper;
	
	@Autowired
	private SySettingMapper sySettingMapper;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private SyUnionItemAgentMapper syUnionItemAgentMapper;
	
	@Autowired
	private ConstantReload constantReload;
	/**
	 * 
	 * @param goodscommonid
	 * @return
	 * @throws CoreServiceException
	 */
	public Integer updateSaleNum(Integer goodscommonid)throws CoreServiceException{
		int row =0;
		try {
			row = syGoodsCommonMapper.updateSaleNum(goodscommonid);
		}catch (Exception e){
			logger.info(e.getMessage(), new CoreServiceException(GoodsExcepType.UPDATE_SALE_FAIL));
		}
		return row;
	}
	/**
	 * 
	 * @param goodsCommon
	 * @return
	 */
	
	public List<SyGoodsCommonBo> list(SyGoodsCommonExample goodsCommon) {
		List<SyGoodsCommon> list = syGoodsCommonMapper.selectByExample(goodsCommon);
		List<SyGoodsCommonBo> bos = new ArrayList<SyGoodsCommonBo>();
		for (SyGoodsCommon syGoodsCommon : list) {
			SyGoodsCommonBo syGoodsCommomBo = new SyGoodsCommonBo();
			BeanUtils.copyProperties(syGoodsCommon, syGoodsCommomBo);
			bos.add(syGoodsCommomBo);
		}
		if(CollectionUtils.isEmpty(bos)){
			return bos;
		}
		return null;
	}

	public SyGoodsCommon getById(Integer goodsCommonId) {
		SyGoodsCommon syGoodsCommon = syGoodsCommonMapper.selectByPrimaryKey(goodsCommonId);
		return syGoodsCommon;
	}
	/**
	 * 获得最大购买相关信息
	 */
	public Integer getHaveBuyNum(GoodsInfo goodsInfo,Integer buyerId) throws CoreServiceException{
		Integer haveBuyNum =0;
		if(goodsInfo.getGoodsProjectType()==OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP
				&&goodsInfo.getMaxBuyNum()>0) {
			SyBuyNumExample bne = new SyBuyNumExample();
			bne.createCriteria().andBuyerIdEqualTo(buyerId).andGoodsIdEqualTo(goodsInfo.getGoodsId());
			List<SyBuyNum> buyNumlist=this.syBuyNumMapper.selectByExample(bne);
		
			if(!CollectionUtils.isEmpty(buyNumlist)) {  
				haveBuyNum=buyNumlist.get(0).getNum();
			}
		}
		return haveBuyNum;
	}
	/*
	 * 校验购买数量 by zy
	 */
	public void checkBuyNum(GoodsInfo goodsInfo,Integer buyerId) throws CoreServiceException {
		if(goodsInfo.getGoodsProjectType()==OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP
				&&goodsInfo.getMaxBuyNum()>0) {
			SyBuyNumExample bne = new SyBuyNumExample();
			bne.createCriteria().andBuyerIdEqualTo(buyerId).andGoodsIdEqualTo(goodsInfo.getGoodsId());
			List<SyBuyNum> buyNumlist=this.syBuyNumMapper.selectByExample(bne);
		
			Integer agoBuyNum=0;
			if(!CollectionUtils.isEmpty(buyNumlist)) {  
				agoBuyNum=buyNumlist.get(0).getNum();
			}
			if(logger.isDebugEnabled()) {
				logger.info("order syMaxBuy :agoBuyNum:"+agoBuyNum+"maxbuy:"+goodsInfo.getMaxBuyNum()+"nowBuy:"+goodsInfo.getGoodsNum());
			}
			Integer maxBuyNum = goodsInfo.getMaxBuyNum();
			maxBuyNum = ObjectUtils.isEmpty(maxBuyNum)?0:maxBuyNum;
			if(agoBuyNum+goodsInfo.getGoodsNum()>maxBuyNum) {
				throw new CoreServiceException(OrderServiceExcepType.SYSHOP_MAX_BUYNUM_FAIL,"该商品每个用户仅可购买"+maxBuyNum+"件,您已购买过："+agoBuyNum+"件~");
			}
				
		}
	}
	/**
	 * 善源商场购买数量冲正
	 * zy
	 * @param goodsInfo
	 * @param buyerId 
	 * 逻辑 buynum
	 * @throws CoreServiceException
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public void rebackBuyNum(Integer buyerId, Integer goodsId, Integer goodsNum) throws CoreServiceException {
		SyBuyNumExample bne = new SyBuyNumExample();
		bne.createCriteria().andBuyerIdEqualTo(buyerId).andGoodsIdEqualTo(goodsId);
		List<SyBuyNum> buyNumlist=this.syBuyNumMapper.selectByExample(bne);
		if(!ObjectUtils.isEmpty(buyNumlist)){
			SyBuyNum sbn=buyNumlist.get(0);
			sbn.setBuyerId(buyerId);
			sbn.setGoodsId(goodsId);
			sbn.setNum(goodsNum);
			syBuyNumMapper.updateDownNum(sbn);
		}
		
	}
	/**
	 * 校验善源商场的购买数量   by sunyue
	 * @param buyerId
	 * @param goodsId
	 * @param goodsNum
	 * @throws CoreServiceException
	 */
	public void updateSyshopBuyNum(Integer buyerId, Integer goodsId, Integer goodsNum) throws CoreServiceException {
		SyBuyNumExample bne = new SyBuyNumExample();
		bne.createCriteria().andBuyerIdEqualTo(buyerId).andGoodsIdEqualTo(goodsId);
		List<SyBuyNum> buyNumlist=this.syBuyNumMapper.selectByExample(bne);
		if(ObjectUtils.isEmpty(buyNumlist)||ObjectUtils.isEmpty(buyNumlist.get(0).getRecId())) {
			SyBuyNum sbn=new SyBuyNum();
			sbn.setBuyerId(buyerId);
			sbn.setNum(goodsNum);
			sbn.setGoodsId(goodsId);
			this.syBuyNumMapper.insertSelective(sbn);
		}else {
			SyBuyNum sbn=buyNumlist.get(0);
			if(ObjectUtils.isEmpty(goodsId) && ObjectUtils.isEmpty(goodsId) && !ObjectUtils.isEmpty(goodsNum)) {
				throw new CoreServiceException(GoodsExcepType.UPDATE_BUNUM_ERROR,"invalid params");
			}
			//by zy
			sbn.setBuyerId(buyerId);
			sbn.setGoodsId(goodsId);
			sbn.setNum(goodsNum);
			syBuyNumMapper.updateNum(sbn);
		}
	}

	/**
	 * 商品的列表  by sunyue  
	 */
	public List<SyGoodsCommon> getGoodsCommonInfo(List<Integer> goodsCommonids) throws CoreServiceException {
		SyGoodsCommonExample sgce = new SyGoodsCommonExample();
		sgce.createCriteria().andGoodsCommonidIn(goodsCommonids);
		return this.syGoodsCommonMapper.selectByExample(sgce);
	}
  /**
   * 校验购买数量是否大于库存数量
   * by zy
   */
	@Override
	public void checkStore(GoodsInfo goodsInfo) throws CoreServiceException {
		if(ObjectUtils.isEmpty(goodsInfo)) {
			throw new CoreServiceException(GoodsExcepType.EMPTY_PARAMS,"相关参数为空");
		}
		if(logger.isDebugEnabled()) {
			logger.info("order checkStore :GoodsStorage:"+goodsInfo.getGoodsStorage()+"nowBuy:"+goodsInfo.getGoodsNum());
		}
		if(goodsInfo.getGoodsNum() >goodsInfo.getGoodsStorage()) {
			throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,"该商品库存不足，请修改购买数量~");
		}
		
	}

	/**
	 * 大家帮  by sunyue
	 * @param supportCountryIds  定点扶贫县的id
	 * @param OrderByClause 排序 limit
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<GoodsCommonInfo> getHelpGoodsList(List<Long> supportcountryIds, Integer unionItemId) throws CoreServiceException {
		Map<String,Object> map = new HashMap<String,Object>();
		List<Integer> goodsCommonIds = new ArrayList<Integer>();
		map.put("supportcountryIds", supportcountryIds);
		//map.put("goodsCommonIds", goodsCommonIds);
		List<GoodsCommonInfo> goodsList = new ArrayList<GoodsCommonInfo>();
		List<SyGoodsCommon> helpgoodslist = this.syGoodsCommonMapper.selectHelpGoodsList(map);

		List<SyUnionItemGoodsList> unionItemGoodsList = this.getUnionItemGoodsList(unionItemId);
		if(!ObjectUtils.isEmpty(unionItemGoodsList) ) {
			for (SyUnionItemGoodsList syUnionItemGoodsList : unionItemGoodsList) {
				goodsCommonIds.add(syUnionItemGoodsList.getGoodsCommonid());
			}
		}
		if(!ObjectUtils.isEmpty(helpgoodslist)) {
			
			Collections.shuffle(helpgoodslist);
			
			//TODO 1.存入redis 2.分页 目前首页取10 个
			int i=0;
			for (SyGoodsCommon syGoodsCommon:helpgoodslist) {
				
				if(i>=10){
					break;
				}
				if(!ObjectUtils.isEmpty(goodsCommonIds) && !goodsCommonIds.contains(syGoodsCommon.getGoodsCommonid())) {
					GoodsCommonInfo goodsCommonInfo = new GoodsCommonInfo();
					goodsCommonInfo.setRealGoodsImage(constantReload.getCdnHost()+"/goods"+"/"+syGoodsCommon.getStoreId()+"/"+syGoodsCommon.getGoodsImage());
					goodsCommonInfo.setGoodsCommonid(syGoodsCommon.getGoodsCommonid());
					goodsCommonInfo.setGoodsName(syGoodsCommon.getGoodsName());
					goodsCommonInfo.setGoodsPrice(syGoodsCommon.getGoodsPrice());
					goodsCommonInfo.setTouchUrl("/bocm/index.php?act=project&op=project_detail&gc_id="+ syGoodsCommon.getGoodsCommonid()
					+"&goods_project_type="+syGoodsCommon.getGoodsProjectType()+"&publisher_id="+syGoodsCommon.getPublisherId());
					goodsList.add(goodsCommonInfo);
					i++;
				}else {
					GoodsCommonInfo goodsCommonInfo = new GoodsCommonInfo();
					goodsCommonInfo.setRealGoodsImage(constantReload.getCdnHost()+"/goods"+"/"+syGoodsCommon.getStoreId()+"/"+syGoodsCommon.getGoodsImage());
					goodsCommonInfo.setGoodsCommonid(syGoodsCommon.getGoodsCommonid());
					goodsCommonInfo.setGoodsName(syGoodsCommon.getGoodsName());
					goodsCommonInfo.setGoodsPrice(syGoodsCommon.getGoodsPrice());
					goodsCommonInfo.setTouchUrl("/bocm/index.php?act=project&op=project_detail&gc_id="+ syGoodsCommon.getGoodsCommonid()
					+"&goods_project_type="+syGoodsCommon.getGoodsProjectType()+"&publisher_id="+syGoodsCommon.getPublisherId());
					goodsList.add(goodsCommonInfo);
					i++;
				}
			}
		}
		return goodsList;
	}
	
	@Override
	public List<SyUnionItemGoodsList> getUnionItemGoodsList(Integer unionItemId) throws CoreServiceException {
		List<SyUnionItemGoodsList> goodsList = new ArrayList<SyUnionItemGoodsList>();
		if(!ObjectUtils.isEmpty(unionItemId)) {
			 goodsList =  this.syUnionItemAgentMapper.selectUnionItemGoods(unionItemId);
			if(!ObjectUtils.isEmpty(goodsList)) {
				for (SyUnionItemGoodsList syUnionItemGoodsList : goodsList) {
					syUnionItemGoodsList.setRealGooodsImage(constantReload.getCdnHost()+"/goods"+"/"+syUnionItemGoodsList.getStoreId()+"/"+syUnionItemGoodsList.getRealGooodsImage());
					syUnionItemGoodsList.setTouchUrl("/bocm/index.php?act=project&op=project_detail&gc_id="+ syUnionItemGoodsList.getGoodsCommonid()+"&goods_project_type="+syUnionItemGoodsList.getGoodsProjectType()+"&publisher_id="+syUnionItemGoodsList.getPublisherId());
				}
			}
		}
		return goodsList;
		
	}
	
	/**
	 * 特产馆      by sunyue
	 * @param channel   渠道
	 * @param areaid3   县的id
	 * @param str     区域
	 * @param proviceId   省的id
	 * @param cityId	市的id
	 * @param text    特产名称
	 * @return
	 * @throws CoreServiceException
	 */
	public SpecialGoodsBo  getSpecialList(AreaBo ab,String channel){
		SpecialGoodsBo domain = new SpecialGoodsBo();
		List<GoodsCommonInfo> goodsList = new ArrayList<GoodsCommonInfo>();
		
		// 查询商品信息
		SyGoodsCommonExample agce = new SyGoodsCommonExample();
		agce.createCriteria().andGoodsProjectTypeEqualTo(17).andGoodsStateEqualTo((byte)1).andAreaid3EqualTo(ab.getAreaId());
		agce.setOrderByClause("speciality_sort desc limit 0,3");
		List<SyGoodsCommon> specialBocList = this.syGoodsCommonMapper.selectByExample(agce);
		
		if(!ObjectUtils.isEmpty(specialBocList)) {
			for (SyGoodsCommon syGoodsCommon : specialBocList) {
				GoodsCommonInfo goodsCommonInfo = new GoodsCommonInfo();
				goodsCommonInfo.setGoodsCommonid(syGoodsCommon.getGoodsCommonid());
				goodsCommonInfo.setGoodsName(syGoodsCommon.getGoodsName());
				goodsCommonInfo.setGoodsPrice(syGoodsCommon.getGoodsPrice());
				goodsCommonInfo.setRealGoodsImage(constantReload.getCdnHost()+"/goods"+"/"+syGoodsCommon.getStoreId()+"/"+syGoodsCommon.getGoodsImage());
				// 点击路径 跳转商品详情页
				goodsCommonInfo.setTouchUrl("/bocm/index.php?act=project&op=project_detail&gc_id="+ syGoodsCommon.getGoodsCommonid()
				+"&goods_project_type="+syGoodsCommon.getGoodsProjectType()+"&publisher_id="+syGoodsCommon.getPublisherId());
				goodsList.add(goodsCommonInfo);
			}
			
			domain.setGoodsList(goodsList);
			domain.setText(ab.getSpecialtyStore());
			
			if(StringUtils.isBlank(channel)){
				channel="boc";
			}
			domain.setTouchUrlMore("/bocm/index.php?act=goods&op=search_poor_goods_list&send_area="+ab.getProvinceName()+" "+ab.getCityName()+" "+ab.getAreaName()+"&province_id="+ab.getProvinceId()+"&city_id="+ab.getCityId()+"&area_id="+ab.getAreaId()+"&channel="+channel);
			return domain;
		}
		return null;
		
	}

	/**
	 * 查询发布者的商品  by sunyue
	 * @param publisherId
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<SyGoodsCommon> getGoodsByPublisher(Integer publisherId) throws CoreServiceException {
		SyGoodsCommonExample sgce = new SyGoodsCommonExample();
		sgce.createCriteria().andGoodsProjectTypeEqualTo(17).andGoodsStateEqualTo((byte)1).andPublisherIdEqualTo(publisherId);
		List<SyGoodsCommon> goodsList = this.syGoodsCommonMapper.selectByExample(sgce);
		if(!ObjectUtils.isEmpty(goodsList)) {
			return goodsList;
		}
		return null;
	}

	
	/**
	 * 根据发布者查询商品条数
	 * @param publisherId
	 * @return
	 */
	@Override
	public List<SyGoodsCommonCountInfo> getGoodsCountList(List<Integer> publisherId) throws CoreServiceException {
		if(!CollectionUtils.isEmpty(publisherId)){
			SyGoodsCommonExample syGoodsCommonExample = new SyGoodsCommonExample();
			syGoodsCommonExample.createCriteria().andPublisherIdIn(publisherId).andGoodsStateEqualTo((byte) 1);
			List<SyGoodsCommonCountInfo> commonCountInfos = this.syGoodsCommonMapper.countGoodsCountList(syGoodsCommonExample);
			if(!CollectionUtils.isEmpty(commonCountInfos)){
				return commonCountInfos;
			}
		}
		return null;
	}

	/**
	 * @Author wang chunru
	 * @Description 查询商品详情
	 * @param goodsCommonId 商品ID
	 * @return Map<String,Object>
	 * @throws
	 */
	@Override
	public Map<String, Object> getGoodsDetail(Integer goodsCommonId)
			throws CoreServiceException {
		
		//商品详情map容器
		Map<String, Object> map = new HashMap<String, Object>();
		//商品公共详情
		SyGoodsCommon goodsCommon = syGoodsCommonMapper.selectGoodsDetail(goodsCommonId);
		if(ObjectUtils.isEmpty(goodsCommon)){
			throw new CoreServiceException("该商品不存在");
		}
		//图片凭借
		goodsCommon.setGoodsImage(consistGoodsImageUrl(goodsCommon.getStoreId(), goodsCommon.getGoodsImage()));
		//产品规格反序列化
		if(!ObjectUtils.isEmpty(goodsCommon.getSpecValue())){
			String spec = Pherialize.unserialize(goodsCommon.getSpecValue()).toString();
			String deSpec = deserializeSpec(spec);
			goodsCommon.setSpecValue(deSpec);
		}
		//判断是否是贫困地区产品 北四县
		Long[] north4county = GoodsConstant.NorthFourCounty.NORTH_FOUR_COUNTY;
		boolean isNorthForCounty = false;
		for (int i = 0; i < north4county.length; i++) {
			if(north4county[i] == goodsCommon.getAreaid3()) {
				isNorthForCounty = true;
				break;
			}
		}
		String areaTag = "";
		if(isNorthForCounty){//是北四县
			areaTag = GoodsConstant.AreaTag.AREA_TAG_POOR;
		}
		map.put("areaTag", areaTag);
		
		//产品的标识
		List<String> goodsTags = new ArrayList<String>();
		if(GoodsConstant.OwnerType.OWNER_TYPE_AGENT.equals(goodsCommon.getOwnerType())){
			if(!ObjectUtils.isEmpty(goodsCommon.getPoorType())){
				switch (goodsCommon.getPoorType()) {
				case GoodsConstant.PoorType.POOR_TYPE_PRE_BUY:
					goodsTags.add(GoodsConstant.TagType.TAG_POOR_TYPE_PRE_BUY);
					break;
				case GoodsConstant.PoorType.POOR_TYPE_LABOR:
					goodsTags.add(GoodsConstant.TagType.TAG_POOR_TYPE_LABOR);
					break;
				case GoodsConstant.PoorType.POOR_TYPE_RENT:
					goodsTags.add(GoodsConstant.TagType.TAG_POOR_TYPE_RENT);
					break;
				case GoodsConstant.PoorType.POOR_TYPE_POST_PAY:
					goodsTags.add(GoodsConstant.TagType.TAG_POOR_TYPE_POST_PAY);
					break;
				}
			}
		} else if (GoodsConstant.OwnerType.OWNER_TYPE_POOR.equals(goodsCommon.getOwnerType())){
			if(!ObjectUtils.isEmpty(goodsCommon.getGoodsType())){
				switch (goodsCommon.getGoodsType()) {
				case GoodsConstant.PoorType.POOR_SELF_GOODS:
					goodsTags.add(GoodsConstant.TagType.TAG_POOR_SELF_GOODS);
					break;
				case GoodsConstant.PoorType.POOR_REPLACE_GOODS:
					goodsTags.add(GoodsConstant.TagType.TAG_POOR_REPLACE_GOODS);
					break;
				}
			}
		} else if(goodsCommon.getAssistId() > 0){
				goodsTags.add(GoodsConstant.TagType.TAG_POOR_CODE_ABLED);
		}
		//判断是否预售
		if(GoodsConstant.TradeMode.TRADE_MODE_QKYS.equals(goodsCommon.getTradeMode())){
			String preTime = DateUtil.getIntegerToNyr((long)goodsCommon.getPresellTime());
			map.put("isNotify", true);
			map.put("notifyMsg", "本产品为预售产品，故需延迟至,故需延迟至" + preTime + "发货。");
			goodsTags.add(GoodsConstant.TagType.TAG_PRE_SALE);
		}
		
		//商品审核信息
		if("yes".equals(goodsCommon.getIsFresh())){
			goodsTags.add(GoodsConstant.TagType.TAG_FRESH);
		}

		map.put("goodsTags", goodsTags);
		
		//延迟发货信息
		SyGoodsDelayMessage delayMsg = syGoodsDelayMessageMapper.selectGoodsDelayMessage(goodsCommonId);
		long time = new Date().getTime();
		
		//判断是否显示延迟通知
		map.put("isNotify", false);
		if(!ObjectUtils.isEmpty(delayMsg) && delayMsg.getDelayTime() > time && delayMsg.getDelayState() == 1){
			String timeStr = DateUtil.getIntegerToNyr((long)delayMsg.getDelayTime());
			map.put("delayTime", timeStr);
			map.put("isNotify", true);
			map.put("notifyMsg", "因" + delayMsg.getDelayReason() + ",故为发货订单需延迟至" + timeStr + "发货。");
		}
	
		//商品详情类型
		String goodsDetailType = "";
		//获取贫困户信息
		SyPoor poorInfo = syPoorMapper.selectPoorInfo(goodsCommon.getPublisherId());
		//获取中行角色人信息
		SyRole roleInfo = syRoleMapper.selectRoleInfo(goodsCommon.getPublisherId());
		if(!ObjectUtils.isEmpty(roleInfo)){
			//助理人
			goodsDetailType = GoodsConstant.GoodsDetailType.GOODS_DETAIL_AGENT;
			int sendSpeed = goodsCommon.getSendSpeed();
			if(!ObjectUtils.isEmpty(sendSpeed)) {
				if(sendSpeed > 72) {
					int day = sendSpeed/24;
					int hour = sendSpeed%24;
					goodsCommon.setSendSpeedDesc(day + "天" + hour + "小时");
				}else {
					goodsCommon.setSendSpeedDesc(sendSpeed + "小时");
				}
			}else {
				goodsCommon.setSendSpeedDesc("无");
			}
			double refundRate = goodsCommon.getRefundRate()*100;
			double complainRate = goodsCommon.getComplainRate()*100;
			double refundRateStat = 0.0;
			double complainRateStat = 0.0;
			SyPlatformStats platformInfo = (SyPlatformStats) map.get("platformInfo");
			if(!ObjectUtils.isEmpty(platformInfo)){
				refundRateStat = platformInfo.getLatestRefundRate().doubleValue();
				complainRateStat = platformInfo.getLatestComplainRate().doubleValue();
			}
			String refundRateDesc = refundRateStat > refundRate ? "良好" : "一般";
			String complainRateDesc = complainRateStat > complainRate ? "良好" : "一般";
			//退款率
			goodsCommon.setRefundRate(refundRate);
			//投诉率
			goodsCommon.setComplainRate(complainRate);
			//相比平台退款率
			goodsCommon.setRefundRateDesc(refundRateDesc);
			//相比平台投诉率
			goodsCommon.setComplainRateDesc(complainRateDesc);
			
		}else if(!ObjectUtils.isEmpty(poorInfo)) {
			//贫困户
			goodsDetailType = GoodsConstant.GoodsDetailType.GOODS_DETAIL_POOR;
		}else if(goodsCommon.getAssistId() > 0) {
			//集采
			goodsDetailType = GoodsConstant.GoodsDetailType.GOODS_DETAIL_ASSIST;
			
			
		}
		map.put("goodsDetailType", goodsDetailType);
		
		//查询运费
		SyTransportExtend transportInfo = syTransportExtendMapper.selectTransportInfo(goodsCommon.getTransportId());
		double shippingFee = 0.0;
		if(!ObjectUtils.isEmpty(transportInfo)){
			shippingFee = transportInfo.getSprice().doubleValue();
		}
		map.put("shippingFee", shippingFee);	
		
		//贫困户总共可以获得的金额
		Double poorGetFee = 0.0;
		//扶贫基金的金额
		Double fundFee = 0.0;
		if(goodsCommon.getAssistId() > 0){//集采
			poorGetFee = goodsCommon.getGoodsPrice().doubleValue()*0.1;
		}else if(GoodsConstant.OwnerType.OWNER_TYPE_POOR.equals(goodsCommon.getOwnerType())){//贫困户自营
			//贫困户总共可以获得的金额
			poorGetFee = goodsCommon.getGoodsPrice().doubleValue()*(1-getServiceRate(null))/1000;
		}else {
			
			//贫困户总共可以获得的金额
			poorGetFee =  goodsCommon.getGoodsPrice().doubleValue()*(1-goodsCommon.getmFeeRate().doubleValue()/1000);
			//扶贫基金的金额
			Double fundFeeRate = getCurrFundFeeRateForBoc(goodsCommon.getOwnerType(),poorInfo,roleInfo);
			fundFee = goodsCommon.getGoodsPrice().doubleValue() * (fundFeeRate / 1000);
		}
		DecimalFormat df = new DecimalFormat("#0.00");  
		map.put("poorGetFee", df.format(poorGetFee));
		map.put("fundFee", df.format(fundFee));
		//用户将获得的积分
		double getPoints=goodsCommon.getGoodsPrice().doubleValue()*GoodsConstant.PointsRate.BOC_POINT_RATE;
		map.put("getPoints", (int)getPoints);
		
		map.put("goodsCommon", goodsCommon);
		return map;
	}
	/**
	 * 是否是新的统计周期
	 * @Author wang chunru
	 * @Description 
	 * @param channel
	 * @return boolean
	 * @throws
	 */
	private boolean isNewStatPeriod(String channel){
		return false;
	}
	/**
	 * 获取当前对贫困户产品收取的平台服务费率
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return double
	 * @throws
	 */
	private double getServiceRate(String channel){
		if (isNewStatPeriod(channel)) {
			//不是公益中行渠道或者十月一之后平台服务费率
			SySetting setting = sySettingMapper.selectByPrimaryKey("pwcn_service_fee_rate");
			return ObjectUtils.isEmpty(setting) ? GoodsConstant.ServiceRate.PWCN_SERVICE_FEE_RATE_FOR_POOR_GOODS * 1000 : Double.parseDouble(setting.getValue());
	    } else {
	    	SySetting setting = sySettingMapper.selectByPrimaryKey("service_fee_rate");
			return ObjectUtils.isEmpty(setting) ? GoodsConstant.ServiceRate.SERVICE_FEE_RATE_FOR_POOR_GOODS * 1000 : Double.parseDouble(setting.getValue());
	    }
	}
	/**
	 * 
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return double
	 * @throws
	 */
	private double getCurrFundFeeRateForBoc(String roleType,SyPoor poor,SyRole role){
		SySetting setting = sySettingMapper.selectByPrimaryKey("fund_fee_rate");
		//默认的基金收费费率
	    double defaultFundFeeRate = ObjectUtils.isEmpty(setting) ? GoodsConstant.FundRate.FUND_FEE_RATE_FOR_BOC * 1000 : Double.parseDouble(setting.getValue());
	    if(GoodsConstant.OwnerType.OWNER_TYPE_AGENT.equals(roleType)){
	    	if(!ObjectUtils.isEmpty(role) && isNewStatPeriod(role.getChannel())){
	    		return 0;
	    	}else {
	    		return defaultFundFeeRate;
	    	}
	    }else if(GoodsConstant.OwnerType.OWNER_TYPE_POOR.equals(roleType)){
	    	//贫困户不收扶贫基金
	        return 0;
	    }else{
	    	return defaultFundFeeRate;
	    }
	}
	/**
	 * 反序列化产品规格
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return String
	 * @throws
	 */
	private String deserializeSpec(String serializeSpec){
		String deserializeSpec = "";
		if(ObjectUtils.isEmpty(serializeSpec)){
			return deserializeSpec;
		}
		serializeSpec = serializeSpec.replaceAll("}", "");
		String[] slipt1 = serializeSpec.split(",");
		for (int i = 0; i < slipt1.length; i++) {
			String str = slipt1[i];
			if(!ObjectUtils.isEmpty(str)){
				String[] split2 = str.split("=");
				if(i==0 && split2.length>2){
					deserializeSpec += "每" + split2[2] + " ";
				}else {
					deserializeSpec += split2[2] + " ";
				}
			}
		}
		return deserializeSpec;
	}
	/**
	 * 拼接图片路径
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return String
	 * @throws
	 */
	private String consistGoodsImageUrl(Integer storeId,String image){
		StringBuffer sb = new StringBuffer();
		sb.append(ImageUtil.cdn_end_point);
		sb.append("/");
		sb.append("goods");
		sb.append("/");
		sb.append(storeId);
		sb.append("/");
		sb.append(image);
		return sb.toString();
	}

	@Override
	public SyGoodsCommon selectCartGoodsInfoByGoodsId(Integer goodsId) {
		return syGoodsCommonMapper.selectCartGoodsInfoByGoodsId(goodsId);
	}

	@Override
	public void insertGoodsInfoToRedis(List<SyGoods> goodsList) throws Exception {

		if (!ObjectUtils.isEmpty(goodsList)) {
			HashOperations<String, String, String> ops = stringRedisTemplate.opsForHash();

			for (SyGoods syGoods : goodsList) {

				String key = CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE + syGoods.getGoodsId();

				// 冷数据一次性加入
				Map<String, String> m = new HashMap<String, String>();
				m.put("price", syGoods.getGoodsPrice().toString());
				m.put("purchasePrice", syGoods.getPurchasePrice().toString());
				m.put("bocPointsPrice", syGoods.getBocPointsPrice().toString());
				m.put("goodsId", String.valueOf(syGoods.getGoodsId()));
				m.put("status", String.valueOf(syGoods.getGoodsState()));
				m.put("verify", String.valueOf(syGoods.getGoodsVerify()));
				m.put("maxBuyNum", String.valueOf(syGoods.getMaxBuyNum()));
				m.put("goodsCode", syGoods.getGoodsCode());
				String goodsSpec = syGoods.getGoodsSpec();
				goodsSpec = ObjectUtils.isEmpty(goodsSpec)?"":goodsSpec;
				m.put("goodsSpec", goodsSpec.toString());
				m.put("goodsCommonid", String.valueOf(syGoods.getGoodsCommonid()));
				ops.putAll(key, m);
				

				// 热数据怕被其他线程覆盖住
				ops.putIfAbsent(key, "sellNum", String.valueOf(syGoods.getGoodsSalenum()));
				ops.putIfAbsent(key, "collectNum", String.valueOf(syGoods.getGoodsCollect()));
				ops.putIfAbsent(key, "storage", String.valueOf(syGoods.getGoodsStorage()));

			}
		}
	}

	@Override
	public void updataRedisGoodsStorageAndSellNum(Integer goodsId,Integer goodsNum) throws Exception {
	   			
		logger.info("------------- update goods to redis data--------------goodsId={},goodsNum={}",goodsId,goodsNum);
		
		HashOperations<String, String,String> ops = stringRedisTemplate.opsForHash();
		
		String key=CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE+goodsId;
		
		//如果缓存中的库存少于等于0 就直接删除缓存中的商品详情
		if(ops.hasKey(key, "storage")){
			ops.increment(CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE+goodsId, "storage", -goodsNum.doubleValue());	
		}
		if(ops.hasKey(key, "sellNum")){
			ops.increment(CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE+goodsId, "sellNum", goodsNum.doubleValue());
		}
	}

	/**
	 * @auther zhongying
	 * @param goodsId
	 * @param goodsNum
	 * @throws Exception
	 */
	public void updataRedisSellNum(Integer goodsId,Integer goodsNum) throws Exception{
		logger.info("------------- update goods to redis data--------------goodsId={},goodsNum={}",goodsId,goodsNum);
		HashOperations<String, String,String> ops = stringRedisTemplate.opsForHash();
		String key=CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE+goodsId;
		if(ops.hasKey(key, "sellNum")){
			ops.increment(CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE+goodsId, "sellNum", goodsNum.doubleValue());
		}
	}
	@Override
	public List<Integer> getGoodsCommonIdListByGcId(Integer gcId, String gcType) throws CoreServiceException{
		if (ObjectUtils.isEmpty(gcId)) {
			logger.info("gcType={}商品分类gcId={}为空", gcType, gcId);
			throw new CoreServiceException(BizServiceExcepType.GC_ID_IS_NULL);
		}
		//集采
		if (GoodsConstant.GoodsOfShop.BIZ_BUY.equalsIgnoreCase(gcType)) {
			return syGoodsCommonMapper.selectGoodsCommonIdListByGcId(getFullBizGoodsClass(gcId));
		}
		//善缘商场
		if (GoodsConstant.GoodsOfShop.SY_SHOP.equalsIgnoreCase(gcType)) {
			return syGoodsCommonMapper.selectSyGoodsCommonIdList(gcId);
		}
		//大爱超市
		if (GoodsConstant.GoodsOfShop.DAAI_SHOP.equalsIgnoreCase(gcType)) {
			return syGoodsCommonMapper.selectDaaiGoodsCommonIdList(gcId);
		}
		return null;
		
	}
	
	/**
     * 通过集采新分类返回老分类+新分类
     * @author zhangwd
     */
	public Integer[] getFullBizGoodsClass(Integer gcId) {
		
		HashMap<Integer, Object> goodsClassMap = new HashMap<>();
		goodsClassMap.put(1774,  new Integer[] {1302,1468,1931,1932});//苹果->富士苹果,富士苹果个,勺面苹果,自营富士
		goodsClassMap.put(1777,  new Integer[] {1316,1769});//枣->枣,枣
		goodsClassMap.put(1877,  new Integer[] {1320,1745});//糕点->糕点,荞麦酥
		goodsClassMap.put(1323,  new Integer[] {1323});//蜜枣
		goodsClassMap.put(1878,  new Integer[] {1325,1329,1332,1593});//果干类->桂圆干,葡萄干,水果干,果仁
		goodsClassMap.put(1911,  new Integer[] {1363});//根茎类->红薯
		goodsClassMap.put(1891,  new Integer[] {1364,1616,1618,1703,1767});// 花茶->菊花茶,金银花,桂圆枸杞茶,秋葵茶,金丝黄菊
		goodsClassMap.put(1923,  new Integer[] {1370});//酒水->苹果酒
		goodsClassMap.put(1795,  new Integer[] {1400,1757});//玉米->水果玉米,水果玉米
		goodsClassMap.put(1815,  new Integer[] {1404,1405,1406,1407});//豆类->黄豆,绿豆,红豆,黑豆
		goodsClassMap.put(1812,  new Integer[] {1410,1756});//面粉->荞麦面,面粉
		goodsClassMap.put(1857,  new Integer[] {1427, 1323});//干枣->干枣,蜜枣
		goodsClassMap.put(1915,  new Integer[] {1569,1614,1766,1337});//休闲小吃->香菇脆片,秋葵脆片,零食,碧根果
		goodsClassMap.put(1876,  new Integer[] {1574});//枣->大枣
		goodsClassMap.put(1921,  new Integer[] {1601,1602,1624, 1595});//工艺品->皮影,泥塑,陕西八大怪,筷子
		goodsClassMap.put(1894,  new Integer[] {1625,1754});//牛奶->牛奶,牛奶ml
		goodsClassMap.put(1929,  new Integer[] {1649,1905});//辣酱类->芝麻酱,橄榄菜
		goodsClassMap.put(1928,  new Integer[] {1660,1661});//果汁->饮料,山楂果茶
		goodsClassMap.put(1861,  new Integer[] {1696,1762});//醋->醋,醋
		goodsClassMap.put(1828,  new Integer[] {1760});//手撕驴肉->食品
		goodsClassMap.put(1853,  new Integer[] {1759});//地皮菜->干货
		goodsClassMap.put(1892,  new Integer[] {1352});//黑茶->乌龙茶
		goodsClassMap.put(1898,  new Integer[] {1599,1770});//冲调谷物->饮料冲调,菊粉
		goodsClassMap.put(1934,  new Integer[] {1639});//油
		goodsClassMap.put(1936,  new Integer[] {1754,1625});//牛奶/酸奶->牛奶ml,牛奶
		
		List<Integer> list=new ArrayList<Integer>();
		Integer[] value = (Integer[]) goodsClassMap.get(gcId);
		if (ObjectUtils.isEmpty(value)) {
			list.add(gcId);
			value = new Integer[] {gcId};
		}else {
			for(int i=0;i <value.length;i++) {
				list.add(value[i]);
			}
			list.add(gcId);
		}
		return (Integer[]) list.toArray(new Integer[list.size()]);
				
	}
	public List<Integer> getFullBizClass(Integer gcId){
		HashMap<Integer, Object> goodsClassMap = new HashMap<>();
		HashMap<String, Object> goodsMap = new HashMap<>();
		goodsClassMap.put(1774,  new Integer[] {1302,1468,1931,1932});
		goodsClassMap.put(1777,  new Integer[] {1316,1769});
		goodsClassMap.put(1877,  new Integer[] {1320,1745});
		goodsClassMap.put(1323,  new Integer[] {1323});
		goodsClassMap.put(1878,  new Integer[] {1363});
		goodsClassMap.put(1911,  new Integer[] {1302,1468,1931,1932});
		goodsClassMap.put(1891,  new Integer[] {1364,1616,1618,1703,1767});
		goodsClassMap.put(1923,  new Integer[] {1370});
		goodsClassMap.put(1795,  new Integer[] {1400,1757});
		goodsClassMap.put(1815,  new Integer[] {1404,1405,1406,1407});
		goodsClassMap.put(1812,  new Integer[] {1410,1756});
		goodsClassMap.put(1857,  new Integer[] {1427});
		goodsClassMap.put(1915,  new Integer[] {1569,1614,1766});
		goodsClassMap.put(1876,  new Integer[] {1876});
		goodsClassMap.put(1921,  new Integer[] {1601,1602,1624});
		goodsClassMap.put(1894,  new Integer[] {1625,1754});
		goodsClassMap.put(1929,  new Integer[] {1649,1905});
		goodsClassMap.put(1928,  new Integer[] {1660,1661});
		goodsClassMap.put(1861,  new Integer[] {1696,1762});
		List<Integer> list=new ArrayList<Integer>();
		Integer[] value = (Integer[]) goodsClassMap.get(gcId);
		if (ObjectUtils.isEmpty(value)) {
			list.add(gcId);
			value = new Integer[] {gcId};
		}else {
			for(int i=0;i <value.length;i++) {
				list.add(value[i]);
			}
			list.add(gcId);
		}
		goodsMap.put("list", list);
		goodsMap.put("gcId", gcId);
		return list;
	}
	
	@Override
	public List<Integer> memberHasGoods() throws CoreServiceException {
		return syGoodsCommonMapper.memberHasGoods();
	}
	@Override
	public Integer getGoodsNum(Long countryId, String ownerType) throws CoreServiceException {
		SyGoodsCommonExample example = new SyGoodsCommonExample();
		example.createCriteria().andOwnerTypeEqualTo(ownerType)
		.andGoodsStateEqualTo(GoodsConstant.GoodsState.GOODS_STATE1)
		.andAreaid3EqualTo(countryId);
		Integer count = syGoodsCommonMapper.countByExample(example);
		return count;
	}
	
}

