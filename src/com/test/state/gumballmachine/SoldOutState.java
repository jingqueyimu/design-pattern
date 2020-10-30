package com.test.state.gumballmachine;

/**
 * 售罄状态
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        // 当前为售罄状态，不能投入25分钱
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        // 当前为售罄状态，不能要求退回25分钱
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        // 当前为售罄状态，不能转动曲柄
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        // 当前为售罄状态，不能发放糖果
        System.out.println("No gumball dispensed");
    }
}
