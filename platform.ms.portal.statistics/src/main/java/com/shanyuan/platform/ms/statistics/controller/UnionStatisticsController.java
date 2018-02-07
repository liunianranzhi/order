package com.shanyuan.platform.ms.statistics.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.BaseController;
import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.StatisticsConstant;
import com.shanyuan.platform.ms.core.statistics.domain.PointDomain;
import com.shanyuan.platform.ms.facade.statistics.OrderStatisticsFacade;
import com.shanyuan.platform.ms.facade.statistics.PointStatisticsFacade;
import com.shanyuan.platform.ms.facade.statistics.UnionBuyerStatisticsFacade;
import com.shanyuan.platform.ms.facade.statistics.UnionSaleStatisticsFacade;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 联盟销售统计管理接口
 * @author win10
 *
 */
@ApiResponses(value = {
		@ApiResponse(code = 401, message = "Unauthorized"),
		@ApiResponse(code = 403, message = "Forbidden"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Failure") 
	})
@CrossOrigin
@RestController
@RequestMapping(value="/statistics")
public class UnionStatisticsController extends BaseController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
		
	@Autowired
	private OrderStatisticsFacade orderStatisticsFacade;
	
	@Autowired
	private UnionBuyerStatisticsFacade unionBuyerStatisticsFacade;
	
	@Autowired
	private UnionSaleStatisticsFacade unionSaleStatisticsFacade;
	
	@Autowired
	private PointStatisticsFacade pointStatisticsFacade;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private ConstantReload constantReload; 
	
	@ApiOperation(value = "联盟销售统计", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="start_time",	value="查询起始时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="end_time",	value="查询结束时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="page_num",	value="当前页的页数", defaultValue = "1",		required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="union_id",	value="联盟id",			required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="area_id",	value="地区id",			required=false,dataType="Long", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/union-seller")
	public CommonVO getUnionSellerStatistics(
			@RequestParam(value="start_time",required=true)Integer startTime,
			@RequestParam(value="end_time",required=true)Integer endTime,
			@RequestParam(value="page_num", required=false,defaultValue = "1") Integer pageNum,
			@RequestParam(value="union_id",required=false)Integer unionid,
			@RequestParam(value="area_id",required=false)Long areaid,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "获联盟销售统计列表成功";

		try {
			vo.setData(unionSaleStatisticsFacade.getSaleStatistics(startTime, endTime, unionid, areaid,pageNum, StatisticsConstant.ReqType.LIST));
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取联盟销售统计列表失败";
			logger.error("获取联盟销售统计列表失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	@GetMapping("/export-union-seller")
	public CommonVO exportUnionSellerStatistics(
			@RequestParam(value="start_time",required=true)Integer startTime,
			@RequestParam(value="end_time",required=true)Integer endTime,
			@RequestParam(value="page_num", required=false,defaultValue = "1") Integer pageNum,
			@RequestParam(value="union_id",required=false)Integer unionid,
			@RequestParam(value="area_id",required=false)Long areaid,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			Map<String, Object> saleStatistics = unionSaleStatisticsFacade.getSaleStatistics(startTime, endTime, unionid,areaid,pageNum, StatisticsConstant.ReqType.EXPORT);
			return buildSuccessResp(saleStatistics);
		} catch (Exception e) {
			logger.error("获取联盟销售统计列表失败, {}", e);
			return buildResp("获取联盟销售统计列表失败", CODE_ERROR);
		}
	}
	
	@ApiOperation(value = "联盟购买统计", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="startTime",	value="查询起始时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="endTime",	value="查询结束时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="page_num",	value="当前页的页数", defaultValue = "1", required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="unionid",	value="联盟id",			required=false,dataType="Integer", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/union-buyer")
	public CommonVO getUnionBuyerStatistics(
			@RequestParam(value="start_time",required=true)Integer startTime,
			@RequestParam(value="end_time",required=true)Integer endTime,
			@RequestParam(value="page_num",required=false,defaultValue = "1")Integer pageNum,
			@RequestParam(value="union_id",required=false)Integer unionid,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "获联盟购买统计列表成功";
		try {
			vo.setData(unionBuyerStatisticsFacade.getBuyerStatistics(startTime, endTime, unionid,pageNum, StatisticsConstant.ReqType.LIST));
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取联盟购买统计列表失败";
			logger.error("获取联盟购买统计列表失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	@GetMapping("/export-union-buyer")
	public CommonVO exportUnionBuyerStatistics(
			@RequestParam(value="start_time",required=true)Integer startTime,
			@RequestParam(value="end_time",required=true)Integer endTime,
			@RequestParam(value="page_num",required=false,defaultValue = "1")Integer pageNum,
			@RequestParam(value="union_id",required=false)Integer unionid,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			Map<String, Object> buyerStatistics = unionBuyerStatisticsFacade.getBuyerStatistics(startTime, endTime, unionid,pageNum, StatisticsConstant.ReqType.EXPORT);
			return buildSuccessResp(buyerStatistics);
		} catch (Exception e) {
			logger.error("获取联盟购买统计列表失败, {}", e);
			return buildResp("获取联盟购买统计列表失败", CODE_ERROR);
		}
	}
	
	
	@ApiOperation(value = "平台销量统计", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="startTime",	value="查询起始时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="endTime",	value="查询结束时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="pageNum",	value="当前页", defaultValue = "1", required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="limit",	value="查询数据行数",	required=false,dataType="Integer", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/flat-seller")
	public CommonVO getFlatSellerStatistics(
			@RequestParam(value="start_time",required=true)Integer startTime,
			@RequestParam(value="end_time",required=true)Integer endTime,
			@RequestParam(value="page_num",required=false, defaultValue = "1")Integer pageNum,
			@RequestParam(value = "limit", required = false) Integer limit,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "获取平台销售统计列表成功";
		try {
			JSONObject jsonObject = new JSONObject();
			JSONObject platFormSaleStatistics = orderStatisticsFacade.platFormSaleStatistics(startTime, endTime,pageNum);
			jsonObject.put("platFormSaleStatistics", platFormSaleStatistics);
			vo.setData(platFormSaleStatistics);
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取平台销售统计列表失败";
			logger.error("获取平台销售统计列表失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	@ApiOperation(value = "供给侧统计", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="time",	value="查询时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="page_num",	value="当前页的页数",	required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="country_id",	value="地区id",	required=false,dataType="Long", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/provide-statistics")
	public CommonVO getFlatSellerStatisticsList(
			@RequestParam(value="time",required=true)Integer time,
			@RequestParam(value="page_num",required=false, defaultValue = "1")Integer pageNum,
			@RequestParam(value="country_id",required=false)Long countryId,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "获取供给侧统计列表成功";
		try {
			JSONObject jsonObject = new JSONObject();
			JSONObject provideStatistics = orderStatisticsFacade.getProvideStatistics(time, countryId,pageNum, unionId);
			jsonObject.put("provideStatistics", provideStatistics);
			vo.setData(jsonObject);
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取供给侧统计列表失败";
			logger.error("获取供给侧统计列表失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	@GetMapping("/export-provide-stat")
	public CommonVO exportProvideStatistics(
			@RequestParam(value="time",required=true)Integer time,
			@RequestParam(value="country_id",required=false)Long countryId,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			JSONObject provideStatistics = orderStatisticsFacade.getProvideStatistics(time, countryId, null, unionId);
			JSONObject result = new JSONObject();
			result.put("data", provideStatistics.get("data"));
			return buildSuccessResp(result);
		} catch (Exception e) {
			logger.info(e.getMessage(), e);
		}
		return buildErrorResp();
	}
	
	@GetMapping("/export-assist-stat")
	public CommonVO exportAssistStatistics(
			@RequestParam(value="time",required = true)Integer time,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			JSONObject assistStatistics = orderStatisticsFacade.getAssistStatistics(time, unionId, null);
			JSONObject result = new JSONObject();
			result.put("data", assistStatistics.get("assistStatistics"));
			return buildSuccessResp(result);
		} catch (Exception e) {
			logger.info(e.getMessage(), e);
			return buildErrorResp();
		}
	}
	
	@ApiOperation(value = "扶贫成果总览", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="time",	value="查询时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="unionId",	value="联盟id",	required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="currentPage",	value="当前页",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="countryId",	value="县id",	required=false,dataType="Long", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/results-overview")
	public CommonVO getPovertyAlleviationStatisticsList(
			@RequestParam(value="time",required=true)Integer time,
			@RequestParam(value="page_num",required=false, defaultValue = "1")Integer currentPage,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value = "country_id", required = false) Long countryId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "获取扶贫成果总览列表成功";
		try {
			JSONObject showPovertyOverviewDate = orderStatisticsFacade.showPovertyOverviewDate(time, unionId, countryId,currentPage);
			vo.setData(showPovertyOverviewDate);
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取扶贫成果总览列表失败";
			logger.error("获取扶贫成果总览列表失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	@GetMapping("/export-overview")
	public CommonVO exportPovertyAlleviationStatisticsList(
			@RequestParam(value="time",required=true)Integer time,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value = "country_id", required = false) Long countryId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			JSONObject result = new JSONObject();
			JSONObject showPovertyOverviewDate = orderStatisticsFacade.showPovertyOverviewDate(time, unionId, countryId, null);
			result.put("showPovertyOverviewDate", showPovertyOverviewDate.get("povertyDatalist"));
			return buildSuccessResp(result);
		} catch (Exception e) {
			logger.error("获取扶贫成果总览列表失败", e);
			return buildErrorResp();
		} 
	}
	
	@ApiOperation(value = "帮扶侧统计", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="time",	value="查询时间(yyyyMMdd)",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="page_num",	value="当前页的页数",	required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="union_id",	value="联盟id",	required=false,dataType="Integer", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/assist-statistics")
	public CommonVO getAssistStatisticsList(
			@RequestParam(value="time",required=true)Integer time,
			@RequestParam(value="page_num",required=false, defaultValue = "1")Integer pageNum,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "获取帮扶侧统计列表成功";
		try {
			JSONObject jsonObject = new JSONObject();
			JSONObject assistStatistics = orderStatisticsFacade.getAssistStatistics(time, unionId,pageNum);
			jsonObject.put("assistStatistics", assistStatistics);
			vo.setData(jsonObject);
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取帮扶侧统计列表失败";
			logger.error("获取帮扶侧统计列表失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	
	@ApiOperation(value = "积分人数统计", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="page_num",	value="当前页的页数",	required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="union_id",	value="联盟id",	required=false,dataType="Integer", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/point-num")
	public CommonVO getMemberPointsNum(
			@RequestParam(value="union_id",required=false, defaultValue = "0")Integer unionId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			List<PointDomain> pointDetail = pointStatisticsFacade.getPointDetail(unionId);
			JSONObject result = new JSONObject();
			result.put("pointDetail", pointDetail);
			return buildSuccessResp(result);
		} catch (Exception e) {
			logger.error("获取累计积分人数和可用积分人数列表失败", e);
			return buildResp("获取累计积分人数和可用积分人数列表失败", CODE_ERROR);
		}
	}
	
	@GetMapping("/export-point-num")
	public CommonVO exportMemberPointsNum(
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			List<PointDomain> pointDetail = pointStatisticsFacade.getPointDetail(unionId);
			JSONObject result = new JSONObject();
			result.put("pointDetail", pointDetail);
			return buildSuccessResp(result);
		} catch (Exception e) {
			logger.error("获取累计积分人数和可用积分人数列表失败", e);
			return buildResp("获取累计积分人数和可用积分人数列表失败", CODE_ERROR);
		}
	}
	
	@ApiOperation(value = "积分描述统计", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="member_id",	value="会员id",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="page_num",	value="当前页的页数",	required=false,dataType="Integer", 	paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/point-desc")
	public CommonVO getPointDesc(
			@RequestParam(value="member_id",required=true)Integer memberId,
			@RequestParam(value="page_num",required=false,defaultValue = "1")Integer pageNum,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "获取会员积分描述列表成功";
		try {
			JSONObject pointsInfos = orderStatisticsFacade.getPointsInfos(memberId,pageNum, StatisticsConstant.ReqType.LIST);
			vo.setData(pointsInfos);
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取会员积分描述列表失败";
			logger.error("获取会员积分描述列表失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	@GetMapping("/export-point-desc")
	public CommonVO exportPointDesc(
			@RequestParam(value="member_id",required=true)Integer memberId,
			@RequestParam(value="page_num",required=false,defaultValue = "1")Integer pageNum,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			JSONObject pointsInfos = orderStatisticsFacade.getPointsInfos(memberId,pageNum, StatisticsConstant.ReqType.EXPORT);
			return buildSuccessResp(pointsInfos);
		} catch (Exception e) {
			logger.error("获取会员积分描述列表失败", e);
			return buildResp("获取会员积分描述列表失败", CODE_ERROR);
		}
	}
	
	@ApiOperation(value = "积分段会员详情", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="truename",	value="用户真是姓名",	required=false,dataType="String", 	paramType="query"),
		@ApiImplicitParam(name="member_mobile",	value="用户电话",	required=false,dataType="String", 	paramType="query"),
		@ApiImplicitParam(name="union_id",	value="联盟id",	required=false,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="page_num",	value="当前页",	required=true,dataType="Integer", 	paramType="query"),
		@ApiImplicitParam(name="point_tag",	value="积分段取值",	required=true,dataType="Long", 	paramType="query"),
		@ApiImplicitParam(name="name",	value="积分累计字段名，特定参数:totalPointNum或者validPointNum",	required=true,dataType="String", paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping("/points-details")
	public CommonVO getPointsInfosStatisticsList(
			@RequestParam(value="true_name",required=false)String trueName,
			@RequestParam(value="member_mobile",required=false)String memberMobile,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value="page_num",required=false, defaultValue = "1")Integer currentPage,
			@RequestParam(value="point_tag",required=true)Long pointTag,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		CommonVO vo=new CommonVO();
		int code = 200;
		String message = "某个积分段拥有的会员详情";
		try {
			JSONObject jsonObject = new JSONObject();
			JSONObject userDetailInfos = orderStatisticsFacade.getUserDetailInfos(pointTag, name,unionId,memberMobile,trueName,currentPage, StatisticsConstant.ReqType.LIST);
			jsonObject.put("userDetailInfos", userDetailInfos);
			vo.setData(userDetailInfos);
		} catch (Exception e) {
			code = CODE_ERROR;
			message = "获取该积分段的会员详情失败";
			logger.error("获取该积分段的会员详情失败", e);
		} finally {
			vo.setCode(code);
			vo.setMessage(message);
		}
		return vo;
	}
	
	@GetMapping("/export-points-details")
	public CommonVO exportPointsInfosStatisticsList(
			@RequestParam(value="true_name",required=false)String trueName,
			@RequestParam(value="member_mobile",required=false)String memberMobile,
			@RequestParam(value="union_id",required=false)Integer unionId,
			@RequestParam(value="page_num",required=false, defaultValue = "1")Integer currentPage,
			@RequestParam(value="point_tag",required=true)Long pointTag,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "req_key", required = true) String reqKey){
		if(!checkReqKey(reqKey)){
			return buildResp("参数错误，请传入正确的req_key", CODE_ERROR);
		}
		try {
			JSONObject userDetailInfos = orderStatisticsFacade.getUserDetailInfos(pointTag, name,unionId,memberMobile,trueName,currentPage, StatisticsConstant.ReqType.EXPORT);
			return buildSuccessResp(userDetailInfos);
		} catch (Exception e) {
			logger.error("获取该积分段的会员详情失败", e);
			return buildResp("获取该积分段的会员详情失败", CODE_ERROR);
		}
	}
	
	private boolean checkReqKey(String key){
		if(constantReload.isDegug){
			return true;
		}
		String redisKey = stringRedisTemplate.opsForValue().get(StatisticsConstant.RedisKey.STATISTICS_REQUEST_KEY);
		return key.equalsIgnoreCase(redisKey);
	}
}

