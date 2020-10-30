package com.test.observer.weather;

/**
 * 观察者接口
 */
public interface Observer {

    /**
     * 更新观测值
     */
    public void update(float temperature, float humidity, float pressure);
}