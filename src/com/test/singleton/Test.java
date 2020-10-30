package com.test.singleton;

import com.test.singleton.doublechecklock.Singleton;
//import com.test.singleton.hungry.Singleton;
//import com.test.singleton.lazy.safe.Singleton;
//import com.test.singleton.lazy.unsafe.Singleton;

public class Test {
    
    public static void main(String[] args) {
        // 获取单件实例
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
    }
}
