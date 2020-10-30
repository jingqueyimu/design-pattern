package com.test.iterator.menu;

public class Test {
    
    public static void main(String[] args) {
        // 菜单
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        // 女招待
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        // 打印菜单
        waitress.printMenu();
    }
}
