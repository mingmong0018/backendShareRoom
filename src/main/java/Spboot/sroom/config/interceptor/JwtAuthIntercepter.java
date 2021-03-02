package Spboot.sroom.config.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import Spboot.sroom.redis.IUseRedis;
import Spboot.sroom.util.IJwtUtil;

@Component
public class JwtAuthIntercepter implements HandlerInterceptor{
	
	@Autowired
	IJwtUtil jwtUtil;
	@Autowired
	IUseRedis useRedis;
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception{
		
			String basicConfirm = null;
			String givenJWT = null;
			String id = null,redisJWT=null,verifyJWT=null;
			
			try {	
			if(((basicConfirm=request.getHeader("Authorization").substring(0, 7)).equals("Bearer "))
					&&((givenJWT=request.getHeader("Authorization").substring(7))!=null)
					&&((id=jwtUtil.verifyToken(givenJWT))!=null)
					&&((redisJWT=useRedis.getField(id))!=null)
					&&((verifyJWT=verifyJWT(givenJWT,redisJWT)).equals("success"))) {
							System.out.println("preHandle true 작동");
							return true;
						
			}else {
				System.out.println("preHandle false1 작동");
				return false;
			}
		}catch(Exception e) {
			
			System.out.println("preHandle false2 작동");
			return false;
		}
	}
	public String verifyJWT(String givenJWT,String redisJWT) {
		if(!givenJWT.equals(redisJWT)) {
			return "fail";
		}else {
			return "success";
		}
		
	}


}
