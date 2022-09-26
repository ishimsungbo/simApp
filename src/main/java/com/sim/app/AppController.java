package com.sim.app;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/Test/{name}")
    public String Test(@ApiParam(value = "이름" , required = true) @PathVariable String name){
        return "안녕하세요";
    }
}
