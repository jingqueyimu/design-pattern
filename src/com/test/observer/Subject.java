package com.test.observer;

import java.util.ArrayList;

/**
 * 主题
 */
public class Subject {
    
    /**
     * 观察者列表
     */
    private ArrayList<Observer> observers;
    
    public Subject() {
        observers = new ArrayList<>();
    }

    /**
     * 注册观察者
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     */
    public void removeObserver(Observer o) {
        observers.remove(o);        
    }

    /**
     * 通知所有观察者,并推送数据（也可以不推送数据，而是由观察者过来拉取数据）
     */
    public void notifyObservers(Object data) {
        for (Observer o : observers) {
            o.update(data);
        }
    }
}
