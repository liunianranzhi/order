package syplatform.filter;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.post.SendResponseFilter;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.netflix.zuul.context.RequestContext;

/**
 * @author caoyongjun
 *
 */
@Component
public class PostServletFilter extends SendResponseFilter{
	private static final Logger logger = LoggerFactory.getLogger(PreServletFilter.class);
	
	private String getIp(HttpServletRequest request) {
		String remoteAddr = request.getRemoteAddr();
        String forwarded = request.getHeader("X-Forwarded-For");
        String realIp = request.getHeader("X-Real-IP");
        String ip = null;
        if (realIp == null) {
            if (forwarded == null) {
                ip = remoteAddr;
            } else {
                ip = forwarded.split(",")[0];
            }
        } else {
            if (realIp.equals(forwarded)) {
                ip = realIp;
            } else {
                if(forwarded != null){
                    forwarded = forwarded.split(",")[0];
                }
                ip = realIp + "/" + forwarded;
            }
        }
        if(ip.length() > 15){
        	ip = ip.substring(0, 15);
        }
        return ip;
	}
	
	@Override
	public Object run(){
		
		RequestContext context = RequestContext.getCurrentContext();
		
		int statusCode = context.getResponseStatusCode();
		HttpServletRequest request = context.getRequest();
		String ip = getIp(request);
		String requestUri = request.getRequestURI();
		Map<String, String[]> requestParams = request.getParameterMap();
		StringBuilder sb=new StringBuilder();
		if(!ObjectUtils.isEmpty(requestParams)){
			for(String key:requestParams.keySet()){
				sb.append(key).append("=");
				if(!ObjectUtils.isEmpty(requestParams.get(key))){
					for(int i=0;i<requestParams.get(key).length;i++){
						sb.append("["+i+"]"+requestParams.get(key)[i]);
					}
				}else{
					sb.append("");
				}
				sb.append("||");
			}
		}
		/*
		String requestBody = context.getResponseBody();//TODO 没有返回值 得重新再做一下
		//截取一下报文
		if(requestBody!=null&& requestBody.length() > 200){
			requestBody = requestBody.substring(0, 200);
		}
		*/
		long startTime = Long.parseLong(String.valueOf(context.get("executeStartTime")));
		long endTime = System.currentTimeMillis();
		long executeTime = endTime-startTime;
		
		logger.info("   ip={},statusCode={},startTime={},endTime={},executeTime={},requestUri={},requestParams={}"
				,ip,statusCode,startTime,endTime,executeTime,requestUri,sb.toString());
		
		return null;
	}
	
	@Override
	public int filterOrder() {
		return 2000;
	}
}
