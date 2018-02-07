package com.shanyuan.platform.ms.core.user;

import java.util.List;

import com.shanyuan.platform.ms.dao.user.entity.SyManagerBoc;


public interface ManagerBocService {
	
	List<SyManagerBoc> selectManagerBoc(Integer memberId);

}
