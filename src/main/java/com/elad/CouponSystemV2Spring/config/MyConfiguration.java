package com.elad.CouponSystemV2Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.elad.CouponSystemV2Spring.security.Information;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyConfiguration {

	
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/greeting-javaconfig").allowedOrigins("*");
			}
		};
	}
	
    @Bean
    public Map<String, Information> map(){
        return new HashMap<>();
    }
    
   
    
    
}