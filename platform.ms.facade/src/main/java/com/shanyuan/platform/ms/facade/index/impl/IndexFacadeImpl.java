package com.shanyuan.platform.ms.facade.index.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.apache.commons.lang.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.ImageModuleConstant;
import com.shanyuan.platform.ms.core.constant.IndexConstant;
import com.shanyuan.platform.ms.core.constant.RecommendConstant;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.bo.GoodsCommonInfo;
import com.shanyuan.platform.ms.core.goods.bo.SpecialGoodsBo;
import com.shanyuan.platform.ms.core.recommend.RecommendModuleService;
import com.shanyuan.platform.ms.core.recommend.RecommendService;
import com.shanyuan.platform.ms.core.user.IndexPopService;
import com.shanyuan.platform.ms.core.user.SyGuideShowStateService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommend;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommendModule;
import com.shanyuan.platform.ms.dao.user.entity.AgentBo;
import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowState;
import com.shanyuan.platform.ms.dao.user.entity.SyIndexPop;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.common.CommonFacade;
import com.shanyuan.platform.ms.facade.goods.SearchGoodsFacade;
import com.shanyuan.platform.ms.facade.index.IndexFacade;
import com.shanyuan.platform.ms.facade.index.IndexGoods;
import com.shanyuan.platform.ms.facade.index.domain.AdDomain;
import com.shanyuan.platform.ms.facade.index.domain.AgreementDomain;
import com.shanyuan.platform.ms.facade.index.domain.ButtonImages;
import com.shanyuan.platform.ms.facade.index.domain.FocusDomain;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;
import rx.functions.Func4;


/**
 * 
 * @author yangjian
 * @date 2017/10/31
 *
 */
@Component
public class IndexFacadeImpl implements IndexFacade {
	
	@Autowired
	private RecommendService recommendService;
	
	@Autowired
	private RecommendModuleService recommendModuleService;
	
	@Autowired 
	SyGoodsCommonService  syGoodsCommonService;
	
	@Autowired
	private IndexPopService indexPopService;
	
	@Autowired
	private SyGuideShowStateService syGuideShowStateService;
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private CommonFacade commonService;
	
	@Autowired
	private IndexGoods   indexGoods;
	
	
	private final static Logger logger=LoggerFactory.getLogger(SearchGoodsFacade.class);
	@Override
	public String getRealChannel(String channel ,String token, String did){
		return commonService.getChannelForUser(channel, token, did);
	}

	@Override
	@HystrixCommand(fallbackMethod="fallbackGetCommonData", groupKey="IndexFocus", commandKey = "IndexFocus")
	@Cacheable(value = CommonRedisKey.IndexRedisKey.INDEX_FOCUS_LIST, key = "'" + CommonRedisKey.IndexRedisKey.INDEX_FOCUS_LIST + "_' + #channel", unless = "#result == null")
	public Map<String, Object> getCommonData(String channel, String type, String token) throws Exception {
		if(StringUtils.isEmpty(type)){
			type = IndexConstant.IOSImageType.TWO_TYEP;
		}
		//为channel设置默认值
		if(StringUtils.isEmpty(channel)){
			channel = "";
		}
		
		SyRecommendModule indexModule = recommendModuleService.getInfoByModuleCode(RecommendConstant.RecommendModuleCode.INDEX_PAGE);
		
		//当前渠道公益项目
		List<SyRecommend> recommendProjectChannel = StringUtils.isEmpty(channel) ? new ArrayList<>() : recommendService.getRecommend(channel, RecommendConstant.RecommendModuleCode.PROJECT, indexModule.getRecId());
		//全部公益项目
		List<SyRecommend> recommendProjectAll = recommendService.getRecommend(null, RecommendConstant.RecommendModuleCode.PROJECT, indexModule.getRecId());
		//当前渠道公益活动
		List<SyRecommend> recommendActivityChannel = StringUtils.isEmpty(channel) ? new ArrayList<>() : recommendService.getRecommend(channel, RecommendConstant.RecommendModuleCode.ACTIVITY, indexModule.getRecId());
		//全部公益活动
		List<SyRecommend> recommendActivityAll = recommendService.getRecommend(null, RecommendConstant.RecommendModuleCode.ACTIVITY, indexModule.getRecId());
		//当前渠道商品
		List<SyRecommend> recommendShopChannel = StringUtils.isEmpty(channel) ? new ArrayList<>() : recommendService.getRecommend(channel, RecommendConstant.RecommendModuleCode.SHOP, indexModule.getRecId());
		//全部渠道商品
		List<SyRecommend> recommendShopAll = recommendService.getRecommend(null, RecommendConstant.RecommendModuleCode.SHOP, indexModule.getRecId());
		
		//合并以及处理图片链接
		recommendProjectChannel.addAll(recommendProjectAll);
		for (SyRecommend syRecommend : recommendProjectChannel) {
			syRecommend.setImgUrl(ImageUtil.getImageFullUrlForOss(constantReload.getCdnHost(), ImageModuleConstant.OSS_DIRK_RECOMMEND, syRecommend.getImgUrl()));
		}
		recommendActivityChannel.addAll(recommendActivityAll);
		for (SyRecommend syRecommend : recommendActivityChannel) {
			syRecommend.setImgUrl(ImageUtil.getImageFullUrlForOss(constantReload.getCdnHost(), ImageModuleConstant.OSS_DIRK_RECOMMEND, syRecommend.getImgUrl()));
		}
		recommendShopChannel.addAll(recommendShopAll);
		
		for (SyRecommend syRecommend : recommendShopChannel) {
			syRecommend.setImgUrl(ImageUtil.getImageFullUrlForOss(constantReload.getCdnHost(), ImageModuleConstant.OSS_DIRK_RECOMMEND, syRecommend.getImgUrl()));
		}
		
		List<ButtonImages> firstLine = new ArrayList<ButtonImages>();
		//第一行按钮

		String imgPre = "/bocm/platformjs/static/image/index/";
		String _2XSuf = "_2x.png";
		String _3XSuf = "_3x.png";
		String imgUrlDacs = ImageUtil.cdnres_point + imgPre + "artboard15";
		imgUrlDacs = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlDacs + _2XSuf : imgUrlDacs + _3XSuf;

		firstLine.add(new ButtonImages("大爱超市", imgUrlDacs, "/bocm/index.php?act=goods&op=search_poor_goods_list&from_action=index"));
		String imgUrlSyzx = ImageUtil.cnd_res_point + imgPre + "/artboard16";
		imgUrlSyzx = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlSyzx + _2XSuf : imgUrlSyzx + _3XSuf;
		firstLine.add(new ButtonImages("善源甄选", imgUrlSyzx, "/bocm/index.php?act=goods&op=bizbuy"));
		String imgUrlDwjc = ImageUtil.cnd_res_point + imgPre + "/artboard19";
		imgUrlDwjc = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlDwjc + _2XSuf : imgUrlDwjc + _3XSuf;
		firstLine.add(new ButtonImages("单位集采", imgUrlDwjc, "/bocm/index.php?act=goods&op=bizbuy_goods_list"));
		String imgUrlSysc = ImageUtil.cnd_res_point + imgPre + "/artboard17";
		imgUrlSysc = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlSysc + _2XSuf : imgUrlSysc + _3XSuf;
		firstLine.add(new ButtonImages("善源商场", imgUrlSysc, "/bocm/index.php?act=index&op=syshop_index"));
		
		//第二行按钮
		List<ButtonImages> secondLine = new ArrayList<ButtonImages>();
		String imgUrlGyzc = ImageUtil.cnd_res_point + imgPre + "/artboard11";
		imgUrlGyzc = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlGyzc + _2XSuf : imgUrlGyzc + _3XSuf;
		secondLine.add(new ButtonImages("公益众筹", imgUrlGyzc, "/bocm/index.php?act=pubwel_router&op=pubwel_list&project_mode=get_crowdfunding_list"));
		String imgUrlCsxm = ImageUtil.cnd_res_point + imgPre + "/beneficence11";
		imgUrlCsxm = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlCsxm + _2XSuf : imgUrlCsxm + _3XSuf;
		secondLine.add(new ButtonImages("慈善项目", imgUrlCsxm, "/bocm/index.php?act=pubwel_router&op=pubwel_list&project_mode=get_donate_list"));
		String imgUrlGrqz = ImageUtil.cnd_res_point + imgPre + "/for_help";
		imgUrlGrqz = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlGrqz + _2XSuf : imgUrlGrqz + _3XSuf;
		secondLine.add(new ButtonImages("个人求助", imgUrlGrqz, "/bocm/index.php?act=pubwel_router&op=pubwel_list&project_mode=get_personalhelp_list"));
		
		//第三行按钮
		List<ButtonImages> thirdLine = new ArrayList<ButtonImages>();
		String imgUrlZyd = ImageUtil.cnd_res_point + imgPre + "/artboard12";
		imgUrlZyd = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlZyd + _2XSuf : imgUrlZyd + _3XSuf;
		thirdLine.add(new ButtonImages("志愿组织", imgUrlZyd, "/mobile/index.php?act=volunteer_router&op=vol_organization"));
		String imgUrlXsld = ImageUtil.cnd_res_point + imgPre + "/artboard13";
		imgUrlXsld = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlXsld + _2XSuf : imgUrlXsld + _3XSuf;
		thirdLine.add(new ButtonImages("最新招募", imgUrlXsld, "/mobile/index.php?act=volunteer_router&op=vol_recruit&tab_index=1"));
		String imgUrlTcsx = ImageUtil.cnd_res_point + imgPre + "/artboard14";
		imgUrlTcsx = type.equals(IndexConstant.IOSImageType.TWO_TYEP) ? imgUrlTcsx + _2XSuf : imgUrlTcsx + _3XSuf;
		thirdLine.add(new ButtonImages("同城志愿", imgUrlTcsx, "/mobile/index.php?act=volunteer_router&op=vol_recruit&tab_index=2"));

		
		//设置最终list
		List<FocusDomain> resultList = new ArrayList<FocusDomain>();
		resultList.add(new FocusDomain("公益消费", "兼爱交利 投桃报李", recommendShopChannel, firstLine));
		resultList.add(new FocusDomain("公益项目", "博施济众 积善成德", recommendProjectChannel, secondLine));
		resultList.add(new FocusDomain("一起志愿", "岂曰无衣 与子同袍", recommendActivityChannel, thirdLine));
		
		
		//设置返回结果
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("focus", resultList);
		return resultMap;
	}


	public Map<String, Object> fallbackGetCommonData(String channel, String type, String token) throws CoreServiceException {
		logger.error("fallback getCommonData start");
		String jsonStr = "{\"code\":200,\"message\":\"success\",\"data\":{\"focus\":[{\"title\":\"公益消费\",\"desc\":\"兼爱交利 投桃报李\",\"recommends\":[{\"recId\":159,\"moduleId\":9,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_5dec13bc4ebc33a0296e87fe2efab761.jpeg\",\"recommendName\":\"hahah\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1511767272,\"touchUrl\":\"https://t2.17shanyuan.com/bocm/index.php?act=project&op=project_detail&from_type=syShop&gc_id=986876\",\"channel\":\"boc\",\"updateTime\":1512124383,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":158,\"moduleId\":9,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_2425a7d995d2b2b916a8bd7e1e87a452.jpeg\",\"recommendName\":\"re\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1511767186,\"touchUrl\":\"www.baidu.com\",\"channel\":\"boc\",\"updateTime\":1511785470,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":160,\"moduleId\":9,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_0185813fc7caf582531d60f4cae12437.jpeg\",\"recommendName\":\"wode\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1511767304,\"touchUrl\":\"eew\",\"channel\":\"boc\",\"updateTime\":1511767307,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":120,\"moduleId\":9,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/e64cc6246e677817d0243b7e592a474c.jpeg\",\"recommendName\":\"0926善源商场\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1506423397,\"touchUrl\":\"https://t2.17shanyuan.com/bocm/index.php?act=help&op=support_news&article_id=218\",\"channel\":\"allunion\",\"updateTime\":1512370572,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":165,\"moduleId\":9,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_57a42321dd7feb901c4a8978a38fb17b.jpeg\",\"recommendName\":\"善缘商城\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1512123969,\"touchUrl\":\"https://www.17shanyuan.com/bocm/index.php?act=project&op=project_detail&from_type=syShop&gc_id=979116\",\"channel\":\"allunion\",\"updateTime\":1512124452,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":170,\"moduleId\":9,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_1e25fb8b01de33da628bef5a80bae833.jpeg\",\"recommendName\":\"id990945\",\"recommendDesc\":\"\",\"type\":\"goods\",\"itemId\":990945,\"status\":2,\"sort\":0,\"createTime\":1512371683,\"touchUrl\":\"https://t2.17shanyuan.com/bocm/index.php?act=project&op=project_detail&goods_id=990945\",\"channel\":\"allunion\",\"updateTime\":1512371701,\"bannerId\":0,\"startTime\":0,\"endTime\":0}],\"buttonImages\":[{\"name\":\"大爱超市\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index/artboard15_2x.png\",\"touchUrl\":\"/bocm/index.php?act=goods&op=search_poor_goods_list&from_action=index\"},{\"name\":\"善源甄选\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//artboard16_2x.png\",\"touchUrl\":\"/bocm/index.php?act=goods&op=bizbuy\"},{\"name\":\"单位集采\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//artboard19_2x.png\",\"touchUrl\":\"/bocm/index.php?act=goods&op=bizbuy_goods_list\"},{\"name\":\"善源商场\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//artboard17_2x.png\",\"touchUrl\":\"/bocm/index.php?act=index&op=syshop_index\"}]},{\"title\":\"公益项目\",\"desc\":\"博施济众 积善成德\",\"recommends\":[{\"recId\":122,\"moduleId\":7,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/0114bcd9e361e0f6a80fdcbd0cefa476.jpeg\",\"recommendName\":\"测试\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1508909650,\"touchUrl\":\"http://finance.sina.cn/zt_d/jrfp2017?from=singlemessage&isappinstalled=0\",\"channel\":\"boc\",\"updateTime\":1508909653,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":121,\"moduleId\":7,\"imgUrl\":\"https://pwcn-test.oss-cn-beijing.aliyuncs.com/recommend/5d5421344e651aabd0a1ec827ffc69f0.jpeg\",\"recommendName\":\"测试\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1506505020,\"touchUrl\":\"https://www.17shanyuan.com/bocm/index.php?act=project&op=project_detail&from_type=syShop&gc_id=979395\",\"channel\":\"boc\",\"updateTime\":1506505777,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":69,\"moduleId\":7,\"imgUrl\":\"https://cdn.17shanyuan.com/recommend/b982fdc3160e27052b84b5e844110a87.jpeg\",\"recommendName\":\"\",\"recommendDesc\":\"\",\"type\":\"project\",\"itemId\":29,\"status\":2,\"sort\":0,\"createTime\":1505320657,\"touchUrl\":\"https://www.17shanyuan.com/mobile/index.php?act=syproject&op=syproject_detail&public_project_id=29\",\"channel\":\"boc\",\"updateTime\":1505321641,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":119,\"moduleId\":7,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/b3bfd0e05be70708a5bb80942d8a6b97.jpeg\",\"recommendName\":\"测试\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1506332820,\"touchUrl\":\"https://m2.qschou.com/project/love/love_v7.html?projuuid=0161e90a-e1d6-4468-8bd5-d56a0b8c951f&uuid=71cc9b07-bbd6-464e-baea-9f9a5f2e7e73&platform=qsc_ios/3.0.5/v6&shareto=2&from_uuid=71cc9b07-bbd6-464e-baea-9f9a5f2e7e73&from=singlemessage&isappinstalled=0\",\"channel\":\"allunion\",\"updateTime\":1512447776,\"bannerId\":0,\"startTime\":0,\"endTime\":0}],\"buttonImages\":[{\"name\":\"公益众筹\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//artboard11_2x.png\",\"touchUrl\":\"/bocm/index.php?act=pubwel_router&op=pubwel_list&project_mode=get_crowdfunding_list\"},{\"name\":\"慈善项目\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//beneficence11_2x.png\",\"touchUrl\":\"/bocm/index.php?act=pubwel_router&op=pubwel_list&project_mode=get_donate_list\"},{\"name\":\"个人求助\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//for_help_2x.png\",\"touchUrl\":\"/bocm/index.php?act=pubwel_router&op=pubwel_list&project_mode=get_personalhelp_list\"}]},{\"title\":\"一起志愿\",\"desc\":\"岂曰无衣 与子同袍\",\"recommends\":[{\"recId\":92,\"moduleId\":8,\"imgUrl\":\"https://cdn.17shanyuan.com/recommend/b81fd5a463deb7b2420b5ab51b0fb7ec.jpeg\",\"recommendName\":\"积分圆梦\",\"recommendDesc\":\"\",\"type\":\"other\",\"itemId\":0,\"status\":2,\"sort\":0,\"createTime\":1505477683,\"touchUrl\":\"https://www.17shanyuan.com/bocm/index.php?act=cpdonation&op=donate_activity\",\"channel\":\"boc\",\"updateTime\":1506101808,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":118,\"moduleId\":8,\"imgUrl\":\"https://cdn.17shanyuan.com/recommend/8be0035a0d2bfb5665d9c2efe392a20b.jpeg\",\"recommendName\":\"0923\",\"recommendDesc\":\"\",\"type\":\"article\",\"itemId\":217,\"status\":2,\"sort\":0,\"createTime\":1506101750,\"touchUrl\":\"https://www.17shanyuan.com/bocm/index.php?act=help&op=support_news&article_id=217\",\"channel\":\"boc\",\"updateTime\":1506101799,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":133,\"moduleId\":8,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_ce7b5296359b834b1a03444e57217b2c.jpeg\",\"recommendName\":\"\",\"recommendDesc\":\"\",\"type\":\"article\",\"itemId\":218,\"status\":2,\"sort\":0,\"createTime\":1510651688,\"touchUrl\":\"https://t2.17shanyuan.com/bocm/index.php?act=help&op=support_news&article_id=218\",\"channel\":\"allunion\",\"updateTime\":1510651701,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":138,\"moduleId\":8,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_a36fd29328e5e839b459141a7af13d5d.jpeg\",\"recommendName\":\"一起志愿首页\",\"recommendDesc\":\"\",\"type\":\"volunteer\",\"itemId\":56,\"status\":2,\"sort\":0,\"createTime\":1510829162,\"touchUrl\":\"https://t2.17shanyuan.com/mobile/index.php?act=volunteer&op=volunteer_detial&volunteer_id=56\",\"channel\":\"allunion\",\"updateTime\":1510829167,\"bannerId\":0,\"startTime\":0,\"endTime\":0},{\"recId\":155,\"moduleId\":8,\"imgUrl\":\"https://cdnt.17shanyuan.com/recommend/oss_893429bc15c8958a6ba44231cd3eb97a.jpeg\",\"recommendName\":\"和就可烦记得看解放贷款\",\"recommendDesc\":\"\",\"type\":\"volunteer\",\"itemId\":43,\"status\":2,\"sort\":0,\"createTime\":1511502836,\"touchUrl\":\"https://t2.17shanyuan.com/mobile/index.php?act=volunteer_router&op=vol_detail&volunteer_org_id=43\",\"channel\":\"allunion\",\"updateTime\":1511502839,\"bannerId\":0,\"startTime\":0,\"endTime\":0}],\"buttonImages\":[{\"name\":\"志愿组织\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//artboard12_2x.png\",\"touchUrl\":\"/mobile/index.php?act=volunteer_router&op=vol_organization\"},{\"name\":\"最新招募\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//artboard13_2x.png\",\"touchUrl\":\"/mobile/index.php?act=volunteer_router&op=vol_recruit&tab_index=1\"},{\"name\":\"同城志愿\",\"imgUrl\":\"https://cdnres.17shanyuan.com/bocm/platformjs/static/image/index//artboard14_2x.png\",\"touchUrl\":\"/mobile/index.php?act=volunteer_router&op=vol_recruit&tab_index=2\"}]}]}}";
		JSONObject j = JSONObject.parseObject(jsonStr);
		return j;
	}
	
	@HystrixCommand(fallbackMethod = "fallbackIndexGoods",
			groupKey="IndexGoods", commandKey = "IndexHelpGoodsList"
	)
	private Observable<IndexGoodsDomain> getHelpGoodsListOb(Integer memberId, String channel,int status){
		return Observable.create(new OnSubscribe<IndexGoodsDomain> () {
			@Override
			public void call(Subscriber<? super IndexGoodsDomain> t) {
				IndexGoodsDomain igd=	indexGoods.getHelpGoodsList( memberId,  channel);
				 t.onNext(igd);
			     t.onCompleted();
				
			}
		});
	}
	
	@HystrixCommand(fallbackMethod = "fallbackIndexGoods",
			groupKey="IndexGoods", commandKey = "IndexSpecialGoodsList"
	)
	private Observable<IndexGoodsDomain> getSpecialGoodsListOb(Integer memberId, String channel,int status){
		return Observable.create(new OnSubscribe<IndexGoodsDomain> () {
			@Override
			public void call(Subscriber<? super IndexGoodsDomain> t) {
				IndexGoodsDomain igd=	indexGoods.getSpecialGoodsList( memberId,  channel);
				 t.onNext(igd);
			     t.onCompleted();
				
			}
		});
	}
	
	
	@HystrixCommand(fallbackMethod = "fallbackUnionIndexGoods",
			groupKey="IndexGoods", commandKey = "IndexUnionItemGoodsList"
	)
	public Observable<IndexGoodsDomain> getUnionItemGoodsObserver(String unionCode) throws CoreServiceException {
		return Observable.create(new OnSubscribe<IndexGoodsDomain> () {
			@Override
			public void call(Subscriber<? super IndexGoodsDomain> t) {
				IndexGoodsDomain igd=	indexGoods.getUnionItemGoodsList(  unionCode);
				 t.onNext(igd);
			     t.onCompleted();
				
			}
		});
	}
	
	@HystrixCommand(fallbackMethod = "fallbackIndexGoods",
			groupKey="IndexGoods", commandKey = "IndexAgentGoodsList"
	)
	private Observable<IndexGoodsDomain> getAgentListOb(Integer memberId, String channel,int status){
		return Observable.create(new OnSubscribe<IndexGoodsDomain> () {
			@Override
			public void call(Subscriber<? super IndexGoodsDomain> t) {
				IndexGoodsDomain igd=indexGoods.getAgentList( memberId,  channel);
				 t.onNext(igd);
			     t.onCompleted();
				
			}
		});
	}

	
	
	/**
	 *@author caoyongjun
	 *用于返回大家帮 特产馆 优秀助理人超时时
	 */
	public IndexGoodsDomain fallbackIndexGoods(Integer memberId,String channel,int status) throws CoreServiceException {
		IndexGoodsDomain domain=new IndexGoodsDomain();
		String title="";
		String desc="";
		if(status==1){
			title="大家帮";
			desc="货真物美 有口皆碑";
			domain.setDatas(new ArrayList<GoodsCommonInfo>());
		}else if(status==2){
			title="特产馆";
			desc="山肴野蔌 篱壁佳物";
			domain.setDatas(new ArrayList<SpecialGoodsBo>());
		}else{
			title="优秀助理人";
			desc="言忠信 行笃敬 自立以立人";
		   domain.setDatas(new ArrayList<AgentBo>());
		}
		domain.setTitle(title);
		domain.setDesc(desc);
		
		return domain;
	}
	
	/**
	 *@author caoyongjun
	 *用于子联盟数据为空fallback
	 */
	public Object fallbackUnionIndexGoods(String channel) throws CoreServiceException {
		return new ArrayList<IndexGoodsDomain>();
	}
	
	
	@Override
	public Map<String, Object> getIndexPop(String channel, String token) throws CoreServiceException {
		channel = StringUtils.isEmpty(channel) ? IndexConstant.Channels.ALLUNION : channel;
		SyIndexPop indexPopByChannel = this.indexPopService.getIndexPopByChannel(channel);
		//设置图片链接
		indexPopByChannel.setImgUrl(ImageUtil.getImageFullUrlForOss(constantReload.getCdnHost(), ImageModuleConstant.OSS_DIRK_INDEX_POP, indexPopByChannel.getImgUrl()));
		indexPopByChannel.setTouchUrl(StringEscapeUtils.unescapeHtml(indexPopByChannel.getTouchUrl()));
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if(!ObjectUtils.isEmpty(indexPopByChannel)){
			resultMap.put("indexPop", indexPopByChannel);
			return resultMap;
		}
		return resultMap;
	}

	/**
	 * 获取广告
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	@Cacheable(value = CommonRedisKey.IndexRedisKey.INDEX_AD_LIST, key = "'"+ CommonRedisKey.IndexRedisKey.INDEX_AD_LIST + "_' + #channel", unless = "#result == null")
	public List<AdDomain> getAdList(String channel, String token) throws CoreServiceException {
		channel = null;
		List<SyRecommend> adList = this.recommendService.getAdList(channel);
		List<AdDomain> adDomains = new ArrayList<AdDomain>();
		for (SyRecommend syRecommend : adList) {
			AdDomain adDomain = new AdDomain();
			BeanUtils.copyProperties(syRecommend, adDomain);
			adDomain.setImgUrl(ImageUtil.getImageFullUrlForOss(constantReload.getCdnHost(), "/recommend/", adDomain.getImgUrl()));
			adDomains.add(adDomain);
		}
		
		List<AdDomain> resultList = new ArrayList<AdDomain>(6);
		for(int i = 0; i < 6; i++){
			resultList.add(i, new AdDomain((byte) (i + 1)));
			for (AdDomain adDomain : adDomains) {
				if(adDomain.getBannerId() == (i + 1)){
					resultList.set(i, adDomain);
				}
			}
		}
		return resultList;
	}

	@HystrixCommand(fallbackMethod = "fallbackIndexGoods"
		//	,commandProperties ={@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1000")}
	)
	@Override
	@Deprecated
	public Future<IndexGoodsDomain> getIndexGoodsListForFuture(Integer memberid, String channel, int status) throws CoreServiceException {
		return new AsyncResult<IndexGoodsDomain>(){
			 
			 @Override
			 public IndexGoodsDomain invoke(){
				 if(status==1){
		     		return indexGoods.getHelpGoodsList(memberid,channel);
		     	}else if(status==2){
		     		return indexGoods.getSpecialGoodsList(memberid,channel);
		     	}else{
		     		return indexGoods.getAgentList(memberid,channel);
		     	}
			 }
		};
	}
	public Map<String, Object> getIndexGoods(Integer memberid, String channel){
		Observable<Map<String, Object>> zip = Observable.zip(getHelpGoodsListOb(memberid, channel,1),getSpecialGoodsListOb(memberid, channel,2)
				,getAgentListOb(memberid, channel,3),getUnionItemGoodsObserver(channel),new Func4<Object,Object,Object,Object,Map<String,Object>>() {
					@Override
					public Map<String, Object> call(Object t1, Object t2,
							Object t3,Object t4) {
						Map<String,Object> map = new HashMap<>();
						map.put("helpGoodsList", t1);
						map.put("specialGoodsList", t2);
						map.put("agentList", t3);
						map.put("channelList", t4);
						return map;
					}
		}) ;
		 Map<String,Object> map2 = new HashMap<>();
		 zip.subscribe(observer->{
			 map2.putAll(observer);
		 });
		 
		 return map2 ;
	}


	@Override
	public AgreementDomain getIndexAgreePop(String token) throws CoreServiceException {
		AgreementDomain result = new AgreementDomain();
		if(StringUtils.isEmpty(token)){
			return result;
		}
		SyMember member = userCorrelationService.getMemberByToken(token);
		SyGuideShowState guideShowState = this.syGuideShowStateService.getGuideShowStateByMember(member.getMemberId());
		result.setShow(!(IndexConstant.UserAgreememt.AGREE == guideShowState.getUserAgreement()));
		result.setShowUrl("");
		this.syGuideShowStateService.updateAgreement(guideShowState.getRecId(), IndexConstant.UserAgreememt.AGREE);
		return result;
	}

}





