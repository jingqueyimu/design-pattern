package com.test.singleton.lazy.unsafe;

/**
 * 单件类（懒汉式、线程不安全）
 */
public class Singleton {

    /**
     * 唯一单件实例
     */
    private static Singleton uniqueInstance;
    
    /**
     * 私有构造
     */
    private Singleton() {}
    
    /**
     * 获取单件实例
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            // 延迟创建单件实例
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
