package com.shanyuan.platform.ms.facade.index;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.facade.index.domain.AdDomain;
import com.shanyuan.platform.ms.facade.index.domain.AgreementDomain;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;

/**
 * 首页业务
 * @author yangjian
 * @date 2017/10/31
 *
 */
public interface IndexFacade {
	

	/**
	 * 轮播图及对应按钮
	 * @param channel
	 * @param 2为2倍图，3为3倍图
	 * @param token 用户标识
	 * @param did 设备id
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String, Object> getCommonData(String channel, String type, String token) throws Exception;



	
	/**
	 * 根据渠道获取首页弹窗 by yangjian
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String, Object> getIndexPop(String channel, String token) throws CoreServiceException;
	
	/**
	 * 获取广告
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AdDomain> getAdList(String channel, String token) throws CoreServiceException;
	
	/**
	 * @author caoyongjun
	 * 异步执行查询列表信息
	 * @param memberid
	 * @param channel
	 * @param status
	 * @return
	 * @throws CoreServiceException
	 */
	Future<IndexGoodsDomain> getIndexGoodsListForFuture(Integer memberId, String channel,int status)throws Exception;
	
	/**
	 * 聚合查询优秀主理人 特产馆 大家帮
	 * @param memberid
	 * @param channel
	 * @return
	 */
	public Map<String,Object> getIndexGoods(Integer memberid, String channel);
	
	/**
	 * 获取首页用户协议弹窗
	 * @param token
	 * @return
	 */
	public AgreementDomain getIndexAgreePop(String token) throws CoreServiceException;

	/**
	 * 获取用户真正channel
	 * @param channel
	 * @param token
	 * @return
	 */
	public String getRealChannel(String channel ,String token, String did);
}
