package com.test.state.gumballmachine;

/**
 * 已投入25分钱状态
 */
public class HasQuarterState implements State {
    
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        // 当前为已投入25分钱状态，不能再次投入
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        // 退回25分钱，并将状态转到未投入25分钱状态
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        // 转动曲柄，并将状态转为售出状态
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        // 当前为已投入25分钱状态，还未转动曲柄，不能发放糖果
        System.out.println("No gumball dispensed");
    }
}
