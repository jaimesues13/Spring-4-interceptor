package com.fragua.springboot.interceptor.springbootinterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Autowired
    @Qualifier("loadingTimeInterceptor")
    private HandlerInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //todos
        //registry.addInterceptor(timeInterceptor);

        //un path
      registry.addInterceptor(timeInterceptor).addPathPatterns("/app/var");

      //lo contrario a add
      //registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/var");
    }
    
}
