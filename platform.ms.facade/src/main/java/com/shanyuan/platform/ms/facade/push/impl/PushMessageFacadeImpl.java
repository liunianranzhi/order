package com.shanyuan.platform.ms.facade.push.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.PublishService;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.TopicConstant;
import com.shanyuan.platform.ms.core.constant.enums.MessageType;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.facade.push.PushMessageFacade;
import com.shanyuan.platform.ms.facade.push.domain.MessageDomain;
import com.shanyuan.platform.ms.facade.push.domain.UmengPushDomain;
import com.shanyuan.platform.ms.facade.push.impl.exceptype.PushMessageExcepType;

/**
 * 
 * @author yangjian
 * @date 2017/12/11
 *
 */
@Component
public class PushMessageFacadeImpl implements PushMessageFacade {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PublishService publishService;
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Override
	public Boolean pushMessage(String token, Integer fromId, String title, String body, Integer orderId, Byte type) {
		Integer memberId = this.getMemberIdByToken(token);
		String pageUrl = "";
		if(type.equals(MessageType.MESSAGE_TYPE_POINTS.getCode())){
			pageUrl = this.constantReload.getShopSiteMobileUrl() + "/index.php?act=point&op=point_detail_list";
		}
		MessageDomain messageDomain = new MessageDomain(memberId, fromId, title, body, pageUrl, orderId, type);
		try {
			publishService.publishStringMessage(TopicConstant.MessagePublish.MESSAGE_TOPIC, TopicConstant.MessagePublish.MESSAGE_TAGNAME, JSON.toJSONString(messageDomain), "", "");
		} catch (Exception e) {
			logger.info("push message failed, memberId: {}, message: {}, type: {}", memberId, JSONObject.toJSONString(messageDomain), type);
			throw new CoreServiceException(PushMessageExcepType.PUSH_FAILED);
		}
		return true;
	}

	@Override
	public Boolean sendUmengNotify(String token, String ticker, String title, String text, String loadUrl) {
		Integer memberId = this.getMemberIdByToken(token);
		Map<String, String> extra = new HashMap<>();
		if(!StringUtils.isEmpty(loadUrl)){
			extra.put("loadUrl", loadUrl);
		}
		String type = this.getTokenInfoByToken(token).getClientType();
		UmengPushDomain umengPushDomain = new UmengPushDomain(type, token, ticker, title, text, extra);
		publishService.publishStringMessage(TopicConstant.MessagePublish.NOTIFY_TOPIC, TopicConstant.MessagePublish.NOTIFY_TAGNAME, JSON.toJSONString(umengPushDomain), "", "");
		return true;
	}
	
	private Integer getMemberIdByToken(String token){
		return userCorrelationService.getMemberByToken(token).getMemberId();
	}
	
	private SyMbUserToken getTokenInfoByToken(String token){
		return this.userCorrelationService.getTokenInfoByToken(token);
	}

}
