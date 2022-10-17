package com.sim.app.redis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionTest {

    @GetMapping("/getSession")
    public String getSession(HttpSession httpSession){
        return httpSession.getId();
    }

}
