package com.sim.app.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicLong;

@Slf4j
public class AtomicLongTest {
    public static void main(String[] args) {
        AtomicLong aLong = new AtomicLong();
        Long i = aLong.getAndIncrement();

        log.info("발생 Long ===> " + i);
    }
}
