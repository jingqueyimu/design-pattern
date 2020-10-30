package com.test.others.interpreter.arith;

/**
 * 减法表达式
 */
public class SubExpression extends OperatorExpression {

    public SubExpression(Expression var1, Expression var2) {
        super(var1, "-", var2);
    }

    @Override
    public int interpret(Context context) {
        return var1.interpret(context) - var2.interpret(context);
    }
}
