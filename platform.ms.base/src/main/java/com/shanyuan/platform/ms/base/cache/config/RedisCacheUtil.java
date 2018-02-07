package com.shanyuan.platform.ms.base.cache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author lee
 *  生成redis 缓存时工具
 */
@Component
public class RedisCacheUtil {

    @Autowired
    private StringRedisTemplate redisTemplate;
    
    
    public boolean generateCacheAble(String key,long waitMs) {
        
        return false ;
    }
    
    
    
    
}
