package com.test.factorymethod.pizza;

/**
 * 芝加哥风味披萨店
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza(); 
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }
}
