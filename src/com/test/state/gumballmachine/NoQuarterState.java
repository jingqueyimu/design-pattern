package com.test.state.gumballmachine;

/**
 * 未投入25分钱状态
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        // 投入25分钱，并转到已投入25分钱状态
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        // 当前为未投入25分钱状态，不能退回25分钱
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        // 当前为未投入25分钱状态，不能转动曲柄
        System.out.println("You truned, but there's no quarter");
    }

    @Override
    public void dispense() {
        // 当前为未投入25分钱状态，不能发放糖果
        System.out.println("You need to pay first");
    }
}
