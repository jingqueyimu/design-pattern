package com.test.others.flyweight;

import java.util.HashMap;

/**
 * 蝇量类工厂
 */
public class FlyweightFactory {

    /**
     * 池容器
     */
    private static HashMap<String, Flyweight> pool = new HashMap<>();
    
    /**
     * 获取蝇量类实例
     */
    public static Flyweight getFlyweight(String unsharedState) {
        // 从池中取出蝇量类实例
        Flyweight flyweight = pool.get(unsharedState);
        if (flyweight == null) {
            // 创建蝇量类实例,并放入池中
            System.out.println("Create flyweight instance, and put into the pool：" + unsharedState);
            flyweight = new ConcreteFlyweight(unsharedState);
            pool.put(unsharedState, flyweight);
        } else {
            System.out.println("Get flyweight instance from the pool：" + unsharedState);
        }
        return flyweight;
    }
}
