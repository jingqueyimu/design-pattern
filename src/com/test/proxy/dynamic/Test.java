package com.test.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        // 真实主题（被代理类）
        Subject realSubject = new RealSubject();
        
        // 调用处理器
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 代理实例的方法被调用时，最终会执行该方法
                System.out.println("InvocationHandler start to invoke...");
                // do something...
                // 调用真实主题（被代理类）的方法
                method.invoke(realSubject, args);
                // do something...
                return null;
            }
        };
        
        // 使用 Proxy 创建代理
        Subject subjectProxy = (Subject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(), 
                realSubject.getClass().getInterfaces(), 
                handler);
        
        // 通过代理发起请求
        subjectProxy.request();
    }
}
