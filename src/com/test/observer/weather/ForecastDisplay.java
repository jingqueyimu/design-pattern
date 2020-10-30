package com.test.observer.weather;

/**
 * 预测布告板
 */
public class ForecastDisplay implements Observer {

    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 注册观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    
    public void display() {
        System.out.println("Forecast：waiting for implementation...");
    }
}
