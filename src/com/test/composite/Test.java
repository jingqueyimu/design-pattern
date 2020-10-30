package com.test.composite;

public class Test {

    public static void main(String[] args) {
        // 组合
        Component composite1 = new Composite("composite1");
        Component composite2 = new Composite("composite2");
        Component composite3 = new Composite("composite3");
        // 叶节点
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");
        Component leaf4 = new Leaf("leaf4");
        
        // 组合1包含组合2、3
        composite1.addChild(composite2);
        composite1.addChild(composite3);
        // 组合2包含叶节点1、2
        composite2.addChild(leaf1);
        composite2.addChild(leaf2);
        // 组合3包含叶节点3、4
        composite3.addChild(leaf3);
        composite3.addChild(leaf4);
        
        // 打印组件名称
        System.out.println(composite1.getName());
        for (Component child : composite1.getChilds()) {
            System.out.println(" " + child.getName());
            for (Component leaf : child.getChilds()) {
                System.out.println("  " + leaf.getName());
            }
        }
    }
}
