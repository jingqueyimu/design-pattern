package com.test.observer;

public class Test {
    
    public static void main(String[] args) {
        // 主题
        SubjectA subject = new SubjectA();
        // 观察者A
        ObserverImplA observerA = new ObserverImplA(subject);
        // 观察者B
        ObserverImplB observerB = new ObserverImplB(subject);
        // 模拟主题数据变化
        subject.setData("I'm Batman!!!");
        subject.setData("Why so serious...");
    }
}
