package com.test.proxy;

public class Test {

    public static void main(String[] args) {
        // 代理
        SubjectProxy proxy = new SubjectProxy();
        // 通过代理请求主题
        proxy.request();
    }
}
