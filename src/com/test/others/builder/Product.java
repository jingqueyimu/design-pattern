package com.test.others.builder;

/**
 * 产品
 */
public class Product {

    /**
     * 产品部件1
     */
    private String part1;
    
    /**
     * 产品部件2
     */
    private String part2;
    
    /**
     * 产品部件3
     */
    private String part3;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public String getPart3() {
        return part3;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    @Override
    public String toString() {
        return "Product [part1=" + part1 + ", part2=" + part2 + ", part3=" + part3 + "]";
    }
}
