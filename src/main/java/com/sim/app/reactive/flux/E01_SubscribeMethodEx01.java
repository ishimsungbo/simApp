package com.sim.app.reactive.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class E01_SubscribeMethodEx01 {

    public static void main(String[] args) {

        log.info("1번 예제======================================");

        Flux<Integer> ints = Flux.range(1,3);
                //.log();
        ints.subscribe(i -> System.out.println("구독 결과 : "+i));

        log.info("2번 예제======================================");

        Flux<Integer> i = Flux.range(1, 4)
                .map(x ->{
                    if(x <= 3 ) return x;
                    throw new RuntimeException("Got to 4");
                });

        i.subscribe(x -> System.out.println("2번째 결과 : " + x),
                error-> System.out.println("Error: " + error));

        //i.subscribe();
        //@Nullable Consumer<? super T> consumer, Consumer<? super Throwable> errorConsumer
    }
}
