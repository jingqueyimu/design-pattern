package com.test.others.visitor;

/**
 * 具体访问者
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("ConcreteVisitor visit ConcreteElementA:");
        // 访问者操作元素
        element.operate();
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("ConcreteVisitor visit ConcreteElementB:");
        // 访问者操作元素
        element.operate1();        
        element.operate2();        
    }
}
