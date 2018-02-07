package com.shanyuan.platform.ms.base.common.util;

import java.util.Random;

/**
 * 验证码生成工具
 * @author yangjian
 *
 */
public class GeneratorUtil {
	
	public static String generateImgText(){
		String str="abcdefghgkmnpqrstuvwxyzABCDEFGHGKMNPQRSTUVWXYZ23456789";
        Random r=new Random();
        String arr[]=new String [4];
        String b="";
        for(int i=0;i<4;i++){
            int n=r.nextInt(53);
            arr[i]=str.substring(n,n+1);
            b+=arr[i];
        }
        return b;
	}
	
	public static void main(String[] args) {
		System.out.println(generateImgText());
	}

}
