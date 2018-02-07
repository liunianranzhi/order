package com.shanyuan.platform.ms.base.common.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import de.ailis.pherialize.Mixed;
import de.ailis.pherialize.Pherialize;

public class SerializeUtil {
	/**
	 * 获得单位的反序列化
	 * @param spec
	 * @return
	 */
	public static String getSpecUnSerialize(String spec){
		String nspec="";
		if(!ObjectUtils.isEmpty(spec)) {
			Mixed unserialize = Pherialize.unserialize(spec);
			if(!ObjectUtils.isEmpty(unserialize)) {
				 String string = unserialize.toString();
				 string =string.replaceAll("}", "");
				 String[] array = string.split(",");
				 for(int i=0;i<array.length;i++) {
					 String object = array[i];
					 if(!ObjectUtils.isEmpty(object)) {
						 String[] split = object.split("=");
						 if(i==0&&split.length>1) {
							 nspec +="每" + split[1] ;
						 }else if(split.length>1) {
							 nspec += split[1];
						 }
					 }
				 }
			}
		}
		
		return nspec;
	}
	public static Map<String,String> specUnitUnSerialize(String spec){
		Map<String,String> nspecUnit=new HashMap<String,String>();
		String nspec="";
		String nunit="";
		if(!ObjectUtils.isEmpty(spec)) {
			Mixed unserialize = Pherialize.unserialize(spec);
			if(!ObjectUtils.isEmpty(unserialize)) {
				 String string = unserialize.toString();
				 string =string.replaceAll("}", "");
				 String[] array = string.split(",");
				 for(int i=0;i<array.length;i++) {
					 String object = array[i];
					 if(!ObjectUtils.isEmpty(object)) {
						 String[] split = object.split("=");
						 if(i==0&&split.length>1) {
							 nspec = split[1] ;
						 }else if(split.length>1) {
							 nunit += split[1];
						 }
					 }
				 }
			}
		}
		nspecUnit.put("spec", nspec);
		nspecUnit.put("unit", nunit);
		return nspecUnit;
	}
	public static void main(String[] args) {
		String str="a:3:{i:1243;s:3:\"箱\";i:1256;s:2:\"11\";i:1253;s:1:\"g\";}";
		//String str="";
		System.out.println("===="+specUnitUnSerialize(str));
	}
}
