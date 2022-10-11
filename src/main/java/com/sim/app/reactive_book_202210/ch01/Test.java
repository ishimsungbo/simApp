package com.sim.app.reactive_book_202210.ch01;

import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;

public class Test {

    //@Autowired
    //private static KitchenService kitchenService;

    public static void main(String[] args) {
        //Flux<Dish> flux=  kitchenService.getDishes();
        System.out.println(21%5);
        System.out.println(12%5);
        System.out.println(5%5);

    }
}
