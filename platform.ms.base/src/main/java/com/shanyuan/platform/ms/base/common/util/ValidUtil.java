package com.shanyuan.platform.ms.base.common.util;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class ValidUtil {

	/**
	 * 电话号码校验
	 * @param phone
	 * @return
	 */
	public static boolean validPhone(String phone ) {
		if(!ObjectUtils.isEmpty(phone)) {
			Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9])|(17[0-9])|(19[8-9])|(166)|(14[0-9]))\\d{8}$");
			Matcher m = p.matcher(phone);
			return m.matches(); 
		}else {
			return false;
		}
		
	}
	
	/**
	 * 处理用户手机号显示
	 * @param mobile
	 * @return
	 */
	public static String getUserDispMobile(String mobile) {
		return mobile.substring(0, 3)+"**"+mobile.substring(mobile.length()-4);
	}

	/**
	 * 邀请码校验
	 * @param inviteCode
	 * @return
	 */
	public static boolean validInviteCode(String inviteCode){
		if(StringUtils.isEmpty(inviteCode)){
			return false;
		}
		String[] inviteInfo = inviteCode.split("-");
		if(inviteInfo.length != 2){
			return false;
		}
		if(StringUtils.isEmpty(inviteInfo[0]) || StringUtils.isEmpty(inviteInfo[1])){
			return false;
		}
		return true;
	}



//	public static void main(String[] args){
//		Set<String> keys= new HashSet<String>();
//        Set<String> passwd= new HashSet<String>();
//        while(keys.size()<1500){
//            StringBuilder sb = new StringBuilder();
////            sb.append( RandomUtils.nextInt(100,999)) ;
////            sb.append(RandomUtils.nextInt(100,999)) ;
////            sb.append(RandomUtils.nextInt(100000,999999));
//            String abc = "ABCDEFGHIZKLMNOPQRSTUVWXYZ";
//            sb.append( abc.charAt(RandomUtils.nextInt(1,25)));
//            sb.append( abc.charAt(RandomUtils.nextInt(1,25)));
//            sb.append( abc.charAt(RandomUtils.nextInt(1,25)));
//            sb.append(RandomUtils.nextInt(1000000,9999999));
//            sb.append( abc.charAt(RandomUtils.nextInt(1,25)));
//            sb.append( abc.charAt(RandomUtils.nextInt(1,25)));
//
//            keys.add(sb.toString());
//        }
//        for(String str : keys ){
//            System.out.println(str);
//        }
//	}
}
