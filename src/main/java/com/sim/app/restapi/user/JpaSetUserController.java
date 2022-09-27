package com.sim.app.restapi.user;

import io.swagger.annotations.Api;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Api(tags = {"96. JPA SetUp"})
@RestController
public class JpaSetUserController {

    @Autowired
    private UserJpaRepo userJpaRepo;

    @PostMapping("/user/saveUser")
    public String testSaveUser(){

        User user = User.builder()
                .email(LocalDateTime.now()+"@xxx.com")
                .name("uName "+ LocalDateTime.now())
                .build();

        userJpaRepo.save(user);

        return "성공";
    }

    @GetMapping("/user/findUser/{testUserName}")
    public User testFindByUserName(@PathVariable String testUserName){
        return userJpaRepo.findByName(testUserName);
    }

}
