package com.test.singleton.doublechecklock;

/**
 * 单件类（双重检查加锁）
 */
public class Singleton {

    /**
     * 唯一单件实例
     */
    private volatile static Singleton uniqueInstance;
    
    /**
     * 私有构造
     */
    private Singleton() {}
    
    /**
     * 获取单件实例
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
