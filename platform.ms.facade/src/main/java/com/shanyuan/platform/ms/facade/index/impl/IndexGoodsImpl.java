package com.shanyuan.platform.ms.facade.index.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.ConditionService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.bo.AreaBo;
import com.shanyuan.platform.ms.core.goods.bo.GoodsCommonInfo;
import com.shanyuan.platform.ms.core.goods.bo.SpecialGoodsBo;
import com.shanyuan.platform.ms.core.store.AgentService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItem;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemGoodsList;
import com.shanyuan.platform.ms.dao.user.entity.AgentBo;
import com.shanyuan.platform.ms.facade.index.IndexGoods;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;



@Component
public class IndexGoodsImpl implements IndexGoods{
	
	
	
	@Autowired 
	private SyGoodsCommonService  syGoodsCommonService;
	
	@Autowired
	private UnionService unoinService;
	
	@Autowired
	private AgentService roleService;
	
	@Autowired
	private ConditionService conditionService;
	
	private final static Logger logger=LoggerFactory.getLogger(IndexGoodsImpl.class);


	/**
	 * 大家帮  buy sunyue
	 * @param memberId
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Cacheable(value = CommonRedisKey.IndexRedisKey.INDEX_HELP_GOODS, key = "'" + CommonRedisKey.IndexRedisKey.INDEX_HELP_GOODS + "_' + #channel", unless = "#result.Datas.size() == 0")
	@Override
	public IndexGoodsDomain getHelpGoodsList(Integer memberId, String channel) throws CoreServiceException {
		
		logger.info("<<<<<<<<<<<<<  1 >>>>>>>>>>");
		logger.info("大家帮没有Redis 缓存");
		IndexGoodsDomain domain = new IndexGoodsDomain();
		List<GoodsCommonInfo> goodsList = new ArrayList<GoodsCommonInfo>();
		List<Long> areaids = this.roleService.getAreaids(memberId, channel);
		SyUnionItem unionItemInfo = this.unoinService.getUnionItemGoods(channel);
		if(!ObjectUtils.isEmpty(unionItemInfo)) {
			goodsList = syGoodsCommonService.getHelpGoodsList(areaids, unionItemInfo.getUnionItemId());
		}else {
			goodsList = syGoodsCommonService.getHelpGoodsList(areaids, null);
		}
		domain.setTitle("大家帮");
		domain.setDesc("货真物美 有口皆碑");
		domain.setDatas(CollectionUtils.isEmpty(goodsList)? new ArrayList<GoodsCommonInfo>(): goodsList);
		domain.setTouchUrlMore("/bocm/index.php?act=goods&op=support_poor_most_recent_goods_list&sort_order=overall_sort");
	return domain;
	}
	/**
	 * 特产馆      by sunyue
	 * @param memberid   
	 * @param channel 渠道
	 * @return List<Object>
	 * @throws CoreServiceException
	 */
	@Override
	@Cacheable(value = CommonRedisKey.IndexRedisKey.INDEX_SPECIAL_GOODS, key = "'" + CommonRedisKey.IndexRedisKey.INDEX_SPECIAL_GOODS + "_' + #channel", unless = "#result.Datas.size() == 0")
	public IndexGoodsDomain getSpecialGoodsList(Integer memberId, String channel) throws CoreServiceException {
		
		logger.info("<<<<<<<<<<<<<  2 >>>>>>>>>>");
		logger.info("特产馆没有Redis 缓存");
		IndexGoodsDomain domain = new IndexGoodsDomain();
		List<SpecialGoodsBo> bo = new ArrayList<SpecialGoodsBo>();
		if(!StringUtils.isEmpty(channel)) {
			// 根据channel 获得省市县
			List<AreaBo> areaInfo = this.conditionService.getSpecialtyStoresByUnionChannel(channel);
			
			if(!CollectionUtils.isEmpty(areaInfo)) {
				for (AreaBo areaBo : areaInfo) {
					SpecialGoodsBo goods = new SpecialGoodsBo();
					goods = this.syGoodsCommonService.getSpecialList(areaBo,channel);
					bo.add(goods);
				}
			}
		}
		domain.setTitle("特产馆");
		domain.setDesc("山肴野蔌 篱壁佳物");
		domain.setTouchUrlMore("");
		domain.setDatas(CollectionUtils.isEmpty(bo) ? new ArrayList<SpecialGoodsBo>(): bo);
		return domain;
	}
	/**
	 * 优秀助理人   by sunyue
	 * @param memberid
	 * @param channel 渠道
	 * @return List<AgentBo>
	 * @throws CoreServiceException
	 */
	@Override
	@Cacheable(value = CommonRedisKey.IndexRedisKey.INDEX_AGENT_LIST, key = "'" + CommonRedisKey.IndexRedisKey.INDEX_AGENT_LIST + "_' + #channel", unless = "#result.Datas.size() == 0")
	public IndexGoodsDomain getAgentList(Integer memberId, String channel) throws CoreServiceException {
		
		logger.info("<<<<<<<<<<<<<  3 >>>>>>>>>>");
		
		IndexGoodsDomain domain = new IndexGoodsDomain();
		
		List<Long> areaids = this.roleService.getAreaids(memberId, channel);
		List<AgentBo> agentList = this.roleService.agentList(areaids);
		domain.setTitle("优秀助理人");
		domain.setDesc("言忠信 行笃敬 自立以立人");
		domain.setTouchUrlMore("");
		domain.setDatas(CollectionUtils.isEmpty(agentList)? new ArrayList<AgentBo>(): agentList);
		
		return domain;
	}

	/**
	 * 子联盟  by sunyue
	 * @param unionCode
	 * @return
	 * @throws CoreServiceException
	 */
	@Cacheable(value = CommonRedisKey.IndexRedisKey.INDEX_UNIONITEM_GOODS, key = "'" + CommonRedisKey.IndexRedisKey.INDEX_UNIONITEM_GOODS + "_' + #unionCode", unless = "#result.Datas.size() == 0")
   public IndexGoodsDomain getUnionItemGoodsList(String unionCode) throws CoreServiceException {
		logger.info("<<<<<<<<<<<<<  4 >>>>>>>>>>");
		logger.info("子联盟没有Redis 缓存");
		List<SyUnionItemGoodsList> result = new ArrayList<SyUnionItemGoodsList>();
		SyUnionItem unionItemInfo = this.unoinService.getUnionItemGoods(unionCode);
		IndexGoodsDomain domain = new IndexGoodsDomain();
		if(!ObjectUtils.isEmpty(unionItemInfo)) {
			result = syGoodsCommonService.getUnionItemGoodsList(unionItemInfo.getUnionItemId());
			domain.setTitle(unionItemInfo.getIndexTag());
			domain.setTouchUrlMore("/bocm/index.php?act=goods&op=union_item_goods_list&sort_order=overall_sort&union_item_id="+unionItemInfo.getUnionItemId());
		}else {
			domain.setTitle("");
			domain.setTouchUrlMore("");
		}
		domain.setDesc("");
		domain.setDatas(CollectionUtils.isEmpty(result)? new ArrayList<SyUnionItemGoodsList>(): result);
		return domain ;
	}
}
