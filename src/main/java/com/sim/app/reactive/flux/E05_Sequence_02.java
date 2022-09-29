package com.sim.app.reactive.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicLong;

@Slf4j
public class E05_Sequence_02 {
    public static void main(String[] args) {
        Flux<String> flux = Flux.generate(
                AtomicLong::new,
                (state, sink) -> {
                    long i = state.getAndIncrement();
                    sink.next("3 * "+ i +" = " + 3 * i);
                    if(i == 10) sink.complete();
                    return state;
                });

        flux.subscribe(System.out::println);
    }
}
