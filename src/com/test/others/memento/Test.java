package com.test.others.memento;

public class Test {

    public static void main(String[] args) {
        // 备忘录管理者
        MementoCaretaker caretaker = new MementoCaretaker();
        // 备忘录发起人
        MementoOriginator originator = new MementoOriginator();
        originator.setState("状态1");
        System.out.println("初始状态：" + originator.getState());
        // 备忘录发起人创建备忘录
        Memento memento = originator.createMemento();
        // 备忘录管理者保存备忘录
        caretaker.setMemento(memento);
        // 备忘录发起人改变状态
        originator.setState("状态2");
        System.out.println("新状态：" + originator.getState());
        // 从备忘录管理者中取出备忘录，并通过备忘录恢复状态
        originator.restoreFromMemento(caretaker.getMemento());
        System.out.println("恢复状态：" + originator.getState());
    }
}
