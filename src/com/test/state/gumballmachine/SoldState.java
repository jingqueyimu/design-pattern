package com.test.state.gumballmachine;

/**
 * 售出状态
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    @Override
    public void insertQuarter() {
        // 当前为售出状态，不能再次投入25分钱
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        // 当前为售出状态，不能退回25分钱
        System.out.println("Sorry, you already truned the crank");
    }

    @Override
    public void turnCrank() {
        // 当前为售出状态，不能再次转动曲柄
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        // 发放糖果
        gumballMachine.releaseBall();
        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
