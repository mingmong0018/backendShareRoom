package Spboot.sroom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import Spboot.sroom.config.interceptor.JwtAuthIntercepter;

@Component
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	JwtAuthIntercepter jwtAuthIntercepter;
	
	private String[] INTERCEPTOR_WHITE_LIST= {
			"/login/**","/upload/**",
	};
	@Override
	public void addCorsMappings(CorsRegistry cr) {
		cr.addMapping("/**")
		.allowedOrigins("http://shareroom-frontend.s3-website.ap-northeast-2.amazonaws.com")
	    .allowedMethods("POST","GET","OPTIONS","PUT","DELETE");
		
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(jwtAuthIntercepter)
					.addPathPatterns("/*")
					.excludePathPatterns(
							"/upload/**",
							"/login",
							"/listRoom",
							"/roomDetail",
							"/roomTag",
							"/roomOption",
							"/keyword",
							"/writer",
							"/options",
							"/writer"
							);
	}
}
