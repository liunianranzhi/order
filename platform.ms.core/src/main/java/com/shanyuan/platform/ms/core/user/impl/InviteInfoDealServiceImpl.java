package com.shanyuan.platform.ms.core.user.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.member.PushService;
import com.shanyuan.platform.ms.core.user.InviteInfoDealService;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserTokenExample;
import com.shanyuan.platform.ms.dao.auth.mapper.SyMbUserTokenMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyMessage;
import com.shanyuan.platform.ms.dao.user.mapper.SyMessageMapper;

/**
 * 邀请信息 处理 接口实现 
 * @author zhangwd
 *
 */

@Component
public class InviteInfoDealServiceImpl implements InviteInfoDealService {

	@Autowired
	private PushService  pushService;
	
	@Autowired
	private SyMessageMapper syMessageMapper;
	
	@Autowired
	private SyMbUserTokenMapper syMbUserTokenMapper;
	
	@Autowired
	private ConstantReload  constantReload;
	
	/**
	 * 生成积分增加站内信
	 * @param memberId
	 * @param points
	 * @param token
	 */
	public void sendMessageToMemberForIncPoints(Integer memberId ,Integer points) {
		
		int ntime = DateUtil.getNowInt();
		
		String pageUrl = this.constantReload.getShopSiteMobileUrl()+ "/index.php?act=point&op=point_detail_list" ;
		
		SyMessage message = new SyMessage();
		message.setMessageParentId(0); //不能为空
		message.setMessageTitle("积分变更通知");
		message.setMessageBody("恭喜您，又有公益积分入账啦，本次获得公益积分："+points);
		message.setMessageLink(pageUrl);
		message.setMessageType((byte) 105);
		message.setFromMemberId(0);
		message.setToMemberId(memberId+"");
		message.setMessageTime(ntime+"");
		message.setMessageState((byte) 40);
		message.setOrderId(0);
		
		this.syMessageMapper.insertSelective(message);
	}
	
	/**
	 * 生成积分增加推送
	 * @param memberId
	 * @param points
	 */
	public void sendNotifyToMemberForIncPoints(Integer memberId ,Integer points ) {
		
		String pageUrl = this.constantReload.getShopSiteMobileUrl()+ "/index.php?act=point&op=point_detail_list" ;
		
		String extraUrl="";
		try {
			
			extraUrl = this.constantReload.getShopSiteMobileUrl()+"/index.php?act=index&op=notify_page&page_url="+URLEncoder.encode(pageUrl,"UTF-8");
		
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		
		SyMbUserTokenExample nsmte = new SyMbUserTokenExample();
		nsmte.createCriteria().andMemberIdEqualTo(memberId);
		List<SyMbUserToken> tokens = this.syMbUserTokenMapper.selectByExample(nsmte);
		
		if(tokens.isEmpty()) {
			return ;
		}
		
		String token  = tokens.get(0).getToken();
		String type = tokens.get(0).getClientType();
		
		 String ticker  = "积分变更通知";
	     String title  = "积分变更通知";
	     String  text = "恭喜您，又有公益积分入账啦，本次获得公益积分：" + points;
	     
	     Map<String,String> extra = new HashMap<String,String>();
	     
	     try {
	    	 
			extra.put("loadUrl", URLEncoder.encode(extraUrl,"UTF-8"));
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     pushService.sendNotifyByTokenUmeng(type, token, ticker, title, text, extra);
	}
	
	/**
	 * 生成邀请成功站内信
	 * @param memberId
	 * @param fromId
	 * @param title
	 * @param body
	 * @param pageUrl
	 * @param orderId
	 * @param messageType
	 */
	public void sendmessageToMember(Integer memberId ,int fromId ,String title ,String body,String pageUrl,int orderId,byte messageType) {
		
		int ntime = (int) (System.currentTimeMillis()/1000);
		
		SyMessage message = new SyMessage();
		message.setMessageParentId(0); //不能为空
		message.setMessageTitle(title);
		message.setMessageBody(body);
		message.setMessageLink(pageUrl);
		message.setMessageType(messageType);
		message.setFromMemberId(fromId);
		message.setToMemberId(memberId+"");
		message.setMessageTime(ntime+"");
		message.setMessageState((byte) 40);
		message.setOrderId(orderId);
		
		this.syMessageMapper.insertSelective(message);
	}
	
	/**
	 * 发送推送消息
	 * @param memberId
	 * @param ticker
	 * @param title
	 * @param text
	 * @param loadUrl
	 */
	public void sendNotifyToMemberForIncPoints(Integer memberId  ,String ticker ,String title ,String text ,String loadUrl) {
		
		SyMbUserTokenExample nsmte = new SyMbUserTokenExample();
		nsmte.createCriteria().andMemberIdEqualTo(memberId);
		List<SyMbUserToken> tokens = this.syMbUserTokenMapper.selectByExample(nsmte);
		
		if(tokens.isEmpty()) {
			return ;
		}
		
		String token  = tokens.get(0).getToken();
		String type = tokens.get(0).getClientType();
		Map<String,String> extra = new HashMap<String,String>();
		extra.put("loadUrl", loadUrl );
		
		pushService.sendNotifyByTokenUmeng(type, token, ticker, title, text, extra);
		 
	}
}
