package com.shanyuan.platform.ms.core.user.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.JsonUtils;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.PublishService;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.constant.TopicConstant;
import com.shanyuan.platform.ms.core.constant.UserConstant;
import com.shanyuan.platform.ms.core.user.GloryDealService;
import com.shanyuan.platform.ms.core.user.InviteInfoDealService;
import com.shanyuan.platform.ms.core.user.SendMessageInfoService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.bo.MemberRoleInfo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.GloryDealServiceException;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderExample;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryDetails;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryDetailsExample;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryTypeList;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryUserList;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryUserListExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import com.shanyuan.platform.ms.dao.user.mapper.SyGloryDetailsMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyGloryTypeListMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyGloryUserListMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;

@Component
public class GloryDealServiceImpl implements GloryDealService {

	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private SyGloryUserListMapper syGloryUserListMapper;
	
	@Autowired
	private SyGloryDetailsMapper syGloryDetailsMapper;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private UserCorrelationService userCorrelationService;
	
	@Autowired
	private SyGloryTypeListMapper syGloryTypeListMapper;
	
	@Autowired
	private SyMemberMapper syMemberMapper;

	@Autowired
	private SyOrderMapper syOrderMapper;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private SendMessageInfoService sendMessageInfoService;
	
	@Autowired
	private InviteInfoDealService inviteInfoDealService;
	
	@Autowired
	private PublishService publishService;
	
	private Map<String,Integer> engNum = new HashMap<String,Integer>();
	private Map<String,Long> countryCodeMap = new HashMap<String,Long>();
	
	@PostConstruct
	public void initEngNum() {
		 engNum.put("negative", -1);  
		 engNum.put("zero", 0);  
		 engNum.put("one", 1);  
		 engNum.put("two", 2);  
		 engNum.put("three", 3);  
		 engNum.put("four", 4);  
		 engNum.put("five", 5);  
		 engNum.put("six", 6);  
		 engNum.put("seven", 7);  
		 engNum.put("eight", 8);  
		 engNum.put("nine", 9);  
		 engNum.put("ten", 10);  
		 engNum.put("eleven", 11);  
		 engNum.put("twelve", 12);  
		 engNum.put("thirteen", 13);  
		 engNum.put("fourteen", 14);  
		 engNum.put("fifteen", 15);  
		 engNum.put("sixteen", 16);  
		 engNum.put("seventeen", 17);  
		 engNum.put("eighteen", 18);  
		 engNum.put("nineteen", 19);  
		 engNum.put("twenty", 20);  
		 engNum.put("thirty", 30);  
		 engNum.put("forty", 40);  
		 engNum.put("fifty", 50);  
		 engNum.put("sixty", 60);  
		 engNum.put("seventy", 70);  
		 engNum.put("eighty", 80);  
		 engNum.put("ninety", 90);  
		 engNum.put("hundred", 100);  
		 engNum.put("thousand", 1000);  
		 
		 countryCodeMap.put("ch", 610430000000l);
		 countryCodeMap.put("cw", 610428000000l);
		 countryCodeMap.put("ys", 610426000000l);
		 countryCodeMap.put("xy", 610429000000l);
	}
	
	@Override
	public void checkGlory(Integer memberId) throws CoreServiceException {
		//获取全部勋章列表
		List<SyGloryTypeList> gloryTypes = this.getAllGloryTypeList(1);
		
		if(CollectionUtils.isEmpty(gloryTypes)) {
			return ;
		}
		
		//获取用户获得的勋章列表
		List<SyGloryUserList> gloryUsers = this.syGloryUserListMapper.selectGloryUserListByMemberId(memberId);//用户勋章列表
		if(gloryTypes.size() > gloryUsers.size()){//用户勋章数量小于勋章总数
			//初始化用户勋章列表
			this.initGloryUser(gloryTypes, gloryUsers, memberId);
		}
		
		//过滤用户勋章列表，enable_state=1
		List<SyGloryUserList> enableGloryUser = new ArrayList<SyGloryUserList>();
		for (SyGloryUserList gloryUser : gloryUsers) {
			if(UserConstant.GloryEnableState.ENABLESTATE.equals(gloryUser.getEnableState())){
				enableGloryUser.add(gloryUser);
			}
		}
		
		//查询勋章进度详情列表
		List<SyGloryDetails> gloryDetails = 
				this.syGloryDetailsMapper.selectGloryDetailsByMemberId(memberId);
		//勋章进度详情列表转Map存储
		Map<Integer, SyGloryDetails> detailMap = new HashMap<Integer,SyGloryDetails>();
		for( SyGloryDetails gloryDetail : gloryDetails) {
			detailMap.put(gloryDetail.getGloryIdD(), gloryDetail);
		}
		
		//勋章列表转Map存储
		Map<Integer, SyGloryTypeList> gloryTypesMap = new HashMap<Integer, SyGloryTypeList>();
		for (SyGloryTypeList gloryType : gloryTypes) {
			gloryTypesMap.put(gloryType.getGloryId(), gloryType);
		}
		
		//检查更新勋章进度详情
		int m = 0;
		for(SyGloryUserList gloryUser :enableGloryUser ) {
			m += this.updateGloryDetail(gloryUser, 
					detailMap.get(gloryUser.getGloryId()), gloryTypesMap.get(gloryUser.getGloryId()));
		}
		 
		//发送勋章消息
		if(m>0) {
			if(this.constantReload.useQueuePushMessage){
				JSONObject json = new JSONObject();
				json.put("memberId", memberId);
				publishService.publishStringMessage(TopicConstant.GloryPublish.GLORY_TOPIC, TopicConstant.GloryPublish.GLORY_TAGNAME, json.toJSONString(), "", "");
			}else{
				this.sendMessageForGlory(memberId );
			}
		}
		//将用户勋章信息写入redis
		this.writeUserGloryToRedis(memberId);

	}
	/**
	 * 将用户勋章信息写入redis
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	private void writeUserGloryToRedis(Integer memberId) {
		if(constantReload.useRedisOpsData) {
			List<SyGloryDetails> gloryDetails = null;
			String currKey = "";
			SetOperations<String, String> set = null;
			try {
				//Redis获取用户信息
				set = stringRedisTemplate.opsForSet();
				Set<String> keys = set.members(CommonRedisKey.UserInfoRedisKey.USER_INFO_SET);
				currKey = CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE + memberId;
				boolean exit = keys.contains(currKey);
				if(!exit){//
					//将用户信息key存入redis的uiset
					set.add(CommonRedisKey.UserInfoRedisKey.USER_INFO_SET, 
							CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE + memberId);
				}
				
				//用户勋章进度详情列表
				gloryDetails = this.syGloryDetailsMapper.selectGloryDetailsByMemberId(memberId);
				//将用户勋章信息存入redis的hash中，key为ui_memberid
				HashOperations<String, String, Object> map = stringRedisTemplate.opsForHash();
				
				//勋章列表
				map.put(currKey, "gloryList", JSONObject.toJSONString(gloryDetails, 
						SerializerFeature.WriteNullStringAsEmpty));
				
			} catch (Exception e) {
				logger.info("用户 " + memberId + " 的勋章信息写入redis失败");
			}
		}
	}

	/**
	 * 检查更新勋章进度详情
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	private int updateGloryDetail(SyGloryUserList gloryUser,
			SyGloryDetails gloryDetail, SyGloryTypeList gloryType) {
		int mi =0;
		//如果用户已获得该勋章，则返回
		if(gloryDetail!=null&& gloryDetail.getAchieveState()==1) {
			return 0;
		}
		
		//用户未获得该勋章
		
		//勋章code，（积分规则，获取勋章的条件）
		String gloryCode = gloryType.getGloryCode().trim();
		if(!StringUtils.isEmpty(gloryCode)){
			
			if(gloryCode.endsWith("order")) {
				//订单相关勋章处理
				mi = this.executeOrderGlory(gloryType, gloryUser, gloryDetail);
				
			}else if(gloryCode.startsWith("jf")) {
				//积分相关勋章处理
				mi = this.executeJFGlory(gloryType, gloryUser, gloryDetail);
				
			}else if(gloryCode.length()==4) {
				//北四县相关勋章处理
				mi = this.executeAreaGlory(gloryType, gloryUser, gloryDetail);
			}
		}
		
		return mi;
	}

	/**
	 * 初始化用户勋章信息     分布式锁实现 独占更新方法
	 * @Author wang chunru
	 * @Description 
	 * @param gloryTypes 全部勋章列表，gloryUsers 用户勋章列表
	 * @return void
	 * @throws
	 */
	private void initGloryUser(List<SyGloryTypeList> gloryTypes,
			List<SyGloryUserList> gloryUsers, Integer memberId) {
		boolean mylock = true; 
		String key = "";
		if(constantReload.useRedisOpsData){
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			key = LoginConstant.RedisKey.GLORY_INIT_KEY_PRE + memberId;
			ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
			mylock = ops.setIfAbsent(key, uuid);
			stringRedisTemplate.expire(key, 30, TimeUnit.SECONDS);
		}
		
		if(mylock) {
			
//			MemberRoleInfo roleInfo = this.userCorrelationService.getMemberRoleInfo(memberId);
//			String roleCode = roleInfo.getCode()+"";
			
//			SyCircleMember cirmem = this.userCorrelationService.getCircleInfoOnlyBocOrg(memberId);
//			String channelCode = cirmem.getCode();
			
			try {
				//过滤未初始化的勋章
				List<SyGloryTypeList> unInitGlories = new ArrayList<SyGloryTypeList>();
				if(gloryUsers.size() == 0){
					unInitGlories = gloryTypes;
				}else {
					//用户已拥有勋章key：value
					Map<Integer, SyGloryUserList> gloryUserMap = new HashMap<Integer, SyGloryUserList>();
					for(SyGloryUserList gloryUser : gloryUsers) {
						gloryUserMap.put(gloryUser.getGloryId(), gloryUser);
					}
					
					for (SyGloryTypeList gloryType : gloryTypes) {
						if(!gloryUserMap.containsKey(gloryType.getGloryId())){
							unInitGlories.add(gloryType);
						}
					}
				}
				//开始初始化未初始化的用户勋章信息
				for (SyGloryTypeList gloryType : unInitGlories) {
					
					SyGloryUserList gloryUser = new SyGloryUserList();
					gloryUser.setEnableState(UserConstant.GloryEnableState.ENABLESTATE);
					gloryUser.setGloryId(gloryType.getGloryId());
					gloryUser.setMemberId(memberId);
					
					this.syGloryUserListMapper.insertSelective(gloryUser);
					gloryUsers.add(gloryUser);
				}
				
				
			}catch(Exception e) {
				
				logger.error(e.getMessage(),e);
				
			}finally {
				if(constantReload.useRedisOpsData){
					this.stringRedisTemplate.delete(key);
				}
			}
		}
		
	}

	/**
	 * 勋章检查
	 * @param gloryUser
	 * @param detail
	 * @return
	 */
	@SuppressWarnings("unused")
	private int doCheckGlory(SyGloryUserList gloryUser, SyGloryDetails detail ) {
		
		int mi =0;
		
		if(detail!=null&& detail.getAchieveState()==1) {
			return 0;
		}
		
		SyGloryTypeList glory = this.syGloryTypeListMapper.selectByPrimaryKey(gloryUser.getGloryId());
		String gloryCode = glory.getGloryCode().trim();
		
		if(StringUtils.isNotEmpty(gloryCode)) {
			
			if(gloryCode.endsWith("order")) {
				
				mi = this.executeOrderGlory(glory, gloryUser, detail);
				
			}else if(gloryCode.startsWith("jf")) {
				
				mi = this.executeJFGlory(glory, gloryUser, detail);
				
			}else if(gloryCode.length()==4) {
				
				mi = this.executeAreaGlory(glory, gloryUser, detail);
			}
		}
		
		return mi;
	}
	
	/**
	 * 订单勋章处理
	 * @param glory
	 * @param gloryUser
	 * @param detail
	 * @return
	 */
	private int  executeOrderGlory(SyGloryTypeList glory, SyGloryUserList gloryUser, SyGloryDetails detail  ) {
		int mi = 0;
		try {
			String gloryCode = glory.getGloryCode().trim(); 
			String en = gloryCode.replace("order", "");
			Integer ods = this.engNum.get(en);
			if(ods == null ) {
				logger.error("cat parse gloryCode : "+gloryCode);
				return 0;
			}
			SyOrderExample nsoe = new SyOrderExample();
			nsoe.createCriteria().andOrderStateEqualTo("40").andGoodsProjectTypeEqualTo(17).andBuyerIdEqualTo(gloryUser.getGloryMemberId());
			
			int ownOds = this.syOrderMapper.countByExample(nsoe);
			
			if(ownOds >= ods ) {
				
				int ntime = (int) (System.currentTimeMillis()/1000);
				SyGloryDetailsExample emp = new SyGloryDetailsExample();
				emp.createCriteria().andGloryIdDEqualTo(gloryUser.getGloryId()).andAchieveStateEqualTo(1);
				int m = this.syGloryDetailsMapper.countByExample(emp);
				
				if(detail==null) {
					
					detail = new SyGloryDetails();
					detail.setAchieveCountIndex(m+1);
					detail.setAchieveState(1);
					detail.setAchieveTime(ntime);
					detail.setGloryIdD(gloryUser.getGloryId());
					detail.setGloryUserId(gloryUser.getMemberId());
					detail.setProgressStep(ods);
					detail.setSplashFlag("1");
					detail.setTotalProgressStep(ods);
					
					mi = this.syGloryDetailsMapper.insertSelective(detail);
					
				}else {
					
					SyGloryDetails ndetail =  new SyGloryDetails();
					ndetail.setAchieveCountIndex(m+1);
					ndetail.setAchieveState(1);
					ndetail.setAchieveTime(ntime);
					ndetail.setProgressStep(ods);
					ndetail.setSplashFlag("1");
					ndetail.setTotalProgressStep(ods);
					ndetail.setGloryDetialId(detail.getGloryDetialId());
					
					mi=this.syGloryDetailsMapper.updateByPrimaryKeySelective(ndetail);
					
				}
			}else {
				if(detail == null) {
					
					detail = new SyGloryDetails();
					detail.setAchieveState(0);
					detail.setAchieveCountIndex(0);
					detail.setAchieveTime(0);
					detail.setGloryIdD(gloryUser.getGloryId());
					detail.setGloryUserId(gloryUser.getMemberId());
					detail.setProgressStep(ownOds);
					detail.setSplashFlag("0");
					detail.setTotalProgressStep(ods);
					
					this.syGloryDetailsMapper.insertSelective(detail);
					
				}else {
					
					SyGloryDetails ndetail =  new SyGloryDetails();
					ndetail.setProgressStep(ownOds);
					ndetail.setTotalProgressStep(ods);
					ndetail.setGloryDetialId(detail.getGloryDetialId());
					
					this.syGloryDetailsMapper.updateByPrimaryKeySelective(ndetail);
				}
			}
		}catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
		return mi;
	}
	
	/**
	 * 县域帮扶订单勋章处理
	 * @param glory
	 * @param gloryUser
	 * @param detail
	 * @return
	 */
	private int executeAreaGlory(SyGloryTypeList glory, SyGloryUserList gloryUser, SyGloryDetails detail  ) {
		
		int mi = 0;
		try {
			String gloryCode = glory.getGloryCode().trim(); 
			String countryCode = gloryCode.substring(0, 2);
			Integer ods = Integer.parseInt(gloryCode.substring(2));
			
			if(!countryCodeMap.containsKey(countryCode) ) {
				logger.error("cat parse gloryCode : "+gloryCode);
				return 0 ;
			}
			
			SyOrderExample nsoe = new SyOrderExample();
			nsoe.createCriteria().andOrderStateEqualTo("40").andGoodsProjectTypeEqualTo(17).andBuyerIdEqualTo(gloryUser.getGloryMemberId()).andSupportCountyIdEqualTo(countryCodeMap.get(countryCode));
			int ownOds = this.syOrderMapper.countByExample(nsoe);
			
			if(ownOds >= ods ) {
				
				int ntime = (int) (System.currentTimeMillis()/1000);
				SyGloryDetailsExample emp = new SyGloryDetailsExample();
				emp.createCriteria().andGloryIdDEqualTo(gloryUser.getGloryId()).andAchieveStateEqualTo(1);
				int m = this.syGloryDetailsMapper.countByExample(emp);
				
				if(detail == null) {
					
					detail = new SyGloryDetails();
					detail.setAchieveCountIndex(m+1);
					detail.setAchieveState(1);
					detail.setAchieveTime(ntime);
					detail.setGloryIdD(gloryUser.getGloryId());
					detail.setGloryUserId(gloryUser.getMemberId());
					detail.setProgressStep(ods);
					detail.setSplashFlag("1");
					detail.setTotalProgressStep(ods);
					
					mi = this.syGloryDetailsMapper.insertSelective(detail);
					
				}else {
					
					SyGloryDetails ndetail =  new SyGloryDetails();
					ndetail.setAchieveCountIndex(m+1);
					ndetail.setAchieveState(1);
					ndetail.setAchieveTime(ntime);
					ndetail.setProgressStep(ods);
					ndetail.setSplashFlag("1");
					ndetail.setTotalProgressStep(ods);
					ndetail.setGloryDetialId(detail.getGloryDetialId());
					
					mi = this.syGloryDetailsMapper.updateByPrimaryKeySelective(ndetail);
				}
			}else {
				
				if(detail == null) {
					
					detail = new SyGloryDetails();
					detail.setAchieveState(0);
					detail.setAchieveCountIndex(0);
					detail.setAchieveTime(0);
					detail.setGloryIdD(gloryUser.getGloryId());
					detail.setGloryUserId(gloryUser.getMemberId());
					detail.setProgressStep(ownOds);
					detail.setSplashFlag("0");
					detail.setTotalProgressStep(ods);
					
					this.syGloryDetailsMapper.insertSelective(detail);
					
				}else {
					
					SyGloryDetails ndetail =  new SyGloryDetails();
					ndetail.setProgressStep(ownOds);
					ndetail.setTotalProgressStep(ods);
					ndetail.setGloryDetialId(detail.getGloryDetialId());
					
					this.syGloryDetailsMapper.updateByPrimaryKeySelective(ndetail);
					
				}
			}
		}catch(Exception e) {
			
			logger.error(e.getMessage(),e);
		}
		
		return mi;
	}
	
	/**
	 * 积分勋章处理
	 * @param glory
	 * @param gloryUser
	 * @param detail
	 * @return
	 */
	private int executeJFGlory(SyGloryTypeList glory, SyGloryUserList gloryUser, SyGloryDetails detail ) {
		
		int mi = 0;
		try {
			
			String gloryCode = glory.getGloryCode().trim(); 
			int point = Integer.parseInt(gloryCode.replace("jf", ""));
			
			long ownPoint = 0;
			if(constantReload.useRedisOpsData){
				try {
					HashOperations<String, String, String> hash = this.stringRedisTemplate.opsForHash();
					String bocPoints = hash.get("ui_" + gloryUser.getMemberId(), "bocPoints");
					if(StringUtils.isEmpty(bocPoints)){
						SyMemberWithBLOBs member = this.syMemberMapper.selectByPrimaryKey(gloryUser.getMemberId());
						ownPoint = member.getBocPoints();
					}else{
						ownPoint = Integer.parseInt(bocPoints);
					}
				} catch (Exception e) {
					logger.error("从redis获取用户" + gloryUser.getMemberId() + "的积分失败");
					SyMemberWithBLOBs member = this.syMemberMapper.selectByPrimaryKey(gloryUser.getMemberId());
					ownPoint = member.getBocPoints();
				}
			}else{
				SyMemberWithBLOBs member = this.syMemberMapper.selectByPrimaryKey(gloryUser.getMemberId());
				ownPoint = member.getBocPoints();
			}
			if(ownPoint >= point ) {
				
				int ntime = (int) (System.currentTimeMillis()/1000);
				SyGloryDetailsExample emp = new SyGloryDetailsExample();
				emp.createCriteria().andGloryIdDEqualTo(gloryUser.getGloryId()).andAchieveStateEqualTo(1);
				int m = this.syGloryDetailsMapper.countByExample(emp);
				
				if(detail==null) {
					
					detail = new SyGloryDetails();
					detail.setAchieveCountIndex(m+1);
					detail.setAchieveState(1);
					detail.setAchieveTime(ntime);
					detail.setGloryIdD(gloryUser.getGloryId());
					detail.setGloryUserId(gloryUser.getMemberId());
					detail.setProgressStep(point);
					detail.setSplashFlag("1");
					detail.setTotalProgressStep(point);
					mi =this.syGloryDetailsMapper.insertSelective(detail);
					
				}else {
					
					SyGloryDetails ndetail =  new SyGloryDetails();
					ndetail.setAchieveCountIndex(m+1);
					ndetail.setAchieveState(1);
					ndetail.setAchieveTime(ntime);
					ndetail.setProgressStep(point);
					ndetail.setSplashFlag("1");
					ndetail.setTotalProgressStep(point);
					ndetail.setGloryDetialId(detail.getGloryDetialId());
					
					mi=this.syGloryDetailsMapper.updateByPrimaryKeySelective(ndetail);
				}
			}else {
				
				if(detail==null) {
					
					detail = new SyGloryDetails();
					detail.setAchieveState(0);
					detail.setAchieveCountIndex(0);
					detail.setAchieveTime(0);
					detail.setGloryIdD(gloryUser.getGloryId());
					detail.setGloryUserId(gloryUser.getMemberId());
					detail.setProgressStep(((Long)ownPoint).intValue());
					detail.setSplashFlag("0");
					detail.setTotalProgressStep(point);
					
					this.syGloryDetailsMapper.insertSelective(detail);
					
				}else {
					
					SyGloryDetails ndetail =  new SyGloryDetails();
					ndetail.setProgressStep(((Long)ownPoint).intValue());
					ndetail.setTotalProgressStep(point);
					ndetail.setGloryDetialId(detail.getGloryDetialId());
					
					this.syGloryDetailsMapper.updateByPrimaryKeySelective(ndetail);
				}
			}
			
		}catch(Exception e) {
			
			logger.error(e.getMessage(),e);
		}
		
		return mi;
	}
	
	/**
	 * 分布式锁实现 独占更新方法
	 * @param memberId  用户id
	 * @throws CoreServiceException
	 */
	@SuppressWarnings("unused")
	private void initGlory(Integer memberId) throws CoreServiceException {
		
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		
		String key = LoginConstant.RedisKey.GLORY_INIT_KEY_PRE + memberId;
		
		ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
		boolean mylock = ops.setIfAbsent(key, uuid);
		
		if(mylock) {
			
			stringRedisTemplate.expire(key, 30, TimeUnit.SECONDS);
			
			MemberRoleInfo roleInfo = this.userCorrelationService.getMemberRoleInfo(memberId);
			
			String roleCode = roleInfo.getCode()+"";
			
//			SyCircleMember cirmem = this.userCorrelationService.getCircleInfoOnlyBocOrg(memberId);
			
//			String channelCode = cirmem.getCode();
			
			try {
				
//				List<SyGloryUserList> addugs = new ArrayList<SyGloryUserList>(); 
				
				SyGloryUserListExample ngule = new SyGloryUserListExample();
				ngule.createCriteria().andMemberIdEqualTo(memberId);
				
				List<SyGloryUserList> userGlories = this.syGloryUserListMapper.selectByExample(ngule);
				
				Map<Integer, SyGloryUserList> gloryUserMap = new HashMap<Integer, SyGloryUserList>();
				
				for(SyGloryUserList gul : userGlories) {
					
					gloryUserMap.put(gul.getGloryId(), gul);
					
				}
				List<SyGloryTypeList> gloryList = this.syGloryTypeListMapper.selectByExample(null);
				
				for(SyGloryTypeList gtl : gloryList) {
					
					if(!gloryUserMap.containsKey(gtl.getGloryId())) {
						
						SyGloryUserList ngul = new SyGloryUserList();
						ngul.setEnableState(UserConstant.GloryEnableState.DISENABLESTATE);
						String channelRange = gtl.getChannelRange();
						String memTypeRange = gtl.getCustTypeRange();
						
						if(StringUtils.isNotEmpty(channelRange)&&StringUtils.isNotEmpty(memTypeRange)) {
							
							boolean match = true ;
							if(!channelRange.equalsIgnoreCase("ALL")) {
								String[] cs = channelRange.split(",");
								Set<String> csSet = new HashSet<String>(Arrays.asList(cs));
								if (!csSet.contains(channelRange)) {
									match=false;
								}
							}
							
							if(match) {
								String[] ts = memTypeRange.split(",");
								Set<String> tsSet = new HashSet<String>(Arrays.asList(ts));
								if (!tsSet.contains(roleCode)) {
									match=false;
								}
							}
							if(match) {
								ngul.setEnableState(1);
							}
							
						}
						
						ngul.setGloryId(gtl.getGloryId());
						ngul.setMemberId(memberId);
						this.syGloryUserListMapper.insertSelective(ngul);
					}
				}
			}catch(Exception e) {
				
				logger.error(e.getMessage(),e);
				
			}finally {
				
				this.stringRedisTemplate.delete(key);
			}
		}
		
	}
	
	/**
	 * 发送积分消息
	 * @param memberId
	 */
	@Override
	public void sendMessageForGlory(Integer memberId)  throws CoreServiceException{
		
		try {
			String pageUrl =  this.constantReload.getShopSiteApiUrl()+"'/index.php?act=glory&op=glory_list&member_id="+memberId;
			String loadUrl = pageUrl;
			
			loadUrl =  this.constantReload.getShopSiteApiUrl()+"/index.php?act=index&op=notify_page&page_url="+URLEncoder.encode(loadUrl, "UTF-8");
			loadUrl = URLEncoder.encode(loadUrl, "UTF-8");
			
			//发送站内消息
			this.sendMessageInfoService.sendmessageToMember(memberId, 0, "公益勋章", "恭喜点亮新的爱心勋章，点击查看。", pageUrl, 0,(byte) 105);
			//发送推送消息
			this.inviteInfoDealService.sendNotifyToMemberForIncPoints(memberId, "公益勋章", "公益勋章", "恭喜点亮新的爱心勋章，点击查看。", loadUrl);
		
		} catch (UnsupportedEncodingException e) {
			logger.info(e.getMessage(), new CoreServiceException(GloryDealServiceException.UNSUPPORTED_ENCODING));
		}
		
	}
	/**
	 * 获取平台所有勋章列表
	 */
	@Override
	public List<SyGloryTypeList> getAllGloryTypeList(Integer onlineState){
		if(!constantReload.isUseRedisOpsData()){
			return this.syGloryTypeListMapper.selectGloryTypeList(onlineState);
		}else {
			
			List<SyGloryTypeList> gloryList = null;
			SetOperations<String, String> set = null;
			Set<String> gloryTypeList = null;
			try {
				//从redis获取勋章列表
				set = stringRedisTemplate.opsForSet();
				gloryTypeList = set.members("gloryset");
				if(ObjectUtils.isEmpty(gloryTypeList)){//redis不存在从db获取
					gloryList = this.syGloryTypeListMapper.selectGloryTypeList(onlineState);
					for (SyGloryTypeList glory : gloryList) {
						set.add("gloryset_" + onlineState, JSONObject.toJSONString(glory));
					}
				}else {//redis存在
					gloryList = new ArrayList<SyGloryTypeList>();
					for (String jsonStr : gloryTypeList) {
						SyGloryTypeList glory = JsonUtils.jsonToPojo(jsonStr, SyGloryTypeList.class);
						gloryList.add(glory);
					}
				}
			} catch (Exception e) {
				logger.error("redis连接失败");
				gloryList = this.syGloryTypeListMapper.selectGloryTypeList(onlineState);
			}
			return gloryList;
		}
	}
	/**
	 * 删除勋章
	 */
	@Override
	public int deleteGlory(Integer gloryId) throws CoreServiceException {
		return this.syGloryTypeListMapper.deleteByPrimaryKey(gloryId);
	}
	/**
	 * 新增勋章
	 */
	@Override
	public int saveGlory(SyGloryTypeList glory) {
		return this.syGloryTypeListMapper.insertSelective(glory);
	}
	/**
	 * 修改勋章
	 */
	@Override
	public int updateGlory(SyGloryTypeList glory) {
		return this.syGloryTypeListMapper.updateByPrimaryKeySelective(glory);
	}
}
