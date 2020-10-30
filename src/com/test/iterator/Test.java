package com.test.iterator;

public class Test {
    
    public static void main(String[] args) {
        // 聚合对象
        Aggregate aggregate = new ConcreteAggregate();
        // 迭代器
        Iterator iterator = aggregate.createIterator();
        // 遍历
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
