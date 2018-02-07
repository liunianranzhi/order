package com.shanyuan.platform.ms.base.cache.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.shanyuan.platform.ms.base.cache.serializer.FastJson2JsonRedisSerializer;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;

import redis.clients.jedis.JedisPoolConfig;


@Configuration
@EnableCaching
public class RedisConfig  extends CachingConfigurerSupport{

//    @Value("${spring.redis.host}")
//    private String host;
//    @Value("${spring.redis.port}")
//    private int port;
//    @Value("${spring.redis.timeout}")
//    private int timeout;
    
    //自定义缓存key生成策略
//    @Bean
//    public KeyGenerator keyGenerator() {
//        return new KeyGenerator(){
//            @Override
//            public Object generate(Object target, java.lang.reflect.Method method, Object... params) {
//                StringBuffer sb = new StringBuffer();
//                sb.append(target.getClass().getName());
//                sb.append(method.getName());
//                for(Object obj:params){
//                    sb.append(obj.toString());
//                }
//                return sb.toString();
//            }
//        };
//    }
    //缓存管理器
    @Bean 
    public CacheManager cacheManager(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate) {
    	RedisConnectionFactory factory = redisTemplate.getConnectionFactory();
    	 RedisCacheManager cacheManager = null;
    	if(factory instanceof JedisConnectionFactory) {
    		JedisConnectionFactory jcf = (JedisConnectionFactory) factory;
    		JedisPoolConfig npc = (JedisPoolConfig) jcf.getPoolConfig().clone();
    		JedisConnectionFactory njcf= new JedisConnectionFactory(npc);
    		njcf.setHostName(jcf.getHostName());
    		njcf.setPort(jcf.getPort());
    		njcf.setPassword(jcf.getPassword());
    		njcf.setTimeout(jcf.getTimeout());
    		njcf.setDatabase(0); 
    		njcf.setUsePool(true);
    		njcf.afterPropertiesSet();
    		@SuppressWarnings("rawtypes")
			RedisTemplate ntemplate = new StringRedisTemplate(njcf);
    		  setSerializer(ntemplate);//设置序列化工具
    		  ntemplate.afterPropertiesSet();
    		  cacheManager = new RedisCacheManager(ntemplate);
    	}
    	 if(cacheManager==null) {
    		  cacheManager = new RedisCacheManager(redisTemplate);
    	 }
    	  
      
        //设置缓存过期时间 
        cacheManager.setDefaultExpiration(30);
        //针对key单独设置过期时间
        Map<String, Long> expireMap = new HashMap<String, Long>();
        expireMap.put(CommonRedisKey.IndexRedisKey.INDEX_AD_LIST, 5 * 60L);
        expireMap.put(CommonRedisKey.IndexRedisKey.INDEX_FOCUS_LIST, 5 * 60L);
        expireMap.put(CommonRedisKey.GoodsFilterRedisKey.DACS_SUPPORT_AREA_LIST, 24 * 60 * 60L);
        expireMap.put(CommonRedisKey.IndexRedisKey.INDEX_HELP_GOODS, 6 * 60 * 60L);
        expireMap.put(CommonRedisKey.IndexRedisKey.INDEX_SPECIAL_GOODS, 30 * 60L);
        expireMap.put(CommonRedisKey.IndexRedisKey.INDEX_UNIONITEM_GOODS, 6 * 60 * 60L);
        expireMap.put(CommonRedisKey.BizGoodsClass.BIZ_GOODS_CLASS_SET, 6 * 60 * 60L);
        expireMap.put(CommonRedisKey.GoodsFilterRedisKey.DACS_GOODS_CLASS_SET, 6 * 60 * 60L);
        expireMap.put(CommonRedisKey.GoodsFilterRedisKey.DACS_SUPPORT_AREA_LIST, 6 * 60 * 60L);
        expireMap.put(CommonRedisKey.GoodsClass.GOODS_CLASS_SET, 6 * 60 * 60L);
        expireMap.put(CommonRedisKey.OpenSearchKey.OPEN_SEARCH_LIST, 5 * 60L);
        expireMap.put(CommonRedisKey.OrderStatistics.STATISTICS_ORDER_MEMBER_CIRCLE_SET, 12 * 60 * 60L);
        expireMap.put(CommonRedisKey.MemberChannel.MEMBER_CHANNEL_SET, 12 * 60 * 60L);
        expireMap.put(CommonRedisKey.OrderStatistics.STATISTICS_BIZ_ORDER_SET, 6 * 60 * 60L);
        expireMap.put(CommonRedisKey.OrderStatistics.STATISTICS_BIZ_ORDER_GOODS_SET, 6 * 60 * 60L);
        cacheManager.setExpires(expireMap);
        return cacheManager;
    }
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory){
    	if(factory instanceof JedisConnectionFactory) {
    		JedisConnectionFactory jcf = (JedisConnectionFactory) factory;
    		jcf.setDatabase(3);
    	}
        StringRedisTemplate template = new StringRedisTemplate(factory);
        setSerializer(template);//设置序列化工具
        template.afterPropertiesSet();
        return template;
    }
     private void setSerializer(RedisTemplate template){
    	 FastJson2JsonRedisSerializer<Object> fastJsonRedisSerializer = new FastJson2JsonRedisSerializer(Object.class);
         template.setValueSerializer(fastJsonRedisSerializer);
         template.setKeySerializer(new StringRedisSerializer());
     }
}