package com.sim.app.reactive.flux;

import reactor.core.publisher.Flux;

public class E02_SubscribeMethodEx_done {
    public static void main(String[] args) {

        Flux<Integer> ints = Flux.range(1,4);
        ints.subscribe(i->System.out.println("결과 : "+i),
                error -> System.out.println("Error : " + error),
                () -> System.out.println("Done"));

    }
}
