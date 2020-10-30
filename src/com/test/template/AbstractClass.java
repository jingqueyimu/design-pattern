package com.test.template;

/**
 * 抽象类
 */
public abstract class AbstractClass {
    
    /**
     * 模板方法
     */
    public final void templateMethod() {
        // 公共步骤，由抽象类实现
        commonStep();
        // 依赖于子类的步骤，由子类实现
        step1();
        step2();
        step3();
        // 钩子方法，由子类决定要不要覆盖
        hook();
    }
    
    /**
     * 步骤1
     */
    public abstract void step1();
    
    /**
     * 步骤2
     */
    public abstract void step2();
    
    /**
     * 步骤3
     */
    public abstract void step3();
    
    /**
     * 公共步骤
     */
    private void commonStep() {
        System.out.println("I'm common step!");
    }
    
    /**
     * 钩子方法
     */
    public void hook() {
        // 可以空实现，也可以提供默认实现
    }
}
