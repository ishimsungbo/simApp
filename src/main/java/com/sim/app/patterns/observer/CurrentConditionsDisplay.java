package com.sim.app.patterns.observer;

public class CurrentConditionsDisplay implements ObserverV, DisplayElement{

    private float temperature;
    private float humidity;
    private SubjectV weatherData;

    public CurrentConditionsDisplay(SubjectV weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        //온도와 습도를 표시하는 정보
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");
    }

    @Override
    public String getName() {
        return "현재기상조건 표시 장치";
    }
}
