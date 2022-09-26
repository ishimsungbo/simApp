package com.sim.app.restapi.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserSaveTest {

    @Autowired UserJpaRepo userJpaRepo;

    @Test
    void save(){

        User user = User.builder()
                .email("abcfile@naver.com")
                .name("고짱구")
                .build();

        userJpaRepo.save(user);


        User qUser = userJpaRepo.findByName("고짱구");

        assertThat(qUser.getName()).isEqualTo("고짱구");

    }

}
