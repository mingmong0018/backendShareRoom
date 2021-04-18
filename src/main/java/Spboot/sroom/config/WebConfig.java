package Spboot.sroom.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

import Spboot.sroom.config.interceptor.JwtAuthIntercepter;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	private final String uploadImagesPath;
	
	@Autowired
	JwtAuthIntercepter jwtAuthIntercepter;
	
	public WebConfig(@Value("${custom.path.upload-images}") String uploadImagesPath) {
		this.uploadImagesPath=uploadImagesPath;
	}
	
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
							"/writer",
							"/bestTag",
							"/tagListRoom"
							);
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		List<String> imageFolders=Arrays.asList("profile","room");
		for(String imageFolder:imageFolders) {
			registry.addResourceHandler("/upload/"+imageFolder+"/**")
			.addResourceLocations("file:///"+uploadImagesPath+imageFolder+"/")
			.setCachePeriod(3600)
			.resourceChain(true)
			.addResolver(new PathResourceResolver());
		}
	}
}
