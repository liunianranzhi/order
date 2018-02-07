package com.shanyuan.platform.ms.facade.hystrix;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.request.async.DeferredResult;

import rx.Observable;
import rx.Observer;

import com.shanyuan.platform.ms.facade.TestApplicationFacade;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class TestObserver {
	
	@Autowired
	ObserT obserT ;
	
	@Autowired
	FutureTest futureTest;
	
//	@Test
	public void testFuture() throws InterruptedException, ExecutionException{
//		Future<IndexGoodsDomain> f=futureTest.future(null, null, 1);
		
//		Future<IndexGoodsDomain> f2=futureTest.future(null, null, 2);
		
		Future<IndexGoodsDomain> f3=futureTest.future(null, null, 3);
		
		try{
//			IndexGoodsDomain r=f.get();
//			IndexGoodsDomain r2=f2.get();
			IndexGoodsDomain r3=f3.get();
			
//			System.out.println(r.getTitle()+System.currentTimeMillis());
//			System.out.println(r2.getTitle()+System.currentTimeMillis());
			System.out.println(r3.getTitle()+System.currentTimeMillis());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testObserv() throws InterruptedException, ExecutionException{
		
	}
	
	
	
	public DeferredResult<HashMap<String, IndexGoodsDomain>> toDeferredResult(Observable<HashMap<String, IndexGoodsDomain>> details) {
		DeferredResult<HashMap<String, IndexGoodsDomain>> result = new DeferredResult<HashMap<String, IndexGoodsDomain>>();
		details.subscribe(new Observer<HashMap<String, IndexGoodsDomain>>() {
			@Override
			public void onCompleted() {
				System.out.println("complete");
			}
			@Override
			public void onError(Throwable throwable) {
				System.out.println("error");
			}
			@Override
			public void onNext(HashMap<String, IndexGoodsDomain> domain) {
				result.setResult(domain);
			}
		});
		return result;
	}
}
