package com.test.decorator.beverage;

public class Test {
    
    public static void main(String[] args) {
        // 浓缩咖啡
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        // 综合咖啡 
        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        // 添加摩卡
        beverage2 = new Mocha(beverage2);
        // 添加豆浆
        beverage2 = new Soy(beverage2);
        // 添加奶泡
        beverage = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
