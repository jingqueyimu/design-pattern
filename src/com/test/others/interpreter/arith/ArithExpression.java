package com.test.others.interpreter.arith;

/**
 * 算术表达式
 */
public class ArithExpression extends Expression {

    public ArithExpression(String code) {
        super(code);
    }

    @Override
    public int interpret(Context context) {
        // a + b
        // 以"空格"分隔变量与运算符
        String[] codes = code.split(" ");
        // 变量表达式
        VarExpression var1 = new VarExpression(codes[0]);
        VarExpression var2 = new VarExpression(codes[2]);
        // 运算符表达式
        OperatorExpression operator = new OperatorExpression(var1, codes[1], var2);
        return operator.interpret(context);
    }
}
