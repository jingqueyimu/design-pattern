package com.test.iterator.menu;

/**
 * 餐厅菜单迭代器
 */
public class DinerMenuIterator implements Iterator {
    
    /**
     * 数组形式的菜单项
     */
    public MenuItem[] menuItems;
    int position = 0;
    
    public DinerMenuIterator(MenuItem[] items) {
        this.menuItems = items;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (!this.hasNext()) {
            return null;
        }
        MenuItem item = menuItems[position];
        position = position + 1;
        return item;
    }
}
