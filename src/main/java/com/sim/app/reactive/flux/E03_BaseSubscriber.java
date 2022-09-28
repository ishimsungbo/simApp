package com.sim.app.reactive.flux;


import io.swagger.models.auth.In;
import reactor.core.publisher.Flux;

//4.3.4. On Backpressure and Ways to Reshape Requests

public class E03_BaseSubscriber {
    public static void main(String[] args) {
        SampleSubscriber<Integer> ss = new SampleSubscriber<Integer>();
        Flux<Integer> ints = Flux.range(1,4);
        //ints.doOnNext(x -> System.out.println(x)).log();
        ints.subscribe(ss);
    }
}
