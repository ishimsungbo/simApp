package com.sim.app.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements SubjectV{

    private List<ObserverV> observerVLists;
    private float temperature;
    private float humidity;  //습도
    private float pressure;  //압력

    public WeatherData() {
        observerVLists = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObserverV o) {
        observerVLists.add(o);
    }

    @Override
    public void removeObserver(ObserverV o) {
        int i = observerVLists.indexOf(o);
        if(i>=0){
            System.out.println("정보 표시 제외 장치 : "+ observerVLists.get(i).getName());
            observerVLists.remove(i);
        }
    }

    //등록된 옵저버들에게 정보변경 알림을 준다. observer.update()
    @Override
    public void notifyObserver() {
        for(int i=0;i<observerVLists.size();i++){
            ObserverV observer = observerVLists.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // 기상정보가 들어오면 옵저버들에게 알린다.
    public void measurementsChanged(){
        notifyObserver();
    }

    //진짜 기상청에서 정보를 가져오는 대신 테스트용으로 하나 만듬.
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
