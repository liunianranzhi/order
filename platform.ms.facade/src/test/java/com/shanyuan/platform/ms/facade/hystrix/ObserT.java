package com.shanyuan.platform.ms.facade.hystrix;

import com.shanyuan.platform.ms.facade.index.IndexGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.ObservableExecutionMode;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.facade.index.IndexFacade;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;

import rx.Observable;
import rx.Subscriber;

@Component
public class ObserT {
	
	@Autowired
	IndexFacade indexFacade;

	@Autowired
	IndexGoods indexGoods;

	//observableExecutionMode=ObservableExecutionMode. EAGER LAZY
	@HystrixCommand(observableExecutionMode=ObservableExecutionMode.LAZY)
	public Observable<IndexGoodsDomain> ss(Integer memberId,String channel,int status) throws CoreServiceException {
		 return Observable.create(new Observable.OnSubscribe<IndexGoodsDomain>() {
            @Override
            public void call(Subscriber<? super IndexGoodsDomain> observer) {
                try {
                    if (!observer.isUnsubscribed()) {
                    	if(status==1){
                    		observer.onNext(indexGoods.getHelpGoodsList(memberId,channel));
                    	}else if(status==2){
                    		observer.onNext(indexGoods.getSpecialGoodsList(memberId,channel));
                    	}else{
                    		observer.onNext(indexGoods.getAgentList(memberId,channel));
                    	}
                        observer.onCompleted();
                    }
                } catch (Exception e) {
                    observer.onError(e);
                }
            }
        });
	}
}
