package com.shanyuan.platform.ms.base.common.util;

import org.apache.commons.lang3.RandomUtils;

public class AuthUtils {
	
	/**
	 * 魔术手机验证码
	 */
	public static final  String   MAGIC_MCODE = "791584";
	/**
	 * PC端万能密码
	 */
	public static final  String  MAGIC_MCODE_PC = "26675917";
	
	/**
	 * 生成token方法
	 * @param memberName 用户名
	 * @return
	 */
	public static String generateToken(String memberName) {
		StringBuilder sb = new StringBuilder();
		sb.append(MD5Util.getMD5LowerCase(memberName));
		int nowSeconds = (int) (System.currentTimeMillis()/1000);
		sb.append(nowSeconds);
		sb.append(RandomUtils.nextInt(0, 999999));
		return sb.toString();
	}
	
	public static boolean isMagicCode(String mcode){
		if(MAGIC_MCODE.equalsIgnoreCase(mcode) || MAGIC_MCODE_PC.equalsIgnoreCase(mcode)){
			return true;
		}
		return false;
	}
	
}
