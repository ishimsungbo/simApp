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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.MessageSource;

import java.util.Locale;

@Slf4j
@Api(tags = {"1. Index"})  //스웨거
@RequiredArgsConstructor
@RestController
public class AppController {

    @GetMapping("/")
    public String index(){
        return "<h2>SimApp Spring boot Home Page</h2>";
    }

    @GetMapping("/modeltest")
    public String modelTest(Model model){
        model.addAttribute("message","123123123213213213123");
        return "hi";
    }

}
