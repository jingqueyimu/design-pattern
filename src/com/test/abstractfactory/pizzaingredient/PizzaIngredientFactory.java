package com.test.abstractfactory.pizzaingredient;

/**
 * 披萨原料工厂接口
 */
public interface PizzaIngredientFactory {
    
    /**
     * 创建面团
     */
    public Dough createDough();
    
    /**
     * 创建酱料
     */
    public Sauce createSauce();
    
    /**
     * 创建芝士
     */
    public Cheese createCheese();
    
    // 创建其他原料
}
