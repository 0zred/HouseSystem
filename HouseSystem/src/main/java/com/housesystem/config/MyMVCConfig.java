package com.housesystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @PackageName:com.housesystem.config
 * @ClassName:MyMVCConfig
 * @Description:扩展MVC
 * @Author:Ozred
 * @Date:2021/11/23/17:22
 */
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main1.html").setViewName("index");
        registry.addViewController("/main2.html").setViewName("user/login");
    }

    /*配置拦截器*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHanderInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html", "/", "/login", "/user/login", "/regist", "/user/register",
                        "/case", "/css/*", "/font/**", "/img/**", "/js/**");
    }
}
