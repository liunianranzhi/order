package com.shanyuan.platform.ms.base.exception;

import com.netflix.hystrix.exception.HystrixBadRequestException;

/**
 * 2014年12月5日 下午2:44:54
 */


/**
 * @author lee
 *
 */
public class CoreServiceException extends HystrixBadRequestException {
    
    /**
     * 如果需要序列化
     */
    private static final long serialVersionUID = 1L;
    private final CoreServiceExcepType excepType;
 
    
    public CoreServiceException(CoreServiceExcepType excepType) {
    	super("");
        this.excepType = excepType;
    }
    
    public CoreServiceException(String message) {
        super(message);
        this.excepType = CoreServiceExcepType.DEFAULT_TYPE;
    }
    
    /**
     * 创建异常
     * @param msgKey 信息key；建议一个方法中抛出的异常key不一样就可以
     * @param message 信息描述
     */
    public CoreServiceException(CoreServiceExcepType excepType, String message) {
        super(message);
        this.excepType = excepType;
    }
    
    public CoreServiceException(CoreServiceExcepType excepType, String message, 
            Exception ex) {
        super(message, ex);
        this.excepType = excepType;
    }

    public CoreServiceExcepType getExcepType() {
        return excepType;
    }
    
}
