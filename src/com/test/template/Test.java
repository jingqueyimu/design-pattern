package com.test.template;

public class Test {
    
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();
        System.out.println();
        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}
