package com.shanyuan.platform.ms.core.union;

import java.util.List;

import com.shanyuan.platform.ms.dao.union.entity.SyAreaChannel;

public interface AreaChannelService {
	List<SyAreaChannel> listAreaChannel(String unionChannel, Byte type);
	
	List<SyAreaChannel> listAreaByUnionId(Integer unionId, Byte type);
	
	List<Long> getDistinctAreaId(Byte type);
}
