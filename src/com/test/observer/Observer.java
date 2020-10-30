package com.test.observer;

/**
 * 观察者接口
 */
public interface Observer {

    /**
     * 根据主题推送的数据进行更新操作
     */
    public void update(Object data);
}