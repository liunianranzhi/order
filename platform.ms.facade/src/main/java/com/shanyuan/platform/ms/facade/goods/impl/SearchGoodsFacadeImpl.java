package com.shanyuan.platform.ms.facade.goods.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.aliyun.opensearch.sdk.dependencies.com.google.common.collect.Maps;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchClientException;
import com.aliyun.opensearch.sdk.generated.commons.OpenSearchException;
import com.shanyuan.platform.ms.base.common.CommonRedisKey.OpenSearchKey;
import com.shanyuan.platform.ms.base.common.util.NumberFormatUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.constant.GoodsConstant.CompareGoodsPrice;
import com.shanyuan.platform.ms.core.constant.GoodsConstant.GoodsPayPointType;
import com.shanyuan.platform.ms.core.constant.GoodsConstant.GoodsTypes;
import com.shanyuan.platform.ms.core.constant.LoginConstant.RoleType;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.constant.ProjectConstant.ProjectType;
import com.shanyuan.platform.ms.core.goods.ConditionService;
import com.shanyuan.platform.ms.core.goods.OpenSearchGoodsService;
import com.shanyuan.platform.ms.core.goods.SearchGoodsService;
import com.shanyuan.platform.ms.core.goods.SyGoodsService;
import com.shanyuan.platform.ms.core.union.AreaChannelService;
import com.shanyuan.platform.ms.core.union.UnionItemAgentService;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.user.PoorAgentService;
import com.shanyuan.platform.ms.core.user.RoleService;
import com.shanyuan.platform.ms.core.user.SyPoorService;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemAgent;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.facade.constant.GoodsFacadeConstant.GoodsListStyle;
import com.shanyuan.platform.ms.facade.goods.SearchGoodsFacade;
import com.shanyuan.platform.ms.facade.goods.domain.SyTopGoodsDomain;

/**
 * @author 曹勇军
 *
 */
@Component
public class SearchGoodsFacadeImpl implements SearchGoodsFacade {
	
	private final static Logger logger=LoggerFactory.getLogger(SearchGoodsFacade.class);
	
	@Autowired
	private PoorAgentService poorAgentService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private SearchGoodsService searchGoodsService;
	
	@Autowired
	private ConditionService conditionService;
	
	@Autowired
	private UnionService unoinService;
	
	@Autowired
	private SyGoodsService syGoodsService;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private OpenSearchGoodsService openSearchGoodsService;
	
	@Autowired
	private UnionService unionService;
	
	@Autowired
	private UnionItemAgentService unionItemAgentService;
	
	@Autowired
	private AreaChannelService areaChannelService;
	
	@Autowired
	SyPoorService syPoorService;
	
	/**
	 * @author caoyongjun
	 * 大爱超市的排序筛选
	 * 排序类型：time_desc:新品上线
     *          price_desc:价格倒序
     *          price_asc:价格顺序
     *          sale_desc:销量排序
     *          overall_sort:综合排序
	 */
	public static String getGoodsListSort(String sortOrder) {
		String result="overall_sort";
		if(!ObjectUtils.isEmpty(sortOrder)){
		  switch (sortOrder) {
			case "time_desc":
				result =  "goods_edittime DESC";
				break;
			case "time_asc":
				result =  "goods_edittime DESC";
				break;
			case "price_desc":
				result =  "goods_price DESC";
				break;
			case "price_asc":
				result =  "goods_price";
				break;
			case "sale_desc":
				result =  "sale_num DESC";
				break;
			case "sale_asc":
				result =  "sale_num DESC";
				break;
			default:
				break;
			}
		}
        return result;
    }
	
	/**
	 * @author caoyongjun
	 * 善源商场的的排序筛选
	 * 排序类型：time_desc：上架时间倒序	
     *          time_asc：上架时间顺序
     *          price_desc:价格倒序
     *          price_asc:价格顺序
     *          sale_desc:销量倒序
     *          sale_asc:销量顺序
	 */
	public static String getSyGoodsListSort(String sortOrder) {
		String result=null;
		if(!ObjectUtils.isEmpty(sortOrder)){
		  switch (sortOrder) {
			case "time_desc":
				result =  "goods_addtime DESC";
				break;
			case "time_asc":
				result =  "goods_addtime";
				break;
			case "price_desc":
				result =  "goods_price DESC";
				break;
			case "price_asc":
				result =  "goods_price";
				break;
			case "sale_desc":
				result =  "sale_num DESC";
				break;
			case "sale_asc":
				result =  "sale_num";
				break;
			default:
				break;
			}
		}
        return result;
    }
	
	/**
	 * @author caoyongjun
	 * 为了查找出多个排序条件的排序   大爱超市的检索接口
	 * @return
	 */
	public static String getMultiHelpGoodsListSort(String sortOrder){
		if(StringUtils.isBlank(sortOrder) || "overall_sort".equals(sortOrder)){
			return "overall_sort";
		}
		StringBuilder sb=new StringBuilder();
		String[] sortStrs=sortOrder.split("\\,");
		for(int i=0;i<sortStrs.length;i++){
			sb.append("a.").append(getGoodsListSort(sortStrs[i]));
			if(i!=sortStrs.length-1){
				sb.append(",");
			}
		}
		return sb.toString(); 
	}
	
	/**
	 * @author caoyongjun
	 * 为了查找出多个排序条件的排序   善源超市的检索接口
	 * favorable=综合排序
	 * @return
	 */
	public static String getMultiSyGoodsListSort(String sortOrder){
		if(StringUtils.isBlank(sortOrder) || "favorable".equals(sortOrder)){
			return "favorable";
		}
		StringBuilder sb=new StringBuilder();
		String[] sortStrs=sortOrder.split("\\,");
		for(int i=0;i<sortStrs.length;i++){
			sb.append("a.").append(getSyGoodsListSort(sortStrs[i]));
			if(i!=sortStrs.length-1){
				sb.append(",");
			}
		}
		return sb.toString(); 
	}
	@SuppressWarnings("unchecked")
	@Override
	public Map<String,Object> searchGoodsList(Integer memberId,  String searchQuery, String sortOrder, Long villageId, Long townId,
			Long areaId, Long cityId, Long provinceId, Integer goodsType, String goodsCert, String ownerType,Integer pageNo,Integer unionItemId,Integer unionId) throws CoreServiceException {
		
		List<Long> supportCountyIdList=null;//扶贫县id
		
		
		//是否是公益组织来的
		if(unionId!=null && unionId>0){
			SyUnion union=unionService.getUnionById(unionId);
			if(!ObjectUtils.isEmpty(union)){
				String channel=union.getUnionChannel();
				if(StringUtils.isNotBlank(channel)){
					List<SyAreaChannel> areaChannelList=areaChannelService.listAreaChannel(channel, GoodsConstant.AgentChannelType.AREA_CHANNEL_HELP);
					if(!ObjectUtils.isEmpty(areaChannelList)){
						supportCountyIdList=new ArrayList<Long>();
						for(SyAreaChannel areaChannel:areaChannelList){
							supportCountyIdList.add(areaChannel.getAreaId());
						}
					}
				}
			}
		}
		
		//1.是否登录 并且不是公益联盟来的
		if(supportCountyIdList==null && !ObjectUtils.isEmpty(memberId)){
			String channel=null;
			//判断是否是优秀助理人
			List<SyRole> roleList=roleService.getSyRoleByMemberIdAndType(memberId, RoleType.ROLE_TYPE_COOP,RoleType.ROLE_TYPE_WS,RoleType.ROLE_TYPE_GOV,RoleType.ROLE_TYPE_INDUSTRY);
			if(!ObjectUtils.isEmpty(roleList)){
				channel=roleList.get(0).getChannel();
			}else{//查询pool表
				SyPoor syPoor=syPoorService.getSyPoorByMemberId(memberId);
				if(!ObjectUtils.isEmpty(syPoor)){
					channel=syPoor.getChannel();
				}
			}
			
			//不是助理人和贫困户时   就是普通用户
			if(StringUtils.isBlank(channel)){
				SyCircleMember circleMember=unoinService.getSyCircleMemberByMemberId(memberId);
				if(!ObjectUtils.isEmpty(circleMember)){
					//获取到贫困县id
					supportCountyIdList=conditionService.getQueryConditionForMember(circleMember.getCircleId(), circleMember.getCode());
				}
			}else{
				supportCountyIdList=conditionService.getAreadIdsByChannel(channel);
			}
			
			//2.1.该用户是不是代理人
			/*
			List<SyRole> roleList=roleService.getSyRoleByMemberIdAndType(memberId, RoleType.ROLE_TYPE_COOP,RoleType.ROLE_TYPE_WS,RoleType.ROLE_TYPE_GOV,RoleType.ROLE_TYPE_INDUSTRY);
			if(!ObjectUtils.isEmpty(roleList)){
				//2.2.检查会员是否是贫困代理人
				SyPoorAgent syPoorAgent=poorAgentService.getPoorAgentByMemberId(memberId);
				if(!ObjectUtils.isEmpty(syPoorAgent)){
					SyRole syRole=roleList.get(0);Byte erorFlag=0;
					//2.3.判断代理人有没有同意协议   2.4.判断是否代理了贫困户
					if (erorFlag.compareTo(syRole.getSureAgreement())==0) {
						logger.info("     该代理人没有同意协议  memberId={}   ",memberId);
		                throw new CoreServiceException("该代理人没有同意协议");
		            }
		            if (erorFlag.compareTo(syRole.getSurePoor())==0) {
		            	logger.info("     该代理人没有确认贫困户  memberId={}   ",memberId);
		            	throw new CoreServiceException("该代理人没有确认贫困户");
		            }
				}
			}
			*/
		}
		
		//3.设定查询条件
		List<Integer> goodsProjectTypeList=new ArrayList<Integer>();
		Long addressId=null;//地区
		List<String> goodsCertList=null;//产品认证可多条
		String ownerTypeQUERY=null;//用于查询的经营者
		List<String> goodsTypeList=null;//商品类型
		Integer assistId=0;//助理人id
		Integer areaDeep=null;//哪一级地区
		Integer gcId=goodsType;
		
		
		List<Integer> publisherIdList=null;
		//判断是否是子联盟的搜索
		if(unionItemId!=null && unionItemId>0){
//			SyUnionItem unionItem=unionService.getUnionItemById(unionItemId);
//			String indexTag=null;
//			if(!ObjectUtils.isEmpty(unionItem)){
//				indexTag=unionItem.getIndexTag();
//			}
			List<SyUnionItemAgent> unionItemAgentList=unionItemAgentService.selectSyUnionItemAgentByUnionId(unionItemId);
			if(!ObjectUtils.isEmpty(unionItemAgentList)){
				publisherIdList=new ArrayList<Integer>();
				for(SyUnionItemAgent unionItemAgent:unionItemAgentList){
					publisherIdList.add(unionItemAgent.getMemberId());
				}
			}
		}
		
//		if("ws".equals(listType)){//代理人产品
//			goodsProjectTypeList.addAll(Arrays.asList(ProjectType.AGENT_TYPES));
//		}else{
			goodsProjectTypeList.add(ProjectType.PROJECT_TYPE_SUPPORT_POOR);
//		}
		
		//3.1.判断地区 查询出 areaDeep地区属于第几个县级别 和addresId地区id
        if (!ObjectUtils.isEmpty(villageId)){
        	addressId=villageId;
        	areaDeep=5;
        }else if(!ObjectUtils.isEmpty(townId)){
        	addressId=townId;
        	areaDeep=4;
        }else if(!ObjectUtils.isEmpty(areaId)){
        	addressId=areaId;
        	areaDeep=3;
        }else if(!ObjectUtils.isEmpty(cityId)){
        	addressId=cityId;
        	areaDeep=2;
        }else if(!ObjectUtils.isEmpty(provinceId)){
        	addressId=provinceId;
        	areaDeep=1;
        }
        
        //3.2.产品认证筛选  多个时以逗号分隔
        if(!ObjectUtils.isEmpty(goodsCert)){
        	goodsCertList=new ArrayList<String>();
        	String goodsCerts[]=goodsCert.split(",");
        	goodsCertList.addAll(Arrays.asList(goodsCerts));
        }
        
        //3.3.产品经营者
        if(!ObjectUtils.isEmpty(ownerType) && !"all".equals(ownerType)){
        	ownerTypeQUERY=ownerType;
        	//如果属于贫困户的就  找到产品类型为 自产和代销
        	if(OrderConstant.ownerType.OWNER_TYPE_POOR.equals(ownerTypeQUERY)){
        		goodsTypeList=new ArrayList<String>();
        		goodsTypeList.add(GoodsTypes.POOR_SELF_GOODS);
        		goodsTypeList.add(GoodsTypes.POOR_REPLACE_GOODS);
        	}
        }
       
        //3.4.设置排序
    	sortOrder=getMultiHelpGoodsListSort(sortOrder);
        
        Map<String,Object> resultData=new HashMap<String,Object>();
        List<Map<String,Object>> resultList=new ArrayList<Map<String,Object>>();
        //4.查询商品列表
		Map<String, Object> goodsMap = searchGoodsService.searchGoodsList(searchQuery, goodsProjectTypeList, areaDeep,addressId, goodsCertList, ownerTypeQUERY, goodsTypeList, assistId, sortOrder, gcId, supportCountyIdList,publisherIdList,pageNo);
		if (!ObjectUtils.isEmpty(goodsMap) && !ObjectUtils.isEmpty(goodsMap.get("goodsList"))) {
			List<SyGoodsCommon> goodsCommonList = (List<SyGoodsCommon>) goodsMap.get("goodsList");
			resultData.put("hasNext", goodsMap.get("hasNext"));
			for (SyGoodsCommon goodsCommon : goodsCommonList) {
				Map<String, Object> resultMap = new HashMap<String, Object>();
				if(!ObjectUtils.isEmpty(goodsCommon.getGoodsImage()) && !ObjectUtils.isEmpty(goodsCommon.getStoreId())){
					resultMap.put("goodsImage", constantReload.getCdnHost() +"/goods/" + goodsCommon.getStoreId() + "/" + goodsCommon.getGoodsImage());
				}else{
					resultMap.put("goodsImage", "");
				}
				resultMap.put("goodsPrice", "￥"+NumberFormatUtils.getBigDecimalFormatString(goodsCommon.getGoodsPrice()));
				resultMap.put("ownerType", goodsCommon.getOwnerType());// 如果是poor就要显示贫困标签 agent就不用显示
				resultMap.put("goodsName", StringEscapeUtils.unescapeHtml(goodsCommon.getGoodsName()));// 产品标题
				resultMap.put("shippingFee", "￥"+NumberFormatUtils.getBigDecimalFormatString(goodsCommon.getShippingFee()));// 运费金额
				if (!ObjectUtils.isEmpty(goodsCommon.getShippingFee()) && goodsCommon.getShippingFee().compareTo(BigDecimal.ZERO) > 0) {// 有运费需要显示
					resultMap.put("hasTransportFee", "Y");// 有运费
				} else {// 无运费
					resultMap.put("hasTransportFee", "N");// 免运费
				}
				resultMap.put("goodsDesc",goodsCommon.getPublisherTruename() + "的产品已获得" + NumberFormatUtils.getFormatString(goodsCommon.getSaleNum()) + "人次帮助");// 产品描述														// xx的产品已获得x人次帮助
				
				resultMap.put("goodsCommonid",goodsCommon.getGoodsCommonid());
				resultMap.put("goodsUrl", "/bocm/index.php?act=index&op=showvue&appVariant=boc#/mall_detail?goods_id="+goodsCommon.getGoodsCommonid());

				resultList.add(resultMap);
			}
			resultData.put("goodsList", resultList);
		}else{
			resultData.put("hasNext", "N");
			resultData.put("goodsList", new ArrayList<>());
		}
		return resultData;
	}
	@SuppressWarnings("unchecked")
	@Override
	public Map<String,Object> searchSyGoodsList(String searchQuery, String sortOrder, Integer goodsType, Integer pageNo) throws CoreServiceException {
		
		//查询值定义
		sortOrder=getMultiSyGoodsListSort(sortOrder);
		if(ObjectUtils.isEmpty(sortOrder)){
			sortOrder="favorable";
		}
		Integer gcId=goodsType;
		
		Map<String,Object> resultData=new HashMap<String,Object>();
	    List<Map<String,Object>> resultList=new ArrayList<Map<String,Object>>();
	    //4.查询商品列表
  		Map<String, Object> goodsMap = searchGoodsService.searchSyGoodsList(searchQuery, sortOrder, gcId, pageNo,null,null);
  		if (!ObjectUtils.isEmpty(goodsMap) && !ObjectUtils.isEmpty(goodsMap.get("goodsList"))) {
			List<SyGoodsCommon> goodsCommonList = (List<SyGoodsCommon>) goodsMap.get("goodsList");
			resultData.put("hasNext", goodsMap.get("hasNext"));
  			Map<String, Object> resultMap = null;
  			for (SyGoodsCommon syGoodsCommon : goodsCommonList) {
  				resultMap = new HashMap<String, Object>();
  				resultList.add(setDataMap(resultMap, syGoodsCommon));
  			}
  			resultData.put("goodsList", resultList);
  		}else{
  			resultData.put("goodsList", Arrays.asList());
  			resultData.put("hasNext", "N");
  		}
		
		return resultData;
	}

	/**
	 * @author caoyongjun
	 * 抽离出来的为了设定返回值 善源商品的列表数据
	 */
	@Override
	public Map<String,Object> setDataMap(Map<String,Object> dataMap,SyGoodsCommon syGoodsCommon){
		
		dataMap.put("goodsUrl", "/bocm/index.php?act=project&from_action=syshop&op=project_detail&from_type=syShop&gc_id="+syGoodsCommon.getGoodsCommonid()+"&goods_project_type="+syGoodsCommon.getGoodsProjectType());
		
		if(!ObjectUtils.isEmpty(syGoodsCommon.getUnitSpec())){
			dataMap.put("unitSpec", syGoodsCommon.getUnitSpec().replaceAll("\\|", ""));//包装规格
			dataMap.put("unit", syGoodsCommon.getUnit());//包装单位
		}else{
			dataMap.put("unitSpec", "");//包装规格
			dataMap.put("unit", "");//包装单位
		}
		dataMap.put("goodsCommonid", syGoodsCommon.getGoodsCommonid());
		dataMap.put("goodsName", StringEscapeUtils.unescapeHtml(syGoodsCommon.getGoodsName()));
		if(!ObjectUtils.isEmpty(syGoodsCommon.getGoodsImage()) && !ObjectUtils.isEmpty(syGoodsCommon.getStoreId())){
			dataMap.put("goodsImage", constantReload.getCdnHost()+"/goods/"+syGoodsCommon.getStoreId()+"/"+syGoodsCommon.getGoodsImage());
		}else{
			dataMap.put("goodsImage", "");
		}
		dataMap.put("goodsPrice", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getGoodsPrice()));
		if (!ObjectUtils.isEmpty(syGoodsCommon.getShippingFee()) && syGoodsCommon.getShippingFee().compareTo(BigDecimal.ZERO) > 0) {// 有运费需要显示
			dataMap.put("hasTransportFee", "Y");// 有运费
		} else {// 无运费
			dataMap.put("hasTransportFee", "N");// 免运费
		}
		dataMap.put("shippingFee", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getShippingFee()));// 运费金额
		
		if(!ObjectUtils.isEmpty(syGoodsCommon.getBocPointsPrice())){
			dataMap.put("bocPointsPay", NumberFormatUtils.getFormatString(syGoodsCommon.getBocPointsPrice().multiply(GoodsPayPointType.BOC_POINT_RATE)));// 积分支付
		}else{
			dataMap.put("bocPointsPay", "0");// 积分支付
		}
		dataMap.put("goodsStorage", NumberFormatUtils.getFormatString(syGoodsCommon.getGoodsStorage()));//库存
		dataMap.put("goodsMarketprice", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getGoodsMarketprice()));//市场价
		dataMap.put("discountMoney", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getDiscountMoney()));//优惠金额
		if(!ObjectUtils.isEmpty(syGoodsCommon.getDiscountRate())){
			dataMap.put("discountRate", NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getDiscountRate()));
		}else{
			dataMap.put("discountRate", "0.00");
		}
		return dataMap;
	}
	
	public Map<String,Object> setTopMapData(Map<String,Object> dataMap,SyGoodsCommon syGoodsCommon,boolean showStorage){
		
		dataMap.put("goodsUrl", "/bocm/index.php?act=project&op=project_detail&from_type=syShop&gc_id="+syGoodsCommon.getGoodsCommonid());
		
		if(!ObjectUtils.isEmpty(syGoodsCommon.getUnitSpec())){
			dataMap.put("unitSpec", syGoodsCommon.getUnitSpec().replaceAll("\\|", ""));//包装规格
			dataMap.put("unit", syGoodsCommon.getUnit());//包装单位
		}else{
			dataMap.put("unitSpec", "");//包装规格
			dataMap.put("unit", "");//包装单位
		}
		dataMap.put("goodsCommonid", syGoodsCommon.getGoodsCommonid());
		dataMap.put("goodsName", StringEscapeUtils.unescapeHtml(syGoodsCommon.getGoodsName()));
		if(!ObjectUtils.isEmpty(syGoodsCommon.getGoodsImage()) && !ObjectUtils.isEmpty(syGoodsCommon.getStoreId())){
			dataMap.put("goodsImage", constantReload.getCdnHost()+"/goods/"+syGoodsCommon.getStoreId()+"/"+syGoodsCommon.getGoodsImage());
		}else{
			dataMap.put("goodsImage", "");
		}
		dataMap.put("goodsPrice", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getGoodsPrice()));
		if (!ObjectUtils.isEmpty(syGoodsCommon.getShippingFee()) && syGoodsCommon.getShippingFee().compareTo(BigDecimal.ZERO) > 0) {// 有运费需要显示
			dataMap.put("hasTransportFee", "Y");// 有运费
		} else {// 无运费
			dataMap.put("hasTransportFee", "N");// 免运费
		}
		dataMap.put("shippingFee", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getShippingFee()));// 运费金额
		
		if(!ObjectUtils.isEmpty(syGoodsCommon.getBocPointsPrice())){
			dataMap.put("bocPointsPay", NumberFormatUtils.getFormatString(syGoodsCommon.getBocPointsPrice().multiply(GoodsPayPointType.BOC_POINT_RATE)));// 积分支付
		}else{
			dataMap.put("bocPointsPay", "0");// 积分支付
		}
		Long storageL=syGoodsCommon.getGoodsStorage();
		if(storageL==null){
			storageL=0L;
		}
		dataMap.put("goodsStorage", NumberFormatUtils.getFormatString(storageL));//库存
		if(showStorage){
			if(storageL>=100){
				dataMap.put("goodsStorageDesc", "库存充裕");//库存描述
			}else{
				dataMap.put("goodsStorageDesc", "还剩"+storageL+"件");//库存描述
			}
		}else{
			dataMap.put("goodsStorageDesc", "");
		}
		dataMap.put("goodsMarketprice", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getGoodsMarketprice()));//市场价
		dataMap.put("discountMoney", "￥"+NumberFormatUtils.getBigDecimalFormatString(syGoodsCommon.getDiscountMoney()));//优惠金额
		dataMap.put("discountRate", NumberFormatUtils.getFormatString(syGoodsCommon.getDiscountRate()));//折扣利率
		
		return dataMap;
	}
	
	//设定返回值
	public SyTopGoodsDomain setTopDomain(List<SyGoodsCommon> list,Integer style,Integer row,Integer column,Boolean showStorage,String topType,String topTypeDesc,String moreUrl){
		SyTopGoodsDomain domain=new SyTopGoodsDomain();
		domain.setTopType(topType);
		domain.setTopTypeDesc(topTypeDesc);
		domain.setCount(list.size());
		
		int resultRow=0;
		int resultColumn=0;
		
		int length=list.size();
		
		switch (style) {
			case 1:
				resultRow=1;
				resultColumn=length;
				break;
			case 2://2列 多行 
				if(list.size()<2){
					resultRow=1;
					resultColumn=length;
				}else{
					resultRow=(int)Math.ceil((double)length/(2));
					resultColumn=2;
				}
				break;
			case 3://多行 一列
				resultRow=length;
				resultColumn=1;
				break;
			default:
				break;
		}
		
		domain.setRow(resultRow);
		domain.setColumn(resultColumn);
		domain.setStyle(style);
		domain.setMoreUrl(moreUrl);
		Map<String,Object> dataMap=null;
		List<Object> dataList=new ArrayList<Object>();
		for (SyGoodsCommon syGoodsCommon : list) {
			dataMap=new HashMap<String,Object>();
			dataList.add(setTopMapData(dataMap, syGoodsCommon,showStorage));
		}
		domain.setGoodsList(dataList);
		return domain;
	}
	@Override
	@Cacheable(value = OpenSearchKey.OPEN_SEARCH_LIST, key = "'"+ OpenSearchKey.OPEN_SEARCH_LIST + "-toplist'")
	public Map<String,Object> syGoodsTopList() throws CoreServiceException {
		
		Map<String,Object> returnDomain=new HashMap<String,Object>();
		
		List<SyTopGoodsDomain> returnList=new ArrayList<SyTopGoodsDomain>();
		
		List<SyGoodsCommon> notInGoodsList=new ArrayList<SyGoodsCommon>();
		
		//查詢爱心特惠
		List<SyGoodsCommon> loveList=getSyGoodsTopList("b.goods_storage", 7, CompareGoodsPrice.EQ_PRICE, notInGoodsList);
		if(!ObjectUtils.isEmpty(loveList)){
			notInGoodsList.addAll(loveList);
			returnList.add(setTopDomain(loveList,GoodsListStyle.LEFT_GO,1,loveList.size(),true,"爱心特惠","积分全额购买不花一分钱",""));
		}else{
			SyTopGoodsDomain domain=new SyTopGoodsDomain();
			domain.setTopType("爱心特惠");
			domain.setTopTypeDesc("积分全额购买不花一分钱");
			domain.setCount(0);
			domain.setRow(1);
			domain.setColumn(0);
			domain.setStyle(1);
			domain.setGoodsList(new ArrayList<Object>());
			domain.setMoreUrl("");
			returnList.add(domain);
		}
		
		
		//查詢最优惠
		List<SyGoodsCommon> goodsPriceList=getSyGoodsTopList("discount_rate DESC", 6, CompareGoodsPrice.GT_PRICE, notInGoodsList);
		if(!ObjectUtils.isEmpty(goodsPriceList)){
			notInGoodsList.addAll(goodsPriceList);
			returnList.add(setTopDomain(goodsPriceList,GoodsListStyle.FANG_FANG,3,2,false,"最多优惠","","/bocm/index.php?act=goods&op=syshop_goods_list&sort_order=price_asc"));
		}
		
		//查詢最新上架
		List<SyGoodsCommon> goodsAddTimeList=getSyGoodsTopList("a.goods_addtime DESC", 4, CompareGoodsPrice.GT_PRICE, notInGoodsList);
		if(!ObjectUtils.isEmpty(goodsAddTimeList)){
			notInGoodsList.addAll(goodsAddTimeList);
			
			returnList.add(setTopDomain(goodsAddTimeList,GoodsListStyle.FANG_FANG,2,2,false,"最新上架","","/bocm/index.php?act=goods&op=syshop_goods_list&sort_order=time_desc"));
		}
		
		//查詢最多銷量
		List<SyGoodsCommon> saleNumList=getSyGoodsTopList("a.sale_num DESC", 4, CompareGoodsPrice.GT_PRICE, notInGoodsList);
		if(!ObjectUtils.isEmpty(saleNumList)){
			returnList.add(setTopDomain(saleNumList,GoodsListStyle.LONG1,1,saleNumList.size(),false,"最多销量","","/bocm/index.php?act=goods&op=syshop_goods_list&sort_order=sale_desc"));
		}
		
		returnDomain.put("result", returnList);
		return returnDomain;
	}
	
	/**
	 * @author caoyongjun
	 * 先去找搜索引擎  出现网络系统异常就去mysql找
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<SyGoodsCommon> getSyGoodsTopList(String orderByStr,int limit,int compareGoodsPriceFlag,List<SyGoodsCommon> notInGoodsList){
		
		boolean searchMysql=false;
		//查找opensearch
		if(constantReload.isUseOpenSearch()){
			try {
				Map<String,Object> resultMap=openSearchGoodsService.getSyGoodsTopList(limit, orderByStr, compareGoodsPriceFlag, notInGoodsList);
				return (List<SyGoodsCommon>) resultMap.get("goodsList");
			} catch (CoreServiceException e) {
				e.printStackTrace();
				return null;//代表数据为空
			} catch (OpenSearchException e) {
				e.printStackTrace();
				searchMysql=true;
			} catch (OpenSearchClientException e) {
				e.printStackTrace();
				searchMysql=true;
			}
			
		}else{
			searchMysql=true;
		}
		
		if(searchMysql){
			//查找mysql的
			Map<String,Object> paramMap=Maps.newHashMap();
			paramMap.put("orderByStr", orderByStr);
			paramMap.put("limit", limit);
			paramMap.put("notInGoodsIds", notInGoodsList);
			if(compareGoodsPriceFlag==0){
				paramMap.put("goodsPrice", compareGoodsPriceFlag);
			}else{
				paramMap.put("gtGoodsPrice", 1);
			}
			return searchGoodsService.syGoodsTopList(paramMap);
		}
		return null;
	}


	@Override
	public Map<String, Object> searchBizGoodsList(String searchQuery, String sortOrder, String goodsType, Integer pageNo) throws CoreServiceException {
		
		Map<String, Object> result = new HashMap<>();
		
		// 排序的条件
		sortOrder = getGoodsListSort(sortOrder);
		
		result = searchGoodsService.searchBizBuyGoodsList(searchQuery, sortOrder, goodsType, pageNo, null);
		
		return result;
	}

	@Override
	public List<String> getSuggestList(String searchQuery, Integer pageSize) {
		List<String> list=null;
		try {
			if(pageSize==null || pageSize==0){
				pageSize=10;
			}
			list = openSearchGoodsService.getSuggestList(searchQuery, pageSize);
		} catch (OpenSearchException e) {
			e.printStackTrace();
		} catch (OpenSearchClientException e) {
			e.printStackTrace();
		}
		return list;
	}
}