package com.sim.app.reactive.basic;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class MySubscription implements Subscription {

    private Subscriber subscriber;

    private final ExecutorService exceutor;
    private final AtomicInteger value;
    private AtomicBoolean isCanceled;
    private List subscriptions;
    private CompletableFuture terminated;

    public MySubscription(Subscriber subscriber, ExecutorService executor, List subscriptions, CompletableFuture terminated) {
        this.subscriber = subscriber;

        this.exceutor = executor;
        this.subscriptions = subscriptions;
        this.value = new AtomicInteger();
        this.isCanceled = new AtomicBoolean(false);

        this.terminated = terminated;
    }

    @Override
    public void request(long n) {

        if(isCanceled.get()){
            return;
        }

        if (n < 0 ) {
            exceutor.execute(()->{
                subscriber.onError(new IllegalArgumentException());
            });
        }

        for(int i =0 ; i < n ; i++){
            exceutor.execute(()->{
                int v = value.incrementAndGet();
                log.info("아이템을 {}을 Subscriber에 전송", v);
                subscriber.onNext(v);
            });
        }
    }

    @Override
    public void cancel() {
        isCanceled.set(true);
        synchronized (subscriptions){
            subscriptions.remove(this);
            if(subscriptions.size()==0){
                shutdown();
            }
        }
    }

    private void shutdown(){
        log.info("shutdown executor...");
        exceutor.shutdown();
        Executors.newSingleThreadExecutor().submit(()->{
            log.info("shutdown complete");
            terminated.complete(null);
        });
    }
}
