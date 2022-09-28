package com.sim.app.reactive.basic;

public class PubDriven {
    public static void main(String[] args) {
        MyPublisher pub = new MyPublisher();
        MySubscriber sub = new MySubscriber("구독자1");

        //구독진행
        pub.subscribe(sub);

    }
}
