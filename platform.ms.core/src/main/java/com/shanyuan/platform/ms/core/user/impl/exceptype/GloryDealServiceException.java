package com.shanyuan.platform.ms.core.user.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

/**
 * 绑定第三方异常类型
 * @author zhangwd
 *
 */
public interface GloryDealServiceException extends CoreServiceExcepType {

    /**
     * 发送勋章消息中 未支持编码异常
     */
    CoreServiceExcepType UNSUPPORTED_ENCODING = new ExcepType("Unsupported_Encoding_Exception");
}
