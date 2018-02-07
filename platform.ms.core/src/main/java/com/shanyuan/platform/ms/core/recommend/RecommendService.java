package com.shanyuan.platform.ms.core.recommend;

import java.util.List;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.recommend.entity.RecommendGoodsBo;
import com.shanyuan.platform.ms.dao.recommend.entity.SyRecommend;

/**
 * 推荐系统项目
 * @author yangjian
 * @date 2017/10/31
 *
 */
public interface RecommendService {

	/**
	 * 根据渠道和分类获取项目
	 * @param channel  
	 * @param type
	 * @return
	 */
	public List<SyRecommend> getRecommend(String channel, String type, Integer parentId) throws CoreServiceException;
	
	/**
	 * 获取广告列表
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyRecommend> getAdList(String channel) throws CoreServiceException;

	/**
	 * 根据集采模板查询集采推荐商品
	 * @param recId  推荐系统项目id
	 * @param status 推荐系统项目状态   0：不可用，1：可用
	 * @return 
	 * @author zhangwd
	 */
	public List<RecommendGoodsBo> getRecommendGoodsByBizModule(Integer recId, Byte status) throws CoreServiceException;
	
}
