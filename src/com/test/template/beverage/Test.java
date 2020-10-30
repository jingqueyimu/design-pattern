package com.test.template.beverage;

public class Test {
    
    public static void main(String[] args) {
        // 茶
        System.out.println("\nMaking tea...");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        // 咖啡
        System.out.println("\nMaking coffee...");
        CaffeineBeverage caffee = new Caffee();
        caffee.prepareRecipe();
    }
}
