package com.shanyuan.platform.ms.base.common.util;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Json工具类
 * @author wang chunru
 *
 */
public class JsonUtils {

	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();
	/**
	 * 将对象转换成json字符串。
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return String
	 * @throws
	 */
	public static String objectToJson(Object data) {
		try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将json结果集转化为对象
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return T
	 * @throws
	 */
	public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
		try {
			T t = MAPPER.readValue(jsonData, beanType);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将json数据转换成pojo对象list
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return List<T>
	 * @throws
	 */
	public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
		JavaType javaType = MAPPER.getTypeFactory().constructParametricType(
				List.class, beanType);
		try {
			List<T> list = MAPPER.readValue(jsonData, javaType);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	/**
	 * 将json数据转换成Map
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return Map<?,?>
	 * @throws
	 */
	public static Map<?, ?> jsonToMap(String jsonData) {
		try {
			Map<?, ?> map = MAPPER.readValue(jsonData, Map.class);
			return map;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	/**
     * map key值去下划线且下划线后第一个字母大写
     * @param oldMap
     * @return
     * @author zhangwd
     */
    public static JSONObject convertProperty(JSONObject jsonObject){
    	JSONObject jsonObj = new JSONObject();
		Set<String> keySet = jsonObject.keySet();
			for (String str : keySet) {
				JSONObject jsonO = new JSONObject();
				JSONObject obj = (JSONObject) jsonObject.get(str);
				Set<String> property = obj.keySet();
				for (String pro : property) {
					String convertStr = convertStr(pro);
					jsonO.fluentPut(convertStr, obj.get(pro));
				}
				jsonObj.fluentPut(str, jsonO);
			}
    	return jsonObj;
    }
    
    /**
     *去下划线且下划线后第一个字母大写
     */
    public static String convertStr(String str) {
    	String newString = null;
		int indexOf = str.indexOf("_"); 
		if (indexOf != -1) {
			String subFirst = str.substring(0, indexOf);
			String substring = str.substring(indexOf + 2);
			char at = str.charAt(indexOf + 1);
			String newStr = subFirst + StringUtils.upperCase(at + "") + substring;
			//判断有没有
			newString = convertStr(newStr);
			str = newString;
		}
    	String[] split = str.split("_");
    	for (int i = 1; i < split.length; i++) {
			//StringUtils.upperCase(newString)
			
		}
		return str;
    }
    /**
     * null置换为""
     */
    public static ValueFilter filter = new ValueFilter() {
	    @Override
	    public Object process(Object obj, String s, Object v) {
		    if(v==null)
		        return "";
		    return v;
	    }
	};
}
