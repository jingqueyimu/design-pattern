package com.test.iterator.menu;

/**
 * 女招待
 */
public class Waitress {
    
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    
    public void printMenu() {
        // 获取菜单迭代器
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        // 使用迭代器打印菜单
        System.out.println("----MENU----\n");
        System.out.println("BREAKFASE:");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH:");
        printMenu(dinerIterator);
    }
    
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getPrice());
        }
    }
}
