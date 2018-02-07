package com.shanyuan.platform.ms.base.common.util;

import java.util.ArrayList;
import java.util.List;

public class PointsUtils {
	
	static List<Long> tags = new ArrayList<>();
	
	static {
		tags.add(0L);
		tags.add(100L);
		tags.add(200L);
		tags.add(300L);
		tags.add(500L);
		tags.add(1000L);
		tags.add(2000L);
		tags.add(3000L);
		tags.add(4000L);
		tags.add(5000L);
		tags.add(6000L);
		tags.add(7000L);
		tags.add(8000L);
		tags.add(9000L);
		tags.add(10000L);
		tags.add(20000L);
		tags.add(30000L);
		tags.add(40000L);
		tags.add(50000L);
		tags.add(60000L);
		tags.add(70000L);
		tags.add(80000L);
		tags.add(90000L);
		tags.add(100000L);
		tags.add(200000L);
		tags.add(300000L);
		tags.add(400000L);
		tags.add(500000L);
		tags.add(600000L);
		tags.add(700000L);
		tags.add(800000L);
		tags.add(900000L);
		tags.add(1000000L);
		tags.add(2000000L);
		tags.add(3000000L);
		tags.add(4000000L);
		tags.add(5000000L);
	}

	public static Long getPointSection(Long points) {
		if(points==0) {
			return 0L;
		}else if(points <=100) {
			return 100L;
		}else if(points <=200) {
			return 200L;
		}else if(points<=300) {
			return 300L;
		}else if(points<=500) {
			return 500L;
		}else if(points<=1000) {
			return 1000L;
		}else if(points<=2000) {
			return 2000L;
		}else if(points<=3000) {
			return 3000L;
		}else if(points<=4000) {
			return 4000L;
		}else if(points<=5000) {
			return 5000L;
		}else if(points<=6000) {
			return 6000L;
		}else if(points<=7000) {
			return 7000L;
		}else if(points<=8000) {
			return 8000L;
		}else if(points<=9000) {
			return 9000L;
		}else if(points<=10000) {
			return 10000L;
		}else if(points<=20000) {
			return 20000L;
		}else if(points<=30000) {
			return 30000L;
		}else if(points<=40000) {
			return 40000L;
		}else if(points<=50000) {
			return 50000L;
		}else if(points<=60000) {
			return 60000L;
		}else if(points<=70000) {
			return 70000L;
		}else if(points<=80000) {
			return 80000L;
		}else if(points<=90000) {
			return 90000L;
		}else if(points<=100000) {
			return 100000L;
		}else if(points<=200000) {
			return 200000L;
		}else if(points<=300000) {
			return 300000L;
		}else if(points<=400000) {
			return 400000L;
		}else if(points<=500000) {
			return 500000L;
		}else if(points<=600000) {
			return 600000L;
		}else if(points<=700000) {
			return 700000L;
		}else if(points<=800000) {
			return 800000L;
		}else if(points<=900000) {
			return 900000L;
		}else if(points<=1000000) {
			return 1000000L;
		}else if(points<=2000000) {
			return 2000000L;
		}else if(points<=3000000) {
			return 3000000L;
		}else if(points<=4000000) {
			return 4000000L;
		}else if(points<=5000000) {
			return 5000000L;
		}else {
			return 0L;
		}
		
	}

	public static List<Long> getTags() {
		return tags;
	}

}
