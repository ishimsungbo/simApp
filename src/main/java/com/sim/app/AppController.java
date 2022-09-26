package com.sim.app;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.MessageSource;

import java.util.Locale;

@Slf4j
@Api(tags = {"1. Index and Test"})  //스웨거
@RequiredArgsConstructor
@RestController
public class AppController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/")
    public String index(){
        return "<h2>SimApp Spring boot Home Page</h2>";
    }

    @GetMapping("/message01")
    public String message01(){
        Locale.setDefault(Locale.ROOT);

        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/message_resource/message");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(3);
        messageSource.clearCache();
        messageSource.setConcurrentRefresh(true);

        String[] str = new String[]{"i18n"};

        System.out.println(messageSource.getMessage("greeting", str, Locale.getDefault()));
        System.out.println(messageSource.getMessage("greeting", str, Locale.US));
        System.out.println(messageSource.getMessage("greeting", str, Locale.KOREA));


        return "메세지 세팅 확인 중";
    }

    @GetMapping("/beanList")
    public String[] beanList(){
        String[] beans = applicationContext.getBeanDefinitionNames();

        for (String bean : beans) {
            System.out.println("bean : " + bean);
        }
        return beans;
    }



    @ApiOperation(value = "테스트 value" , notes = "테스트 notes")  //스웨거 어노테이션
    @GetMapping("/Test/{name}")
    public String Test(@ApiParam(value = "이름" , required = true) @PathVariable String name){
        return "안녕하세요";
    }
}
