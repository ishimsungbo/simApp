package com.sim.app.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * 인터셉터를 구현하고 lang 을 구성.. 메세지 적용
 */

@Slf4j
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");

        registry.addInterceptor(localeChangeInterceptor).addPathPatterns("/*");

        registry.addInterceptor(new FirstInterceptor())
                .excludePathPatterns("/common/*")  //제외할 인터셉터를 적용시킨다.
                .addPathPatterns("/sim/*");        //인터셉터를 적용시킬 url 을 등록한다.
    }
}
