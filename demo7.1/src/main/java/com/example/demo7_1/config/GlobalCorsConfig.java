package com.example.demo7_1.config;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//处理跨域访问问题
//跨域问题可以简单理解成如果你的前端项目的IP地址和端口号和后端的IP地址和端口号不一样，就会导致前端无法获取到数据
@Configuration
public class GlobalCorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowCredentials(true)
                        .allowedMethods("GET","POST","DELETE")
                        .allowedHeaders("*")
                        .exposedHeaders("*");
            }
        };
    }
}
