package com.shanyuan.platform.ms.core.store;

import java.math.BigDecimal;
import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.AgentBo;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;

public interface AgentService {
	
	/**
	 * 优秀助理人
	 * @param areaid3
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AgentBo> getAgentList(List<Long> areaid3) throws CoreServiceException ;
	
	
	
	/**
	 * 助理人
	 * @author sunyue
	 * @param areaid3
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AgentBo> getAgentListNew(List<Long> areaid3) throws CoreServiceException ;
	
	
	/**
	 * 助理人  从php redis 中取
	 * @author sunyue
	 * @param areaid3
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AgentBo> getNewAgentList(Integer memberId, String channel) throws CoreServiceException ;
	
	/**
	 * 处理助理人信息
	 * @param areaIds3
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AgentBo> getAgentInfo (List<Long> areaIds3) throws CoreServiceException;
	
	/**
	 * 获得县
	 * @param memberId
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public List<Long> getAreaids (Integer memberId, String channel) throws CoreServiceException;
	
	/**
	 * 所有被冻结的账户id  by sunyue
	 * @return memberid
	 */
	public List<Integer> memberIds() throws CoreServiceException;
	/**
	 * 得到店铺评价分数  by sunyue
	 * @param memberId
	 * @return BigDecimal
	 */
	public BigDecimal getStoreScores(Integer memberId) throws CoreServiceException;
	/**
	 * 统计助理人统计信息
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	public void agentStatsTask();
	
	
	//public List<Integer> getAgents(List<Long> areaid3) throws CoreServiceException;
	
	/**
	 * 分开查询优秀主理人
	 * @param areaid3
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AgentBo> agentList (List<Long> areaid3) throws CoreServiceException;
	

}

