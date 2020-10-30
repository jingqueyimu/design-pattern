package com.test.composite.menu;


/**
 * 菜单（组合）
 */
public class Menu extends MenuComponent {

    private String name;
    
    public Menu(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void print() {
        System.out.println("\n" + getName());;
        System.out.println("---------------------");;
    }
}
