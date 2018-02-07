package com.shanyuan.platform.ms.core.union;

import java.util.List;

import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemAgent;

public interface UnionItemAgentService {
	List<SyUnionItemAgent> selectSyUnionItemAgentByUnionId(Integer unionId);
}
