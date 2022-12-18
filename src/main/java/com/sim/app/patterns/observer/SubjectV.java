package com.sim.app.patterns.observer;

public interface SubjectV {

    public void registerObserver(ObserverV o);
    public void removeObserver(ObserverV o);
    public void notifyObserver();

}
