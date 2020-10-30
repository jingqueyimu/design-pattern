package com.test.factorymethod.pizza;

/**
 * 纽约风味披萨店
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza(); 
        } else if ("clam".equals(type)) {
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }
}
