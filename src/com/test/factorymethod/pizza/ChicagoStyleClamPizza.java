package com.test.factorymethod.pizza;

/**
 * 芝加哥风味的蛤蜊披萨
 */
public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Frozen Clams");
    }
    
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
