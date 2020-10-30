package com.test.abstractfactory.pizzaingredient;

public class Test {
    
    public static void main(String[] args) {
        // 纽约原料工厂
        PizzaIngredientFactory nyFactory = new NYPizzaIngredientFactory();
        // 芝加哥原料工厂
        PizzaIngredientFactory chicagoFactory = new ChicagoPizzaIngredientFactory();
        
        // 使用纽约原料工厂创建原料
        Dough dough = nyFactory.createDough();
        Sauce sauce = nyFactory.createSauce();
        Cheese cheese = nyFactory.createCheese();
        System.out.println("New York Pizza Ingredient Factory Create:");
        System.out.println(" " + dough.getName());
        System.out.println(" " + sauce.getName());
        System.out.println(" " + cheese.getName() + "\n");
        // 使用芝加哥原料工厂创建原料
        dough = chicagoFactory.createDough();
        sauce = chicagoFactory.createSauce();
        cheese = chicagoFactory.createCheese();
        System.out.println("Chicago Pizza Ingredient Factory Create:");
        System.out.println(" " + dough.getName());
        System.out.println(" " + sauce.getName());
        System.out.println(" " + cheese.getName());
    }
}
