package com.shanyuan.platform.ms.core.hystrix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;

/**
 * @author 曹勇军
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class HystrixTest {
	@Autowired
	private TestGroupKey t;
	
	
	@Test
	public void testAsync(){
		
		for(int i=0;i<10;i++){
			new ThreadTest(i).start();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	class ThreadTest extends Thread{
		private int i;
		public ThreadTest(int i){
			this.i=i;
		}
		@Override
		public void run(){
			int j=i%2;
			if(j==0){
				t.group1(i, Thread.currentThread().getName());
			}else{
				t.group2(i, Thread.currentThread().getName());
			}
		}
	}
}
