package com.sim.app.restapi.user;

import org.springframework.beans.factory.annotation.Autowired;

public class TestMain {

    @Autowired
    private static UserJpaRepo userJpaRepo;

    public static void main(String[] args) {

        User user = userJpaRepo.findByName("이름");

        System.out.println("결과 : " + user.toString());

    }
}
