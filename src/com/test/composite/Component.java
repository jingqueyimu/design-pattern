package com.test.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组件抽象类
 */
public abstract class Component {
    
    /**
     * 子组件（可以是组合或叶节点）
     */
    protected List<Component> childs = new ArrayList<Component>();

    /**
     * 添加子组件
     */
    public void addChild(Component component) {
        childs.add(component);
    }
    
    /**
     * 移除子组件
     */
    public void removeChild(Component component) {
        childs.remove(component);
    }
    
    /**
     * 获取所有子组件
     */
    public List<Component> getChilds() {
        return childs;
    }
    
    public String getName() {
        // 默认抛异常，由子类决定要不要覆盖
        throw new UnsupportedOperationException();
    }
}
