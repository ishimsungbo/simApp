package com.sim.app.reactive.basic;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

//https://bgpark.tistory.com/160

@Slf4j
public class MyPublisher implements Publisher {

    final ExecutorService executor = Executors.newFixedThreadPool(4);
    private List subscriptions = Collections.synchronizedList(new ArrayList<>());
    private final CompletableFuture<Object> terminated = new CompletableFuture<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        log.info("Subscriptions 생성");

        MySubscription subscription  = new MySubscription(subscriber,executor,subscriptions,terminated);
        subscriptions.add(subscription);
        subscriber.onSubscribe(subscription);
    }

    public void waitUnitTerminated() throws ExecutionException, InterruptedException{
        terminated.get();
    }
}
