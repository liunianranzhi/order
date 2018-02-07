package com.shanyuan.platform.ms.core.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.common.util.ImageUtil;
@Component
@ManagedResource
public class ConstantReload {

	public boolean isDegug;
	public boolean useWhite ;
	public String protocol ;
	
	public String host ;
	
	public String vpath ;
	
	public Integer sharePoints ;
	
	public String smsApiKey ;
	
	public Integer daaiGcId;
	
	public  String Android_appkey  ;
	public  String Android_appMasterSecret  ;
	public  String Ios_appkey ;
	
	public boolean useRedisOpsData;
	public boolean useQueuePushMessage;
	
	public  String Ios_appMasterSecret;
	
	public String smsSign;
	
	public boolean submitOrderAsync;
	
	public String currEnv;
	
	
	public  String openSearchAppName;
	public  String openSearchAccesskey;
	public  String openSearchSecret;
	public  String openSearchHost;
	
	public  boolean useOpenSearch;
	
	public Integer validCodeExpire = 7;
	
	
	/*
	 * 魔术手机验证码
	 */
	public String   MAGIC_MCODE = "518981";
	/*
	 * PC端万能密码
	 */
	public String  MAGIC_MCODE_PC = "27565012";
	
	@ManagedAttribute
	public boolean isUseRedisOpsData() {
		return useRedisOpsData;
	}
	@ManagedAttribute
	@Value("${myset.info.use_redis_ops_data}")
	public void setUseRedisOpsData(boolean useRedisOpsData) {
		this.useRedisOpsData = useRedisOpsData;
	}
	@ManagedAttribute
	public boolean isUseQueuePushMessage() {
		return useQueuePushMessage;
	}
	@ManagedAttribute
	@Value("${myset.info.use_queue_push_message}")
	public void setUseQueuePushMessage(boolean useQueuePushMessage) {
		this.useQueuePushMessage = useQueuePushMessage;
	}
	@ManagedAttribute
	public String getSmsSign() {
		return smsSign;
	}
	@ManagedAttribute
	@Value("${myset.info.sms_sign}")
	public void setSmsSign(String smsSign) {
		this.smsSign = smsSign;
	}
	@ManagedAttribute
	public String getMAGIC_MCODE() {
		return MAGIC_MCODE;
	}
	@ManagedAttribute
	public void setMAGIC_MCODE(String mAGIC_MCODE) {
		MAGIC_MCODE = mAGIC_MCODE;
	}
	@ManagedAttribute
	public String getMAGIC_MCODE_PC() {
		return MAGIC_MCODE_PC;
	}
	@ManagedAttribute
	public void setMAGIC_MCODE_PC(String mAGIC_MCODE_PC) {
		MAGIC_MCODE_PC = mAGIC_MCODE_PC;
	}
	@ManagedAttribute
	@Value("${key.info.android_appkey}")
	public void setAndroid_appkey(String android_appkey) {
		Android_appkey = android_appkey;
	}
	@ManagedAttribute
	@Value("${key.info.android_appmastersecret}")
	public void setAndroid_appMasterSecret(String android_appMasterSecret) {
		Android_appMasterSecret = android_appMasterSecret;
	}
	@ManagedAttribute
	@Value("${key.info.ios_appkey}")
	public void setIos_appkey(String ios_appkey) {
		Ios_appkey = ios_appkey;
	}
	@ManagedAttribute
	@Value("${key.info.ios_appmastersecret}")
	public void setIos_appMasterSecret(String ios_appMasterSecret) {
		Ios_appMasterSecret = ios_appMasterSecret;
	}
	@ManagedAttribute
	public String getAndroid_appkey() {
		return Android_appkey;
	}
	
	@ManagedAttribute
	public Integer getDaaiGcId() {
		return daaiGcId;
	}
	@ManagedAttribute
	@Value("${myset.info.DAAI_GC_ID}")
	public void setDaaiGcId(Integer daaiGcId) {
		this.daaiGcId = daaiGcId;
	}
	
	@ManagedAttribute
	public String getAndroid_appMasterSecret() {
		return Android_appMasterSecret;
	}
	@ManagedAttribute
	public String getIos_appkey() {
		return Ios_appkey;
	}
	@ManagedAttribute
	public String getIos_appMasterSecret() {
		return Ios_appMasterSecret;
	}
	@ManagedAttribute
	public String getSmsApiKey() {
		return smsApiKey;
	}
	@ManagedAttribute
	@Value("${key.info.smsapikey}")
	public void setSmsApiKey(String smsApiKey) {
		this.smsApiKey = smsApiKey;
	}
	@ManagedAttribute
	public Integer getSharePoints() {
		return sharePoints;
	}
	@ManagedAttribute
	@Value("${myset.info.sharepoints}")
	public void setSharePoints(Integer sharePoints) {
		this.sharePoints = sharePoints;
	}
	public int CIRCLE_ID_WEAL_CLUB ;
	
	public int CIRCLE_ID_WEAL_ENTERPRISE ;
	
	@ManagedAttribute
	public int getCIRCLE_ID_WEAL_CLUB() {
		return CIRCLE_ID_WEAL_CLUB;
	}
	@ManagedAttribute
	@Value("${myset.info.CIRCLE_ID_WEAL_CLUB}")
	public void setCIRCLE_ID_WEAL_CLUB(int cIRCLE_ID_WEAL_CLUB) {
		CIRCLE_ID_WEAL_CLUB = cIRCLE_ID_WEAL_CLUB;
	}
	@ManagedAttribute
	public int getCIRCLE_ID_WEAL_ENTERPRISE() {
		return CIRCLE_ID_WEAL_ENTERPRISE;
	}
	@ManagedAttribute
	@Value("${myset.info.CIRCLE_ID_WEAL_ENTERPRISE}")
	public void setCIRCLE_ID_WEAL_ENTERPRISE(int cIRCLE_ID_WEAL_ENTERPRISE) {
		CIRCLE_ID_WEAL_ENTERPRISE = cIRCLE_ID_WEAL_ENTERPRISE;
	}

	public String getShopSiteApiUrl() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProtocol());
		sb.append(getHost());
		sb.append(getVpath());
		sb.append("/api");
		return sb.toString();
	}
	public String getShopSiteMobileUrl() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProtocol());
		sb.append(getHost());
		sb.append(getVpath());
		sb.append("/bocm");
		return sb.toString();
	}
	
	public String getShopSiteImageUrl(){
		StringBuilder sb = new StringBuilder();
		sb.append(getProtocol());
		sb.append(getHost());
		sb.append(getVpath());
		sb.append("/images/1");
		return sb.toString();
	}
	public String getShopSiteRootUrl() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProtocol());
		sb.append(getHost());
		sb.append(getVpath());
		return sb.toString();
	}
	@ManagedAttribute
	public String getProtocol() {
		return protocol;
	}
	@ManagedAttribute
	@Value("${myset.info.protocol}")
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	@ManagedAttribute
	public String getHost() {
		return host;
	}
	@ManagedAttribute
	@Value("${myset.info.host}")
	public void setHost(String host) {
		this.host = host;
	}
	@ManagedAttribute
	public String getVpath() {
		return vpath==null?"":vpath;
	}
	@ManagedAttribute
	@Value("${myset.info.vpath}")
	public void setVpath(String vpath) {
		this.vpath = vpath;
	}
	public String chnlIdAppBoc  ;
	@ManagedAttribute
	@Value("${myset.info.isdebug}")
	public   void setDegug(boolean isDegug) {
		 this.isDegug = isDegug;
	}
	@ManagedAttribute
	@Value("${myset.info.usewhite}")
	public   void setUseWhite(boolean useWhite) {
		 this.useWhite = useWhite;
	}
	@ManagedAttribute
	public   boolean isDegug() {
		return isDegug;
	}
	@ManagedAttribute
	public   boolean isUseWhite() {
		return useWhite;
	}
	@ManagedAttribute
	public String getChnlIdAppBoc() {
		return chnlIdAppBoc;
	}
	@ManagedAttribute
	@Value("${myset.info.chnlIdAppBoc}")
	public void setChnlIdAppBoc(String chnlIdAppBoc) {
		this.chnlIdAppBoc = chnlIdAppBoc;
	}
	@ManagedAttribute
	public boolean isSubmitOrderAsync() {
		return submitOrderAsync;
	}
	@ManagedAttribute
	@Value("${order.info.submitAsync}")
	public void setSubmitOrderAsync(boolean submitOrderAsync) {
		this.submitOrderAsync = submitOrderAsync;
	}
	
	@ManagedAttribute
	public String getCurrEnv() {
		return currEnv;
	}
	@ManagedAttribute
	@Value("${myset.info.curr_env}")
	public void setCurrEnv(String currEnv) {
		this.currEnv = currEnv;
	}
	
	
	@ManagedAttribute
	public String getOpenSearchAppName() {
		return openSearchAppName;
	}
	@ManagedAttribute
	@Value("${opensearch.appname}")
	public void setOpenSearchAppName(String openSearchAppName) {
		this.openSearchAppName = openSearchAppName;
	}
	@ManagedAttribute
	public String getOpenSearchAccesskey() {
		return openSearchAccesskey;
	}
	@ManagedAttribute
	@Value("${opensearch.accesskey}")
	public void setOpenSearchAccesskey(String openSearchAccesskey) {
		this.openSearchAccesskey = openSearchAccesskey;
	}
	@ManagedAttribute
	public String getOpenSearchSecret() {
		return openSearchSecret;
	}
	@ManagedAttribute
	@Value("${opensearch.secret}")
	public void setOpenSearchSecret(String openSearchSecret) {
		this.openSearchSecret = openSearchSecret;
	}
	@ManagedAttribute
	public String getOpenSearchHost() {
		return openSearchHost;
	}
	@ManagedAttribute
	@Value("${opensearch.host}")
	public void setOpenSearchHost(String openSearchHost) {
		this.openSearchHost = openSearchHost;
	}
	
	@ManagedAttribute
	public boolean isUseOpenSearch() {
		return useOpenSearch;
	}
	@ManagedAttribute
	@Value("${opensearch.use}")
	public void setUseOpenSearch(boolean useOpenSearch) {
		this.useOpenSearch = useOpenSearch;
	}
	@ManagedAttribute
	public Integer getValidCodeExpire() {
		return validCodeExpire;
	}
	@ManagedAttribute
	public void setValidCodeExpire(Integer validCodeExpire) {
		this.validCodeExpire = validCodeExpire;
	}
	/**
	 * 获取当前环境cdn域名
	 * @return
	 */
	public String getCdnHost(){
		if("test".equals(getCurrEnv())){
			return ImageUtil.cdn_test_point;
		}
		if("pro".equals(this.getCurrEnv())){
			return ImageUtil.cdn_end_point;
		}
		if("res".equals(getCurrEnv())){
			return ImageUtil.cdnres_point; 
		}
		if("plan".equals(getCurrEnv())){
			return ImageUtil.cdn_test_point;
		}
		return ImageUtil.cdn_test_point;
	}
	
	
	
	
}
