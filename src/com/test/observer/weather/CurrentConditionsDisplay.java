package com.test.observer.weather;

/**
 * 目前状态布告板
 */
public class CurrentConditionsDisplay implements Observer {
    
    private Subject weatherData;
    private float temperature;
    private float humidity;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 注册观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Current conditions：" + temperature + "F degress and " + humidity + "% humidity");
    }
}
