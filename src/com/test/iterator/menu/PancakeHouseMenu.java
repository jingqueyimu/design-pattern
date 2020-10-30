package com.test.iterator.menu;

import java.util.ArrayList;

/**
 * 煎饼屋菜单
 */
public class PancakeHouseMenu implements Menu {
    
    public ArrayList<MenuItem> menuItems;
    
    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        menuItems.add(new MenuItem("Regular Pancake Breakfast", 2.99));
        menuItems.add(new MenuItem("Blueberry Pancakes", 3.49));
        menuItems.add(new MenuItem("Waffles", 3.59));
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
