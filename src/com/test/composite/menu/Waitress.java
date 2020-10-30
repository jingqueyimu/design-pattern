package com.test.composite.menu;

/**
 * 女招待
 */
public class Waitress {
    
    MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu() {
        print(allMenus);
    }
    
    private void print(MenuComponent menuComponent) {
        menuComponent.print();
        for (MenuComponent child : menuComponent.getChilds()) {
            print(child);
        }
    }
}
