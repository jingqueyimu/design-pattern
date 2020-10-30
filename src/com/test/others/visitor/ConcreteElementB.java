package com.test.others.visitor;

/**
 * 具体元素B
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        // 具体元素接受访问 -> 访问者访问具体元素
        visitor.visit(this);
    }
    
    public void operate1() {
        System.out.println("  ConcreteElementB operate1");
    }
    
    public void operate2() {
        System.out.println("  ConcreteElementB operate2");
    }
}
