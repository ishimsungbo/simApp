package com.sim.app.restapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@Api(tags = {"99. Etc Test"})  //스웨거
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/test/")
public class TestController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("message01")
    public String message01(){

        String[] str = new String[]{"i18n"};

        System.out.println(messageSource.getMessage("greeting", str, Locale.getDefault()));
        System.out.println(messageSource.getMessage("greeting", str, Locale.US));
        System.out.println(messageSource.getMessage("greeting", str, Locale.KOREA));


        return "메세지 세팅 확인 중";
    }

    @GetMapping("beanList")
    public String[] beanList(){
        String[] beans = applicationContext.getBeanDefinitionNames();

        for (String bean : beans) {
            System.out.println("bean : " + bean);
        }
        return beans;
    }

    @ApiOperation(value = "테스트 value" , notes = "테스트 notes")  //스웨거 어노테이션
    @GetMapping("{name}")
    public String Test(@ApiParam(value = "이름" , required = true) @PathVariable String name){
        return "안녕하세요";
    }

}
