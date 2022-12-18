package com.sim.app.patterns.observer;

public interface ObserverV {
    public void update(float temp, float humidity, float pressure);
    public String getName();
}
