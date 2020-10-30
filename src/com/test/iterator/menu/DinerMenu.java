package com.test.iterator.menu;

/**
 * 餐厅菜单
 */
public class DinerMenu implements Menu {
    
    public MenuItem[] menuItems;
    
    public DinerMenu() {
        menuItems = new MenuItem[3];
        menuItems[0] = new MenuItem("BLT", 2.99);
        menuItems[1] = new MenuItem("Soup of the day", 3.29);
        menuItems[2] = new MenuItem("Hotdog", 3.05);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
