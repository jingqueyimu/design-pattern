package com.test.others.interpreter.arith;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文环境（运行环境）
 * 用于管理全局信息
 */
public class Context {
    
    /**
     * 数据池
     */
    private static Map<Expression, Integer> dataPool =  new HashMap<Expression, Integer>();
    
    /**
     * 赋值
     */
    public void assign(Expression var, int value) {
        dataPool.put(var, value);
    }
    
    /**
     * 取值
     */
    public int lookup(Expression var) {
        Integer value = dataPool.get(var);
        return value == null ? 0 : value;
    }
    
    /**
     * 运行代码
     */
    public int run(String code) {
        return new CodeExpression(code).interpret(this);
    }
}
