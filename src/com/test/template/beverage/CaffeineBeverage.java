package com.test.template.beverage;

/**
 * 咖啡因饮料抽象类
 */
public abstract class CaffeineBeverage {
    
    /**
     * 准备冲泡法（模板方法）
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    
    /**
     * 冲泡（依赖于子类的步骤）
     */
    abstract void brew();
    
    /**
     * 添加调料（依赖于子类的步骤）
     */
    abstract void addCondiments();
    
    /**
     * 烧水（公共步骤）
     */
    void boilWater() {
        System.out.println("Boiling water");
    }
    
    /**
     * 把饮料倒进杯子（公共步骤）
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    /**
     * 顾客是否想要添加调料（钩子方法）
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
