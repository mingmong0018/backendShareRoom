package Spboot.sroom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import Spboot.sroom.config.interceptor.JwtAuthIntercepter;

@Component
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	JwtAuthIntercepter jwtAuthIntercepter;
	
	private String[] INTERCEPTOR_WHITE_LIST= {
			"/login/**","/upload/**",
	};
	@Override
	public void addCorsMappings(CorsRegistry cr) {
		cr.addMapping("/**")
		.allowedOrigins("http://http://shareroom-frontend.s3-website.ap-northeast-2.amazonaws.com:80")  // 허용할 주소 및 포트
		.allowedOrigins("http://localhost:8081");  // 허용할 주소 및 포트
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
							"/writer"
							);
	}
}
