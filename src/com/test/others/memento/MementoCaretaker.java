package com.test.others.memento;

/**
 * 备忘录管理者
 */
public class MementoCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
