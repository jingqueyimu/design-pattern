package com.test.composite.menu;

import java.util.List;

/**
 * 菜单项（叶节点）
 */
public class MenuItem extends MenuComponent {

    private String name;
    private double price;
    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void addChild(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeChild(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public List<MenuComponent> getChilds() {
        return childs;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void print() {
        System.out.println("  " + getName() + ", " + getPrice());;
    }
}
