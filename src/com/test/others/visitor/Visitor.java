package com.test.others.visitor;

/**
 * 访问者接口
 */
public interface Visitor {

    /**
     * 访问具体元素A
     */
    public void visit(ConcreteElementA element);
    
    /**
     * 访问具体元素B
     */
    public void visit(ConcreteElementB element);
}
