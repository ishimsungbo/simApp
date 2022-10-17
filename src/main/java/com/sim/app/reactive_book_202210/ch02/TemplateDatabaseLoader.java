package com.sim.app.reactive_book_202210.ch02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

//@Component
public class TemplateDatabaseLoader {

    /*
    @Bean
    CommandLineRunner initialize(MongoOperations operations) {
        return args -> {
            operations.save(new Item("Alf alarm clock", "kids clock", 19.99));
            operations.save(new Item("Smurf TV tray", "kids TV tray", 24.99));
        };
    }
     */
}
