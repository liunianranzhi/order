package com.shanyuan.platform.ms.base.common.util;

import org.springframework.util.ObjectUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/** 
 * 说明：日期处理
 * 创建人：BY ZY
 * 修改时间：2017年8月24日
 * @version
 */
public class DateUtil {
	
    /**
     * 获得拼接的时间
     * @auther zy
     * @param time
     * @return
     */
    public static Long getLongTimes(String time) {
	    if(ObjectUtils.isEmpty(time)){
	        return null;
        }
        String a=getDay();
        Long  now=0L;
        try {
            DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            now = fmt.parse(a+" "+time).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        return now;
    }
	/**
	 * 获取YYYY格式
	 * @return
	 */
	public static String getSdfTimes() {
		SimpleDateFormat sdfTimes = new SimpleDateFormat("yyyyMMddHHmmss");
		 long currentTimeMillis = System.currentTimeMillis();
		 Date date = new Date(currentTimeMillis);
		return sdfTimes.format(date);
	}
	public static Date getNowDate() {
		long currentTimeMillis = System.currentTimeMillis();
		return new Date(currentTimeMillis);
	}
	/**
	 * 由long 转为yyyy-MM-dd HH:mm:ss 
	 * @return
	 */
	public static String getIntegerToSdf(Long time) {
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdfTime.format(new Date(time*1000));
	}
	/**
	 * 由long yyyy/MM/dd 
	 * @return
	 */
	public static String getIntegerToSTime(Long time) {
		SimpleDateFormat sTimes = new SimpleDateFormat("yyyy/MM/dd");
		return sTimes.format(new Date(time*1000));
	}
	/**
	 * 由long 转为yyyy-MM-dd 
	 * @return
	 */
	public static String getIntegerToNyr(Long time) {
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
		return sdfDay.format(new Date(time*1000));
	}
	/**
	 * 由long 转为yyyy.MM.dd
	 * @return
	 */
	public static String getIntegerNyr(Long time) {
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy.MM.dd");
		return sdfDay.format(new Date(time*1000));
	}
	
	/**
	 * 由10位秒数转年月
	 * @param time
	 * @return
	 */
	public static String getIntegerYearMonth(Integer time){
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyyMM");
		return sdfDay.format(new Date(time*1000L));
	}
	
	/**
	 * 由10位秒数转年月日
	 * @param time
	 * @return
	 */
	public static String getIntegerYearMonthDay(Integer time){
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyyMMdd");
		return sdfDay.format(new Date(time*1000L));
	}
	
	/**
	 * 由10位秒数转年月日
	 * @param time
	 * @return
	 */
	public static String getIntegerYearMonthDay(){
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyyMMdd");
		return sdfDay.format(new Date(System.currentTimeMillis()));
	}
	
	/**
	 * 由long  当前时间
	 * @return
	 */
	public static long getNowLong() {
		return System.currentTimeMillis()/1000;
	}

	public static int getNowInt() { 
	    return (int) (System.currentTimeMillis()/1000);
	}

	/**
	 * 获取YYYY格式
	 * @return
	 */
	public static String getYear() {
		SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
		return sdfYear.format(getNowDate());
	}

	/**
	 * 获取YYYY-MM-DD格式
	 * @return
	 */
	public static String getDay() {
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
		return sdfDay.format(getNowDate());
	}
	
	/**
	 * 获取YYYYMMDD格式
	 * @return
	 */
	public static String getDays(){
		SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");
		return sdfDays.format(getNowDate());
	}

	/**
	 * 获取YYYY-MM-DD HH:mm:ss格式
	 * @return
	 */
	public static String getTime() {
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdfTime.format(getNowDate());
	}

	/**
	* @Title: compareDate
	* @Description: TODO(日期比较，如果s>=e 返回true 否则返回false)
	* @param s
	* @param e
	* @return boolean  
	* @throws
	* @author fh
	 */
	public static boolean compareDate(String s, String e) {
		if(fomatDate(s)==null||fomatDate(e)==null){
			return false;
		}
		return fomatDate(s).getTime() >fomatDate(e).getTime();
	}

	/**
	 * 格式化日期
	 * @return
	 */
	public static Date fomatDate(String date) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return fmt.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 格式日期时分秒
	 * @return
	 */

	/**
	 * 校验日期是否合法
	 * @return
	 */
	public static boolean isValidDate(String s) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fmt.parse(s);
			return true;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return false;
		}
	}
	
	/**
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static int getDiffYear(String startTime,String endTime) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//long aa=0;
			int years=(int) (((fmt.parse(endTime).getTime()-fmt.parse(startTime).getTime())/ (1000 * 60 * 60 * 24))/365);
			return years;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return 0;
		}
	}
	 
	/**
     * <li>功能描述：时间相减得到天数
     * @param beginDateStr
     * @param endDateStr
     * @return
     * long 
     * @author Administrator
     */
    public static long getDaySub(String beginDateStr,String endDateStr){
        long day=0;
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date beginDate = null;
        java.util.Date endDate = null;
        
            try {
				beginDate = format.parse(beginDateStr);
				endDate= format.parse(endDateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
            day=(endDate.getTime()-beginDate.getTime())/(24*60*60*1000);
            //System.out.println("相隔的天数="+day);
      
        return day;
    }
    /**
     * 得到n天之后的日期1
     * @param days
     * @return
     */
    public static String getAfterDayDate1(String days) {
    	int daysInt = Integer.parseInt(days);
    	
        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();
        
        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdfd.format(date);
        
        return dateStr;
    }
    /**
     * 得到n天之后的日期
     * @param days
     * @return
     */
    public static String getAfterDayDate(String days) {
    	
    	int daysInt = Integer.parseInt(days);
    	
        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();
        
        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdfd.format(date);
        
        return dateStr;
    }
    
    /**
     * 得到n天之后是周几
     * @param days
     * @return
     */
    public static String getAfterDayWeek(String days) {
    	int daysInt = Integer.parseInt(days);
        Calendar canlendar = Calendar.getInstance(); // java.util包
        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
        Date date = canlendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E");
        String dateStr = sdf.format(date);
        return dateStr;
    }
   /**
    * 
    * @param start 减数
    * @param end 被减数
    * @param days 当前与某个时间相差天数
    * @return
    */
    public static boolean checkIsOutTime(long start ,long now,Integer days) {
    	String eday=getDay();
    	
    	boolean flag=false;
    	if(now!=0) {
    		eday=getIntegerToNyr(now);
    	}
    	if(start !=0) {
    		String sday=getIntegerToNyr(start);
    		if(getDaySub(sday,eday)>days) {
    			flag=true;
    		}
    	}
    	return flag;
    }
    /**
     * 
     * @param start 减数
     * @param end 被减数 数据库是秒
     * @param days 相减得到的天数
     * @return
     */
    public static Integer getSubDays(long start ,long now) {
    	if(now ==0) {
    		now=getNowLong();//1504337048-1494235952
    	}
    	double day=(now-start)/86400.00;
    	Integer days=0;
    	days=(int)Math.ceil(day);
    	return days;
    }
    /**
     * 获取当日0点的时间戳
     * @Author wang chunru
     * @Description 
     * @param 
     * @return long
     * @throws
     */
    public static long getZeroTime(){
    	long current = System.currentTimeMillis();
        long zero = current/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault().getRawOffset();
    	return zero/1000;
    }
    
    /**
     * 获取今天00:00:00时间
     * @return
     */
    public static Integer getStartTimeOfDay(){
    	return getStartTimeOfDay(new Date());
    }
    
    /**
     * 获取今天23:59:59时间
     * @return
     */
    public static Integer getEndTimeOfDay(){
    	return getEndTimeOfDay(new Date());
    }
    
    /**
     * 获取传入日期的00:00:00时间
     * @param date
     * @return
     */
    public static Integer getStartTimeOfDay(Date date){
    	Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Date start = calendar.getTime();
		return (int) (start.getTime()/1000);
    }
    
    /**
     * 获取传入日期的23:59:59时间
     * @param date
     * @return
     */
    public static Integer getEndTimeOfDay(Date date){
    	Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
	    calendar.add(Calendar.SECOND, -1);
	    Date end = calendar.getTime();
	    return (int) (end.getTime()/1000);
    }
    
    /**
     * 获取前一天日期
     * @param date
     * @return
     */
    public static Date getAfterDate(Date date){
    	Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
	    Date end = calendar.getTime();
	    return end;
    }
    
    /**
     * 获取后一天日期
     * @param date
     * @return
     */
    public static Date getBeforeDate(Date date){
    	Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, -1);
		Date start = calendar.getTime();
		return start;
    }
    
    /**
     * 获取后一天日期
     * @return
     */
    public static Date getAfterDate(){
    	return getAfterDate(new Date());
    }
    
    /**
     * 获取前一天日期
     * @return
     */
    public static Date getBeforeDate(){
    	return getBeforeDate(new Date());
    }
    
    private static String getYearMonth(Date date){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
    	String format = sdf.format(date);
    	return format;
    }
    
    /**
     * 获取几个月后或几个月前yyyyMM格式日期
     * @param time
     * @return
     */
    public static String getLaterMonth(Integer time){
    	Calendar calendar = Calendar.getInstance();//日历对象  
        calendar.setTime(new Date());//设置当前日期  
        calendar.add(Calendar.MONTH, time);//月份减一  
        Date date = calendar.getTime();
        return getYearMonth(date);
    }
    
    /**
     * 获取两个日期之间的年月yyyyMM
     * @throws ParseException 
     */
    public static List<String> getBetweenYearMonth(String startTime,String endTime){
    	ArrayList<String> result = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");//格式化为年月
		Calendar min = Calendar.getInstance();
		Calendar max = Calendar.getInstance();
		try {
			min.setTime(sdf.parse(startTime.toString()));
			max.setTime(sdf.parse(endTime.toString()));
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
		max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
		Calendar curr = min;
		while (curr.before(max)) {
		result.add(sdf.format(curr.getTime()));
		curr.add(Calendar.MONTH, 1);
		}
		return result;
    }
    
    /**
     * 获取两个日期之间的年月日yyyyMMdd
     * @throws ParseException 
     */
    public static List<Integer> getBetweenYearMonthDay(Integer startTime,Integer endTime){
    	List<Integer> list = new ArrayList<>();
    	 Calendar start = Calendar.getInstance();  
    	    start.set(Integer.valueOf(startTime.toString().substring(0, 4)), Integer.valueOf(startTime.toString().substring(4, 6))-1, Integer.valueOf(startTime.toString().substring(6, 8)));  
    	    Long startTIme = start.getTimeInMillis();  
    	  
    	    Calendar end = Calendar.getInstance();  
    	    end.set(Integer.valueOf(endTime.toString().substring(0, 4)), Integer.valueOf(endTime.toString().substring(4, 6))-1, Integer.valueOf(endTime.toString().substring(6, 8)));  
    	    Long endTime1 = end.getTimeInMillis();  
    	  
    	    Long oneDay = 1000 * 60 * 60 * 24l;  
    	  
    	    Long time = startTIme;  
    	    while (time <= endTime1) {  
    	        Date d = new Date(time);  
    	        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
    	        list.add(Integer.valueOf(df.format(d).toString().replaceAll("-", "")));
    	   //     System.out.println(df.format(d));  
    	        time += oneDay;  
    	    }  
    	    return list;
    }
   
    /**
     * 根据yyyyMMdd获取日期
     * @param time
     * @return
     */
    public static Date getDateFormInt(Integer time){
    	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    	Date parse = new Date();
    	try {
    		parse = format.parse(time.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	return parse;
    }
    
    /**
     * 根据yyyyMMdd hhmmss数获取详细时间
     * @param time
     * @return
     */
    public static Date getDateFormatInt(Integer time){
    	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd hhmmss");
    	Date parse = new Date();
    	try {
    		parse = format.parse(time.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	return parse;
    }
    
    public static Integer getYYYYMMDDByCurrSeconds(Integer seconds){
    	Long currMills = seconds * 1000L;
    	Date date = new Date(currMills);
    	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    	String sResult = format.format(date);
    	return Integer.parseInt(sResult);
    }
    
    public static Integer getYYYYMMDDByDate(Date date){
    	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    	String sResult = format.format(date);
    	return Integer.parseInt(sResult);
    }
    
    public static void main(String[] args) {
		System.out.println(getBeforeDate());
	}

}
