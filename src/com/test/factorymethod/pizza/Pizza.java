package com.test.factorymethod.pizza;

import java.util.ArrayList;

/**
 * 披萨抽象类
 */
public abstract class Pizza {
    
    /**
     * 名称
     */
    String name;
    /**
     * 面团
     */
    String dough;
    /**
     * 酱料
     */
    String sauce;
    /**
     * 佐料
     */
    ArrayList<String> toppings = new ArrayList<>();
    
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding souce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" "+ toppings.get(i));
        }
    }

    /**
     * 烘烤
     */
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    
    /**
     * 切片
     */
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    /**
     * 装盒
     */
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    public String getName() {
        return name;
    }
}
