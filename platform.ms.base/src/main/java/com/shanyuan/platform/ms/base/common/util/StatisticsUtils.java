package com.shanyuan.platform.ms.base.common.util;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 统计工具类
 * @author yangjian
 * @date 2017/12/28
 *
 */
public class StatisticsUtils {
	
	private static volatile  StatisticsUtils statisticsUtils;
	
	private JSONObject circleInfo;
	
	private JSONObject areaInfo;
	
	private List<Integer> memberHasGoods;
	
	private Map<Integer, String> circleChannel;
	
	private Map<Integer, String> poorAssistChannel;
	
	private JSONObject channelUnion;
	
    public JSONObject getAreaInfo() {
		return areaInfo;
	}

	public void setAreaInfo(JSONObject areaInfo) {
		this.areaInfo = areaInfo;
	}
	
	public JSONObject getChannelUnion() {
		return channelUnion;
	}

	public void setChannelUnion(JSONObject channelUnion) {
		this.channelUnion = channelUnion;
	}

	public static StatisticsUtils getStatisticsUtils() {  
           if (statisticsUtils == null) {    
             synchronized (StatisticsUtils.class) {    
                if (statisticsUtils == null) {    
                	statisticsUtils = new StatisticsUtils();   
                }    
             }    
           }   
           return statisticsUtils;  
    }  

	private StatisticsUtils(){
		
	}

	public JSONObject getCircleInfo() {
		return circleInfo;
	}

	public List<Integer> getMemberHasGoods() {
		return memberHasGoods;
	}

	public void setMemberHasGoods(List<Integer> memberHasGoods) {
		this.memberHasGoods = memberHasGoods;
	}
	
	public Map<Integer, String> getCircleChannel() {
		return circleChannel;
	}

	public void setCircleChannel(Map<Integer, String> circleChannel) {
		this.circleChannel = circleChannel;
	}

	public void setCircleInfo(JSONObject circleInfo) {
		this.circleInfo = circleInfo;
	}

	public static void setStatisticsUtils(StatisticsUtils statisticsUtils) {
		StatisticsUtils.statisticsUtils = statisticsUtils;
	}

	public Map<Integer, String> getPoorAssistChannel() {
		return poorAssistChannel;
	}

	public void setPoorAssistChannel(Map<Integer, String> poorAssistChannel) {
		this.poorAssistChannel = poorAssistChannel;
	}
	
}
