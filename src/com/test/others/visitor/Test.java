package com.test.others.visitor;

public class Test {

    public static void main(String[] args) {
        // 数据结构
        DataStructure dataStructure = new DataStructure();
        dataStructure.add(new ConcreteElementA());
        dataStructure.add(new ConcreteElementB());
        // 访问者
        Visitor visitor = new ConcreteVisitor();
        // 数据结构接受访问者访问
        dataStructure.accept(visitor);
    }
}
