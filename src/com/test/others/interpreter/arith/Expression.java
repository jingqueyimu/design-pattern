package com.test.others.interpreter.arith;

/**
 * 抽象表达式
 */
public abstract class Expression {

    protected String code;
    
    public Expression(String code) {
        this.code = code;
    }
    
    /**
     * 执行解释
     */
    public abstract int interpret(Context context);
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Expression) {
            return this.code.equals(((Expression) obj).code);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
