package com.sim.app.reactive.flux;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

public class SampleSubscriber<T> extends BaseSubscriber<T> {

    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscribed");
        //request(1);
        request(Long.MAX_VALUE);
    }

    @Override
    protected void hookOnNext(T value) {
        System.out.println("==> : "+value);
        //request(1);
        request(Long.MAX_VALUE);
    }
}
