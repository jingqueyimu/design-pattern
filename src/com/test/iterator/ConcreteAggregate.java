package com.test.iterator;

/**
 * 具体聚合
 */
public class ConcreteAggregate implements Aggregate {
    
    /**
     * 持有集合（比如列表、数组、散列表等）
     */
    public String[] items = new String[] {"item1", "item2", "item3"};

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}
