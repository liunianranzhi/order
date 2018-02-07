package com.shanyuan.platform.ms.facade.union;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.union.bo.UnionBo;

public interface UnionFacade {
	
	/**
	 * 首页top统计数据 和 联盟排行榜数据
	 * @param channel  用户当前的通道
	 * @return
	 * @author zhangwd
	 */
	Map<String, Object> getStatisticsToHomePage(String channel) throws Exception;

	/**
	 * 通过用户id 获取用户所在的通道
	 * @param memberId 用户ID
	 * @return
	 * @author zhangwd
	 */
	String getChannelByMemberId(Integer memberId);

	/**
	 * 首页选择联盟
	 * @author zhangwd
	 */
	Map<String, Object> selectUnion();

	/**
	 * 政府联盟更多
	 * @author zhangwd
	 */
	List<UnionBo> selectGovenUnionMore();

	/**
	 * 企业联盟更多
	 * @return
	 * @author zhangwd
	 */
	List<UnionBo> selectEnterpUnionMore();
}
