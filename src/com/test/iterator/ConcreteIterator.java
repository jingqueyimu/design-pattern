package com.test.iterator;

/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator {
    
    /**
     * 要遍历的集合（数组）
     */
    public String[] items;
    /**
     * 当前遍历位置
     */
    int position = 0;
    
    public ConcreteIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position < items.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (!this.hasNext()) {
            return null;
        }
        String item = items[position];
        position = position + 1;
        return item;
    }
}
