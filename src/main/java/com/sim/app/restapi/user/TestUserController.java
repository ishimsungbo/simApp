package com.sim.app.restapi.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestUserController {


    private UserJpaRepo userJpaRepo;

    @PostMapping("/user/saveUser")
    public User testSaveUser(){

        User user = User.builder()
                .email("abcfile@naver.com")
                .name("고짱구")
                .build();

        return userJpaRepo.save(user);
    }

    @GetMapping("/user/findUser/{testUserName}")
    public User testFindByUserName(@PathVariable String testUserName){
        return userJpaRepo.findByName(testUserName);
    }

}
