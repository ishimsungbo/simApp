package com.sim.app.reactive_book_202210.ch01;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class TestSubscriber implements Subscriber {
    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("TestSubscriber onSubscribe");
    }

    @Override
    public void onNext(Object o) {
        System.out.println("TestSubscriber onNext");
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("TestSubscriber onError");
    }

    @Override
    public void onComplete() {
        System.out.println("TestSubscriber onComplete");
    }
}
