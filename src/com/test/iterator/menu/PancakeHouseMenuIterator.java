package com.test.iterator.menu;

import java.util.ArrayList;

/**
 * 煎饼屋菜单迭代器
 */
public class PancakeHouseMenuIterator implements Iterator {
    
    /**
     * 列表形式的菜单项
     */
    public ArrayList<MenuItem> menuItems;
    int position = 0;
    
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.menuItems = items;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (!this.hasNext()) {
            return null;
        }
        MenuItem item = menuItems.get(position);
        position = position + 1;
        return item;
    }
}
