package com.test.template.beverage;

import java.util.Scanner;

/**
 * 咖啡
 */
public class Caffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    
    @Override
    boolean customerWantsCondiments() {
        String answer = askCustomer();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * 询问顾客
     */
    private String askCustomer() {
        System.out.print("Would you like milk and suger with your coffee (y/n)?");
        String answer = null;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            answer = scanner.nextLine();
        }
        scanner.close();
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
