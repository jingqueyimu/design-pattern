package com.test.others.bridge;

public class Test {

    public static void main(String[] args) {
        // 实现化角色
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();
        // 抽象化角色
        Abstraction abstractionAA = new ConcreteAbstractionA(implementorA);
        Abstraction abstractionAB = new ConcreteAbstractionA(implementorB);
        Abstraction abstractionBA = new ConcreteAbstractionB(implementorA);
        Abstraction abstractionBB = new ConcreteAbstractionB(implementorB);
        // 请求动作
        abstractionAA.action();
        abstractionAB.action();
        abstractionBA.action();
        abstractionBB.action();
    }
}
