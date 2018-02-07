package com.shanyuan.platform.ms.portal.goods.controller;

import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.facade.topic.TopicFacade;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 钟颖
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
@RequestMapping(value="/topic")
public class TopicController {
	private final static Logger logger = LoggerFactory.getLogger(TopicController.class);
	@Autowired
	private TopicFacade topicFacade;

	@Autowired
	private TopicExceptionResolver topicExceptionResolver;
	
	@ApiOperation(value = "活动商品列表", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="topicid",value="活动id",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "pagesize", value = "每页显示数", required = false, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "currentpage", value = "当前页数", required = false, dataType = "Integer", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/topic-goods-list")
	public CommonVO getEvaluateOrder(
			@RequestParam(value = "topicid",required = true) Integer topicid,
			@RequestParam(value="pagesize",required=false) Integer pagesize,
			@RequestParam(value="currentpage",required=false) Integer currentpage) {
		
		CommonVO dataDomain=new CommonVO();
		int code=200;
		String message="查询成功";
		try {

			Map<String,Object> map =topicFacade.getTopicGoodsList(topicid,pagesize,currentpage);
			dataDomain.setData(map);
			dataDomain.setCode(code);
			dataDomain.setMessage(message);
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			dataDomain = topicExceptionResolver.parseException(e);
		}
		return dataDomain;
	}
	

}
