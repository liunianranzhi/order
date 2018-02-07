package com.shanyuan.platform.ms.core.user;


import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyIndexPop;

/**
 * 首页弹窗
 * @author yangjian
 * @date 2017/11/16
 *
 */
public interface IndexPopService {
	
	public SyIndexPop getIndexPopByChannel(String channel) throws CoreServiceException;

}
