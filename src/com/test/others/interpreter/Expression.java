package com.test.others.interpreter;

/**
 * 表达式接口
 */
public interface Expression {

    /**
     * 执行解释
     */
    public void interpret(Context context);
}
