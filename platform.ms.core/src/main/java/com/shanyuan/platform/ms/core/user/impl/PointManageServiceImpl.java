package com.shanyuan.platform.ms.core.user.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.PublishService;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.PointConstant;
import com.shanyuan.platform.ms.core.constant.TopicConstant;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.user.GloryDealService;
import com.shanyuan.platform.ms.core.user.InviteInfoDealService;
import com.shanyuan.platform.ms.core.user.PointManageService;
import com.shanyuan.platform.ms.core.user.SendMessageInfoService;
import com.shanyuan.platform.ms.core.user.bo.PointsLogBo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.PointServiceExcepType;
import com.shanyuan.platform.ms.dao.user.entity.PointLogParam;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLog;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLogExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLogExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleLogMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyPointsLogMapper;




@Component
public class PointManageServiceImpl  implements PointManageService {
	
	@Autowired
	private SyMemberMapper memberMapper;
	
	@Autowired
	private SyPointsLogMapper syPointsLogMapper;
	
	@Autowired
	private SyInviteCircleLogMapper syInviteCircleLogMapper;
	
	@Autowired
	private GloryDealService gloryDealService;
	
	@Autowired
	private SendMessageInfoService sendMessageInfoService;
	
	@Autowired
	private InviteInfoDealService inviteInfoDealService;
	
	@Autowired
	private PublishService publishService;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private ConstantReload constantReload;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public List<PointsLogBo> getPointDetail(Integer memberId,List<String>plStages,String orderBy,Integer pageSize,Integer currentPage,String type) throws CoreServiceException {
		pageSize = ObjectUtils.isEmpty(pageSize)?20:pageSize;//每页数量
		currentPage = ObjectUtils.isEmpty(currentPage)?1:currentPage;//当前页
		Integer sizeStart= (currentPage-1)*pageSize;//查询时起始条数
		orderBy = ObjectUtils.isEmpty(orderBy)?" pl_id DESC LIMIT "+sizeStart+","+pageSize:orderBy+" LIMIT "+sizeStart+" , "+pageSize;//查询时order by 和 limit
		if(ObjectUtils.isEmpty(plStages)) {
			plStages =new ArrayList<String>();
			plStages.add("shared_buy");
			plStages.add("shared_regist");
			plStages.add("order");
			plStages.add("fund_fee");
			plStages.add("order_points");
			plStages.add("donate_goods_order");
			plStages.add("sys_adjust");
			plStages.add("donate_money");
			plStages.add("sy_bazaar");
			plStages.add("sy_activity");
			plStages.add("sy_wallet");
			plStages.add("yike_points");
			plStages.add("regist_by_share");
		}
		SyPointsLogExample example = new SyPointsLogExample();
		if("detail".equals(type)) {
			example.createCriteria().andPlMemberidEqualTo(memberId).
			andPlStageIn(plStages);
		}else {
			//预留
		}
		example.setOrderByClause(orderBy);
		List<SyPointsLog> selectByExample = syPointsLogMapper.selectByExample(example);
		List<PointsLogBo> pointsList =new ArrayList<PointsLogBo>();
		if(ObjectUtils.isEmpty(selectByExample)) {
			return pointsList;
		}
				
		for(SyPointsLog point:selectByExample) {
			PointsLogBo bo=new PointsLogBo();
			Integer plAddtime = point.getPlAddtime();
			Long addtime =ObjectUtils.isEmpty(plAddtime)?0L:plAddtime;
			String newtime = DateUtil.getIntegerToSdf(addtime);
			BeanUtils.copyProperties(point,bo);
			bo.setAddtime(newtime);
			String plStage = point.getPlStage();
			String plDesc = point.getPlDesc();
			String fromType = this.getFromType(plStage, plDesc);
			bo.setFrom(fromType);
			pointsList.add(bo);
		}
		return pointsList;
	}
	/**
	 * zy
	 */
	@Override 
	public  String getFromType(String plStage,String plDesc){
		String from ="";
		if(PointConstant.PointStage.ORDER.equals(plStage)) {
			from=PointConstant.FromType.order;
		}else if(PointConstant.PointStage.FUND_FEE.equals(plStage)) {
			from=PointConstant.FromType.fund_fee;
		}else if(PointConstant.PointStage.DONATE_MONEY.equals(plStage)) {
			from=PointConstant.FromType.donate_money;
		}else if(PointConstant.PointStage.ORDER_POINTS.equals(plStage)
				||PointConstant.PointStage.SYS_ADJUST.equals(plStage)||PointConstant.PointStage.SY_WALLET.equals(plStage)) {
			from=plDesc;
		}else if(PointConstant.PointStage.DONATE_GOODS_ORDER.equals(plStage)) {
			from=PointConstant.FromType.donate_goods_order;
		}else if(PointConstant.PointStage.SY_BAZAAR.equals(plStage)) {
			from=PointConstant.FromType.sy_bazaar;
		}else if(PointConstant.PointStage.SY_ACTIVITY.equals(plStage)) {
			from=PointConstant.FromType.sy_activity;	
		}else if(PointConstant.PointStage.YIKE_POINT.equals(plStage)) {
			from=PointConstant.FromType.yike_points;	
		}else if(PointConstant.PointStage.SY_ACTIVITY.equals(plStage)) {
			from=PointConstant.FromType.sy_activity;	
		}else if(PointConstant.PointStage.REGIST_BY_SHARE.equals(plStage)) {
			from=PointConstant.FromType.regist_by_share;	
		}else if(PointConstant.PointStage.SHARED_BUY.equals(plStage)) {
			from=PointConstant.FromType.shared_buy;	
		}else if(PointConstant.PointStage.SHARED_RGEGIST.equals(plStage)) {
			from=PointConstant.FromType.shared_regist;	
		}
		return from;
	}
	
	@Override
	public void validatePoint(Integer needPoints, Integer bocPoints, Integer bocPointsUsed) throws CoreServiceException {
		if(bocPoints==null) {
			 bocPoints=0;
		}
		if(bocPointsUsed==null) {
			bocPointsUsed=0;
		}
		if(needPoints>(bocPoints-bocPointsUsed)) {
			throw new CoreServiceException(OrderServiceExcepType.BOC_POINTS_NOT_ENOUGH_FAIL,"积分不足！");	
		}	
	}

	@Override
	public void correctPoint(Integer buyerId, Integer points, Integer type) throws CoreServiceException{
		//type:1sy_order  type:2 sy_bazaar_order  type:3 sy_order_goods type:4sy_marathon_order type:5sy_donation type:6sy_member
		//type:7sy_donation_goods type:8sy_points_cart type:9sy_points_order type:10sy_points_ordergoods type:11sy_points_orderaddress type:12sy_marathon_order
		switch (type) {
		case 1:
		memberMapper.increasePointsByPrimaryKey(points, buyerId);
		break;
		default:
		memberMapper.updateBocPointsByPrimaryKey(points.longValue(), buyerId);
		break;
		}		
	}
	/**
	 * by zy
	 * 使用积分
	 * 
	 */
	@Override
	public void usePoint(Integer buyerId, Integer bocPoints) {
		if(bocPoints > 0) {
			Integer affectRows = memberMapper.updateBocPointsUsedPoints(bocPoints.longValue(), buyerId);
			if(affectRows <= 0) {
				throw new CoreServiceException(PointServiceExcepType.POINT_FAIL,"更新使用积分错误");
			}
		}
	}

	@Override
	public boolean isRepeatAddPoints(Integer memberId, Integer inviteMemberId, String type)throws CoreServiceException {
		SyPointsLogExample nsple = new SyPointsLogExample();
		nsple.createCriteria().andPlMemberidEqualTo(inviteMemberId).andPlStageEqualTo(type).andPlMemberid2EqualTo(memberId);
		List<SyPointsLog> list = this.syPointsLogMapper.selectByExample(nsple);
		return !list.isEmpty();
	}

	/**
	 * 添加积分   by sunyue
	 * @param memberId  被邀请者的id
	 * @param inviteMemberId   邀请者的id
	 * @param sp   积分日志
	 * @param defaultNum  默认数
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public boolean addPoints(Integer memberId,Integer points, SyPointsLog sp, Integer type) throws CoreServiceException {
		boolean result = this.addPointsTrans(memberId, points, sp, type);
		if(result){
			if(this.constantReload.useQueuePushMessage){
				JSONObject json = new JSONObject();
				json.put("memberId", memberId);
				json.put("points", points);
				publishService.publishStringMessage(TopicConstant.PointPublish.POINT_TOPIC, TopicConstant.PointPublish.POINT_TAGNAME, json.toJSONString(), "", "");
			}else{
				this.sendMessageForPoint(memberId, points);
			}
		}
		//添加勋章检查点
		gloryDealService.checkGlory(memberId);
		return result;
	}
	
	@Transactional(timeout=36000,rollbackFor=Throwable.class,isolation=Isolation.READ_COMMITTED)
	private boolean addPointsTrans(Integer memberId,Integer points, SyPointsLog sp, Integer type){
		boolean result = false;
		// 加积分
		SyMember member = memberMapper.selectByPrimaryKey(memberId);
		//添加日志数据
		result = this.syPointsLogMapper.insertSelective(sp) == 1 ? true : false;
		//日志添加成功后更新积分
		if(result) {
			if(type == PointConstant.PointType.MEMBER_TYPE) {//type 1 加会员积分 2 加会员和中元积分 3:加中元积分
				result = memberMapper.increasePointsByPrimaryKey(member.getMemberPoints(), memberId) == 1 ? true : false;
			}else if(type == PointConstant.PointType.BOC_MEMBER_TYPE){
				result = memberMapper.updateMemberAndBocPointsByPrimaryKey(points, memberId) == 1 ? true : false;
			}else{
				result = memberMapper.updateBocPointsByPrimaryKey(points.longValue(), memberId) == 1 ? true : false;
			}
			if(!result){
				logger.info("增加积分失败，会员id：{}，积分数量：{}", memberId, points);
				throw new CoreServiceException(PointServiceExcepType.POINT_FAIL);
			}
		}else{
			logger.info("积分日志保存失败，积分信息：{}", sp);
			throw new CoreServiceException(PointServiceExcepType.POINT_LOG_FAIL);
		}
		result = this.addYikePoints(memberId, points, sp);
		//添加益客积分
		if(!result){
			logger.info("增加益客积分失败， 会员id：{}", memberId);
			throw new CoreServiceException(PointServiceExcepType.POINT_FAIL);
		}
		
		return result;
	}

	@Override
	public boolean inviteValidatePoint(Integer memberId) throws CoreServiceException {
		SyPointsLogExample syPointsLogExample = new SyPointsLogExample();
		syPointsLogExample.createCriteria().andPlMemberidEqualTo(memberId)
		.andPlStageEqualTo(PointConstant.PointStage.REGIST_BY_SHARE);
		List<SyPointsLog> syPointsLogs = syPointsLogMapper.selectByExample(syPointsLogExample);
		if(!CollectionUtils.isEmpty(syPointsLogs)){
			logger.info("该用户已经领取过注册积分，用户id：{}", memberId);
			return false;
		}
		
		return true;
	}

	@Override
	public boolean addYikePoints(Integer memberId, Integer points, SyPointsLog syPointsLog)
			throws CoreServiceException {
		boolean result = true;
		if(!PointConstant.PointStage.YIKE_POINT_LIST.contains(syPointsLog.getPlStage())){
			return result;
		}
		SyInviteCircleLogExample syInviteCircleLogExample = new SyInviteCircleLogExample();
		syInviteCircleLogExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyInviteCircleLog> syInviteCircleLogs = syInviteCircleLogMapper.selectByExample(syInviteCircleLogExample);
		if(CollectionUtils.isEmpty(syInviteCircleLogs)){
			logger.info("there is no log by this memberId:{}", memberId);
			return result;
		}
		SyInviteCircleLog syInviteCircleLog = syInviteCircleLogs.get(0);
		Integer invMId = syInviteCircleLog.getMemberId();
		syPointsLog.setPlStage(PointConstant.PointStage.YIKE_POINT);
		syPointsLog.setPlMemberid(invMId);
		syPointsLog.setPlMemberid2(memberId);
		syPointsLog.setPlDesc("益客" + syPointsLog.getPlDesc());
		result = this.addPoints(invMId, (int)(points * PointConstant.BOC_SHARED_GOODS_POINT_RATE), syPointsLog, PointConstant.PointType.BOC_TYPE);
		if(!result){
			logger.info("add yike points failed, memberId:{}", memberId);
		}
		return result;
	}

	@Override
	public boolean sendMessageForPoint(Integer memberId, Integer points) {
		try{
			String pageUrl = this.constantReload.getShopSiteMobileUrl() + "/index.php?act=point&op=point_detail_list";
			String loadUrl = this.constantReload.getShopSiteMobileUrl() + "/index.php?act=index&op=notify_page&page_url=" + URLEncoder.encode(pageUrl, "UTF-8");
			//发送站内消息
			sendMessageInfoService.sendmessageToMember(memberId, 0, "积分变更通知", "恭喜您，又有公益积分入账啦，本次获得公益积分：" + points, pageUrl, 0, (byte) 105);
			//发送推送消息
			this.inviteInfoDealService.sendNotifyToMemberForIncPoints(memberId, "积分变更通知", "公益勋章", "恭喜您，又有公益积分入账啦，本次获得公益积分：" + points, loadUrl);
		}catch (UnsupportedEncodingException e){
			logger.info(e.getMessage(), new CoreServiceException(PointServiceExcepType.UNSUPPORTED_ENCODING));
		}
		return false;
	}
	
	@Override
	public boolean addCachePoints(SyMember syMember, Integer points, Integer invMid, String channel, String stage,
			String desc) {
		Integer memberId = syMember.getMemberId();
		String key = CommonRedisKey.UserInfoRedisKey.USER_INFO_PRE + memberId; 
		HashOperations<String, String, String> opsForHash = stringRedisTemplate.opsForHash();
		Integer cachePoints = Integer.valueOf(opsForHash.get("ui_" + memberId, "bocPoints") + "");
		opsForHash.put(key, "bocPoints", cachePoints + points + "");
		boolean result = this.addPointLog(syMember, null, null, null, points, desc, stage, invMid, channel);
		
		//添加勋章检查点
		gloryDealService.checkGlory(memberId);
		
		return result;
	}
	
	@Override
	public boolean addPointLog(SyMember syMember, Integer orderId, Integer adminId, String adminName, 
			Integer bocPoints, String desc, String stage, Integer memberId2, String channel) throws CoreServiceException{
		Integer memberId = syMember.getMemberId();
		SyPointsLog syPointsLog = new SyPointsLog(memberId, syMember.getMemberName(), syMember.getMemberTruename(),
				syMember.getMemberIdValue(), orderId, adminId , adminName, bocPoints, (int) DateUtil.getNowLong() , desc, 
				stage, channel, memberId2);
		boolean result = this.syPointsLogMapper.insert(syPointsLog) == 1 ? true : false;
		return result;
	}
	
	@Override
	public boolean updateDbPoints(Integer memberId, Integer points, Integer type) throws CoreServiceException {
		boolean result = false;
		SyMember member = this.memberMapper.selectByPrimaryKey(memberId);
		if(type == PointConstant.PointType.MEMBER_TYPE) {//type 1 加会员积分 2 加会员和中元积分 3:加中元积分
			result = memberMapper.increasePointsByPrimaryKey(member.getMemberPoints(), memberId) == 1 ? true : false;
		}else if(type == PointConstant.PointType.BOC_MEMBER_TYPE){
			result = memberMapper.updateMemberAndBocPointsByPrimaryKey(points, memberId) == 1 ? true : false;
		}else{
			result = memberMapper.updateBocPointsByPrimaryKey(points.longValue(), memberId) == 1 ? true : false;
		}
		if(!result){
			logger.info("增加积分失败，会员id：{}，积分数量：{}", memberId, points);
			throw new CoreServiceException(PointServiceExcepType.POINT_FAIL);
		}
		return result;
	}
	/**
	 * 查询积分列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return PageInfo<SyPointsLog>
	 * @throws
	 */
	@Override
	public PageInfo<SyPointsLog> selectUserPointList(
			PageInfo<SyPointsLog> pageinfo, Integer memberId) throws CoreServiceException {
		PageHelper.startPage(pageinfo.getPageNum(), pageinfo.getPageSize());
		
		List<SyPointsLog> list = this.syPointsLogMapper.selectUserPointList(memberId);
		for(SyPointsLog point:list) {
			Integer plAddtime = point.getPlAddtime();
			Long addtime =ObjectUtils.isEmpty(plAddtime)?0L:plAddtime;
			String newtime = DateUtil.getIntegerToSdf(addtime);
			point.setAddTime(newtime);
			String plStage = point.getPlStage();
			String plDesc = point.getPlDesc();
			String fromType = this.getFromType(plStage, plDesc);
			point.setPlStage(fromType);
		}
		
		pageinfo = new PageInfo<SyPointsLog>(list);
		return pageinfo;
	}
	/**
	 * 增加积分日志
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	@Override
	public int savePointLog(SyPointsLog pointLog) throws CoreServiceException {
		pointLog.setPlAddtime((int)(System.currentTimeMillis()/1000));
		pointLog.setPlMemberid2(ObjectUtils.isEmpty(pointLog.getPlMemberid2()) ? 0 : pointLog.getPlMemberid2());
		return this.syPointsLogMapper.insertSelective(pointLog);
	}
	/**
	 * 查询积分列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return PageInfo<SyPointsLog>
	 * @throws
	 */
	@Override
	public PageInfo<SyPointsLog> selectPointList(
			PageInfo<SyPointsLog> pageinfo, PointLogParam params) throws CoreServiceException {
		PageHelper.startPage(pageinfo.getPageNum(), pageinfo.getPageSize());
		
		List<SyPointsLog> list = this.syPointsLogMapper.selectPointList(pageinfo);
		pageinfo = new PageInfo<SyPointsLog>(list);
		return pageinfo;
	}
	/**
	 * 修改积分日志
	 */
	@Override
	public int updatePoint(SyPointsLog pointLog) throws CoreServiceException {
		return this.syPointsLogMapper.updateByPrimaryKeySelective(pointLog);
	}
	/**
	 * 删除积分日志
	 */
	@Override
	public int deletePointLog(Integer pointLogId) throws CoreServiceException {
		return this.syPointsLogMapper.deleteByPrimaryKey(pointLogId);
	}
}

