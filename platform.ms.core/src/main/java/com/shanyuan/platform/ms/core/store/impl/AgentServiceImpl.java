package com.shanyuan.platform.ms.core.store.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.core.ZSetOperations.TypedTuple;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.UserConstant;
import com.shanyuan.platform.ms.core.goods.ConditionService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.store.AgentService;
import com.shanyuan.platform.ms.core.store.SyStoreService;
import com.shanyuan.platform.ms.core.store.impl.execptype.AgentExcepType;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.dao.goods.entity.SyEvaluateGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyPlatformStats;
import com.shanyuan.platform.ms.dao.goods.mapper.SyEvaluateGoodsMapper;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsCommonMapper;
import com.shanyuan.platform.ms.dao.goods.mapper.SyPlatformStatsMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyComplainMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderMapper;
import com.shanyuan.platform.ms.dao.stats.entity.AgentStatsBo;
import com.shanyuan.platform.ms.dao.stats.entity.SyAgentStats;
import com.shanyuan.platform.ms.dao.stats.entity.SyAreaBalanceStats;
import com.shanyuan.platform.ms.dao.stats.mapper.SyAgentStatsMapper;
import com.shanyuan.platform.ms.dao.stats.mapper.SyAreaBalanceStatsMapper;
import com.shanyuan.platform.ms.dao.stats.mapper.SyBizPoorStatsMapper;
import com.shanyuan.platform.ms.dao.stats.mapper.SyPoorFpbRawDataMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleArea;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.entity.SyEvaluateStore;
import com.shanyuan.platform.ms.dao.store.entity.SyFreezeAccount;
import com.shanyuan.platform.ms.dao.store.mapper.SyEvaluateStoreMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyFreezeAccountMapper;
import com.shanyuan.platform.ms.dao.user.entity.AgentBo;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorAgent;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.entity.SyRoleExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorAgentMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyRoleMapper;


@Component
public class AgentServiceImpl implements AgentService {

	private final Logger logger = LoggerFactory.getLogger(AgentServiceImpl.class);

	@Autowired
	private SyRoleMapper syRoleMapper;

	@Autowired
	private SyMemberMapper syMemberMapper;

	@Autowired
	private SyEvaluateGoodsMapper syEvaluateGoodsMapper;

	@Autowired
	private SyEvaluateStoreMapper syEvaluateStoreMapper;

	@Autowired
	private SyFreezeAccountMapper syFreezeAccountMapper;

	@Autowired
	private SyGoodsCommonService syGoodsCommonService;

	@Autowired
	private SyPoorAgentMapper syPoorAgentMapper;

	@Autowired
	private SyPoorMapper syPoorMapper;

	@Autowired
	private SyAreaBalanceStatsMapper syAreaBalanceStatsMapper;

	@Autowired
	private SyPoorFpbRawDataMapper syPoorFpbRawDataMapper;

	@Autowired
	private SyOrderMapper syOrderMapper;

	@Autowired
	private SyBizPoorStatsMapper syBizPoorStatsMapper;

	@Autowired
	private SyGoodsCommonMapper syGoodsCommonMapper;

	@Autowired
	private SyPlatformStatsMapper syPlatformStatsMapper;

	@Autowired
	private SyComplainMapper syComplainMapper;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Autowired
	private SyAgentStatsMapper syAgentStatsMapper;
	
	@Autowired
	private AgentService agentService;
	
	@Autowired
	private ConditionService conditionService;
	
	@Autowired
	private UnionService unoinService;
	
	@Autowired
	private SyStoreService syStoreService;

	/**
	 * 优秀助理人
	 * 
	 * @param areaid3
	 * @return List<AgentBo>
	 * @throws CoreServiceException
	 */
	@Override
	@Deprecated
	public List<AgentBo> getAgentList(List<Long> areaid3) throws CoreServiceException {
		List<Byte> roleTypes = new ArrayList<>();
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_COOP);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_WS);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_GOV);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_INDUSTRY);
		SyRoleExample sre = new SyRoleExample();
		if (!ObjectUtils.isEmpty(areaid3)) {
			sre.createCriteria().andRoleTypeIn(roleTypes).andAreaid3In(areaid3);
		} else {
			sre.createCriteria().andRoleTypeIn(roleTypes);
		}
		// 默认首页显示 8 个
		sre.setOrderByClause("recommend_time desc LIMIT 0,8");
		List<SyRole> roles = this.syRoleMapper.selectByExample(sre);
		List<AgentBo> agentBoList = new ArrayList<AgentBo>();
		if (!ObjectUtils.isEmpty(roles)) {
			// TODO 优化for循环
			for (SyRole syRole : roles) {
				AgentBo ab = new AgentBo();
				Integer memberId = syRole.getMemberId();

				// 去除没有产品的代理人和用户被冻结的代理人
				List<SyGoodsCommon> goodsList = this.syGoodsCommonService.getGoodsByPublisher(memberId);
				if (!ObjectUtils.isEmpty(goodsList) && !this.memberIds().contains(memberId)) {
					SyMember memberInfo = (SyMember) this.syMemberMapper.selectByPrimaryKey(memberId);
					if (!ObjectUtils.isEmpty(memberInfo)) {
						ab.setMemberId(memberId);
						ab.setMemberSex(memberInfo.getMemberSex());
						ab.setMemberTruename(memberInfo.getMemberTruename());
						ab.setImageUrl(ImageUtil.getUserHeadImgUrl(memberInfo.getMemberAvatar(),
								memberInfo.getMemberSex(), null));
						ab.setTouchUrl("/bocm/index.php?act=goods&op=agent_poor_goods_list&member_id="
								+ memberInfo.getMemberId());
						agentBoList.add(ab);
					}
				}
			}
			return agentBoList;
		}
		return null;
	}
	@Override
	@Deprecated
	public List<AgentBo> getAgentListNew(List<Long> areaid3) throws CoreServiceException {
		List<AgentBo> aBoAllList = new LinkedList<>();
		ZSetOperations<String, String> opsForZSet = this.stringRedisTemplate.opsForZSet();
		ValueOperations<String, String> operations = this.stringRedisTemplate.opsForValue();
		// 没有县取默认的
		if (ObjectUtils.isEmpty(areaid3)) {
			String string = operations.get(CommonRedisKey.AgentInfoRedisKey.AGENT_INFO_DEFAULT);
			// redis 中没有 查询数据库
			if(StringUtils.isEmpty(string)) {
				// 从数据库 查询12 条
				aBoAllList = this.getAgentInfo(null);
				
				Collections.sort(aBoAllList, new Comparator<AgentBo>() {
					@Override
					public int compare(AgentBo o1, AgentBo o2) {
						
						return o2.getStoreScore().compareTo(o1.getStoreScore());
					}
				});
			}else {
				aBoAllList = JSON.parseArray(string, AgentBo.class);
			}
			return aBoAllList;
		}
		// 有县取每个县的前12 个 进行排序后 ，取总的前12 个
		for (Long areaid : areaid3) {
			Set<TypedTuple<String>> list = opsForZSet.reverseRangeWithScores(areaid + "", 0, 11);
			// redis 没有 从数据库查
			if (CollectionUtils.isEmpty(list)) {
				//List<AgentBo> memberInfo = this.getAgentInfo(areaid);
			//	aBoAllList.addAll(memberInfo);
			}else {
				
				// redis 有
				List<AgentBo> aBolist = new ArrayList<>();
				Iterator<TypedTuple<String>> iterator = list.iterator();
				while (iterator.hasNext()) {
					
				    TypedTuple<String> next = iterator.next();
					String value = next.getValue();
					AgentBo bo = JSON.parseObject(value, AgentBo.class);
					aBolist.add(bo);
				}
				aBoAllList.addAll(aBolist);
			}
		}
		Collections.sort(aBoAllList, new Comparator<AgentBo>() {
			@Override
			public int compare(AgentBo o1, AgentBo o2) {

				return o2.getStoreScore().compareTo(o1.getStoreScore());
			}
		});
		List<AgentBo> subList = aBoAllList.subList(0, 12);
		return subList;
	}
	
	/**
	 * 优秀助理人     从php redis中取
	 */
	@Override
	@SuppressWarnings("rawtypes")
	@Deprecated
	public List<AgentBo> getNewAgentList(Integer memberId, String channel) throws CoreServiceException {
		List<AgentBo> aBoAllList = new LinkedList<>();
		
		ValueOperations<String, String> operations = this.stringRedisTemplate.opsForValue();
		
		String redisKey = this.redisKey(channel, memberId);
		
		String string = operations.get(redisKey);
		// redis 中没有 查询数据库
		if(StringUtils.isEmpty(string)) {
			// 从数据库 查询12 条
			logger.info("redis中没有，从数据中查得");
			List<Long> areaids = this.getAreaids(memberId, channel);
			if(ObjectUtils.isEmpty(areaids)) {
				logger.info("没有areaids");
				aBoAllList = this.getAgentInfo(null);
				return aBoAllList;
			}else {
				List<AgentBo> memberInfo = this.getAgentInfo(areaids);
				return memberInfo;
			}
		}else {
			List<Map> members = JSON.parseArray(string, Map.class);
			for (Map map : members) {
				AgentBo bo = new AgentBo();
				Integer memberid = Integer.valueOf(map.get("member_id").toString());
				bo.setMemberId(memberid);
				Map memberInfo = JSON.parseObject(map.get("member_info").toString());
				Byte memberSex = Byte.valueOf(memberInfo.get("member_sex").toString());
				bo.setMemberSex(memberSex);
				bo.setMemberTruename(memberInfo.get("member_truename").toString());
				bo.setImageUrl(ImageUtil.getUserHeadImgUrl(memberInfo.get("member_avatar").toString(), memberSex, null));
				bo.setStoreScore(Double.valueOf(map.get("store_score").toString()));
				bo.setTouchUrl("/bocm/index.php?act=goods&op=agent_poor_goods_list&member_id="+memberid);
				aBoAllList.add(bo);
			}
			return aBoAllList;
		}
	}
	
	public String redisKey (String channel, Integer memberId ) {
		String redisKey = "_recommend_agent_list";
		channel = "ykjlb";
		Integer circleId = null;
		if(!ObjectUtils.isEmpty(memberId)) {
			SyCircleMember circleMember=unoinService.getSyCircleMemberByMemberId(memberId);
			if(!ObjectUtils.isEmpty(circleMember) && !ObjectUtils.isEmpty(circleMember.getCircleId())) {
				circleId = circleMember.getCircleId();
				// php 从redis 中取  改为 从circle_area 表中查
				SyCircleArea sca = this.conditionService.getAreaid(circleId);
				if (!ObjectUtils.isEmpty(sca) && !ObjectUtils.isEmpty(sca.getAreaIdStr())) {
					redisKey = "sy_"+circleId+redisKey;
				}
		    }
			return redisKey;
		}
		if(!ObjectUtils.isEmpty(channel)) {
			redisKey = "sy_"+channel+redisKey;
			return redisKey;
		}
		return redisKey;
}

	/**
	 * 处理助理人信息
	 * @param areaIds3
	 * @return
	 */
	@Override
	public List<AgentBo> getAgentInfo (List<Long> areaIds3){
		List<AgentBo> result = new ArrayList<AgentBo>(); 
		List<AgentBo> memberInfo = syMemberMapper.selectGetMemberInfo(areaIds3);
		// 所有被禁用的用户
		List<Integer> members = agentService.memberIds();
		for (AgentBo memberBo : memberInfo) {
			// 去除被冻结的用户
//			List<SyGoodsCommon> goodsList = this.syGoodsCommonService.getGoodsByPublisher(memberBo.getMemberId());
			if(!members.contains(memberBo.getMemberId())) {
				memberBo.setImageUrl(ImageUtil.getUserHeadImgUrl(memberBo.getImageUrl(), memberBo.getMemberSex(), null));
				memberBo.setTouchUrl("/bocm/index.php?act=goods&op=agent_poor_goods_list&member_id="+memberBo.getMemberId());
				result.add(memberBo);
			}
		}
		return result;
	}

	/**
	 * 得到店铺评价分数 by sunyue
	 * 
	 * @param memberId
	 * @return BigDecimal
	 */
	@Override
	@Deprecated
	public BigDecimal getStoreScores(Integer memberId) {
		BigDecimal storeScores = BigDecimal.ZERO;
		BigDecimal servicecreditScore = BigDecimal.ZERO;
		BigDecimal deliverycreditScore = BigDecimal.ZERO;
		// TODO 存入缓存
		// 得到描述相符平均分
		SyEvaluateGoods scores = syEvaluateGoodsMapper.selectEvaluateGoodsScore(memberId);
		if (!ObjectUtils.isEmpty(scores) && !ObjectUtils.isEmpty(scores.getGoodsScoreAvg())) {
			storeScores = scores.getGoodsScoreAvg();
		}
		// 得到物流平均分以及服务平均评分
		SyEvaluateStore storescores = syEvaluateStoreMapper.selectGetEvaluateStoreScore(memberId);
		if (!ObjectUtils.isEmpty(storescores) && !storescores.getStoreEvaluateCount().equals(0)) {
			servicecreditScore = storescores.getServicecreditAvg();
			deliverycreditScore = storescores.getSevaldeliverycreditAvg();
		}
		// 总分
		BigDecimal allSum = storeScores.add(servicecreditScore).add(deliverycreditScore);
		// 平均分
		BigDecimal resultScores = allSum.divide(new BigDecimal(3), 2, BigDecimal.ROUND_HALF_UP);
		return resultScores;
	}

	/**
	 * 所有被冻结的账户id by sunyue
	 * 
	 * @return memberid
	 */
	@Override
	public List<Integer> memberIds() {
		List<Integer> ids = new ArrayList<>();
		List<SyFreezeAccount> freezeAccounts = syFreezeAccountMapper.selectByExample(null);
		if (!ObjectUtils.isEmpty(freezeAccounts)) {
			for (SyFreezeAccount syFreezeAccount : freezeAccounts) {
				ids.add(syFreezeAccount.getMemberId());
			}
		}
		return ids;
	}

	/**
	 * 统计助理人统计信息 @Author wang chunru @Description @param @return void @throws
	 */
	@Override
	public void agentStatsTask() {
		// 计数
		int num = 0;
		SqlSession session = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
		syAgentStatsMapper = session.getMapper(SyAgentStatsMapper.class);

		// 获取助理人列表
		try {
			List<SyRole> roleList = syRoleMapper.selectRoleList();
			for (SyRole role : roleList) {

				SyAgentStats agentStats = new SyAgentStats();
				// 目标帮扶总额
				double targetMoney = 0.0;
				if (isNewStatPeriod(role.getChannel())) {
					SyAreaBalanceStats stats = syAreaBalanceStatsMapper.selectAreaBalanceStats(role.getAreaid3());
					if (ObjectUtils.isEmpty(stats)) {
						targetMoney = getTargetMoneyByAreaId3(role.getAreaid3());
					} else {
						targetMoney = stats.getTargetMoney().doubleValue();
					}
				} else {
					targetMoney = getAgentSaleTargetMoney(role.getMemberId());
				}
				agentStats.setTargetMoney((int) targetMoney);

				// 完成的销售配额
				double finishMoney = 0.0;
				double orderAmount = syOrderMapper.selectOrderAmountByMemberId(role.getMemberId());
				double jicaiMoney = syBizPoorStatsMapper.selectJicaiMoneyByMenberId(role.getMemberId());
				finishMoney = orderAmount + jicaiMoney;
				agentStats.setFinishedMoney((int) finishMoney);

				// 上架的贫困户产品数量
				int onlineGoodsCount = syGoodsCommonMapper.selectGoodsCommonCount(role.getMemberId());
				agentStats.setOnlineGoodsCount(onlineGoodsCount);

				// 店铺评分信息
				SyEvaluateGoods evaluateGoods = syEvaluateGoodsMapper.selectEvaluateGoodsScore(role.getMemberId());
				// 得到描述相符平均分
				if (!ObjectUtils.isEmpty(evaluateGoods)) {
					agentStats.setAvgDesccredit(evaluateGoods.getGoodsScoreAvg());
				}

				// 得到物流平均分以及服务平均评分
				SyEvaluateStore evaluateStore = syEvaluateStoreMapper.selectGetEvaluateStoreScore(role.getMemberId());
				if (!ObjectUtils.isEmpty(evaluateStore)) {
					// 服务评分
					agentStats.setAvgServicecredit(evaluateStore.getServicecreditAvg());
					// 物流评分
					agentStats.setAvgDeliverycredit(evaluateStore.getSevaldeliverycreditAvg());
				}

				// 发货速度
				long sendSpeedAvg = syOrderMapper.selectSendSpeed(role.getMemberId(), null, null);
				agentStats.setSendSpeed(new BigDecimal(sendSpeedAvg));

				// 近期发货速度，30天
				long endTime = new Date().getTime() / 1000;// 单位秒
				long startTime = endTime - 30 * 24 * 60 * 60;
				long latestSendSpeedAvg = syOrderMapper.selectSendSpeed(role.getMemberId(), startTime, endTime);
				agentStats.setLatestSendSpeed(new BigDecimal(latestSendSpeedAvg));

				// 退款率
				double refundRate = this.getRefundRate(role.getMemberId(), null, null);
				agentStats.setRefundRate(new BigDecimal(refundRate));

				// 近期退款率
				double latestRefundRate = this.getRefundRate(role.getMemberId(), startTime, endTime);
				agentStats.setLatestRefundRate(new BigDecimal(latestRefundRate));

				// 投诉率
				double complainRate = this.getComplainRate(role.getMemberId(), null, null);
				agentStats.setComplainRate(new BigDecimal(complainRate));

				// 近期投诉率
				double latestComplainRate = this.getComplainRate(role.getMemberId(), startTime, endTime);
				agentStats.setLatestComplainRate(new BigDecimal(latestComplainRate));

				// 差评率
				double negativeRate = this.getNegativeRate(role.getMemberId());
				agentStats.setNegEvalRate(new BigDecimal(negativeRate));

				agentStats.setMemberId(role.getMemberId());
				agentStats.setAddTime((int) (new Date().getTime() / 1000));
				agentStats.setChannel(role.getChannel());
				// 查询该助理人当天统计 记录
				long nowTime = DateUtil.getZeroTime();
				SyAgentStats sas = syAgentStatsMapper.selectAgentStats(role.getMemberId(), nowTime);
				if (ObjectUtils.isEmpty(sas)) {
					// 新增
					syAgentStatsMapper.insert(agentStats);
				} else {
					// 更新
					agentStats.setRecId(sas.getRecId());
					syAgentStatsMapper.updateByPrimaryKeySelective(agentStats);
				}
				++num;
				if (num % 100 == 0 || num == roleList.size()) {
					session.commit();
					session.clearCache();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}

	}

	/**
	 * 差评率 @Author wang chunru @Description @param @return double @throws
	 */
	private double getNegativeRate(Integer memberId) {
		// 总评数
		double evaluateCount = syEvaluateGoodsMapper.selectEvaluateCount(memberId, null);
		// 差评数，评分小于3分为差评
		double negativeCount = syEvaluateGoodsMapper.selectEvaluateCount(memberId, 3);
		return evaluateCount == 0 ? 0 : negativeCount / evaluateCount;
	}

	/**
	 * 投诉率、近期投诉率 @Author wang chunru @Description @param @return double @throws
	 */
	private double getComplainRate(Integer memberId, Long startTime, Long endTime) {
		// 总订单数
		int orderCount = syOrderMapper.selectOrderCount(memberId, startTime, endTime);
		// 投诉数
		double complainCount = syComplainMapper.selectComplainCount(memberId, startTime, endTime);

		return orderCount == 0 ? 0 : complainCount / orderCount;
	}

	/**
	 * 获取退款率、近期退款lv @Author wang chunru @Description @param @return double @throws
	 */
	private double getRefundRate(Integer memberId, Long startTime, Long endTime) {
		// 总订单数
		int orderCount = syOrderMapper.selectOrderCount(memberId, startTime, endTime);
		// 查询平台最新状态数据：平均最近30天发货速度
		SyPlatformStats plateformStats = syPlatformStatsMapper.selectPlatformInfo();
		Integer sendSpeed = 0;
		if (!ObjectUtils.isEmpty(plateformStats)) {
			sendSpeed = plateformStats.getLatestSendSpeed() == null ? 0
					: plateformStats.getLatestSendSpeed().intValue();
		}
		sendSpeed = sendSpeed * 60 * 60;
		// 退款单数
		double refundCount = syOrderMapper.selectRefundCount(memberId, startTime, endTime, sendSpeed);

		return orderCount == 0 ? 0 : refundCount / orderCount;
	}

	/**
	 * 是否是新的统计周期 @Author wang chunru @Description @param channel @return
	 * boolean @throws
	 */
	private boolean isNewStatPeriod(String channel) {
		// TODO 已过统计周期，目前不考虑
		return false;
	}

	/**
	 * 获取助理人承担的公益销售配额 @Author wang chunru @Description @param @return double @throws
	 */
	private double getAgentSaleTargetMoney(Integer memberId) {
		// 代理的贫困户列表
		List<SyPoorAgent> poorAgentList = syPoorAgentMapper.selectPoorAgentList(memberId);
		int poorNum = 0;
		for (SyPoorAgent agent : poorAgentList) {
			SyPoor poor = syPoorMapper.selectByPrimaryKey(agent.getPoorId());
			if (!ObjectUtils.isEmpty(poor)) {
				poorNum += poor.getFamilyMemberNum();
			}
		}
		// 承担的公益销售配额
		double targetMoney = poorNum * UserConstant.DefaultMoney.POOR_TARGET_MONEY;
		return targetMoney;
	}

	/**
	 * 
	 * @Author wang chunru @Description @param @return double @throws
	 */
	private double getTargetMoneyByAreaId3(Long areaId3) {
		if (ObjectUtils.isEmpty(areaId3)) {
			return 0.0;
		}
		int poorNum = 0;
		if (UserConstant.SpecialArea.CHANGWU_AREA.equals(areaId3)) {// 长武县特殊处理
			poorNum = syPoorMapper.selectPoorNum(areaId3);
		} else {
			poorNum = syPoorFpbRawDataMapper.selectPoorNum(areaId3);
		}
		double targetMoney = poorNum * UserConstant.DefaultMoney.POOR_TARGET_MONEY;

		return targetMoney;
	}
	/**
	 * 获得县的id
	 * @param memberId
	 * @param channel
	 * @return
	 */
	@Override
	public List<Long> getAreaids (Integer memberId, String channel){
		List<Long> areaids = new ArrayList<>();
		Integer circleId = null;
		if(!ObjectUtils.isEmpty(memberId)) {
			SyCircleMember circleMember=unoinService.getSyCircleMemberByMemberId(memberId);
			if(!ObjectUtils.isEmpty(circleMember)) {
				circleId = circleMember.getCircleId();
				if(!StringUtils.isEmpty(circleMember.getCode())) {
					channel = circleMember.getCode();

				}
			}
		}
		logger.info("该用户没有登录，渠道为channel={}", channel);
		// 获取到贫困县id
		areaids=conditionService.getQueryConditionForMember(circleId, channel);
		return areaids;
	}
	/**
	 * 根据县获得角色信息
	 */
	private List<Integer> getAgents(List<Long> areaid3)  {
		List<Integer> memberIds = new ArrayList<Integer>();
		List<Byte> roleTypes = new ArrayList<Byte>();
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_COOP);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_WS);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_GOV);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_INDUSTRY);
		SyRoleExample sre = new SyRoleExample();
		if (!ObjectUtils.isEmpty(areaid3)) {
			sre.createCriteria().andRoleTypeIn(roleTypes).andAreaid3In(areaid3);
		} else {
			sre.createCriteria().andRoleTypeIn(roleTypes);
		}
		// 默认首页显示 8 个
		sre.setOrderByClause("recommend_time desc LIMIT 50");
		List<SyRole> roles = this.syRoleMapper.selectByExample(sre);
		// 所有被禁用的用户
		List<Integer> members = agentService.memberIds();
		
		for (SyRole syRole : roles) {
			if(!members.contains(syRole.getMemberId())) {
				memberIds.add(syRole.getMemberId());
			}
		}
		return memberIds;
	}

	/**
	 * 获得会员信息
	 * @param memberIds
	 * @return
	 */
	private List<SyMember> agentResult(List<Integer> memberIds){
		SyMemberExample sme = new SyMemberExample();
		sme.createCriteria().andMemberIdIn(memberIds);
		sme.setOrderByClause("member_id  LIMIT 0,12");
		List<SyMember> memberInfo = this.syMemberMapper.selectByExample(sme);
		return memberInfo;
	}
	
	@Override
	public List<AgentBo> agentList (List<Long> areaid3){
		List<AgentBo> result = new ArrayList<AgentBo>();
		List<Integer> memberIds = this.getAgents(areaid3);
		if(ObjectUtils.isEmpty(memberIds)) {
			logger.info("没有获得助理人的memberId");
			throw new CoreServiceException(AgentExcepType.NO_MEMBERIDS,"没有获得助理人的memberId！");
		}
		List<AgentStatsBo> getScore = this.syStoreService.getScore(memberIds);
		if(ObjectUtils.isEmpty(getScore)) {
			logger.info("没有获得该助理人的评分");
			throw new CoreServiceException(AgentExcepType.NO_MEMBERIDS,"没有获得该助理人的评分！");
		}
		List<SyMember> memberInfo = this.agentResult(memberIds);
		for (AgentStatsBo agentStatsBo : getScore) {
			for (SyMember syMember : memberInfo) {
				AgentBo bo = new AgentBo();
				if(syMember.getMemberId().equals(agentStatsBo.getMemberId())) {
					bo.setMemberId(syMember.getMemberId());
					bo.setMemberSex(syMember.getMemberSex());
					bo.setMemberTruename(syMember.getMemberTruename());
					bo.setStoreScore(ObjectUtils.isEmpty(agentStatsBo.getStoreScore()) ? 0.00 : agentStatsBo.getStoreScore());
					bo.setImageUrl(ImageUtil.getUserHeadImgUrl(syMember.getMemberAvatar(), syMember.getMemberSex(), null));
					bo.setTouchUrl("/bocm/index.php?act=goods&op=agent_poor_goods_list&member_id="+syMember.getMemberId());
					result.add(bo);
				}
			}
		}
		
		return result;
}
	
	
		
	
}
