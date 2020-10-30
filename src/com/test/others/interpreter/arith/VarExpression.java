package com.test.others.interpreter.arith;

/**
 * 变量表达式
 */
public class VarExpression extends Expression {

    public VarExpression(String code) {
        super(code);
    }

    @Override
    public int interpret(Context context) {
        return context.lookup(this);
    }
}
