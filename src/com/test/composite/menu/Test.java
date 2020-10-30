package com.test.composite.menu;

public class Test {

    public static void main(String[] args) {
        // 所有菜单
        MenuComponent allMenus = new Menu("ALL MENUS");
        // 子菜单
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU");
        MenuComponent dinerMenu = new Menu("DINER MENU");
        MenuComponent dessertMenu = new Menu("DESSERT MENU");
        
        // 添加煎饼屋菜单及菜单项
        allMenus.addChild(pancakeHouseMenu);
        pancakeHouseMenu.addChild(new MenuItem("Regular Pancake Breakfast", 2.99));
        pancakeHouseMenu.addChild(new MenuItem("Blueberry Pancakes", 3.49));
        pancakeHouseMenu.addChild(new MenuItem("Waffles", 3.59));
        // 添加餐厅菜单及菜单项
        allMenus.addChild(dinerMenu);
        dinerMenu.addChild(new MenuItem("BLT", 2.99));
        dinerMenu.addChild(new MenuItem("Soup of the day", 3.29));
        dinerMenu.addChild(new MenuItem("Hotdog", 3.05));
        // 添加甜点菜单及菜单项
        dinerMenu.addChild(dessertMenu);
        dessertMenu.addChild(new MenuItem("Apple Pie", 1.59));
        dessertMenu.addChild(new MenuItem("Cheesecake", 1.99));
        dessertMenu.addChild(new MenuItem("Sorbet", 1.89));
        
        // 使用女招待打印菜单
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
