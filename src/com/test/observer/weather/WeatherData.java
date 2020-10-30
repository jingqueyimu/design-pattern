package com.test.observer.weather;

/**
 * 气象数据
 */
public class WeatherData extends Subject {
    
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;
    
    public void measurementsChanged() {
        // 观测值变化时，通知所有观察者
        notifyObservers(temperature, humidity, pressure);
    }
    
    /**
     * 设置观测值（模拟观测值变化）
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}