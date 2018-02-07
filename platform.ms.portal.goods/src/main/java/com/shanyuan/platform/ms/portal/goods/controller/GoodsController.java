package com.shanyuan.platform.ms.portal.goods.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.shanyuan.platform.ms.base.common.BaseController;
import com.shanyuan.platform.ms.base.common.util.JsonUtils;
import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.goods.OpenSearchGoodsService;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.common.CommonFacade;
import com.shanyuan.platform.ms.facade.goods.BizBuyFacade;
import com.shanyuan.platform.ms.facade.goods.GoodsFacade;
import com.shanyuan.platform.ms.facade.goods.GoodsFilterFacade;
import com.shanyuan.platform.ms.facade.goods.SearchGoodsFacade;
import com.shanyuan.platform.ms.facade.goods.domain.GoodsClassInfo;
import com.shanyuan.platform.ms.facade.goods.domain.SupportAreaInfo;
import com.shanyuan.platform.ms.facade.index.IndexFacade;
import com.shanyuan.platform.ms.facade.user.UserFacade;

/**
 * @author 曹勇军
 *
 */
@ApiResponses(value = {
		@ApiResponse(code = 401, message = "Unauthorized"),
		@ApiResponse(code = 403, message = "Forbidden"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Failure") 
	})
@RestController
@CrossOrigin
@RequestMapping(value="/goods")
public class GoodsController extends BaseController {
	private final static Logger logger = LoggerFactory.getLogger(GoodsController.class);
	
	@Autowired
	private SearchGoodsFacade searchGoodsFacade;
	
	@Autowired
	private UserFacade userFacade;
	
	@Autowired
	private GoodsFacade goodsFacade;
	
	@Autowired
	private GoodsFilterFacade goodsFilterFacade;
	
	@Autowired
	private IndexFacade indexFacade;
	
	@Autowired
	private BizBuyFacade bizBuyFacade;
	
	@Autowired
	private GoodsServiceExceptionResolver exceptionResolver;
	
	@Autowired
	private CommonFacade commonFacade;
	
	@Autowired
	private ConstantReload constantReload;
	
	@ApiOperation(value = "大爱超市商品检索接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌,登录状态时要传",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="unionId",value="公益组织id",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="unionItemId",value="子联盟id",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="searchquery",value="搜索关键词",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="sortorder",value="排序值,综合排序,价格,销量,更新时间 不传时默认为综合排序 {time_desc：新品上线,price_desc:价格倒序,price_asc:价格顺序,sale_desc:销量排序,overall_sort:综合排序}",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="villageid",value="村庄的主键",required=false,dataType="Long",paramType="query"),
		@ApiImplicitParam(name="townid",value="城镇的主键",required=false,dataType="Long",paramType="query"),
		@ApiImplicitParam(name="areaid",value="区域主键",required=false,dataType="Long",paramType="query"),
		@ApiImplicitParam(name="cityid",value="城市主键",required=false,dataType="Long",paramType="query"),
		@ApiImplicitParam(name="provinceid",value="省份主键",required=false,dataType="Long",paramType="query"),
		@ApiImplicitParam(name="goodstype",value="分类id",required=false,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="ownertype",value="产品经营者单选 {all:全部,poor:贫困户自营,agent:助理人助理}",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="goodscert",value="产品认证,可多选多个时要以逗号分隔 列:eu,organic {eu:欧盟认证,organic:有机认证,green:绿色认证,wgh:无公害认证}",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="currentpage",value="用于分页当前页",required=false,dataType="Integer",paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	
	@GetMapping(value="/help-goods-search")
	@CrossOrigin
	public CommonVO helpGoodsSearch(@RequestParam(value="token",required=false) String token,
			@RequestParam(value="unionId",required=false) Integer unionId,
			@RequestParam(value="unionItemId",required=false) Integer unionItemId,
			@RequestParam(value="searchquery",required=false) String searchQuery,
			@RequestParam(value="sortorder",required=false) String sortOrder,
			@RequestParam(value="villageid",required=false) Long villageId,
			@RequestParam(value="townid",required=false) Long townId,
			@RequestParam(value="areaid",required=false) Long areaId,
			@RequestParam(value="cityid",required=false) Long cityId,
			@RequestParam(value="provinceid",required=false) Long provinceId,
			@RequestParam(value="goodstype",required=false) Integer goodsType,
			@RequestParam(value="ownertype",required=false) String ownerType,
			@RequestParam(value="goodscert",required=false) String goodsCert,
			@RequestParam(value="currentpage",required=false) Integer pageNo){
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		try {
			//获取user信息    获取用户数据  并填充
			Integer memberId = null;
			
			if(!ObjectUtils.isEmpty(token)){
				SyMember syMember=userFacade.getMemberByToken(token);
				// 判断是否为没登录或者没有值
				if (!ObjectUtils.isEmpty(syMember)) {
					memberId=syMember.getMemberId();
				}
			}
			
			Map<String,Object> resultMap=searchGoodsFacade.searchGoodsList(memberId,searchQuery, sortOrder, villageId, townId, areaId, cityId, provinceId, goodsType, goodsCert, ownerType, pageNo,unionItemId, unionId);
				
			vo.setCode(code);
			vo.setData(resultMap);
			vo.setMessage(message);
			
		} catch (Exception e) {
			logger.info("查询大爱超市失败  searchQuery={},sortOrder={},token={},villageId={},townId={},areaId={},cityId={},provinceId={},goodsType={},ownerType={},goodsCert={},pageNo={}",searchQuery,sortOrder,token,villageId,townId,areaId,cityId,provinceId,goodsType,ownerType,goodsCert,pageNo);
			vo.setCode(500);
			vo.setMessage("查询大爱超市失败");
			logger.error(e.getMessage(), e);
		}

		return vo; 
	}
	
	@ApiOperation(value = "善源商品检索接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="searchquery",value="搜索关键词",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="sortorder",value="排序值,价格,销量,更新时间,最多优惠 不传时默认为不排序 {time_desc：上架时间倒序,time_asc：上架时间顺序,price_desc:价格倒序,price_asc:价格顺序,sale_desc:销量最多倒序,sale_asc:销量顺序,favorable:最多优惠}",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="goodstype",value="分类id",required=false,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="currentpage",value="用于分页当前页",required=false,dataType="Integer",paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/sy-goods-search")
	public CommonVO syGoodsSearch(
			@RequestParam(value="searchquery",required=false) String searchQuery,
			@RequestParam(value="sortorder",required=false) String sortOrder,
			@RequestParam(value="goodstype",required=false) Integer goodsType,
			@RequestParam(value="currentpage",required=false) Integer pageNo){
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		try {
				
			Map<String,Object> resultMap=searchGoodsFacade.searchSyGoodsList(searchQuery, sortOrder, goodsType, pageNo);
			vo.setCode(code);
			vo.setData(resultMap);
			vo.setMessage(message);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("查询善源商场失败  searchQuery={},sortOrder={},goodsType={},pageNo={}",searchQuery,sortOrder,goodsType,pageNo);
			vo.setCode(500);
			vo.setMessage("查询善源商场失败");
		}

		return vo; 
	}
	
	@ApiOperation(value = "根据模块获取商品类型列表", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="module",value="模块 {1:大爱超市,2:集采分类,3:善源商场}",required=true,dataType="Integer",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/getGoodsClassListByModule")
	public CommonVO getGoodsClassListByModule(
			@RequestParam(value="module",required=true) Integer module) {
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			List<SyGoodsClassBo> classList = goodsFacade.getGoodsClassListByModule(module);
			String goodsClassBoJson = JSONObject.toJSONString(classList, SerializerFeature.IgnoreNonFieldGetter);
			
			map.put("title", "企业让利，回馈爱心人士");
			map.put("syShopClassList", JSONObject.parse(goodsClassBoJson));
			vo.setCode(code);
			vo.setData(map);
			vo.setMessage(message);
			
		} catch (Exception e) {
			vo.setCode(500);
			vo.setMessage("查询商品类型列表失败");
			logger.error("查询商品类型列表失败  module={}", module , e);
		}
		return vo;
	}
	
	@ApiOperation(value = "根据商品模块类型ID获取商品类型列表", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="moduleClassId",value="模块类型值 {1149:大爱超市,1151:集采分类,1150:善源商场,......}",required=true,dataType="Integer",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/getGoodsClassList")
	public CommonVO getGoodsClassList(
			@RequestParam(value="moduleClassId",required=true) Integer moduleClassId) {
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			SyGoodsClassBo root = goodsFacade.getGoodsClassList(moduleClassId);
			String json = JSONObject.toJSONString(root, SerializerFeature.WriteNullListAsEmpty);
			map.put("goodsClassList", JsonUtils.jsonToPojo(json, SyGoodsClassBo.class));
			vo.setCode(code);
			vo.setData(map);
			vo.setMessage(message);
			
		} catch (Exception e) {
			vo.setCode(500);
			vo.setMessage("根据商品模块类型ID获取商品类型列表失败");
			logger.error("根据商品模块类型ID获取商品类型列表  moduleClassId={}", moduleClassId, e);
		}
		return vo;
	}
	
	
	@ApiOperation(value = "查询出善源商场的最多优惠|最新上架|最多销量", httpMethod = "GET" ) 
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/get-sy-goods-top-list")
	public CommonVO getSyGoodsTopList() {
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		
		try {
			vo.setCode(code);
			vo.setData(searchGoodsFacade.syGoodsTopList());
			vo.setMessage(message);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			vo.setCode(500);
			vo.setMessage("查询失败");
		}
		return vo;
	}
	
	@ApiOperation(value = "根据渠道查询帮扶县", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name = "channel", value = "渠道", required = false, dataType = "String", paramType = "query", defaultValue = "boc"),
		@ApiImplicitParam(name = "token", value = "令牌", required = false, dataType = "String", paramType = "query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/getSupportArea")
	public CommonVO getSupportArea(
			@RequestParam(value = "channel", required = false) String channel,
			@RequestParam(value = "token", required = false) String token, 
			@RequestParam(value = "did", required = false) String did
			){
		Map<String, Object> resultMap = new HashMap<>();
		try {
			channel = indexFacade.getRealChannel(channel, token, did);
			List<SupportAreaInfo> supportAreaByChannel = goodsFilterFacade.getSupportAreaByChannel(channel, token);
			resultMap.put("result", supportAreaByChannel);
			return buildSuccessResp(resultMap);
		} catch (CoreServiceException e) {
			logger.error("getSupportArea request failed:{}", e);
			return buildErrorResp(null);
		}
	}
	
	@ApiOperation(value = "获取大爱超市商品分类列表", httpMethod = "GET" ) 
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/getGoodsClass")
	public CommonVO getGoodsClass(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			List<GoodsClassInfo> goodsClass = this.goodsFilterFacade.getGoodsClass();
			resultMap.put("result", goodsClass);
			return buildSuccessResp(resultMap);
		} catch (CoreServiceException e) {
			logger.error("getGoodsClass request failed:{}", e);
			return buildErrorResp(null);
		}
	}
	
	@ApiOperation(value = "获取产品拥有者列表", httpMethod = "GET" ) 
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/getOwnerType")
	public CommonVO getOwnerType(){
		try {
			JSONObject allOwnerType = this.goodsFilterFacade.getAllOwnerType();
			Map<String, Object> resultMap = new LinkedHashMap<String, Object>(allOwnerType);
			return buildSuccessResp(resultMap);
		} catch (CoreServiceException e) {
			logger.error("getOwnerType request failed:{}", e);
			return buildErrorResp(null);
		}
	}
	
	@ApiOperation(value = "获取证书列表", httpMethod = "GET" ) 
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/getCerts")
	public CommonVO getCerts(){
		try {
			JSONObject allCert = this.goodsFilterFacade.getAllCert();
			Map<String, Object> resultMap = new LinkedHashMap<String, Object>(allCert);
			return buildSuccessResp(resultMap);
		} catch (CoreServiceException e) {
			logger.error("getCerts request failed:{}", e);
			return buildErrorResp(null);
		}
	}
	
	@ApiOperation(value = "大家帮|特产馆|优秀助理人|子联盟", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌,登录状态时要传",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "channel", value = "渠道", required = false, dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "did", value = "设备号", required = false, dataType = "String", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/getIndexGoodsList")
	public CommonVO getIndexGoodsList(@RequestParam(value = "token",required = false) String token,
			@RequestParam(value = "channel",required = false) String channel, 
			@RequestParam(value = "did", required = false) String did) {
		Integer memberId = null;
		try {
			//add by yangjian
//			token = commonFacade.checkToken(token, did);
			// 获取用户数据 ,判断是否登录
			if(!ObjectUtils.isEmpty(token)){
				SyMember syMember=userFacade.getMemberByToken(token);

				// 判断是否为没登录或者没有值
				if (!ObjectUtils.isEmpty(syMember)) {
					channel = indexFacade.getRealChannel(channel, token, did);
					memberId=syMember.getMemberId();
					logger.info("controller 该用户已登录,memberId={},channel={}",memberId,channel);
				}
			}
			Map<String, Object> map = indexFacade.getIndexGoods( memberId, channel);

			return buildSuccessResp(map);
		} catch (Exception e) {
			logger.error("查询商品列表失败 token={}, channel={}, e={}",token, channel,e);
			return buildErrorResp(null);
		}
	}
	@ApiOperation(value = "查询商品详情", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌,登录状态时要传",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="goodsCommonId",required=true,dataType="Integer",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/getGoodsDetail")
	public CommonVO getGoodsDetail(
			@RequestParam(value="token",required=false) String token,
			@RequestParam(value="goodsCommonId",required=true) Integer goodsCommonId) {
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		boolean isLogin = false, isSelfGoods = false;
		try {
			Map<String, Object> map = goodsFacade.getGoodsDetail(goodsCommonId);
			
			SyGoodsCommon goodsCommon = (SyGoodsCommon) map.get("goodsCommon");
			//获取user信息    获取用户数据  并填充
			if(!ObjectUtils.isEmpty(token)){
				SyMember syMember=userFacade.getMemberByToken(token);
				// 判断是否为没登录或者没有值
				if (!ObjectUtils.isEmpty(syMember)) {
					isLogin = true;
					if(syMember.getMemberId().equals(goodsCommon.getPublisherId())){
						isSelfGoods = true;
					}
				}
			}
			map.put("isLogon", isLogin);
			map.put("isSelfGoods", isSelfGoods);
			
			String json = JSONObject.toJSONString(goodsCommon, SerializerFeature.IgnoreNonFieldGetter);
			map.put("goodsCommon", JSONObject.parse(json));
			vo.setCode(code);
			vo.setData(map);
			vo.setMessage(message);
			
		} catch (Exception e) {
			logger.info("商品详情查询失败  goodsCommonId={},e={}",goodsCommonId,e);
			vo.setCode(500);
			vo.setMessage(e.getMessage());
		}
		return vo;
	}
	
	/**
	 * 获取善缘甄选-集采推荐商品列表
	 * @return
	 * @author zhangwd
	 */
	@ApiOperation(value = "善缘甄选接口", httpMethod = "GET" ) 
	@ApiImplicitParams({})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/get-biz-recommend-goods")
	public CommonVO getBizBuyRecomGoods() {
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		
		try {
			Map<String, Object> bizBuyRecomGoods = bizBuyFacade.getBizBuyRecomGoods();
			vo.setCode(code);
			vo.setData(bizBuyRecomGoods);
			vo.setMessage(message);
			logger.info("善缘甄选--信息查询成功！",JSONObject.toJSONString(bizBuyRecomGoods));
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			logger.info("善缘甄选--信息查询失败！");
			vo.setCode(500);
			vo.setMessage(e.getMessage());
		}
		return vo;
		
	}
	
	/**
	 * 获集采分类列表
	 * @return
	 * @author zhangwd
	 */
	@ApiOperation(value = "商品分类接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="gcType",value="分类根节点类型",required=true,dataType="string",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/get-goods-class-list")
	public CommonVO getBizBuyGoodsClass(@RequestParam(value = "gcType", required = true) String gcType) {
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		HashMap<String, Object> bizClassList = new HashMap<>();
		try {
			 List<SyGoodsClassInfo> classList = bizBuyFacade.getBizBuyGoodsClassList(gcType);
			 //String jsonString = JSONObject.toJSONString(classList, SerializerFeature.WriteNullListAsEmpty);
			 bizClassList.put("bizClassList", classList);
			vo.setCode(code);
			vo.setData(bizClassList);
			vo.setMessage(message);
			logger.info("商品分类--信息查询成功！",classList);
		} catch (CoreServiceException e) {
			logger.info("商品分类--信息查询失败！");
			logger.error(e.getMessage(),e);
			e.printStackTrace();
			Map<String, Object> exception = exceptionResolver.parseException(e);
			vo.setCode((Integer) exception.get("code"));
			vo.setMessage((String) exception.get("msg"));
		}
		return vo;
		
	}
	
	@ApiOperation(value = "单位集采检索接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="searchquery",value="搜索关键词",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="sortorder",value="排序值,综合排序,价格,销量,更新时间 不传时默认为综合排序 {time_desc：上架时间倒序,time_asc：上架时间顺序,price_desc:价格倒序,price_asc:价格顺序,sale_desc:销量倒序,sale_asc:销量顺序,overall_sort:综合排序}",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="goodstype",value="分类 , 1776:梨",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="currentpage",value="用于分页当前页",required=false,dataType="Integer",paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/searchBizGoods")
	public CommonVO syGoodsBizSearch(
			@RequestParam(value="searchquery",required=false) String searchQuery,
			@RequestParam(value="sortorder",required=false) String sortOrder,
			@RequestParam(value="goodstype",required=false) String goodsType,
			@RequestParam(value="currentpage",required=false) Integer pageNo){
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		try {
				
			Map<String,Object> resultMap=searchGoodsFacade.searchBizGoodsList(searchQuery, sortOrder, goodsType, pageNo);
		
			vo.setCode(code);
			vo.setData(resultMap);
			vo.setMessage(message);
			
		} catch (Exception e) {
			logger.info("查询单位集采失败  searchQuery={},sortOrder={},goodsType={}, pageNo={},e={}",searchQuery,sortOrder, goodsType, pageNo,e);
			vo.setCode(500);
			vo.setMessage("查询单位集采失败");
		}
		return vo; 
	}
	
	
	@Autowired
	private OpenSearchGoodsService openSearchGoodsService;
	
	
	@GetMapping(value="/update_opensearch")
	public CommonVO updateOpenSearch(int updateType,Integer goodsCommonid){
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="更新成功";
		try {
			
			int count=0;
			
			if(!"pwcn_pro".equals(constantReload.getOpenSearchAppName())){
				count=openSearchGoodsService.updateOpenSearchField(updateType,goodsCommonid);
			}
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("result", count);
			vo.setCode(code);
			vo.setData(map);
			vo.setMessage(message);
			
		} catch (Exception e) {
			e.printStackTrace();
			vo.setCode(500);
			vo.setMessage("更新失败");
		}
		return vo; 
	}
	
	@ApiOperation(value = "推荐搜索词接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="searchquery",value="搜索关键词",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="pageSize",value="用于分页当前页",required=false,dataType="Integer",paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
//	@GetMapping(value="/get-suggest-list")
	public CommonVO getSuggestList(@RequestParam(value="searchquery",required=true) String searchQuery
			, @RequestParam(value="pageSize",required=false) Integer pageSize){
		
		CommonVO vo=new CommonVO();
		int code=200;
		String message="查询成功";
		try {
			List<String> list=null;
			Map<String,Object> map=new HashMap<String,Object>();
			if(StringUtils.isBlank(searchQuery)){
				list=new ArrayList<String>();
			}else{
				list=searchGoodsFacade.getSuggestList(searchQuery, pageSize);
				if(ObjectUtils.isEmpty(list)){
					list=new ArrayList<String>();
				}
			}
			
			map.put("result", list);
			vo.setCode(code);
			vo.setData(map);
			vo.setMessage(message);
			
		} catch (Exception e) {
			e.printStackTrace();
			vo.setCode(500);
			vo.setMessage("查询失败");
		}
		return vo; 
	}
}

