package com.sim.app;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"1. Index and Test"})  //스웨거
@RequiredArgsConstructor
@RestController
public class AppController {

    @GetMapping("/")
    public String index(){
        return "<h2>SimApp Spring boot Home Page</h2>";
    }

    @ApiOperation(value = "테스트 value" , notes = "테스트 notes")  //스웨거 어노테이션
    @GetMapping("/Test")
    public String Test(){
        return "안녕하세요";
    }
}
