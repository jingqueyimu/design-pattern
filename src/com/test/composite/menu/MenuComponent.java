package com.test.composite.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单组件抽象类
 */
public abstract class MenuComponent {
    
    /**
     * 子组件（可以是菜单或菜单项）
     */
    protected List<MenuComponent> childs = new ArrayList<MenuComponent>();
    
    /**
     * 添加子组件
     */
    public void addChild(MenuComponent component) {
        childs.add(component);
    }
    
    /**
     * 移除子组件
     */
    public void removeChild(MenuComponent component) {
        childs.remove(component);
    }
    
    /**
     * 获取所有子组件
     */
    public List<MenuComponent> getChilds() {
        return childs;
    }
    
    public String getName() {
        throw new UnsupportedOperationException();
    }
    
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    
    public void print() {
        throw new UnsupportedOperationException();
    }
}
