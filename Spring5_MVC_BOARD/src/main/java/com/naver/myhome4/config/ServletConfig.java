package com.naver.myhome4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*
 * WevMvcConfigurer : @EnableWebMvc를 통해 활성화된 Spring MVC에 대한
 * 					  Java 기반 구성을 사용자 정의하기 위한 콜백 메서드를 정의합니다.
 */
@EnableWebMvc
@ComponentScan(basePackages = {"com.naver.myhome4"})
public class ServletConfig implements WebMvcConfigurer { //기존의 servlet-context.xml에서 설정한 것들을 작성합니다.
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		registry.viewResolver(bean);
	}

	//<resources mapping="/resources/**" location="/resources/"/>
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
		return bpe;
	}

}
