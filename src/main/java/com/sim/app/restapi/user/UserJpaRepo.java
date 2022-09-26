package com.sim.app.restapi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepo extends JpaRepository<User, Long> {

    User findByName(String name);
    User findByEmail(String email);

}
