package com.test.iterator;

/**
 * 迭代器接口
 */
public interface Iterator {

    /**
     * 是否有下一个元素
     */
    public boolean hasNext();
    
    /**
     * 获取下一个元素
     */
    public Object next();
}
