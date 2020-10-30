package com.test.others.visitor;

/**
 * 具体元素A
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        // 具体元素接受访问 -> 访问者访问具体元素
        visitor.visit(this);
    }
    
    public void operate() {
        System.out.println("  ConcreteElementA operate");
    }
}
