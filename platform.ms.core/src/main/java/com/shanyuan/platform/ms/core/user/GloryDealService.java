package com.shanyuan.platform.ms.core.user;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyGloryTypeList;

/**
 * 勋章处理接口
 * @author zhangwd
 *
 */
public interface GloryDealService {

	/**
	 * 勋章检查
	 * @param memberId
	 * @throws CoreServiceException
	 */
	void checkGlory(Integer memberId) throws CoreServiceException;

	/**
	 * 发送积分消息
	 * @param memberId
	 */
	void sendMessageForGlory(Integer memberId) throws CoreServiceException;
	
	/**
	 * 获取所有勋章列表
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return List<SyGloryTypeList>
	 * @throws
	 */
	List<SyGloryTypeList> getAllGloryTypeList(Integer onlineState) throws CoreServiceException;
	/**
	 * 删除勋章
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	int deleteGlory(Integer gloryId) throws CoreServiceException;
	/**
	 * 添加勋章
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	int saveGlory(SyGloryTypeList glory);
	/**
	 * 更新勋章
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return int
	 * @throws
	 */
	int updateGlory(SyGloryTypeList glory);
}
