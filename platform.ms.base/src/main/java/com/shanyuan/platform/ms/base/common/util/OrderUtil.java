package com.shanyuan.platform.ms.base.common.util;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 
 * @author zy
 *
 */
public class OrderUtil {
	private static final long ONE_STEP = 10;
    private static final Lock LOCK = new ReentrantLock();
    private static long lastTime = System.currentTimeMillis();
    private static short lastCount = 0;
    private static AtomicInteger c = new AtomicInteger();
    private static int count = 0;
    /**
     * 生成id
     * @return
     */
	 @SuppressWarnings("finally")
	    public static String nextId1() 
	    {
	    	LOCK.lock();
	    	try {
	    		if (lastCount == ONE_STEP) {
	    			boolean done = false;
	    			while (!done) {
	    				long now = System.currentTimeMillis();
	    				if (now == lastTime) {
	    					try {
	    						Thread.currentThread();
	    						Thread.sleep(1);
	    					} catch (java.lang.InterruptedException e) {
	    					}
	    					continue;
	    				} else {
	    					lastTime = now;
	    					lastCount = 0;
	    					done = true;
	    				}
	    			}
	    		}
	    		count = lastCount++;
	    	}
	    	finally 
	    	{
	    		LOCK.unlock();
	    		return lastTime+""+String.format("%04d",count); 
	    	}
	    }
	 @SuppressWarnings("finally")
	    public static synchronized Long getOrderCode1() 
	    {
		 if(c.get()>100000){
			 c.getAndSet(0);
		 }
		 
		int m =  c.incrementAndGet();
		 //TODO 多进程时冲突；
//	    	LOCK.lock();
//	    	try {
	    		if (lastCount == ONE_STEP) {
	    			boolean done = false;
	    			while (!done) {
	    				long now = System.currentTimeMillis();
	    				if (now == lastTime) {
	    					try {
	    						Thread.currentThread();
	    						Thread.sleep(1);
	    					} catch (java.lang.InterruptedException e) {
	    					}
	    					continue;
	    				} else {
	    					lastTime = now;
	    					lastCount = 0;
	    					done = true;
	    				}
	    			}
	    		}
	    		count = lastCount++;
	    		String orderCode= lastTime+""+String.format("%04d",count); 
	    		 return Long.parseLong(orderCode);
//	    	}
//	    	finally 
//	    	{
////	    		LOCK.unlock();
//	    		//
////	    		String orderCode= lastTime+""+String.format("%04d",count); 
////	    		 return Long.parseLong(orderCode);
//	    	}
	    }
	


	//得到伊利的会员id;
	public static Integer getYiLiMemberId() {
		
		return 353710;
	}
	//得到比例积分
	public static BigDecimal getBocPointsRate() {
		BigDecimal rate=new BigDecimal(10);
		return rate;
	}
	/**
	 * 是否有下一页
	 * @param pageNo
	 * @param pageSize
	 * @param count
	 * @return
	 */
	public static boolean hasNext(int pageNo,int pageSize,int count){
		double hasNext=Math.ceil((double)count/(pageNo*pageSize));
		if(hasNext>1.0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
	/*	List<Integer> a=	new ArrayList<Integer>();
				a.add(1);
				a.add(2);
		Integer[] array = a.toArray(new Integer[a.size()] );
		System.err.println(array);*/
		BigDecimal b=new BigDecimal("1231231321");
				System.err.println(b.shortValue());
		/*Map<String,String> addressMap=new HashMap<String,String>();
		addressMap.put("address","北京市东城区旧鼓楼大街国旺胡同22-A");
		addressMap.put("phone","010-82055586-1197");
		String phpseriaStr = Pherialize.serialize(null);
		 System.out.println(phpseriaStr);*/
		/*Mixed unserialize = Pherialize.unserialize("");
		  System.out.println(unserialize);*/
	/*	  Mixed unserialize2;
		  MixedArray array = Pherialize.unserialize("a:3:{i:1243;s:3:\"箱\";i:1256;s:2:\"11\";i:1253;s:1:\"g\";}").toArray();
		  String string = Pherialize.unserialize("a:3:{i:1243;s:3:\"箱\";i:1256;s:2:\"11\";i:1253;s:1:\"g\";}").toString();
		  System.out.println(string);
		  
		  System.out.println(array);
		  */
		/*MixedArray list2 = Pherialize.unserialize("").toArray();
		System.out.println(list2);
		  MixedArray list = Pherialize.unserialize("a:3:{s:7:\"address\";s:49:\"北京市东城区旧鼓楼大街国旺胡同22-A\";s:5:\"phone\";s:17:\"010-82055586-1197\";s:8:\"postcode\";s:6:\"100009\";}").toArray();
		  System.out.println(list);
		  System.out.println(list.get("dd"))*/;
	/*	  for (int i = 0; i < list.size(); i++) {
			 
			  System.out.println(list.get(i));
			}*/
	/*	Double x=10.123;
		BigDecimal rate=new BigDecimal(x);
		BigDecimal pay=new BigDecimal("120.123");
		System.out.println(rate.subtract(pay));
		System.out.println(""+rate.add(pay)+"===="+rate.intValue());*/
	}
}
