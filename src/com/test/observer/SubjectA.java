package com.test.observer;

/**
 * 主题A
 */
public class SubjectA extends Subject {
    
    /**
     * 主题数据
     */
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        // 数据发生变化时，通知观察者
        notifyObservers(data);
    }
}
