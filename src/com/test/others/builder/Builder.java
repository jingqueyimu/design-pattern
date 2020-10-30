package com.test.others.builder;

/**
 * 生成器抽象类
 */
public abstract class Builder {

    protected Product product = new Product();
    
    public abstract void buildPart1();
    
    public abstract void buildPart2();
    
    public abstract void buildPart3();
    
    /**
     * 获取产品
     */
    public Product getProduct() {
        return product;
    }
}
