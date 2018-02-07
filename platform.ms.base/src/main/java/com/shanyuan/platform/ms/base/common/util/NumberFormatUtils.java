package com.shanyuan.platform.ms.base.common.util;

import java.math.BigDecimal;
import java.text.NumberFormat;

import org.springframework.util.ObjectUtils;

/**
 * @author 曹勇军
 *
 */
public class NumberFormatUtils {

	//留着小数点   11111 ==》 11111.00
	public static String getBigDecimalFormatString(Object number){
		if(ObjectUtils.isEmpty(number)){
			return "0.00";
			
		}
		NumberFormat format = NumberFormat.getInstance();
		format.setMinimumFractionDigits(3);
		format.setMaximumFractionDigits(2);
		return format.format(number);
	}
	//积分没有两位数
	public static String getFormatString(Object number){
		if(ObjectUtils.isEmpty(number)){
			return "0";
		}
		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(2);
		return format.format(number);
	}
	
	public static void main(String[] args) {
		System.out.println(getFormatString(new Long(12321312L)));
		System.out.println(getBigDecimalFormatString(new BigDecimal("12321312")));
	}
}
