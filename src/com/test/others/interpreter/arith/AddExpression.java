package com.test.others.interpreter.arith;

/**
 * 加法表达式
 */
public class AddExpression extends OperatorExpression {

    public AddExpression(Expression var1, Expression var2) {
        super(var1, "+", var2);
    }

    @Override
    public int interpret(Context context) {
        return var1.interpret(context) + var2.interpret(context);
    }
}
