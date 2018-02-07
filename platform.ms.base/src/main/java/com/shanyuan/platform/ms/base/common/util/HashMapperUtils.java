package com.shanyuan.platform.ms.base.common.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.hash.BeanUtilsHashMapper;
import org.springframework.data.redis.hash.DecoratingStringHashMapper;
import org.springframework.data.redis.hash.HashMapper;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * javaBean 转 map
 * 修改原生HashMapper 中 将object类也转成hash值
 * @author zhangwd
 * @param <T>
 * @param <K>
 * @param <V>
 */
public class HashMapperUtils<T, K, V> implements HashMapper<T, K, V> {

	private HashMapper<T, K, V> mapper;

    public HashMapperUtils(HashMapper<T, K, V> mapper) {
        this.mapper = mapper;
    }

    @Override
    public Map<K, V> toHash(T obj) {
        Map<K, V> map = mapper.toHash(obj);
        // 去掉Object类中的class属性生成的key/value
        map.remove("class");
        return map;
    }

    @Override
    public T fromHash(Map<K, V> map) {
        return mapper.fromHash(map);
    }

    @SuppressWarnings("unchecked")
	public static <T, K, V> HashMapperUtils<T, K, V> getInstance(Class<T> tClazz, Class<K> kClazz, Class<V> vClazz) {
    	
        return new HashMapperUtils<T, K, V>((HashMapper<T, K, V>) new DecoratingStringHashMapper<T>( new BeanUtilsHashMapper<T>(tClazz)));
    }
//    使用方法：
//    // 声明
//    private final HashMapperUtils<Bean, String, Object> mapper = HashMapperUtils.getInstance(Bean.class, String.class, Object.class);
//   
//    mapper.toHash(Bean);
   
}
