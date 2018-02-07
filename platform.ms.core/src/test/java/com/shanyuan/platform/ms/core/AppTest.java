package com.shanyuan.platform.ms.core;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	public static void main(String[] args) {
	    
	    String str = "Hello World !" ;
	    Test01  t1 = new Test01();
	    t1.abc = str;
		System.out.println(str.intern());
//		setStringTwice(t1);
		setStringTwice2(str);
		System.out.println(t1.abc.intern());
		
		System.out.println(t1.abc);
	}
	
	public static void setStringTwice(Test01 t) {
	  t.abc = t.abc+t.abc;
	}
	
	static class Test01{
	    String abc ;
	    public Test01(){}
	}
	
	public static void setStringTwice2(String t) {
	      t  = t +t ;
	      System.out.println();
	    }
	    
	

}
