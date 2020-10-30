package com.test.proxy;

/**
 * 主题代理（代理类）
 */
public class SubjectProxy implements Subject {

    /**
     * 持有真实主题
     */
    RealSubject realSubject;
    
    @Override
    public void request() {
        System.out.println("SubjectProxy receives and controls request, and entrust request to RealSubject...");
        // 代理并控制对真实主题的访问，比如权限控制、访问资源控制等
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        // ...
        
        // 将请求委托给真实主题
        realSubject.request();
    }
}
