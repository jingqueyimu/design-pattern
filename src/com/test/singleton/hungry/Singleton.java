package com.test.singleton.hungry;

/**
 * 单件类（饿汉式）
 */
public class Singleton {

    /**
     * 唯一单件实例（“急切”创建单件实例）
     */
    private static Singleton uniqueInstance = new Singleton();
    
    /**
     * 私有构造
     */
    private Singleton() {}
    
    /**
     * 获取单件实例
     */
    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
