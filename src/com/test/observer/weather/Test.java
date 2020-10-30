package com.test.observer.weather;

public class Test {
    
    public static void main(String[] args) {
        // 气象数据
        WeatherData weatherData = new WeatherData();
        // 目前状态布告板
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 统计布告板
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // 预测布告板
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        // 模拟气象观测值变化
        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
