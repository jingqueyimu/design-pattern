package com.test.observer.weather;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 统计布告板
 */
public class StatisticsDisplay implements Observer {

    private Subject weatherData;
    private ArrayList<Float> historyTemperatures;
    
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 注册观察者
        weatherData.registerObserver(this);
        historyTemperatures = new ArrayList<>();
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.historyTemperatures.add(temperature);
        display();
    }
    
    public void display() {
        if (historyTemperatures.isEmpty()) {
            return;
        }
        Collections.sort(historyTemperatures);
        float avgTemperature = 0;
        float maxTemperature = historyTemperatures.get(historyTemperatures.size() - 1);
        float minTemperature = historyTemperatures.get(0);
        float totalTemperature = 0;
        for (Float temperature : historyTemperatures) {
            totalTemperature += temperature;
        }
        avgTemperature = totalTemperature / historyTemperatures.size();
        System.out.println("Avg/Max/Min temperature：" + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }
}
