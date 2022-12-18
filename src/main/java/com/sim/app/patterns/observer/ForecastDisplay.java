package com.sim.app.patterns.observer;

public class ForecastDisplay implements ObserverV, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private SubjectV weatherData;

    public ForecastDisplay(SubjectV weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        //온도와 습도를 표시하는 정보
        System.out.println("Forecast conditions: " + temperature + " F degrees and " + humidity + "% humidity, " + pressure +" pressure");
    }

    @Override
    public String getName() {
        return "기상 예보 표시 장치";
    }
}
