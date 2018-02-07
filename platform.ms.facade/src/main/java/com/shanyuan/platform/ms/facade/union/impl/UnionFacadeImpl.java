package com.shanyuan.platform.ms.facade.union.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.core.constant.IndexConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.constant.UserConstant.UnionType;
import com.shanyuan.platform.ms.core.union.UnionService;
import com.shanyuan.platform.ms.core.union.bo.UnionBo;
import com.shanyuan.platform.ms.core.user.SyPoorService;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.union.entity.SyUnion;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.facade.constant.UserFacadeConstant.HomePageTitle;
import com.shanyuan.platform.ms.facade.union.UnionFacade;

/**
 * @author zhangwd
 */
@Component
public class UnionFacadeImpl implements UnionFacade {
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private UnionService unionService;

	@Autowired
	private SyPoorService syPoorService;

	@Autowired
	private UserCorrelationService userCorrelationService;

	@Override
	public Map<String, Object> getStatisticsToHomePage(String channel) throws Exception {
		
		List<Object> topDataList = new LinkedList<>();
		//注册人数
		Integer memberCount = unionService.getMemberCountWithoutPoor();
		//捐赠 和 义卖 总金额
		Integer donationAmount = unionService.getPlatformDonationAmount();
		//订单总金额
		Integer orderAmount = unionService.getOrderAmount();
		//排行榜数据
		Map<String, Object> unionTopList = unionService.getUnionTopList(channel);
		
		topDataList.add(memberCount.toString()); //公益人士
		topDataList.add(donationAmount.toString()); //公益捐赠
		topDataList.add(orderAmount.toString());	//公益消费
		
		//Top 图片
		String topImg = ImageUtil.php_point + "/data/resource/images/1/index/top_default_v1.png";
		if(IndexConstant.Channels.CHNL_ID_APP_GD.equalsIgnoreCase(channel)){
			topImg = ImageUtil.php_point + "/data/resource/images/1/index/top_gd.png";
		}else if(IndexConstant.Channels.SHANXI1.equalsIgnoreCase(channel)){
			topImg = ImageUtil.php_point + "/data/resource/images/1/index/top_shanxi2.png";
		}
		
		//TOP联盟信息  --- 不同联盟显示不同信息  2017/11/28
		String topTitle = HomePageTitle.TOP_TITLE;
		if(!ObjectUtils.isEmpty(channel) && !ObjectUtils.nullSafeEquals(channel, UnionType.YKJLB)) {
			SyUnion union = unionService.getUnionByUnionChannel(channel);
			if (!ObjectUtils.isEmpty(union) && !ObjectUtils.isEmpty(union.getUnionName())) {
				topTitle = union.getUnionName();
			}
		}
		unionTopList.put("topTitle", topTitle);
		unionTopList.put("topImg", topImg); //首页头部图片
		unionTopList.put("topDataList", topDataList); //首页头部三个数据值
		unionTopList.put("unionMoreUrl", UnionConstant.UnionUrl.UNION_MORE_URL ); //更多联盟url
		
		return unionTopList;
	}
	
	@Override
	public String getChannelByMemberId(Integer memberId) {
		SyCircleMember circleMember = unionService.getSyCircleMemberByMemberId(memberId);
		//圈子用户
		if (!ObjectUtils.isEmpty(circleMember)) {
			return circleMember.getCode();
		}else{ //贫困户
			SyPoor poor = syPoorService.getSyPoorByMemberId(memberId);
			if (!ObjectUtils.isEmpty(poor)){
				return poor.getChannel();
			}else{ //助理人
				SyRole role = userCorrelationService.getRoleAgent(memberId);
				if (!ObjectUtils.isEmpty(role)){
					return  role.getChannel();
				}
			}
		}
		return null;
	}
	
	@Override
	public Map<String, Object> selectUnion() {
		
		HashMap<String, Object> unionMap = new HashMap<>();
		//联盟推荐查询固定2个联盟,不限制union_type
		List<UnionBo> unionList1 = unionService.selectUnion(null, null, 2);
		//企业联盟
		List<UnionBo> unionList2 = unionService.selectUnion(UnionConstant.UnionType.ENTERPRISE_UNION, 2, 4);
		//政府联盟
		List<UnionBo> unionList3 = unionService.selectUnion( UnionConstant.UnionType.GOVERNMENT_UNION, 2, 4);
		unionMap.put("recomUnionList", unionList1);
		unionMap.put("enterpUnionList", unionList2);
		unionMap.put("governUnionList", unionList3);
		return unionMap;
	}
	
	@Override
	public List<UnionBo> selectGovenUnionMore() {

		List<UnionBo> unionBos = unionService.selectUnion(UnionConstant.UnionType.GOVERNMENT_UNION,null, null);
		return unionBos;
	}
	
	@Override
	public List<UnionBo> selectEnterpUnionMore() {
		
		List<UnionBo> unionBos = unionService.selectUnion(UnionConstant.UnionType.ENTERPRISE_UNION, null, null);
		return unionBos;
	}
}
