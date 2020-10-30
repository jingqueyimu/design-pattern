package com.test.others.memento;

/**
 * 备忘录发起人
 */
public class MementoOriginator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * 创建备忘录
     */
    public Memento createMemento() {
        return new Memento(state);
    }
    
    /**
     * 从备忘录中恢复状态
     */
    public void restoreFromMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
