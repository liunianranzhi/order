package com.shanyuan.platform.ms.facade.order;

import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;

public interface OrderParseException {
	CommonVO parseException(CoreServiceException e);
}
