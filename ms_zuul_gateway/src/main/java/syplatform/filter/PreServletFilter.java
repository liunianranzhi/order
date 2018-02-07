package syplatform.filter;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.pre.ServletDetectionFilter;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @author caoyongjun
 *
 */
@Component
public class PreServletFilter extends ServletDetectionFilter {
    private static final Logger logger = LoggerFactory.getLogger(PreServletFilter.class);
	@Autowired
	private StringRedisTemplate redisTemplate ;

	private static final String BLACK = "blackip:set";
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

		long startTime=System.currentTimeMillis();

		RequestContext context = RequestContext.getCurrentContext();
        context.set("executeStartTime", startTime);
        try{
            HttpServletRequest request = context.getRequest();
            String ip = getIp(request);
            if(StringUtils.isNotEmpty(ip)){
                String rip = ip;
                String[] ips = ip.split("/");

                if(ips.length==2){
                     rip = ips[0];

                }
                if(rip.endsWith("/")){
                    rip = rip.substring(0,rip.length()-1);
                }

                SetOperations<String, String> ops =  this.redisTemplate.opsForSet();
                if(ops.isMember(BLACK,rip)){

                    context.set("isSuccess", false);
                    context.setSendZuulResponse(false);
                    context.setResponseBody("非法请求");
                    context.setResponseStatusCode(301);
                    context.getResponse().sendRedirect("http://soft2.xitongzhijia.net:808/201702/MicrosoftOffice2016_XiTongZhiJia.zip");
//                    context.getResponse().setContentType("application/json; charset=utf-8");
                    context.sendZuulResponse();
                    logger.info("black ip access ip={}",rip);
                    return null;


                }

            }
        }catch(Exception e){
            logger.error(e.getMessage(),e);
        }


		return null;
	}

}
