package com.test.observer;

/**
 * 观察者A
 */
public class ObserverImplA implements Observer {

    private Subject subject;
    
    public ObserverImplA(Subject subject) {
        // 保存主题引用，以便后续取消注册
        this.subject = subject;
        // 注册观察者
        subject.registerObserver(this);
    }
    
    @Override
    public void update(Object data) {
        System.out.println("Observer A：" + data.toString());
    }
}
