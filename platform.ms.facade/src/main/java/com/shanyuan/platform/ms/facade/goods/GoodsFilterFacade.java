package com.shanyuan.platform.ms.facade.goods;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.facade.goods.domain.AreaFullInfo;
import com.shanyuan.platform.ms.facade.goods.domain.AreaInfo;
import com.shanyuan.platform.ms.facade.goods.domain.GoodsClassInfo;
import com.shanyuan.platform.ms.facade.goods.domain.SupportAreaInfo;

/**
 * 商品筛选
 * @author yangjian
 * @date 2017/11/01
 *
 */
public interface GoodsFilterFacade {
	/**
	 * 
	 * @param parentId
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AreaInfo>  getAreaByPid(Long parentId) throws CoreServiceException;
	
	/**
	 * 获取所有分类
	 * @return 
	 */
	public List<GoodsClassInfo> getGoodsClass() throws CoreServiceException;
	
	/**
	 * 获取所有证书
	 * @return
	 * @throws CoreServiceException
	 */
	public JSONObject getAllCert() throws CoreServiceException;
	
	/**
	 * 获取所有产品销售者类型
	 * @return
	 * @throws CoreServiceException
	 */
	public JSONObject getAllOwnerType() throws CoreServiceException;
	
	/**
	 * 根据省id获取地域信息
	 * @param provinceId 省id
	 * @param deep 查询深度 1：省 2：市 3：区县 4：乡镇 5：村
	 * @return
	 * @throws CoreServiceException
	 */
	public AreaFullInfo getAreaByProvince(Long provinceId, Integer deep) throws CoreServiceException;
	//public AreaFullInfo getAreaByProvince(Long provinceId, Integer deep) throws CoreServiceException;
	
	/**
	 * 获取所有省份
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyAreaFull> getAllProvince() throws CoreServiceException;
	
	/**
	 * 获取当前渠道帮扶省份
	 * @param channel
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SySupportArea> getProvince(String channel) throws CoreServiceException;
	
	/**
	 * 根据渠道获取当前帮扶地区信息
	 * @param channel
	 * @param deep 查询深度 1：省 2：市 3：区县 4：乡镇 5：村
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AreaFullInfo> getAreaByChannel(String channel, Integer deep) throws CoreServiceException;
	
	/**
	 * 根据渠道获取帮扶省市县信息
	 * @param channel
	 * @param token
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SupportAreaInfo> getSupportAreaByChannel(String channel, String token) throws CoreServiceException;
	
	
}
