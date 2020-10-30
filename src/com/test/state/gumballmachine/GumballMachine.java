package com.test.state.gumballmachine;

/**
 * 糖果机
 */
public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    
    State state = soldOutState;
    int gumballCount = 0;
    
    public GumballMachine(int initGumballCount) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        // 初始化糖果数量
        this.gumballCount = initGumballCount;
        // 初始化糖果机状态
        if (initGumballCount > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }
    
    /**
     * 投入25分钱
     */
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    /**
     * 退回25分钱
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    
    /**
     * 转动曲柄
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    
    /**
     * 发放糖果
     */
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (gumballCount > 0) {
            gumballCount = gumballCount -1;
        }
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public int getGumballCount() {
        return gumballCount;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
