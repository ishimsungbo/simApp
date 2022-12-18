package com.sim.app.patterns.observer;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("기상정보 전송 1");
        weatherData.setMeasurements(80,65,30.4f);

        System.out.println("=======================================================");

        System.out.println("기상정보 전송 2");
        weatherData.setMeasurements(82,70,29.2f);

        System.out.println("=======================================================");
        weatherData.removeObserver(forecastDisplay);


        System.out.println("기상정보 전송 3");
        weatherData.setMeasurements(82,70,29.2f);
    }
}
