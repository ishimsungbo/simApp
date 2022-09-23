package com.sim.app.restapi.user.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    @ApiOperation(value = "테스트", notes = "테스트 조회")
    @GetMapping("/test")
    public String test(){
        return "test user";
    }

}
