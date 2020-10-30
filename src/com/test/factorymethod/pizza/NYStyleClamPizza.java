package com.test.factorymethod.pizza;

/**
 * 纽约风味的蛤蜊披萨
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Sauce Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Fresh Clams");
    }
}
