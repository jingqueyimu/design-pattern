package com.test.factorymethod.pizza;

public class Test {
    
    public static void main(String[] args) {
        // 纽约风味披萨店
        PizzaStore nyStore = new NYStylePizzaStore();
        // 芝加哥风味披萨店
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        
        // 订购芝士披萨
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
