package com.test.state.gumballmachine;

public class Test {
    
    public static void main(String[] args) {
        // 糖果机
        GumballMachine gumballMachine = new GumballMachine(5);
        // 正常操作
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("-----------------------");
        // 异常操作
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
    }
}
