package com.sim.app.reactive.flux;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Slf4j
public class Backpressure01 {

    public static void main(String[] args) {
        Flux.range(1,10)
                .doOnNext(r -> log.info("request of {}",r))
                .subscribe(new BaseSubscriber<Integer>() {

                    @Override
                    protected void hookOnSubscribe(Subscription subscription) {
                        request(8);
                    }

                    @Override
                    protected void hookOnNext(Integer value) {
                        log.info("Cancelling after having received {}" , value);
                        //cancel();
                    }
                });
        /**
        Flux.range(1,10)
                .subscribe(x ->{log.info("받았어요. {}",x);});
**/
    }

}
