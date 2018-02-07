package com.shanyuan.platform.ms.facade.hystrix;

import java.util.ArrayList;
import java.util.concurrent.Future;

import com.shanyuan.platform.ms.facade.index.IndexGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.bo.GoodsCommonInfo;
import com.shanyuan.platform.ms.core.goods.bo.SpecialGoodsBo;
import com.shanyuan.platform.ms.dao.user.entity.AgentBo;
import com.shanyuan.platform.ms.facade.index.IndexFacade;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;

@Component
public class FutureTest {

	@Autowired
	IndexFacade indexFacade;

	@Autowired
	IndexGoods indexGoods;
	
	@HystrixCommand(fallbackMethod = "fallback",
			commandProperties ={@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1000")}
	)
	public Future<IndexGoodsDomain> future(Integer memberId,String channel,int status) throws CoreServiceException {
		 return new AsyncResult<IndexGoodsDomain>(){
			 
			 @Override
			 public IndexGoodsDomain invoke(){
             	if(status==1){
             		return indexGoods.getHelpGoodsList(memberId,channel);
             	}else if(status==2){
             		return indexGoods.getSpecialGoodsList(memberId,channel);
             	}else{
             		return indexGoods.getAgentList(memberId,channel);
             	}
			 }
			 
        };
	}
	
	
	public IndexGoodsDomain fallback(Integer memberId,String channel,int status) throws CoreServiceException {
		IndexGoodsDomain domain=new IndexGoodsDomain();
		String title="";
		String desc="";
		if(status==1){
			title="大家帮";
			desc="货真物美 有口皆碑";
			domain.setDatas(new ArrayList<GoodsCommonInfo>());
		}else if(status==2){
			title="特产馆";
			desc="山肴野蔌 篱壁佳物";
			domain.setDatas(new ArrayList<SpecialGoodsBo>());
		}else{
			title="优秀助理人";
			desc="言忠信 行笃敬 自立以立人";
		   domain.setDatas(new ArrayList<AgentBo>());
		}
		domain.setTitle(title);
		domain.setDesc(desc);
		
		return domain;
	}
	
	
}
