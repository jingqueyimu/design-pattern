package com.test.others.builder;

/**
 * 具体生成器
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPart1() {
        product.setPart1("product part 1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("product part 2");        
    }

    @Override
    public void buildPart3() {
        product.setPart3("product part 3");        
    }
}
