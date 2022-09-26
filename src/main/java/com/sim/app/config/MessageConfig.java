package com.sim.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@Configuration
public class MessageConfig {

    @Bean
    public LocaleResolver defaultLocaleResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.KOREAN);

        return localeResolver;
    }

    @Bean
    public MessageSource messageSource() {

        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/message_resource/message");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(3);

        Locale.setDefault(Locale.KOREAN); // 제공하지 않는 언어로 들어왔을 때 처리

        return messageSource;
    }

    @Bean
    public MessageSourceAccessor messageSourceAccessor (
            @Autowired ReloadableResourceBundleMessageSource messageSource) {
        return new MessageSourceAccessor(messageSource);
    }
}
