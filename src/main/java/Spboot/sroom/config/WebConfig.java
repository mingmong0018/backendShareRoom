package Spboot.sroom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import Spboot.sroom.config.interceptor.JwtAuthIntercepter;

@Component
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	JwtAuthIntercepter jwtAuthIntercepter;
	
	private String[] INTERCEPTOR_WHITE_LIST= {
			"/login/**",
	};
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtAuthIntercepter)
					.addPathPatterns("/*")
					.excludePathPatterns("/login","/listRoom");
	}
}
